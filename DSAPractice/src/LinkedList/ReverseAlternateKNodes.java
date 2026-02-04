package LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseAlternateKNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of nodes
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        
        // Read the values of the nodes
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        // Read the value of K
        int K = sc.nextInt();
        
        // Reverse alternate K nodes
        reverseAlternateKNodes(list, K);
        
        // Print the modified linked list
        printList(list);
        
        sc.close();
    }
    
    // Function to reverse alternate K nodes in the linked list
    public static void reverseAlternateKNodes(LinkedList<Integer> list, int K) {
        // Write your code here
        for(int i = 0; i < list.size(); i+=K) {
            int sIndex = i;
            int lIndex = i+3;
            while(sIndex < lIndex) {
                int node2 = list.get(lIndex);
                int node1 = list.remove(sIndex);

                list.add(sIndex, node2);
                list.remove(lIndex);
                list.add(lIndex, node1);
            }
        }
    }
    
    // Function to print the linked list
    public static void printList(LinkedList<Integer> list) {
        for (Integer value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}