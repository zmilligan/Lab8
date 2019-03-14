/**
 * Enum to represent the shape of a game piece.
 * 
 * @author Stephen
 * @version 2019-03-13
 *
 */
public enum Shape
{
	THIMBLE, 
	BOOT, 
	RACECAR;
	
	/**
	 * Gives the name of the value of the enum object, in lowercase.
	 * 
	 * @return The enum object's name (either thimble, boot, racecar) in lowercase.
	 */
	@Override
	public String toString()
	{
		return this.name().toLowerCase();
	}
}
