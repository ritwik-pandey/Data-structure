import java.util.*;
public class AList implements ListB{
	int size;
	private int items[];
	public AList(){
		items = new int[100];
		size = 0;
	}

	public void resize(int capacity){
		int[] a = new int[capacity];
		System.arraycopy(items , 0 , a , 0 , size);
		items = a;
	}

	public int getFirst(){
		return items[0];
	}

	public void addLast(int a){
		if(items.length == size){
			resize(size * 2);
		}
		items[size] = a;
		++size;
	}

	public int get(int a){
		return items[a];
	}

	public int getLast(){
		return items[size - 1];
	}
	public int size(){
		return size;
	}
	public void removeLast(){
		--size;
	}
	public void print(){
		for(int i = 0 ; i < size ; ++i){
			System.out.print(items[i] + " ");
		}
		System.out.println();
	}
}
