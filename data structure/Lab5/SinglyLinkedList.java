package Lab5;
import java.util.NoSuchElementException;

public class SinglyLinkedList <E> implements Iterable<E> {
    public Iterator<E> iterator() {
        return new SinglyLinkedListIterator<E>();
    } // end of iterator method

    public class Node<E> {
        private E data;
        private Node<E> next;

        // constructors
        public Node() {
            this.data = null;
            this.next = null;
        }// end of constructor

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }// end of constuctor

        public Node(E data) {
            this.data = data;
            this.next = null;
        }// end of constuctor]

        // getters and setterse
        public E getData() {
            return data;
        }// end of getData

        public Node<E> getNext() {
            return next;
        }// end of getNext

        public void setNext(Node<E> next) {
            this.next = next;
        }// end of setNext
    } // end of node class

    private class SinglyLinkedListIterator<E> implements Iterator<E> {
        private SinglyLinkedLists<E>.Node<E> cursor = (SinglyLinkedLists<E>.Node<E>) getHead();
        private SinglyLinkedLists<E>.Node<E>  recent = null;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }// end of hasNext

        @Override
        public SinglyLinkedLists<E>.Node<E> next() throws NoSuchElementException {
            if (cursor==null) {
                throw new NoSuchElementException("no such elements");
            } // end of if
            recent = cursor;
            cursor = cursor.getNext();
            return recent;
        } // end of next
    } // end of iterator class

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    // constructors
    public SinglyLinkedLists() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }// end of constructor

    public int size() {
        return this.size;
    }// end of size

    public boolean isEmpty() {
        return this.size == 0;
    }// end of isEmpty

    public Node<E> getHead() {
        return this.head;
    }

    public E getFirstElement() {
        if (isEmpty())
            return null; // linkedlist is empty

        return head.getData(); // linkedlist isnt empty
    }// end of getFirstElement

    public E getLastElement() {
        if (isEmpty())
            return null; // linkedlist is empty

        return tail.getData(); // linkedlist isnt empty
    }// end of getLastElement

    public void addFirst(E element) {
        // create new node and make it head
        Node<E> newest = new Node<>(element, head); // (next is the old head and data is parameter)
        head = newest;
        if (size == 0) // if linked list is empty
            tail = head; // head is the tail
        size++;
    }// end of addFirst
    
    public void insert(E element) {
        Node<E> newest = new Node<>(element); // (next is the old head and data is parameter)
        if (head == null) { 
            head = newest;
            tail = newest;
            size++;
        } else if ((Integer) newest.data < (Integer) head.data) {
            addFirst(element);
        } else {
            Node<E> currentNode = head;
            while (currentNode.next != null && (Integer) newest.data > (Integer) currentNode.next.data) {
                currentNode = currentNode.next;
            } // end of while
            if (currentNode.next == null) {
                addLast(element);
            } else {
                newest.next = currentNode.next;
                currentNode.next = newest;
                size++;
            } // end of inner elseif
        } // end of outer elseif
    } // end of method

    public void addLast(E element) {
        // creates new node
        Node<E> newest = new Node<>(element, null);
        if (isEmpty()) {
            head = newest; // linkedlist is empty
        } else {
            tail.setNext(newest); // tails's next is now pointing to the new tail
        } // end of if else
        tail = newest; // tail is now the newest
        size++;
    } // end of addLast

    public void show() {
        Node<E> node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        } // end of while
        System.out.println();
    } // end of show
} // end of singly linked

