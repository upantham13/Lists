import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Models orchard objects with an array list of class Tree.
 *
 * @author Umasathvik Pantham
 * @version 05/12/2021
 */
public class Orchard
{
    private Tree[] orchard;
    private int count;

    /**
     * Constructor for objects of class Orchard.
     * 
     * It creates an empty array of class Tree.
     */
    public Orchard(int length)
    {
        orchard = new Tree[length];
        count = 0;
    }

    /**
     * Adds a tree to the specified index position
     * of the array if index is valid.
     * It does not do anythings otherwise.
     *
     * @param tree the Tree object to add 
     * @param index the position to add the tree
     */
    public void add(Tree tree, int index)
    {
        if (count < orchard.length && 
            index >= 0 && index <= count)
        {
            for (int i = count; i > index; i --)
                orchard[i] = orchard[i - 1];
    
            orchard[index] = tree;
            count ++;
        }
    }
    
    /**
     * Gets the last tree with the largest height.
     * 
     * @return the last tallest tree in this orchard
     *         null if the orchard is empty
     */
    public Tree lastTallTree()
    {
        double height = 30;
        for (int i = count - 1; i >= 0; i--)
            {
                Tree lastTallTree = orchard[i];
                if (lastTallTree.getHeight() - height >= 0)
                    return lastTallTree;
            }
        return null;
    }
    
    /**
     * Determines if a tree of the specified type is in this orchard.
     * 
     * @param type the specified type of tree 
     * @return true if this orchard has a tree of the given type
     *         false otherwise
     */
    public boolean contains(String type)
    {
        for (int i = 0; i < orchard.length; i ++)
        {
            if (orchard[i] != null && orchard[i].getType().equals(type))
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Gets the last most expensive item of this order.
     * 
     * @return the last most expensive item of this order
     *         null if this order is empty
     */
    public ArrayList<String> treeList()
    {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < orchard.length; i ++)
        {
            if (orchard[i] != null) {
                list.add(orchard[i].getType());
            }
        }
        return list;
    }
    
    /**
     * Sorts the array based on interface Comparable.
     */
    public void sort()
    {
        Arrays.sort(orchard, 0, count);
    }
}
