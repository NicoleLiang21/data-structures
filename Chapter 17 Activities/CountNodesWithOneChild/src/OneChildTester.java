/**
  This class demonstrates the tree class.
*/
public class OneChildTester
{
  public static void main(String[] args)
  {
      OneChild t4 = new OneChild("Savannah");
      OneChild t2 = new OneChild("Peter", t4, null);
      OneChild t3 = new OneChild("Zara");
      OneChild t1 = new OneChild("Anne", t2, t3);
      System.out.println("Nodes with one child: " + t1.countNodesWithOneChild());
  }
}