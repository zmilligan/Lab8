/**
 * Enum to represent a color (with rgb values).
 * 
 * @author Stephen
 * @version 2019-03-13
 *
 */
public enum Color {

	RED(255, 0, 0), 
	GREEN(0, 255, 0), 
	BLUE(0, 0, 255), 
	YELLOW(255, 255, 0), 
	CYAN(0, 255, 255),  
	MAGENTA(255, 0, 255);  
	
	private int b;
	private int g;
	private int r;
	
	private Color(int r, int g, int b)
	{
		this.r = r;
		this.g= g;
		this.b = b;
	}
	
	/**
	 * @return The color's red component.
	 */
	public int getR()
	{
		return r;
	}
	
	/**
	 * @return The color's green component.
	 */
	public int getG()
	{
		return g;
	}
	
	/**
	 * @return The color's blue component.
	 */
	public int getB()
	{
		return b;
	}

}
