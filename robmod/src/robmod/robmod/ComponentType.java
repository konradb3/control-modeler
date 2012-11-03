/**
 */
package robmod.robmod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Component Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see robmod.robmod.RobmodPackage#getComponentType()
 * @model
 * @generated
 */
public final class ComponentType extends AbstractEnumerator {
	/**
	 * The '<em><b>Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Component</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_LITERAL
	 * @model name="Component"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT = 0;

	/**
	 * The '<em><b>Composition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Composition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_LITERAL
	 * @model name="Composition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION = 1;

	/**
	 * The '<em><b>Sequential Thread</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequential Thread</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL_THREAD_LITERAL
	 * @model name="SequentialThread"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENTIAL_THREAD = 2;

	/**
	 * The '<em><b>Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Library</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIBRARY_LITERAL
	 * @model name="Library"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY = 3;

	/**
	 * The '<em><b>Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deployment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_LITERAL
	 * @model name="Deployment"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT = 4;

	/**
	 * The '<em><b>Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @generated
	 * @ordered
	 */
	public static final ComponentType COMPONENT_LITERAL = new ComponentType(COMPONENT, "Component", "Component");

	/**
	 * The '<em><b>Composition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION
	 * @generated
	 * @ordered
	 */
	public static final ComponentType COMPOSITION_LITERAL = new ComponentType(COMPOSITION, "Composition", "Composition");

	/**
	 * The '<em><b>Sequential Thread</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL_THREAD
	 * @generated
	 * @ordered
	 */
	public static final ComponentType SEQUENTIAL_THREAD_LITERAL = new ComponentType(SEQUENTIAL_THREAD, "SequentialThread", "SequentialThread");

	/**
	 * The '<em><b>Library</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRARY
	 * @generated
	 * @ordered
	 */
	public static final ComponentType LIBRARY_LITERAL = new ComponentType(LIBRARY, "Library", "Library");

	/**
	 * The '<em><b>Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT
	 * @generated
	 * @ordered
	 */
	public static final ComponentType DEPLOYMENT_LITERAL = new ComponentType(DEPLOYMENT, "Deployment", "Deployment");

	/**
	 * An array of all the '<em><b>Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentType[] VALUES_ARRAY =
		new ComponentType[] {
			COMPONENT_LITERAL,
			COMPOSITION_LITERAL,
			SEQUENTIAL_THREAD_LITERAL,
			LIBRARY_LITERAL,
			DEPLOYMENT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentType get(int value) {
		switch (value) {
			case COMPONENT: return COMPONENT_LITERAL;
			case COMPOSITION: return COMPOSITION_LITERAL;
			case SEQUENTIAL_THREAD: return SEQUENTIAL_THREAD_LITERAL;
			case LIBRARY: return LIBRARY_LITERAL;
			case DEPLOYMENT: return DEPLOYMENT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ComponentType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ComponentType
