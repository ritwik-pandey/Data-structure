public class SLLlist implements ListB{
	private IntNode first;
	private int size;
	/** Other class IntNode*/
	public class IntNode{
        	int item;
        	IntNode next;
        	public IntNode(int i , IntNode n){
                	item = i;
                	next = n;
        	}
	}
	/** The first item if it is exist it is at sentinel.next */
	private IntNode sentinel;
	/** Creates a null node */
	public SLLlist(){
		sentinel = new IntNode(13 , null);
		size = 0;
	}
	/**Creates a node with the value */
	public SLLlist(int a){
		sentinel = new IntNode(13 , null);
		sentinel = new IntNode(a , null);
		size = 1;
	}
	/**Add element to the last*/
	public void addLast(int a){
		IntNode p = sentinel;
		while(p.next != null){
			p = p.next;
		}
		p.next = new IntNode(a , null);
		++size;
	}
	/** Gives the first variable */
	public int getFirst(){
                return sentinel.next.item;
        }
	/** Add to the front */
	public void add(int x){
		sentinel.next = new IntNode(x , sentinel.next);
		++size;
        }

	/** Returns the last element */
	public int getLast(){
		IntNode p = sentinel;
		while(p.next != null){
			p = p.next;
		}
		return p;
	}
	/** Returns the last item and removes it*/

	public int removeLast(){
		IntNode back = getLast();
		if(sentinel == back){
			return null;
		}
		size = size - 1;
		IntNode p = sentinel;
		while(p.next.next != back){
			p = p.next;
		}
		p.next = null;
		return back.item;
	}

	public int get(int a){
		int p = 0;
		IntNode b = sentinel.next;
		while(b != null && p != a){
			++p;
			b = b.next;
		}
		if(b == null){
			return 0;
		}
		return b.item;
	} 

	/** Prints the list */
        public void printList(){
                IntNode print = sentinel.next;
		while(print != null){
			System.out.print(print.item + " ");
			print = print.next;
		}
		System.out.println();
        }

	public int size(){
		return size;
	}

	public static void main(String[] args){
		SLLlist list = new SLLlist();
		list.add(10);
		list.add(5);
		list.addLast(20);
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.get(3));
		list.printList();
	}
}
