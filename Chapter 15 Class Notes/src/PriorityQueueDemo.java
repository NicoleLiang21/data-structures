import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        // Create a to-do list
        // The WordOrder class has a priority and a description
        Queue<WorkOrder> todo = new PriorityQueue<>();

        todo.add(new WorkOrder(3, "Water Plants"));
        todo.add(new WorkOrder(2, "Make Dinner"));
        todo.add(new WorkOrder(2, "Conquer World"));
        todo.add(new WorkOrder(9, "Play Video games"));
        todo.add(new WorkOrder(1, "Study for the Ch. 15 Test"));

        // Objects are not stored in priority order
        System.out.println(todo);

        // Objects will be removed in priority order
        while (todo.size() > 0)
            System.out.println(todo.remove());
    }
}
