package MainPackage;

public class MyInteger {
	
	// Stores the integer value represented by this object
	private int value; 
	
	// Returns the integer value
	public int getValue() 
	{ 
		return value;
	}
	
	private void setValue(int value)
	{
		this.value = value;
	}
	
	// Constructor that creates a MyInteger object
	public MyInteger(int value) 
	{
		this.value = value;
	}
	
	// Method that returns true if the given value is even
	public boolean isEven() 
	{
		if (this.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Method that returns true if the given value is odd
	public boolean isOdd() 
	{
		if (this.getValue() % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Method that returns true if the given value is prime
	public boolean isPrime() 
	{
		int i = 0;
		for (i = 1; i <= value / 2; i++)
		{
			if (value % i == 0) 
				return true;
		}
		return false;
	}
			
	// Static method that returns true if the given value is even
	public static boolean isEven(int value) 
	{
		if (value % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Static method that returns true if the given value is odd
	public static boolean isOdd(int value) 
	{
		if (value % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Static method that returns true if the given value is prime
	public static boolean isPrime(int z) 
	{
		int i = 0;
		for (i = 2; i <= z / 2; i++){
			System.out.print(i);
			if (z % i != 0){
				return true;
			}
		}
		return false;
	}
	
	// Static method that returns true if the given value is even
	public static boolean isEven(MyInteger myIntx) 
	{
		if (myIntx.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Static method that returns true if the given value is odd
	public static boolean isOdd(MyInteger myInty) 
	{
		if (myInty.getValue() % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	// Static method that returns true if the given value is prime
	public static boolean isPrime(MyInteger myIntz) 
	{
		int i = 0;
		for (i = 2; i <= myIntz.getValue() / 2; i++)
		{
			if (myIntz.getValue() % i != 0) 
				return true;
		}
		return false;
	}
	
	// Returns true if the value in the object is equal to the specified value
	public boolean equals(int a) 
	{
		return a == value;
	}
	
	// Returns true if the value in the object is equal to the specified value
	public boolean equals(MyInteger b) 
	{
		return b.getValue() == value;
	}
	
	// Converts an array of numeric characters into an integer value
	public static int parseInt(char[] a) 
	{
		return parseInt(new String(a));
	}
	
	// Converts a string into an integer value
	public static int parseInt(String s)
	{
		return Integer.parseInt(s);
	}
	
}
