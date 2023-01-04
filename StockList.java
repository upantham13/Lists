import java.util.ArrayList;
import java.util.Collections;
/**
 * Manages a collection of Stack objects.
 * 
 * @author Umasathvik Pantham
 * @version 05/12/2021
 */
public class StockList
{
    ArrayList<Stock> stocks;

    /**
     * Constructs a StockList object by initializing
     * stocks to an empty array list of Stock.
     */
    public StockList()
    {
        stocks = new ArrayList<Stock>();
    }
   
    /**
     * Adds a stock to the end of stocks.
     * 
     * @param stock the stock to add
     */
    public void add(Stock stock)
    {
        stocks.add(stock);
    }
    
    /**
     * Swaps the two stocks at the specified indexes if
     * both indexes are valid and do nothing otherwise.
     * 
     * @param index1 the index of the first stock to swap
     * @param index2 the index of the second stock to swap
     */
    public void swap(int index1, int index2)
    {
        if (index1 >= 0 && index1 < stocks.size() &&
            index2 >= 0 && index2 < stocks.size())
        {
            Stock temp = stocks.get(index1);
            stocks.set(index1, stocks.get(index2));
            stocks.set(index2, temp);
            
        }
    }

    /**
     * Gets the symbol of the cheapest stock in this list.
     * If multiple stocks have the same cheapest price,
     * then return the first one.
     * 
     * @return the symbol of the first cheapest book
     *         "" if this store is empty
     */
    public String cheapest()
    {
        int size = stocks.size();
        if (size == 0)
            return "";
            
        Stock cheap = null;
        double min = Double.MAX_VALUE, thePrice;
        for (Stock stock: stocks)
        {
            thePrice = stock.getPrice();
            if (thePrice < min)
            {
                min = thePrice;
                cheap = stock;
            }
        }
        
        return cheap.getSymbol();
    }
    
    /**
     * Gets a string including all stocks in this list.
     * 
     * @return the string returned from calling method toString()
     *         on the list
     */
    @Override
    public String toString()
    {
        return stocks.toString();
    }
    
    /**
     * Sorts the array based on interface Comparable.
     */
    public void sort()
    {
        Collections.sort(stocks);
    }
}