package robmod.robmod.diagram.custom;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import robmod.robmod.diagram.part.RobmodDiagramEditorPlugin;

public class RobmodPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {
	// RadioGroupFieldEditor radioGroup;
	Table sLocsTable;
	Button deleteButton;
	Button addFileButton;
	//Button addButton;

	public RobmodPreferencePage() {
	}

	public static IInputValidator validator = new IInputValidator() {

		@Override
		public String isValid(String newText) {
			try {
				URI.createURI(newText);
			} catch (IllegalArgumentException e) {
				return e.getLocalizedMessage();
			}
			return null;
		}

	};

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	@Override
	public Control createContents(Composite parent) {
		Composite result = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		result.setLayout(layout);
		result.setLayoutData(new GridData(GridData.FILL_BOTH));
		sLocsTable = new Table(result, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 1;
		gd.verticalSpan = 3;
		sLocsTable.setLayoutData(gd);
		sLocsTable.setLinesVisible(true);
		sLocsTable.setHeaderVisible(false);
		TableColumn locCol = new TableColumn(sLocsTable, SWT.NONE);
		locCol.setText("location");
		sLocsTable.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				tableSelectionChanged();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				tableSelectionChanged();
			}
		});
		//addButton = new Button(result, SWT.NONE);
		//addButton.setText("Add URL");
		addFileButton = new Button(result, SWT.NONE);
		addFileButton.setText("Add Library");
		deleteButton = new Button(result, SWT.NONE);
		deleteButton.setText("Delete");
		for (URI uri : LibraryPreference.getLocations()) {
			addLocation(uri);
		}
		locCol.pack();
		setTitle("Installed Libraries");
		setDescription("Set the location of libraries used in robmod.");
		registerButtons();
		return result;
	}

	/**
*
*/
	private void registerButtons() {
		addFileButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				FileDialog d = new FileDialog(event.widget.getDisplay()
						.getActiveShell(), SWT.OPEN);
				d.setFilterExtensions(new String[] { "*.robmod" });
				String absPath = d.open();
				if (absPath != null && absPath.trim().length() > 0) {
					try {
						String uri = new java.io.File(absPath).toURI()
								.toString();
						TableItem add = new TableItem(sLocsTable, SWT.NULL);
						add.setText(uri);
					} catch (Exception e) {
						setErrorMessage(e.getMessage());
					}
				}
			}
		});
		deleteButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int selInd = sLocsTable.getSelectionIndex();
				sLocsTable.remove(selInd);
			}
		});
	}

	public void tableSelectionChanged() {
		if (sLocsTable.getSelectionCount() > 0) {
			deleteButton.setEnabled(true);
		} else {
			deleteButton.setEnabled(false);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(RobmodDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}

	@Override
	protected void performDefaults() {
		sLocsTable.removeAll();
		for (URI l : LibraryPreference.getDefaultLocations()) {
			addLocation(l);
		}
	}

	/**
	 * @param string
	 * @param string2
	 */
	private void addLocation(URI uri) {
		TableItem item = new TableItem(sLocsTable, SWT.NONE);
		item.setText(0, uri.toString());
	}

	@Override
	public boolean performOk() {
		List<URI> locs = new ArrayList<URI>();
		for (TableItem i : sLocsTable.getItems()) {
			String u = i.getText(0);
			try {
				URI uri = URI.createURI(u);
				locs.add(uri);
			} catch (IllegalArgumentException e) {
				throw new Error(e);
			}
		}
		LibraryPreference.setLocations(locs);
		return super.performOk();
	}
}
