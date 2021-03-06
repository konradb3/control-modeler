/**
 */
package robmod.robmod;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robmod.robmod.Component#getName <em>Name</em>}</li>
 *   <li>{@link robmod.robmod.Component#getComposition <em>Composition</em>}</li>
 *   <li>{@link robmod.robmod.Component#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link robmod.robmod.Component#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link robmod.robmod.Component#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link robmod.robmod.Component#getType <em>Type</em>}</li>
 *   <li>{@link robmod.robmod.Component#getDescription <em>Description</em>}</li>
 *   <li>{@link robmod.robmod.Component#getProperties <em>Properties</em>}</li>
 *   <li>{@link robmod.robmod.Component#getType2 <em>Type2</em>}</li>
 *   <li>{@link robmod.robmod.Component#getBefore <em>Before</em>}</li>
 *   <li>{@link robmod.robmod.Component#getExecutionOrder <em>Execution Order</em>}</li>
 *   <li>{@link robmod.robmod.Component#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see robmod.robmod.RobmodPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see robmod.robmod.RobmodPackage#getComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link robmod.robmod.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference list.
	 * The list contents are of type {@link robmod.robmod.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference list.
	 * @see robmod.robmod.RobmodPackage#getComponent_Composition()
	 * @model type="robmod.robmod.Component" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList getComposition();

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link robmod.robmod.Handler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference list.
	 * @see robmod.robmod.RobmodPackage#getComponent_Handlers()
	 * @model type="robmod.robmod.Handler" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList getHandlers();

	/**
	 * Returns the value of the '<em><b>Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link robmod.robmod.InputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ports</em>' containment reference list.
	 * @see robmod.robmod.RobmodPackage#getComponent_InputPorts()
	 * @model type="robmod.robmod.InputPort" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList getInputPorts();

	/**
	 * Returns the value of the '<em><b>Output Ports</b></em>' containment reference list.
	 * The list contents are of type {@link robmod.robmod.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ports</em>' containment reference list.
	 * @see robmod.robmod.RobmodPackage#getComponent_OutputPorts()
	 * @model type="robmod.robmod.OutputPort" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList getOutputPorts();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see robmod.robmod.RobmodPackage#getComponent_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link robmod.robmod.Component#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see robmod.robmod.RobmodPackage#getComponent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link robmod.robmod.Component#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link robmod.robmod.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see robmod.robmod.RobmodPackage#getComponent_Properties()
	 * @model type="robmod.robmod.Property" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList getProperties();

	/**
	 * Returns the value of the '<em><b>Type2</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link robmod.robmod.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type2</em>' attribute.
	 * @see robmod.robmod.ComponentType
	 * @see #setType2(ComponentType)
	 * @see robmod.robmod.RobmodPackage#getComponent_Type2()
	 * @model default="" required="true"
	 *        extendedMetaData="namespace=''"
	 * @generated
	 */
	ComponentType getType2();

	/**
	 * Sets the value of the '{@link robmod.robmod.Component#getType2 <em>Type2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type2</em>' attribute.
	 * @see robmod.robmod.ComponentType
	 * @see #getType2()
	 * @generated
	 */
	void setType2(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference list.
	 * The list contents are of type {@link robmod.robmod.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' reference list.
	 * @see robmod.robmod.RobmodPackage#getComponent_Before()
	 * @model type="robmod.robmod.Component"
	 * @generated
	 */
	EList getBefore();

	/**
	 * Returns the value of the '<em><b>Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Order</em>' attribute.
	 * @see #setExecutionOrder(Integer)
	 * @see robmod.robmod.RobmodPackage#getComponent_ExecutionOrder()
	 * @model
	 * @generated
	 */
	Integer getExecutionOrder();

	/**
	 * Sets the value of the '{@link robmod.robmod.Component#getExecutionOrder <em>Execution Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Order</em>' attribute.
	 * @see #getExecutionOrder()
	 * @generated
	 */
	void setExecutionOrder(Integer value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(Double)
	 * @see robmod.robmod.RobmodPackage#getComponent_Period()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	Double getPeriod();

	/**
	 * Sets the value of the '{@link robmod.robmod.Component#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Double value);

} // Component
