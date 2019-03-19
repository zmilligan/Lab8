import org.junit.Test;
import java.util.ArrayList;
import org.junit.Assert;

/**
 * Driver to test the BoardGame and associated classes and Enums.
 * 
 * @author Zandi Milligan
 * @version 2019-03-19
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

	/**
	 * Tests for the Shape Enum
	 */
	@Test
	public void testShapes()
	{
		Assert.assertEquals("Shape toString incorrect.", "thimble", Shape.THIMBLE.toString());
		Assert.assertEquals("Shape toString incorrect.", "boot", Shape.BOOT.toString());
		Assert.assertEquals("Shape toString incorrect.", "racecar", Shape.RACECAR.toString());
	}
	
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
	
	/**
	 * Tests for the BoardGame class
	 */
	@Test
	public void testBoardGame()
	{
		//addPlayer method
		BoardGame first = new BoardGame();
		Assert.assertEquals("BoardGame addPlayer incorrect", true, first.addPlayer("Zandi", GamePiece.BLUE_BOOT, Location.DINING_ROOM));
		Assert.assertEquals("BoardGame addPlayer incorrect", true, first.addPlayer("Megan", GamePiece.RED_THIMBLE, Location.HALL));
		Assert.assertEquals("BoardGame addPlayer incorrect", false, first.addPlayer("David", GamePiece.BLUE_BOOT, Location.CONSERVATORY));
		
		//getPlayerGamePiece method
		Assert.assertEquals("BoardGame getPlayerGamePiece incorrect", GamePiece.BLUE_BOOT, first.getPlayerGamePiece("Zandi"));
		Assert.assertEquals("BoardGame getPlayerGamePiece incorrect", null, first.getPlayerGamePiece("David"));
		
		//getPlayerWithGamePiece method
		Assert.assertEquals("BoardGame getPlayerWithGamePiece incorrect", "Megan", first.getPlayerWithGamePiece(GamePiece.RED_THIMBLE));
		Assert.assertEquals("BoardGame getPlayerWithGamePiece incorrect", null, first.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT));
		
		//getPlayersLocation methods
		Assert.assertEquals("BoardGame getPlayersLocation incorrect", null, first.getPlayersLocation("David"));
		Assert.assertEquals("BoardGame getPlayersLocation incorrect", Location.DINING_ROOM, first.getPlayersLocation("Zandi"));
		
		//movePlayer method
		first.movePlayer("Zandi", Location.KITCHEN);
		Assert.assertEquals("BoardGame movePlayer incorrect", Location.KITCHEN, first.getPlayersLocation("Zandi"));
		
		//moveTwoPlayers method
		Assert.assertEquals("BoardGame moveTwoPlayers return incorrect", "Zandi",
				first.moveTwoPlayers(new String[] {"Megan", "Zandi"}, new Location[] {Location.STUDY, Location.LIBRARY})[0]);
		Assert.assertEquals("BoardGame moveTwoPlayers move incorrect", Location.STUDY, first.getPlayersLocation("Megan"));
		Assert.assertEquals("BoardGame moveTwoPlayers move incorrect", Location.LIBRARY, first.getPlayersLocation("Zandi"));
		//switch the order of players to ensure proper running of moveTwoPlayers
		Assert.assertEquals("BoardGame moveTwoPlayers return incorrect", "Megan",
				first.moveTwoPlayers(new String[] {"Zandi", "Megan"}, new Location[] {Location.KITCHEN, Location.KITCHEN})[1]);
		Assert.assertEquals("BoardGame moveTwoPlayers move incorrect", Location.KITCHEN, first.getPlayersLocation("Zandi"));
		Assert.assertEquals("BoardGame moveTwoPlayers move incorrect", Location.KITCHEN, first.getPlayersLocation("Megan"));
		
		//getPlayersAtLocation method
		ArrayList<String> inKitchen1 = first.getPlayersAtLocation(Location.KITCHEN);
		ArrayList<String> inHall = first.getPlayersAtLocation(Location.HALL);
		ArrayList<String> inLibrary = first.getPlayersAtLocation(Location.LIBRARY);
		Assert.assertEquals("BoardGame getPlayersAtLocation incorrect", true, inKitchen1.contains("Zandi"));
		Assert.assertEquals("BoardGame getPlayersAtLocation incorrect", true, inKitchen1.contains("Megan"));
		Assert.assertEquals("BoardGame getPlayersAtLocation incorrect", false, inKitchen1.contains("David"));
		Assert.assertEquals("BoardGame getPlayersAtLocation incorrect", true, inHall.isEmpty());
		Assert.assertEquals("BoardGame getPlayersAtLocation incorrect", true, inLibrary.isEmpty());
		
		//getGamePiecesAtLocation method
		ArrayList<GamePiece> inKitchen2 = first.getGamePiecesAtLocation(Location.KITCHEN);
		ArrayList<GamePiece> inBallroom = first.getGamePiecesAtLocation(Location.BALLROOM);
		ArrayList<GamePiece> inConservatory = first.getGamePiecesAtLocation(Location.CONSERVATORY);
		Assert.assertEquals("BoardGame getGamePiecesAtLocation incorrect", true, inKitchen2.contains(GamePiece.BLUE_BOOT));
		Assert.assertEquals("BoardGame getGamePiecesAtLocation incorrect", true, inKitchen2.contains(GamePiece.RED_THIMBLE));
		Assert.assertEquals("BoardGame getGamePiecesAtLocation incorrect", false, inKitchen2.contains(GamePiece.MAGENTA_RACER));
		Assert.assertEquals("BoardGame getGamePiecesAtLocation incorrect", true, inBallroom.isEmpty());
		Assert.assertEquals("BoardGame getGamePiecesAtLocation incorrect", true, inConservatory.isEmpty());
		
		//getPlayers method
		//first.addPlayer("Zandi", GamePiece.GREEN_BOOT, Location.HALL);
		Set<String> players = first.getPlayers();
		Assert.assertEquals("BoardGame getGamePiecesAtLocation incorrect", true, players.contains("Megan"));
		Assert.assertEquals("BoardGame getGamePiecesAtLocation incorrect", true, players.contains("Zandi"));
		//players.remove("Zandi");
		//Assert.assertEquals("BoardGame getGamePiecesAtLocation incorrect", false, players.contains("Zandi"));
		
		}
	
	
	
}
