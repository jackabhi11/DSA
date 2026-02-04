package LinkedList;
import java.util.*;

public class CollectionClassImplementation {
	public static void print(LinkedList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " -> ");
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.addFirst(10);
		
		print(list);
		
        list.add(3, 100);
        
        print(list);
        
        list.add(5, 100);
        
        print(list);
        
        
	}

}
