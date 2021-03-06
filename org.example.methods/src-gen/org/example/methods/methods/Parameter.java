/**
 * generated by Xtext 2.13.0
 */
package org.example.methods.methods;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.methods.methods.Parameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.example.methods.methods.Parameter#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 *
 * @see org.example.methods.methods.MethodsPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Type</em>' attribute.
   * @see #setParameterType(String)
   * @see org.example.methods.methods.MethodsPackage#getParameter_ParameterType()
   * @model
   * @generated
   */
  String getParameterType();

  /**
   * Sets the value of the '{@link org.example.methods.methods.Parameter#getParameterType <em>Parameter Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Type</em>' attribute.
   * @see #getParameterType()
   * @generated
   */
  void setParameterType(String value);

  /**
   * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Name</em>' attribute.
   * @see #setParameterName(String)
   * @see org.example.methods.methods.MethodsPackage#getParameter_ParameterName()
   * @model
   * @generated
   */
  String getParameterName();

  /**
   * Sets the value of the '{@link org.example.methods.methods.Parameter#getParameterName <em>Parameter Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Name</em>' attribute.
   * @see #getParameterName()
   * @generated
   */
  void setParameterName(String value);

} // Parameter
