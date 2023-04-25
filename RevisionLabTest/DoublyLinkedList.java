package RevisionLabTest;

public class DoublyLinkedList {

    public static void main(String[] args) {
        // Doubly Linked List 1
        DoublyLinkedList subway = new DoublyLinkedList();
        subway.addToHead("Times Square");
        subway.addToHead("Grand Central");
        subway.addToHead("Central Park");
        subway.printList();

        subway.addToTail("Penn Station");
        subway.addToTail("Wall Street");
        subway.addToTail("Brooklyn Bridge");
        subway.printList();

        subway.removeHead();
        subway.removeTail();
        subway.printList();

        subway.removeByData("Times Square");
        subway.printList();

        // Doubly Linked List 2
        System.out.println();
        DoublyLinkedList WorkingDays = new DoublyLinkedList();

        System.out.println("Weekdays: ");
        WorkingDays.addToHead("Tuesday");
        WorkingDays.addToHead("Monday");
        WorkingDays.addToHead("Sunday");
        WorkingDays.addToHead("Saturday");

        WorkingDays.addToTail("Wedensday");
        WorkingDays.addToTail("Thursday");
        WorkingDays.addToTail("Friday");
        WorkingDays.printList();

        // Removing Weekend Holiday (Saturday & Friday)
        System.out.println("\nWorkingdays: ");
        WorkingDays.removeHead();
        WorkingDays.removeTail();
        WorkingDays.printList();

        // Monday is The Global Labor's Day, so we remove it
        System.out.println("\nWithout Labor's Day: ");
        WorkingDays.removeByData("Monday");
        WorkingDays.printList();
    }

    public Node head;
    public Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;

        if (currentHead != null) {
            currentHead.setPreviousNode(newHead);
            newHead.setNextNode(currentHead);
        }
        this.head = newHead;

        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    public void addToTail(String data) {
        Node newTail = new Node(data);
        Node currentTail = this.tail;

        if (currentTail != null) {
            currentTail.setNextNode(newTail);
            newTail.setPreviousNode(currentTail);
        }
        this.tail = newTail;

        if (this.head == null) {
            this.head = newTail;
        }
    }

    public String removeHead() {
        Node removedHead = this.head;

        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();

        if (this.head != null) {
            this.head.setPreviousNode(null);
        }
        if (removedHead == this.tail) {
            this.removeTail();
        }
        return removedHead.data;
    }

    public String removeTail() {
        Node removedTail = this.tail;

        if (removedTail == null) {
            return null;
        }
        this.tail = removedTail.getPreviousNode();

        if (this.tail != null) {
            this.tail.setNextNode(null);
        }
        if (removedTail == this.head) {
            this.removeHead();
        }
        return removedTail.data;
    }

    public Node removeByData(String data) {
        Node nodeToRemove = null;
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.data == data) {
                nodeToRemove = currentNode;
                break;
            }
            currentNode = currentNode.getNextNode();
        }

        if (nodeToRemove == null) {
            return null;
        }
        if (nodeToRemove == this.head) {
            this.removeHead();
        } else if (nodeToRemove == this.tail) {
            this.removeTail();
        } else {
            Node nextNode = nodeToRemove.getNextNode();
            Node previousNode = nodeToRemove.getPreviousNode();
            nextNode.setPreviousNode(previousNode);
            previousNode.setNextNode(nextNode);
        }
        return nodeToRemove;
    }

    public String printList() {
        Node currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }

}