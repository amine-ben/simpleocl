/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.simpleocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Model Element Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.ac.vub.simpleocl.OclModelElementExp#getModel <em>Model</em>}</li>
 *   <li>{@link be.ac.vub.simpleocl.OclModelElementExp#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.ac.vub.simpleocl.SimpleoclPackage#getOclModelElementExp()
 * @model
 * @generated
 */
public interface OclModelElementExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(OclModel)
	 * @see be.ac.vub.simpleocl.SimpleoclPackage#getOclModelElementExp_Model()
	 * @model required="true"
	 * @generated
	 */
	OclModel getModel();

	/**
	 * Sets the value of the '{@link be.ac.vub.simpleocl.OclModelElementExp#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(OclModel value);

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
	 * @see be.ac.vub.simpleocl.SimpleoclPackage#getOclModelElementExp_Name()
	 * @model unique="false" dataType="be.ac.vub.simpleocl.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link be.ac.vub.simpleocl.OclModelElementExp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OclModelElementExp
