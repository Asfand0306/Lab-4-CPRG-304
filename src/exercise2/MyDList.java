package exercise2;

public class MyDList<E>
{
    private MyNode<E> head;
    private MyNode<E> tail;
    private int size;
    
    // Constructor
    public MyDList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    // Get the head of the list
    public MyNode<E> getHead() {
        return head;
    }
    
    // Add an item to the beginning of the list
    public void addFirst(E item) {
        if (isEmpty()) {
            // List is empty, so new node becomes both head and tail
            head = new MyNode<>(item, null, null);
            tail = head;
        } else {
            // Create new node with next pointing to current head
            MyNode<E> newNode = new MyNode<>(item, null, head);
            // Update current head's prev to point to new node
            head.setPrev(newNode);
            // Update head to new node
            head = newNode;
        }
        size++;
    }
    
    // Add an item to the end of the list
    public void addLast(E item) {
        if (isEmpty()) {
            // List is empty, so new node becomes both head and tail
            head = new MyNode<>(item, null, null);
            tail = head;
        } else {
            // Create new node with prev pointing to current tail
            MyNode<E> newNode = new MyNode<>(item, tail, null);
            // Update current tail's next to point to new node
            tail.setNext(newNode);
            // Update tail to new node
            tail = newNode;
        }
        size++;
    }
    
    // Remove and return the first item
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        
        E result = head.getElement();
        
        if (head == tail) {
            // Only one element in the list
            head = null;
            tail = null;
        } else {
            // Update head to next node
            head = head.getNext();
            // Set new head's prev to null
            head.setPrev(null);
        }
        
        size--;
        return result;
    }
    
    // Remove and return the last item
    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        
        E result = tail.getElement();
        
        if (head == tail) {
            // Only one element in the list
            head = null;
            tail = null;
        } else {
            // Update tail to previous node
            tail = tail.getPrev();
            // Set new tail's next to null
            tail.setNext(null);
        }
        
        size--;
        return result;
    }
    
    // Get the number of items in the list
    public int size() {
        return size;
    }
    
    // Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }
}