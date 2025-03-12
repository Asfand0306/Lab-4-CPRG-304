package exercise2;

public class MyNode<E>
{
    private E element;
    private MyNode<E> next;
    private MyNode<E> prev;
    
    // Constructor
    public MyNode(E element, MyNode<E> prev, MyNode<E> next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }
    
    // Getters and setters
    public E getElement() {
        return element;
    }
    
    public void setElement(E element) {
        this.element = element;
    }
    
    public MyNode<E> getNext() {
        return next;
    }
    
    public void setNext(MyNode<E> next) {
        this.next = next;
    }
    
    public MyNode<E> getPrev() {
        return prev;
    }
    
    public void setPrev(MyNode<E> prev) {
        this.prev = prev;
    }
}