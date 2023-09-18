import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Business utility methods.
*/
public class Business
{
    /**
      * Removes every nth element from the linked list
      *
      * @param employeeNames the linked list to remove from
      * @param n                 the parameter to determine "nth"
     */
    public static void downsize(LinkedList<String> employeeNames, int n)
    {
        ListIterator iter;

        for (int i = n-1; i < employeeNames.size(); i += 1)
        {
            iter = employeeNames.listIterator(i);
            iter.next();
            iter.remove();
        }

    }
}
