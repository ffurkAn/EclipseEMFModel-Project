/**
 */
package EMFModel.Graph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EMFModel.Graph.Graph#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see EMFModel.Graph.GraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link EMFModel.Graph.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see EMFModel.Graph.GraphPackage#getGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();
	
	/**
	 * add node to graph
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	void addNode(Node value);
	
	/**
	 * delete particular node from graph
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	void deleteNode(Node value);
	
	
	

} // Graph
