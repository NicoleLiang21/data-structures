import java.util.Iterator;

/**
    This program demonstrates tree traversal.
*/
public class TraversalDemo
{
    public static void main(String[] args)
    {
        Branch t1 = new Branch("Anne");
        Branch t2 = new Branch("Peter");
        t1.addSubtree(t2);
        Branch t3 = new Branch("Zara");
        t1.addSubtree(t3);
        Branch t4 = new Branch("Savannah");
        t2.addSubtree(t4);

        // Count short names with visitor
        /*class ShortNameCounter implements Tree.Visitor
        {
            public int counter = 0;
            public void visit(Object data)
            {
                System.out.println(data);
                if (data.toString().length() <= 5) { counter++; }
            }
        }

        ShortNameCounter v = new ShortNameCounter();

        t1.preorder(v);
        System.out.println("Short names: " + v.counter);        */
    }
}
