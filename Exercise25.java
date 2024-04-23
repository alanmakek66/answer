public class Exercise25 {
    private Node head;

    public Exercise25() {
        this.head = null;
    }

    private class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at the front of the list. */
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    /*
     * Appends a new node at the end. This method is defined inside LinkedList class
     * shown above
     */
    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
    }

    /*
     * This function prints contents of linked list starting from the given node
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /*
     * Driver program to test above functions.
     */
    public static void main(String[] args) {
        Exercise25 llist = new Exercise25(); // Linked List

        llist.append(6);
        llist.push(7);
        llist.push(1);
        llist.append(4);

        System.out.println("Created Linked list is: ");
        llist.printList();
    }
}