package robmod.robmod.diagram.expressions;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

import robmod.robmod.diagram.part.RobmodDiagramEditorPlugin;

/**
 * @generated
 */
public class RobmodOCLFactory {

	/**
	 * @generated
	 */
	private final RobmodAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected RobmodOCLFactory() {
		this.expressions = new RobmodAbstractExpression[12];
		this.expressionBodies = new String[] {
				"self.type2 = ComponentType::Component", //$NON-NLS-1$
				"self.type2 = ComponentType::Composition", //$NON-NLS-1$
				"(dataType = oppositeEnd.dataType)\nand \n(Component.allInstances()->select(outputPorts->includes(oppositeEnd)) <> Component.allInstances()->select(inputPorts->includes(self)))\n", //$NON-NLS-1$
				"self.dataType = oppositeEnd.dataType\nand\nComponent.allInstances()->select(outputPorts->includes(self)).composition->exists(outputPorts->includes(oppositeEnd))\n", //$NON-NLS-1$
				"self.dataType = oppositeEnd.dataType\nand\nComponent.allInstances()->select(inputPorts->includes(oppositeEnd)).composition->exists(inputPorts->includes(self))\n", //$NON-NLS-1$
				"self.name.size()>0", //$NON-NLS-1$
				"self.type.size()>0", //$NON-NLS-1$
				"self.name.size()>0", //$NON-NLS-1$
				"self.handlers->forAll(trigeredBy->size() > 0) or self.handlers->size() < 2\n", //$NON-NLS-1$
				"self.type2 <> ComponentType::Composition or self.handlers->isEmpty()", //$NON-NLS-1$
				"self.type2 <> ComponentType::Component or self.composition->isEmpty()", //$NON-NLS-1$
				"self.type2 <> ComponentType::Component or self.handlers->notEmpty()", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static RobmodOCLFactory getInstance() {
		RobmodOCLFactory instance = RobmodDiagramEditorPlugin.getInstance()
				.getRobmodOCLFactory();
		if (instance == null) {
			RobmodDiagramEditorPlugin.getInstance().setRobmodOCLFactory(
					instance = new RobmodOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static RobmodAbstractExpression getExpression(int index,
			EClassifier context,
			Map/*[String, org.eclipse.emf.ecore.EClassifier]*/environment) {
		RobmodOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index], context,
					environment == null ? Collections.EMPTY_MAP : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static RobmodAbstractExpression getExpression(String body,
			EClassifier context,
			Map/*[String, org.eclipse.emf.ecore.EClassifier]*/environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static RobmodAbstractExpression getExpression(String body,
			EClassifier context) {
		return getExpression(body, context, Collections.EMPTY_MAP);
	}

	/**
	 * @generated
	 */
	private static class Expression extends RobmodAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map/*[String, org.eclipse.emf.ecore.EClassifier]*/environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment/*[?,?,?,?,?]*/evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Iterator/*[Object]*/it = env.keySet().iterator(); it
					.hasNext();) {
				Object nextKey = it.next();
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment/*[?,org.eclipse.emf.ecore.EClassifier,?,?,?,org.eclipse.emf.ecore.EParameter,?,?,?,?,?,?]*/ecoreEnv,
				Map/*[String, org.eclipse.emf.ecore.EClassifier]*/environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (Iterator/*[String]*/it = environment.keySet().iterator(); it
					.hasNext();) {
				String varName = (String) it.next();
				EClassifier varType = (EClassifier) environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment/*[?,org.eclipse.emf.ecore.EClassifier,?,?,?,?,?,?,?,?,?,?]*/ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType((EClassifier) ecoreEnv.getUMLReflection().getOCLType(
					type));
			return var;
		}
	}
}
