package LRUCacheProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cache Memory Size :-");
        int size = sc.nextInt();
        if(size==0) {
            System.out.println("Give valid Size");
            return;
        }
        LRU LRU = new LRU(size);

        System.out.print("Enter Operation to Perform :- ");
        System.out.println("1.Put \n2.Get \n3.Exit");
        int ch=sc.nextInt();

        do {
            switch (ch) {
                case 1:{
                    System.out.print("Key:-");
                    int key=sc.nextInt();
                    System.out.print("\nValue:-");
                    int value=sc.nextInt();
                    LRU.put(key,value);
                }
                    break;
                case 2: {
                    System.out.print("Key:-");
                    int key = sc.nextInt();
                    int value=LRU.get(key);
                    System.out.println("Value :- "+value);
                }
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
            System.out.print("Enter Operation to Perform :- ");
            System.out.println("1.Put \n2.Get \n3.Exit");
            ch = sc.nextInt();
        } while (ch != 3);
    }
}
