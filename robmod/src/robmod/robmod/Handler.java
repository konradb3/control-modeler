/**
 */
package robmod.robmod;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robmod.robmod.Handler#getName <em>Name</em>}</li>
 *   <li>{@link robmod.robmod.Handler#getTrigeredBy <em>Trigered By</em>}</li>
 *   <li>{@link robmod.robmod.Handler#getDescription <em>Description</em>}</li>
 *   <li>{@link robmod.robmod.Handler#getGenerates <em>Generates</em>}</li>
 * </ul>
 * </p>
 *
 * @see robmod.robmod.RobmodPackage#getHandler()
 * @model
 * @generated
 */
public interface Handler extends EObject {
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
	 * @see robmod.robmod.RobmodPackage#getHandler_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link robmod.robmod.Handler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Trigered By</b></em>' reference list.
	 * The list contents are of type {@link robmod.robmod.InputPort}.
	 * It is bidirectional and its opposite is '{@link robmod.robmod.InputPort#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigered By</em>' reference list.
	 * @see robmod.robmod.RobmodPackage#getHandler_TrigeredBy()
	 * @see robmod.robmod.InputPort#getTrigger
	 * @model type="robmod.robmod.InputPort" opposite="trigger"
	 * @generated
	 */
	EList getTrigeredBy();

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
	 * @see robmod.robmod.RobmodPackage#getHandler_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link robmod.robmod.Handler#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Generates</b></em>' reference list.
	 * The list contents are of type {@link robmod.robmod.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generates</em>' reference list.
	 * @see robmod.robmod.RobmodPackage#getHandler_Generates()
	 * @model type="robmod.robmod.OutputPort"
	 * @generated
	 */
	EList getGenerates();

} // Handler
