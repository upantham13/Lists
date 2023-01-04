/**
 * The class models trees with a type and a height.
 *
 * @author  Umasathvik Pantham
 * @version 05/12/2021
 */
public class Tree implements Comparable
{
    private String type;
    private double height;

    /**
     * Constructor for objects of class Tree.
     * 
     * @param typeParam the type of this tree
     * @param heightParam the height of this tree
     */
    public Tree(String typeParam, double heightParam)
    {
        type = typeParam;
        height = heightParam;
    }

    /**
     * Gets the type of this tree.
     *
     * @return the type of this tree
     */
    public String getType()
    {
        return type;
    }
    
    /**
     * Sets the type of this tree.
     *
     * @return the type of this tree
     */
    public void setType(String newType)
    {
        type = newType;
    }
    
    /**
     * Gets the height of this treee.
     * 
     * @return the height of this tree
     */
    public double getHeight()
    {
        return height;
    }
    
    /**
     * Sets the height of this tree.
     * 
     * @param newHeight the new height of this treee
     */
    public void setHeight(double newHeight)
    {
        height = newHeight;
    }
    
    /**
     * Gets a string representing this tree.
     * 
     * @return a string representing this tree
     *         in the format "Tree[Type:lemon,Height:12.5]"
     */
    @Override
    public String toString()
    {
       return "Tree[Type:" + type + ",Height:" + (int) height + "]";
    }
    
    /**
     * @param anotherObj the object to compare with
     * @return an integer representing the comparing result
     */
         public int compareTo(Object anotherObj)
         {
            Tree another = (Tree)anotherObj;
            
            int result = Double.compare(this.height, another.height);
            
            if(result == 0)
               result = this.type.compareTo(another.type);
            
            return result;
         }
}
