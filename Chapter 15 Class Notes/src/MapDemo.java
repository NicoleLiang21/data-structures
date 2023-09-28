import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /* Map interface is generic
         * First type = key
         * Second type = value
         */
        Map<String, Color> favColors = new HashMap<>();
        
        // Add elements to a map using the put method
        favColors.put("Peter", Color.black);
        favColors.put("Seth", Color.blue);
        favColors.put("Celeste", Color.orange);
        
        // 2 different keys may have the same value
        favColors.put("Dr. Miller", Color.orange);

        // Same key CANNOT have two different values
        // Using put on an existing key changes its value
        favColors.put("Peter", Color.yellow);

        // Create a set of the keys in a map
        Set<String> keys = favColors.keySet();
        for (String key : keys)
        {
            System.out.println(key + " (" + key.hashCode() + "):" + favColors.get(key));
        }
    }
}
