/**
 */
package robmod.robmod;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robmod.robmod.RobmodFactory
 * @model kind="package"
 * @generated
 */
public interface RobmodPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robmod";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dupa.org/robmod.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dwds";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobmodPackage eINSTANCE = robmod.robmod.impl.RobmodPackageImpl.init();

	/**
	 * The meta object id for the '{@link robmod.robmod.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robmod.robmod.impl.ComponentImpl
	 * @see robmod.robmod.impl.RobmodPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPOSITION = 1;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HANDLERS = 2;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INPUT_PORTS = 3;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUTPUT_PORTS = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTIES = 7;

	/**
	 * The feature id for the '<em><b>Type2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE2 = 8;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BEFORE = 9;

	/**
	 * The feature id for the '<em><b>Execution Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXECUTION_ORDER = 10;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link robmod.robmod.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robmod.robmod.impl.HandlerImpl
	 * @see robmod.robmod.impl.RobmodPackageImpl#getHandler()
	 * @generated
	 */
	int HANDLER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Trigered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__TRIGERED_BY = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Generates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__GENERATES = 3;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link robmod.robmod.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robmod.robmod.impl.PortImpl
	 * @see robmod.robmod.impl.RobmodPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EXTERNAL = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link robmod.robmod.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robmod.robmod.impl.InputPortImpl
	 * @see robmod.robmod.impl.RobmodPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__DATA_TYPE = PORT__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__EXTERNAL = PORT__EXTERNAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__CONNECTION = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Propagation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__PROPAGATION = PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__DESCRIPTION = PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__TRIGGER = PORT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link robmod.robmod.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robmod.robmod.impl.OutputPortImpl
	 * @see robmod.robmod.impl.RobmodPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 3;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__DATA_TYPE = PORT__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__EXTERNAL = PORT__EXTERNAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__CONNECTION = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delegation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__DELEGATION = PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__DESCRIPTION = PORT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link robmod.robmod.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robmod.robmod.impl.PropertyImpl
	 * @see robmod.robmod.impl.RobmodPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Propagate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPAGATE = 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link robmod.robmod.ComponentType <em>Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robmod.robmod.ComponentType
	 * @see robmod.robmod.impl.RobmodPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link robmod.robmod.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see robmod.robmod.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robmod.robmod.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link robmod.robmod.Component#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see robmod.robmod.Component#getComposition()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Composition();

	/**
	 * Returns the meta object for the containment reference list '{@link robmod.robmod.Component#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see robmod.robmod.Component#getHandlers()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Handlers();

	/**
	 * Returns the meta object for the containment reference list '{@link robmod.robmod.Component#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see robmod.robmod.Component#getInputPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_InputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link robmod.robmod.Component#getOutputPorts <em>Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Ports</em>'.
	 * @see robmod.robmod.Component#getOutputPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OutputPorts();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see robmod.robmod.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Type();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.Component#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see robmod.robmod.Component#getDescription()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link robmod.robmod.Component#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see robmod.robmod.Component#getProperties()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Properties();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.Component#getType2 <em>Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type2</em>'.
	 * @see robmod.robmod.Component#getType2()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Type2();

	/**
	 * Returns the meta object for the reference list '{@link robmod.robmod.Component#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Before</em>'.
	 * @see robmod.robmod.Component#getBefore()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Before();

	/**
	 * Returns the meta object for the reference '{@link robmod.robmod.Component#getExecutionOrder <em>Execution Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution Order</em>'.
	 * @see robmod.robmod.Component#getExecutionOrder()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ExecutionOrder();

	/**
	 * Returns the meta object for class '{@link robmod.robmod.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see robmod.robmod.Handler
	 * @generated
	 */
	EClass getHandler();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.Handler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robmod.robmod.Handler#getName()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_Name();

	/**
	 * Returns the meta object for the reference list '{@link robmod.robmod.Handler#getTrigeredBy <em>Trigered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trigered By</em>'.
	 * @see robmod.robmod.Handler#getTrigeredBy()
	 * @see #getHandler()
	 * @generated
	 */
	EReference getHandler_TrigeredBy();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.Handler#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see robmod.robmod.Handler#getDescription()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_Description();

	/**
	 * Returns the meta object for the reference list '{@link robmod.robmod.Handler#getGenerates <em>Generates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generates</em>'.
	 * @see robmod.robmod.Handler#getGenerates()
	 * @see #getHandler()
	 * @generated
	 */
	EReference getHandler_Generates();

	/**
	 * Returns the meta object for class '{@link robmod.robmod.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see robmod.robmod.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.InputPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robmod.robmod.InputPort#getName()
	 * @see #getInputPort()
	 * @generated
	 */
	EAttribute getInputPort_Name();

	/**
	 * Returns the meta object for the reference '{@link robmod.robmod.InputPort#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see robmod.robmod.InputPort#getConnection()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Connection();

	/**
	 * Returns the meta object for the reference list '{@link robmod.robmod.InputPort#getPropagation <em>Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Propagation</em>'.
	 * @see robmod.robmod.InputPort#getPropagation()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Propagation();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.InputPort#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see robmod.robmod.InputPort#getDescription()
	 * @see #getInputPort()
	 * @generated
	 */
	EAttribute getInputPort_Description();

	/**
	 * Returns the meta object for the reference list '{@link robmod.robmod.InputPort#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trigger</em>'.
	 * @see robmod.robmod.InputPort#getTrigger()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Trigger();

	/**
	 * Returns the meta object for class '{@link robmod.robmod.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see robmod.robmod.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.OutputPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robmod.robmod.OutputPort#getName()
	 * @see #getOutputPort()
	 * @generated
	 */
	EAttribute getOutputPort_Name();

	/**
	 * Returns the meta object for the reference list '{@link robmod.robmod.OutputPort#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection</em>'.
	 * @see robmod.robmod.OutputPort#getConnection()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Connection();

	/**
	 * Returns the meta object for the reference list '{@link robmod.robmod.OutputPort#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegation</em>'.
	 * @see robmod.robmod.OutputPort#getDelegation()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Delegation();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.OutputPort#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see robmod.robmod.OutputPort#getDescription()
	 * @see #getOutputPort()
	 * @generated
	 */
	EAttribute getOutputPort_Description();

	/**
	 * Returns the meta object for class '{@link robmod.robmod.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see robmod.robmod.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.Port#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see robmod.robmod.Port#getDataType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_DataType();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.Port#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see robmod.robmod.Port#isExternal()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_External();

	/**
	 * Returns the meta object for class '{@link robmod.robmod.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see robmod.robmod.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robmod.robmod.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see robmod.robmod.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link robmod.robmod.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robmod.robmod.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the reference list '{@link robmod.robmod.Property#getPropagate <em>Propagate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Propagate</em>'.
	 * @see robmod.robmod.Property#getPropagate()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Propagate();

	/**
	 * Returns the meta object for enum '{@link robmod.robmod.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Type</em>'.
	 * @see robmod.robmod.ComponentType
	 * @generated
	 */
	EEnum getComponentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobmodFactory getRobmodFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robmod.robmod.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robmod.robmod.impl.ComponentImpl
		 * @see robmod.robmod.impl.RobmodPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPOSITION = eINSTANCE.getComponent_Composition();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__HANDLERS = eINSTANCE.getComponent_Handlers();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INPUT_PORTS = eINSTANCE.getComponent_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Output Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OUTPUT_PORTS = eINSTANCE.getComponent_OutputPorts();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__DESCRIPTION = eINSTANCE.getComponent_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROPERTIES = eINSTANCE.getComponent_Properties();

		/**
		 * The meta object literal for the '<em><b>Type2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__TYPE2 = eINSTANCE.getComponent_Type2();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BEFORE = eINSTANCE.getComponent_Before();

		/**
		 * The meta object literal for the '<em><b>Execution Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__EXECUTION_ORDER = eINSTANCE.getComponent_ExecutionOrder();

		/**
		 * The meta object literal for the '{@link robmod.robmod.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robmod.robmod.impl.HandlerImpl
		 * @see robmod.robmod.impl.RobmodPackageImpl#getHandler()
		 * @generated
		 */
		EClass HANDLER = eINSTANCE.getHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__NAME = eINSTANCE.getHandler_Name();

		/**
		 * The meta object literal for the '<em><b>Trigered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__TRIGERED_BY = eINSTANCE.getHandler_TrigeredBy();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__DESCRIPTION = eINSTANCE.getHandler_Description();

		/**
		 * The meta object literal for the '<em><b>Generates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__GENERATES = eINSTANCE.getHandler_Generates();

		/**
		 * The meta object literal for the '{@link robmod.robmod.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robmod.robmod.impl.InputPortImpl
		 * @see robmod.robmod.impl.RobmodPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PORT__NAME = eINSTANCE.getInputPort_Name();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__CONNECTION = eINSTANCE.getInputPort_Connection();

		/**
		 * The meta object literal for the '<em><b>Propagation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__PROPAGATION = eINSTANCE.getInputPort_Propagation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PORT__DESCRIPTION = eINSTANCE.getInputPort_Description();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__TRIGGER = eINSTANCE.getInputPort_Trigger();

		/**
		 * The meta object literal for the '{@link robmod.robmod.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robmod.robmod.impl.OutputPortImpl
		 * @see robmod.robmod.impl.RobmodPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_PORT__NAME = eINSTANCE.getOutputPort_Name();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__CONNECTION = eINSTANCE.getOutputPort_Connection();

		/**
		 * The meta object literal for the '<em><b>Delegation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__DELEGATION = eINSTANCE.getOutputPort_Delegation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_PORT__DESCRIPTION = eINSTANCE.getOutputPort_Description();

		/**
		 * The meta object literal for the '{@link robmod.robmod.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robmod.robmod.impl.PortImpl
		 * @see robmod.robmod.impl.RobmodPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DATA_TYPE = eINSTANCE.getPort_DataType();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__EXTERNAL = eINSTANCE.getPort_External();

		/**
		 * The meta object literal for the '{@link robmod.robmod.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robmod.robmod.impl.PropertyImpl
		 * @see robmod.robmod.impl.RobmodPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Propagate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PROPAGATE = eINSTANCE.getProperty_Propagate();

		/**
		 * The meta object literal for the '{@link robmod.robmod.ComponentType <em>Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robmod.robmod.ComponentType
		 * @see robmod.robmod.impl.RobmodPackageImpl#getComponentType()
		 * @generated
		 */
		EEnum COMPONENT_TYPE = eINSTANCE.getComponentType();

	}

} //RobmodPackage
