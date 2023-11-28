import java.util.HashMap;

public class Square {

	//The Square class is the smallest building block to construct the entire board, and will be referred to by Row and Cube
	//objects for logistic simplification.
	
	public static int value = 0;
	public static HashMap<Integer,Boolean> possibleNums = new HashMap<Integer,Boolean>() {{
		put(1,true);
		put(2,true);
		put(3,true);
		put(4,true);
		put(5,true);
		put(6,true);
		put(7,true);
		put(8,true);
		put(9,true);
		}};
		
		
	/**
	 * This is the base constructor for the Square class, taking no value and having all possibilities.
	 * 
	 * @param
	 * 
	 */
	public Square()
	{
		
	}
	
	/**
	 * This is the value constructor for the Square class, taking a value and removing all possibilities.
	 * 
	 * @param
	 * 
	 */
	public Square(int value)
	{
		this.value = value;
		this.possibleNums.replaceAll((key,val)->val=false);
	}
	
	/**
	 * This is the getter for value. 
	 * 
	 * @return value Int value of the square, 0 for unfilled squares.
	 * 
	 */
	public int getValue()
	{
		return value;
	}
	
	/**
	 * This is the setter for value. 
	 * 
	 * @param value Int value of the square
	 * 
	 */
	public void setValue(int value)
	{
		this.value = value;
	}
	
	/**
	 * This is the getter for possibleNums. 
	 * 
	 * @return possibleNums Hashmap pairs showing which numbers are possible to be chosen.
	 * 
	 */
	public HashMap getPossNums()
	{
		return possibleNums;
	}
	
	/**
	 * Removes the given number from the list of possible numbers.
	 * 
	 * @param num Integer number to be removed from possibility list
	 * 
	 */
	public void setPossNums(int num)
	{
		possibleNums.replace(num, false);
	}
}
