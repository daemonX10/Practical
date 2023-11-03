public class single_list {
    public static class SingleList {
        Node head; // head of list

        // Linked list Node.
        // This inner class is made static
        // so that main() can access it
        static class Node {
            int data;
            Node next;

            // Constructor
            Node(int d) {
                data = d;
                next = null;
            }
        }

        // Method to insert a new node
        public static SingleList insert(SingleList list, int data) {
            // Create a new node with given data
            Node new_node = new Node(data);
            new_node.next = null;

            // If the Linked List is empty,
            // then make the new node as head
            if (list.head == null) {
                list.head = new_node;
            } else {
                // Else traverse till the last node
                // and insert the new_node there
                Node last = list.head;
                while (last.next != null) {
                    last = last.next;
                }

                // Insert the new_node at last node
                last.next = new_node;
            }

            // Return the list by head
            return list;
        }

        // Method to print the LinkedList.
        public static void printList(SingleList list) {
            Node currNode = list.head;

            System.out.print("LinkedList: ");

            // Traverse through the LinkedList
            while (currNode != null) {
                // Print the data at current node
                System.out.print(currNode.data + " ");

                // Go to next node
                currNode = currNode.next;
            }

            System.out.println();
        }

        // Driver code
        public static void main(String[] args) {
            /* Start with the empty list. */
            SingleList list = new SingleList();

            // Insert the values
            list = insert(list, 1);
            list = insert(list, 2);
            list = insert(list, 3);
            list = insert(list, 4);
            list = insert(list, 5);

            // Print the LinkedList
            printList(list);
        }
    }
}
