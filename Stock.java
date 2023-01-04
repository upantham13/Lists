
/**
 * Models stock objects managed by a financial company.
 * 
 * @author  Umasathvik Pantham
 * @version 05/12/2021
 */
public class Stock implements Comparable
{
    private String symbol;
    private double price;

    /**
     * Constructs a Stock object with the given symbol and price.
     * 
     * @param theSymbol this stock's symbol
     * @param the Price this stock's price
     */
    public Stock(String theSymbol, double thePrice)
    {
        symbol = theSymbol;
        price = thePrice;
    }

    /**
     * Gets the price of this stock.
     * 
     * @return the current price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Gets the symbol for this stock.
     * 
     * @return the symbol
     */
    public String getSymbol()
    {
        return symbol;
    }

    /**
     * Returns a string representing this stock.
     * 
     * @return a string in the format
     *         Stock[symbol=AAPL,price=134.87]
     */
    @Override
    public String toString()
    {
        String s = getClass().getName() + "[symbol=" + symbol
          + ",price=" + price + "]";
        return s;
    }
    
    /**
     * Compares this student with another student, first 
     * based on GPA then based on name.
     * 
     * @param anotherObj the object to compare with
     * @return an integer representing the comparing result
     */
    public int compareTo(Object anotherObj)
    {
        Stock another = (Stock)anotherObj;
            
            int result = Double.compare(this.price, another.price);
            
            if(result == 0)
               result = this.symbol.compareTo(another.symbol);
            
            return result;
    }
}