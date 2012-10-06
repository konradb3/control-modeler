package robmod.robmod.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import robmod.robmod.diagram.edit.parts.Component2EditPart;
import robmod.robmod.diagram.edit.parts.Component3EditPart;
import robmod.robmod.diagram.edit.parts.Component4EditPart;
import robmod.robmod.diagram.edit.parts.Component5EditPart;
import robmod.robmod.diagram.edit.parts.ComponentBeforeEditPart;
import robmod.robmod.diagram.edit.parts.ComponentEditPart;
import robmod.robmod.diagram.edit.parts.ComponentThreadCompartmentEditPart;
import robmod.robmod.diagram.edit.parts.HandlerEditPart;
import robmod.robmod.diagram.edit.parts.HandlerGeneratesEditPart;
import robmod.robmod.diagram.edit.parts.HandlerTrigeredByEditPart;
import robmod.robmod.diagram.edit.parts.InputPort2EditPart;
import robmod.robmod.diagram.edit.parts.InputPortEditPart;
import robmod.robmod.diagram.edit.parts.InputPortPropagationEditPart;
import robmod.robmod.diagram.edit.parts.OutputPort2EditPart;
import robmod.robmod.diagram.edit.parts.OutputPortConnectionEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortDelegationEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortEditPart;
import robmod.robmod.diagram.edit.parts.PropertyEditPart;
import robmod.robmod.diagram.part.Messages;
import robmod.robmod.diagram.part.RobmodVisualIDRegistry;

/**
 * @generated
 */
public class RobmodNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	public RobmodNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Iterator/*[org.eclipse.emf.ecore.resource.Resource]*/it = myEditingDomain
				.getResourceSet().getResources().iterator(); it.hasNext();) {
			Resource nextResource = (Resource) it.next();
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList/*[robmod.robmod.diagram.navigator.RobmodNavigatorItem]*/result = new ArrayList/*[robmod.robmod.diagram.navigator.RobmodNavigatorItem]*/();
			ArrayList/*[org.eclipse.gmf.runtime.notation.View]*/topViews = new ArrayList/*[org.eclipse.gmf.runtime.notation.View]*/(
					resource.getContents().size());
			for (Iterator/*[org.eclipse.emf.ecore.EObject]*/it = resource
					.getContents().iterator(); it.hasNext();) {
				EObject o = (EObject) it.next();
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof RobmodNavigatorGroup) {
			RobmodNavigatorGroup group = (RobmodNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof RobmodNavigatorItem) {
			RobmodNavigatorItem navigatorItem = (RobmodNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (RobmodVisualIDRegistry.getVisualID(view)) {

		case HandlerTrigeredByEditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Edge sv = (Edge) view;
			RobmodNavigatorGroup target = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_HandlerTrigeredBy_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup source = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_HandlerTrigeredBy_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(InputPort2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RobmodVisualIDRegistry.getType(HandlerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OutputPort2EditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Node sv = (Node) view;
			RobmodNavigatorGroup outgoinglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_OutputPort_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup incominglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_OutputPort_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortDelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortDelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(HandlerGeneratesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ComponentBeforeEditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Edge sv = (Edge) view;
			RobmodNavigatorGroup target = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_ComponentBefore_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup source = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_ComponentBefore_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(Component2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(Component3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(Component4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(Component5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(Component2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(Component3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(Component4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(Component5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InputPortEditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Node sv = (Node) view;
			RobmodNavigatorGroup incominglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_InputPort_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup outgoinglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_InputPort_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(HandlerTrigeredByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(InputPortPropagationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(InputPortPropagationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HandlerEditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Node sv = (Node) view;
			RobmodNavigatorGroup outgoinglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_Handler_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(HandlerTrigeredByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(HandlerGeneratesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Component5EditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Node sv = (Node) view;
			RobmodNavigatorGroup incominglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_Component_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup outgoinglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_Component_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(InputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(ComponentBeforeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(ComponentBeforeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OutputPortEditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Node sv = (Node) view;
			RobmodNavigatorGroup outgoinglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_OutputPort_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup incominglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_OutputPort_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortDelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortDelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(HandlerGeneratesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case OutputPortDelegationEditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Edge sv = (Edge) view;
			RobmodNavigatorGroup target = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_OutputPortDelegation_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup source = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_OutputPortDelegation_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPort2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPort2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InputPort2EditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Node sv = (Node) view;
			RobmodNavigatorGroup incominglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_InputPort_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup outgoinglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_InputPort_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(HandlerTrigeredByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(InputPortPropagationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(InputPortPropagationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Component4EditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Node sv = (Node) view;
			RobmodNavigatorGroup incominglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_Component_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup outgoinglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_Component_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(ComponentThreadCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					RobmodVisualIDRegistry
							.getType(Component5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(ComponentBeforeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(ComponentBeforeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HandlerGeneratesEditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Edge sv = (Edge) view;
			RobmodNavigatorGroup target = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_HandlerGenerates_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup source = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_HandlerGenerates_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPort2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RobmodVisualIDRegistry.getType(HandlerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OutputPortConnectionEditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Edge sv = (Edge) view;
			RobmodNavigatorGroup target = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_OutputPortConnection_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup source = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_OutputPortConnection_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(InputPort2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPort2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ComponentEditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Diagram sv = (Diagram) view;
			RobmodNavigatorGroup links = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_Component_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry.getType(HandlerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(Component2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(Component3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(Component4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(HandlerTrigeredByEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPortDelegationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(InputPortPropagationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(HandlerGeneratesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(ComponentBeforeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case InputPortPropagationEditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Edge sv = (Edge) view;
			RobmodNavigatorGroup target = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_InputPortPropagation_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup source = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_InputPortPropagation_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(InputPort2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RobmodVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(InputPort2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Component2EditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Node sv = (Node) view;
			RobmodNavigatorGroup incominglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_Component_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup outgoinglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_Component_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(InputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(ComponentBeforeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(ComponentBeforeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Component3EditPart.VISUAL_ID: {
			LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/result = new LinkedList/*[robmod.robmod.diagram.navigator.RobmodAbstractNavigatorItem]*/();
			Node sv = (Node) view;
			RobmodNavigatorGroup incominglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_Component_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RobmodNavigatorGroup outgoinglinks = new RobmodNavigatorGroup(
					Messages.NavigatorGroupName_Component_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(InputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(OutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(ComponentBeforeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RobmodVisualIDRegistry
							.getType(ComponentBeforeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/getLinksSourceByType(
			Collection/*[org.eclipse.gmf.runtime.notation.Edge]*/edges,
			String type) {
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/result = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.Edge]*/it = edges
				.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/getLinksTargetByType(
			Collection/*[org.eclipse.gmf.runtime.notation.Edge]*/edges,
			String type) {
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/result = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.Edge]*/it = edges
				.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/getOutgoingLinksByType(
			Collection/*[? extends org.eclipse.gmf.runtime.notation.View]*/nodes,
			String type) {
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/result = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = nodes
				.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/getIncomingLinksByType(
			Collection/*[? extends org.eclipse.gmf.runtime.notation.View]*/nodes,
			String type) {
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/result = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = nodes
				.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/getChildrenByType(
			Collection/*[? extends org.eclipse.gmf.runtime.notation.View]*/nodes,
			String type) {
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/result = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = nodes
				.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/getDiagramLinksByType(
			Collection/*[org.eclipse.gmf.runtime.notation.Diagram]*/diagrams,
			String type) {
		ArrayList/*[org.eclipse.gmf.runtime.notation.View]*/result = new ArrayList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.Diagram]*/it = diagrams
				.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/selectViewsByType(
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/views,
			String type) {
		ArrayList/*[org.eclipse.gmf.runtime.notation.View]*/result = new ArrayList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = views
				.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ComponentEditPart.MODEL_ID.equals(RobmodVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection/*[robmod.robmod.diagram.navigator.RobmodNavigatorItem]*/createNavigatorItems(
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/views,
			Object parent, boolean isLeafs) {
		ArrayList/*[robmod.robmod.diagram.navigator.RobmodNavigatorItem]*/result = new ArrayList/*[robmod.robmod.diagram.navigator.RobmodNavigatorItem]*/(
				views.size());
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = views
				.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			result.add(new RobmodNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof RobmodAbstractNavigatorItem) {
			RobmodAbstractNavigatorItem abstractNavigatorItem = (RobmodAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
