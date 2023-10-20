import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * An implementation of a stack as a sequence of nodes.
*/
public class LinkedListStack
{
    private Node first;


    /**
     * Constructs an empty stack.
    */
    public LinkedListStack()
    {
        first = null;
    }


    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to add
    */
    public void push(Object element)
    {
        Node newNode = new Node();
        newNode.data = element;

        // Put the new node on top of the stack -- the next element was the first element
        newNode.next = this.first;

        // Update the status of the new element on top of the stack
        this.first = newNode;

    }


    /**
        Removes the element from the top of the stack.
        @return the removed element
     */
    public Object pop()
    {
        if (this.empty())
            return new NoSuchElementException(); 

        Object element = this.first.data;

        // Replace the top (removed) element with the net element
        this.first = this.first.next;

        return element;
    }


    /**
     * Checks whether this stack is empty.
     *
     * @return true if the stack is empty
    */
    public boolean empty()
    {
        return this.first == null;
    }


    static class Node
    {
        public Object data;
        public Node next;
    }
}
