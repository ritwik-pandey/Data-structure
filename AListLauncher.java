public class AListLauncher{
	public static void main(String[] args){
		AList list = new AList();
		for(int i = 0 ; i < 203 ; ++i){
			list.addLast(i);
		}
		System.out.println("Last element = " + list.getLast());
		list.removeLast();
		System.out.println(list.get(10));
		list.print();
	}
}
