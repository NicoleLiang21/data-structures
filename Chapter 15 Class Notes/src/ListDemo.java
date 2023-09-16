import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        /* addLast() method can populate a list */
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Gamora");
        // list is currently T, N, P, G

        /*
         * listIterator() method creates a new list iterator that is positioned at the head
         * 
         * " | " represents iterator position
         */
        ListIterator<String> iterator = staff.listIterator();  // | T, N, P, G
        
        /* next() method advances iterator over next element in the list */
        iterator.next();  // T | N, P, G

        /* next() method also returns element the iterator passed over */
        String avengers = iterator.next();  // T, N | P, G
        System.out.println(avengers);  // Prints out Natasha 

        /* add() method inserts an element at the iteratore position
         * Iterator is then positioned after the element that was added
         */
        iterator.add("Bruce");  // T, N, B | P, G
        iterator.add("Rocket");  // T, N, B, R | P, G

        /* remove() method removes element returned by the last call to next() or previous()
         * remove() can ONLY be called after calling next() or previous()
         * remove() CANNOT be called after calling add
         */
        iterator.next();  // T, N, B, R, P | G
        iterator.remove();  // T, N, B, R | G

        System.out.println(staff);
        System.out.println("Expected: [Tony, Natasha, Bruce, Rocket, Gamora]");

        /* set() method updates element returned by the last call to next() or previous() */
        iterator.previous();  // T, N, B | R, G
        iterator.set("Scott");  // T, N, B | S, G

        /* hasNext() method is used to determine if there is a next node in the iterator 
         * Often used in the condition of a while loop
        */
        iterator = staff.listIterator();  // | T, N, B, S, G
        
        while(iterator.hasNext())
        {
            String n = iterator.next();
            if (n.equals("Natasha"))  // T, N | B, S, G
                iterator.remove();  // T | B, S, G
        }  // T, B, S, G |

        /* Enhanced for loops work with linked lists */
        for (String n: staff)
        {
            System.out.print(n + " ");
        }
        System.out.println("\nExpected: Tony Bruce Scott Gamora");

        /* 
         * ConcurrentModification Exception
         * CANNOT modify a linked list while also using an iterator UNLESS you use the iterator to do so
         */
        iterator = staff.listIterator();
        while(iterator.hasNext())
        {
            String n = iterator.next();
            //if (n.equals("Scott"))
            //    staff.remove("Scott");
        }

        /* 
         * ConcurrentModification Exception
         * Enhanced for loop automatically creates an iterator
         */
         for (String n: staff)
         {
            if (n.equals("Scott"))
                staff.add("Rocket");
         }

    }
}
