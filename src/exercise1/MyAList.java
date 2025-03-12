package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyAList<E> implements Iterable<E>
{
    private ArrayList<E> list;
    
    // Constructor
    public MyAList() {
        list = new ArrayList<E>();
    }
    
    // Add an item to the end of the list
    public void add(E item) {
        list.add(item);
    }
    
    // Add all items from another MyAList
    public void addAll(MyAList<E> items) {
        for (E item : items) {
            list.add(item);
        }
    }
    
    // Get item at specified index
    public E get(int index) {
        return list.get(index);
    }
    
    // Remove item at specified index
    public void remove(int index) {
        list.remove(index);
    }
    
    // Replace item at specified index
    public void set(int index, E item) {
        list.set(index, item);
    }
    
    // Get the number of items in the list
    public int size() {
        return list.size();
    }
    
    // Check if the list is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    // Convert list to an array
    public Object[] toArray() {
        return list.toArray();
    }
    
    // Remove all elements from the list
    public void clear() {
        list.clear();
    }
    
    // Return an iterator for the list
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}