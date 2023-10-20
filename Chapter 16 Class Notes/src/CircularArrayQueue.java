import java.util.NoSuchElementException;

/**
    An implementation of a queue as a circular array.
*/
public class CircularArrayQueue
{
    private Object[] elements;
    private int head, tail, currentSize;


    /**
        Constructs an empty queue.
    */
    public CircularArrayQueue()
    {
        final int INITIAL_SIZE = 5; // Maximum number of elements in the list

        elements = new Object[INITIAL_SIZE]; 
        head = 0;
        tail = 0;
        currentSize = 0; // Number of elements in the list
    }


    /**
        Checks whether this queue is empty.
        @return true if this queue is empty
    */
    public boolean empty()
    {
        return this.currentSize == 0;
    }


    /**
        Adds an element to the tail of this queue.
        @param element the element to add
    */
    public void add(Object element)
    {
        this.currentSize++;
        this.elements[this.tail] = element;
        this.tail++;

        // Reset the tail to 0 if needed
        this.tail %= this.elements.length;
    }


    /**
        Removes an element from the head of this queue.
        @return the removed element
    */
    public Object remove()
    {
        if (this.empty())
            throw new NoSuchElementException();

        this.currentSize--;
        Object element = this.elements[this.head];

        // Reset the head to 0 if needed
        this.head = (this.head + 1) % this.elements.length;    
    
        return element;
    }


    /**
        Grows the element array if the current size equals the capacity.
    */
    private void growIfNecessary()
    {
        if(this.currentSize == this.elements.length)
        {
            Object[] newElements = new Object[2 * this.elements.length];
            for(int i = 0; i < this.elements.length; i++)
            {
                newElements[i] = this.elements[(head + i) % this.elements.length];
            }
            this.elements = newElements;
            this.head = 0;
            this.tail = this.currentSize;
        }
    }

    
}//CircularArrayQueue
