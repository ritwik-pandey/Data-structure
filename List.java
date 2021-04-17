import java.util.*;
class List{
	public int number;
	public List rest;
	
	public List(int a , List b){
		number = a;
		rest = b;
	}

	public static void main(String[] args){
		List list = new List(15 , null);
		list = new List(10 , list);
		list = new List(5 , list);
		System.out.println(list.number + " "+ list.rest.number + " " + list.rest.rest.number);
		int size = list.getsize();
		System.out.println(size);
		int i = 1;
		list.get(i);
	}
	public int getsize(){
		if(rest == null){
			return 1;
		}
		return 1 + rest.getsize();
	}
	public void get(int i){
		if(i == 0){
			System.out.println(number);
			return;
		}
		rest.get(--i);
	}
}
