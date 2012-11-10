package robmod_plugin2;


import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import robmod.robmod.diagram.custom.ReplaceNewObjectWithTemplateCommand;
import robmod.robmod.diagram.providers.RobmodElementTypes;

public class ComponentTemplateAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterCreateCommand(final CreateElementRequest request) {
        //System.out.println("Couldn't get Console object, maybe you're running this from within an IDE?");
		if (request.getParameters().containsKey("templateElement")) {;
			return new ReplaceNewObjectWithTemplateCommand(request.getEditingDomain(), request);
		}
		return null;
	}

}