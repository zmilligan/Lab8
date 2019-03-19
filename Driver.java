import org.junit.Test;
import org.junit.Assert;

/**
 * Driver to test the BoardGame and associated classes and Enums.
 * 
 * @author Zandi Milligan
 * @version 2019-03-18
 *
 */
public class Driver
{
	/**
	 * Tests for the Color Enum
	 */
	@Test
	public void testColorValues()
	{
	Color col = null;
	// RED:
	col = Color.RED;
	Assert.assertEquals("Incorrect r value in color " + col.name(), 255, col.getR());
	Assert.assertEquals("Incorrect g value in color " + col.name(), 0, col.getG());
	Assert.assertEquals("Incorrect b value in color " + col.name(), 0, col.getB());
	
	// GREEN:
	col = Color.GREEN;
	Assert.assertEquals("Incorrect r value in color " + col.name(), 0, col.getR());
	Assert.assertEquals("Incorrect g value in color " + col.name(), 255, col.getG());
	Assert.assertEquals("Incorrect b value in color " + col.name(), 0, col.getB());
	
	//BLUE:
	col = Color.BLUE;
	Assert.assertEquals("Incorrect r value in color " + col.name(), 0, col.getR());
	Assert.assertEquals("Incorrect g value in color " + col.name(), 0, col.getG());
	Assert.assertEquals("Incorrect b value in color " + col.name(), 255, col.getB());
	
	//YELLOW:
	col = Color.YELLOW;
	Assert.assertEquals("Incorrect r value in color " + col.name(), 255, col.getR());
	Assert.assertEquals("Incorrect g value in color " + col.name(), 255, col.getG());
	Assert.assertEquals("Incorrect b value in color " + col.name(), 0, col.getB());
	
	//CYAN:
	col = Color.CYAN;
	Assert.assertEquals("Incorrect r value in color " + col.name(), 0, col.getR());
	Assert.assertEquals("Incorrect g value in color " + col.name(), 255, col.getG());
	Assert.assertEquals("Incorrect b value in color " + col.name(), 255, col.getB());
	
	//MAGENTA:
	col = Color.MAGENTA;
	Assert.assertEquals("Incorrect r value in color " + col.name(), 255, col.getR());
	Assert.assertEquals("Incorrect g value in color " + col.name(), 0, col.getG());
	Assert.assertEquals("Incorrect b value in color " + col.name(), 255, col.getB());
	}
	
	/**
	 * Tests for the Location Enum
	 */
	@Test
	public void testLocation()
	{
	Assert.assertEquals("Location enum value incorrect.", Location.HALL, Location.valueOf("HALL"));
	Assert.assertEquals("Location enum value incorrect.", Location.LOUNGE, Location.valueOf("LOUNGE"));
	Assert.assertEquals("Location enum value incorrect.", Location.DINING_ROOM, Location.valueOf("DINING_ROOM"));
	Assert.assertEquals("Location enum value incorrect.", Location.KITCHEN, Location.valueOf("KITCHEN"));
	Assert.assertEquals("Location enum value incorrect.", Location.BALLROOM, Location.valueOf("BALLROOM"));
	Assert.assertEquals("Location enum value incorrect.", Location.CONSERVATORY, Location.valueOf("CONSERVATORY"));
	Assert.assertEquals("Location enum value incorrect.", Location.BILLIARD_ROOM, Location.valueOf("BILLIARD_ROOM"));
	Assert.assertEquals("Location enum value incorrect.", Location.LIBRARY, Location.valueOf("LIBRARY"));
	Assert.assertEquals("Location enum value incorrect.", Location.STUDY, Location.valueOf("STUDY"));
	}
}
