/**
 * 
 */

/**
 * @author moises.alonso
 *
 */
public interface IHeap<P, V> {

	void Insert(P priority, V value);
	
	V get(); //Elemento de mayor prioridad
	
	V remove(); //eliminar el de mayor p.
	
	int count();
	
	boolean isEmpty();
	
}