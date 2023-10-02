package nodeTask2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(3);
        list.insertAtHead(2);
        list.insertAtHead(1);

        System.out.println("Задайте число, чтобы поместить его во главе");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        list.insertAtHead(data);


        // Выводим элементы списка.
        Node current = list.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}