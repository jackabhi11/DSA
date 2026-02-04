package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class MergingTwoSortedLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the first linked list
        int n = sc.nextInt();
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        
        // Read the second linked list
        int m = sc.nextInt();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }
        
        // Merge the two sorted linked lists
        LinkedList<Integer> mergedList = mergeSortedLists(list1, list2);
        
        // Print the merged linked list
        for (int value : mergedList) {
            System.out.print(value + " ");
        }
        
        sc.close();
    }
    
    // Function to merge two sorted linked lists
    public static LinkedList<Integer> mergeSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        // Write your code here
        LinkedList<Integer> resList = new LinkedList<>(); // Placeholder return value
       
        int size1 = list1.size();
        int size2 = list2.size();

        int i = 0;
        int j = 0;

        while(i < size1 && j < size2) {
            int a = list1.get(i);
            int b = list2.get(j);
            if (a < b) {
               resList.add(a);
               i++;
            } else {
                resList.add(b);
                j++;
            }
            
        }

        if(i < size1) {
            while(i < size1) {
                int a = list1.get(i);
                resList.add(a);
                i++;
            }
        }

        if(j < size2) {
            while(j < size2) {
                int b = list2.get(j);
                resList.add(b);
                j++;
            }
        }
       
        return resList;  
    }
}