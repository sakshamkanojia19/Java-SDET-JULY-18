package Collections_Exp;

public class One_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Arrays
//		fixed sized, less flexible cant modify the data, not thread safe, contigious manner, similar, kind of data can be stored
		//thread 1 and thread 2 access of one process there will be loss of data : no thread safe
		//2 threads on same resource data might overridden
//		for loop  , only index array is allowed, 
		//collections list, map, array, set,queue
		//Performance little bit faster 
		
//		differeces
		//Collection wrt Array
		//Collection is a framework that is the implementation of data structure
		//Can we store different type of data in collection : Yes
		//It is Dynamic in size  : I can manupulate existing collection.
		//Data Stored in continous fashiopn.
		//Zero based indexing 
		//Vector, hash table, are thread safe, not everything is thread safe depend what you
		//we can use Iterator, For each
      //Data S :  List, Queue, Map, Set, List, Vector
		//performance is slower as it is dynamic sized
		
		
		//Types of Collections
		//List, Set, Map, Queue, Dequeue : Interfaces
		
		//Interface : blueprint of class, no const are allowed , in abstract alllowed constructors, works wth abstract classes.
		// No body body sit in implementing classes in abstract methods
		
		/*
		 * Implementing Classes
		 * 
		 * List  : Interface
		 * array lsit
		 * linkedlist
		 * stack 
		 * vector
		 * 
		 * */
		
		
		
		/*
		 * List
		 * It is Interface
		 * Ordered collection : Insertion order could be maintained
		 * Control over data in the list
		 * user can do search on index based searching can be done
		 * 
		 * List allow duplicat element to store
		 * It also allowes null values elements
		 * 
		 * Dont want to allow duplicate use set inplace sets
		 * 
		 * Can modify data : add remove 
		 * 
		 * Use Iterator listiterator 
		 * 
		 * */
		
		/*
		 * ArrayList  :class
		 * 
		 * Issue in Thread safety in comparsion to List
		 * and everything is same
		 * ConcurrentModificationException
		 * unsync it creates problem in multi thread enviornment
		 * data could dplicate , element might lost 
		 *   
		 * */
		
/*
 * 
 * | Feature            | **ArrayList**                       | **LinkedList**                     | **Vector**                                | **Stack**                                   |
| ------------------ | ----------------------------------- | ---------------------------------- | ----------------------------------------- | ------------------------------------------- |
| Data Type          | Dynamic array                       | Doubly linked list                 | Synchronized dynamic array                | LIFO structure (extends Vector)             |
| Thread Safety      | Not thread-safe                     | Not thread-safe                    | Thread-safe (synchronized)                | Thread-safe (inherits from Vector)          |
| Performance Focus  | Faster for random access            | Faster for insertion and deletion  | Slower due to synchronization             | Slower due to synchronization               |
| Weakness           | Not good for frequent insert/delete | Not efficient for random access    | Heavier performance in multi-threaded use | Only top element can be accessed or removed |
| Order Preservation | Maintains insertion order           | Maintains insertion order          | Maintains insertion order                 | Maintains insertion order (LIFO on top)     |
| Access Pattern     | Direct access via index (O(1))      | Sequential access via nodes (O(n)) | Direct access via index (O(1))            | Access to top only (LIFO behavior)          |
| Use Case           | Best for frequent read/search       | Best for dynamic insertion/removal | Legacy thread-safe list                   | Stack operations like undo, backtracking    |

 * 
 * */
		
		
	}

}
