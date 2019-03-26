import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest
{
	/**
	 * Tests for the BoardGame class methods that do not return Sets
	 */
	@Test
	public void testBoardGame()
	{
		BoardGame first = new BoardGame();
		
		//addPlayer method
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
	}
	
	/**
	 * Tests for the BoardGame class methods that return sets
	 */
	@Test
	public void testBoardGameSets()
	{
		BoardGame second = new BoardGame();
		second.addPlayer("David", GamePiece.YELLOW_BOOT, Location.HALL);
		second.addPlayer("Nathan", GamePiece.BLUE_BOOT, Location.LIBRARY);
		
		//getPlayers method
		second.addPlayer("David", GamePiece.GREEN_BOOT, Location.STUDY);
		
		ArrayList<String> players = new ArrayList<String>();
		for(Object name: second.getPlayers().toArray())
		{
			players.add((String)name);
		}
		Assert.assertEquals("BoardGame getPlayers incorrect", true, players.contains("Nathan"));
		Assert.assertEquals("BoardGame getPlayers incorrect", true, players.contains("David"));
		players.remove("David"); //NOTE: this method removes the FIRST occurrence of the object, to check if David is in here twice
		Assert.assertEquals("BoardGame getPlayers incorrect", false, players.contains("David"));
		
		//getPlayersLocation method
		//ArrayList<Location> actualLocs = new ArrayList<Location>();
		//for(Object loc: second.getPlayerLocations().toArray())
		//{
		//	actualLocs.add((Location)loc);
		//}
		//Set<Location> actualLocs = (Set<Location>)second.getPlayerLocations();
		//Location[] expectedLocs = new Location[] {Location.HALL, Location.LIBRARY, Location.STUDY};
		//for(Location exp: expectedLocs)
		//{
		//	Assert.assertEquals("BoardGame getPlayerLocations incorrect", true, actualLocs.contains(exp));
		//}
	}
	
}
