public class BranchTester
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
        System.out.println("Size: " + t1.size());
        System.out.println("Expected: 4");
        System.out.println("Leaf count: " + t1.leafCount());
        System.out.println("Expected: 2");
    }
}
