/**
    A binary tree in which each node has two children.
*/
public class BinaryTree
{
    private Node root;

    static class Node
    {
        public Object data;
        public Node left, right;
    }

    /**
        Constructs an empty tree.
    */
    public BinaryTree()
    {
        this.root = null;
    } 

    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public BinaryTree(Object rootData) 
    {
        this.root.data = rootData;
    }

    /**
        Constructs a binary tree.
        @param rootData the data for the root
        @param left the left subtree
        @param right the right subtree
    */
    public BinaryTree(Object rootData, OneChild left, OneChild right)
    {
        this(rootData);
        this.root.left = left.root;
        this.root.right= right.root;
    }


    /**
        Returns the height of the subtree whose root is the given node.
        @param n a node or null
        @return the height of the subtree, or 0 if n is null
    */
    private static int height(Node n)
    {
        if (n == null)
            return 0;
        else
            return 1 + Math.max(OneChild.height(n.left), OneChild.height(n.right));
    }

    /**
        Returns the height of this tree.
        @return the height
    */
    public int height()
    {
        return OneChild.height(this.root);
    }

    /**
        Checks whether this tree is empty.
        @return true if this tree is empty
    */
    public boolean isEmpty()
    {
         return this.root == null;
    }

    /**
        Gets the data at the root of this tree.
        @return the root data
    */
    public Object data()
    {
        return this.root.data;
    }
    
    /**
        Gets the left subtree of this tree.
        @return the left child of the root
    */
    public OneChild left() 
    { 
        OneChild subtree = new OneChild();
        subtree.root = this.root.left;
        return subtree;
    }

    /**
        Gets the right subtree of this tree.
        @return the right child of the root
    */
    public OneChild right() 
    { 
        OneChild subtree = new OneChild();
        subtree.root = this.root.right;
        return subtree;
    }
}
