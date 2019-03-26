import org.junit.Assert;
import org.junit.Test;

public class GamePieceTest
{
	/**
	 * Tests for the GamePiece Enum toString method (which also tests the Enum's get methods and the GamePieceAppearance class methods) 
	 */
	@Test
	public void testGamePieceToString()
	{
		Assert.assertEquals("GamePiece toString incorrect.", "RED_RACER: a RED racecar with priority 0",
				GamePiece.RED_RACER.toString());
		Assert.assertEquals("GamePiece toString incorrect.", "BLUE_RACER: a BLUE racecar with priority 2",
				GamePiece.BLUE_RACER.toString());
		Assert.assertEquals("GamePiece toString incorrect.", "MAGENTA_RACER: a MAGENTA racecar with priority 1",
				GamePiece.MAGENTA_RACER.toString());
		Assert.assertEquals("GamePiece toString incorrect.", "RED_THIMBLE: a RED thimble with priority 10",
				GamePiece.RED_THIMBLE.toString());
		Assert.assertEquals("GamePiece toString incorrect.", "BLUE_BOOT: a BLUE boot with priority 5",
				GamePiece.BLUE_BOOT.toString());
		Assert.assertEquals("GamePiece toString incorrect.", "GREEN_BOOT: a GREEN boot with priority 8",
				GamePiece.GREEN_BOOT.toString());
		Assert.assertEquals("GamePiece toString incorrect.", "YELLOW_BOOT: a YELLOW boot with priority 7",
				GamePiece.YELLOW_BOOT.toString());
	}

	/**
	 * Tests for the GamePiece Enum movesFirst method
	 */
	@Test
	public void testGamePieceMovesFirst()
	{
		//Returning the first argument
		Assert.assertEquals("GamePiece movesFirst incorrect.", GamePiece.RED_RACER,
				GamePiece.movesFirst(GamePiece.RED_RACER, GamePiece.BLUE_RACER));
		//Returning the second argument
		Assert.assertEquals("GamePiece movesFirst incorrect.", GamePiece.BLUE_BOOT,
				GamePiece.movesFirst(GamePiece.YELLOW_BOOT, GamePiece.BLUE_BOOT));
		//Arguments are equal
		Assert.assertEquals("GamePiece movesFirst incorrect.", GamePiece.RED_THIMBLE,
				GamePiece.movesFirst(GamePiece.RED_THIMBLE, GamePiece.RED_THIMBLE));
	}
	
}
