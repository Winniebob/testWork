package nodeTask2;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        // Если список пустой, новый элемент становится головой списка.
        if (head == null) {
            head = newNode;
        } else {
            // Устанавливаем указатели для нового элемента и текущей головы списка.
            newNode.next = head;
            head.prev = newNode;
            // Обновляем голову списка.
            head = newNode;
        }
    }
}