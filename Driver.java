/**
 * Driver to test the BoardGame and associated classes and Enums.
 * 
 * @author Zandi Milligan
 * @version 2019-03-19
 *
 */
public class Driver
{
	//I really don't understand the point of the driver class. In the instructions it said that the driver should be used to fully test
	//our code, but webcat freaked out when I had tests only in my driver. As a result, I moved everything to separate test classes and am
	//now just gonna play around with this. I'm not sure what is wanted, so I'm sorry if this is not what was intended.
	public static void main(String[] args)
	{
		BoardGame clue = new BoardGame();
		
		clue.addPlayer("Ms. Scarlett", GamePiece.RED_RACER, Location.LOUNGE);
		clue.addPlayer("Ms. Peacock", GamePiece.BLUE_BOOT, Location.CONSERVATORY);
		clue.addPlayer("Mr. Green", GamePiece.GREEN_BOOT, Location.BALLROOM);
		clue.addPlayer("Prof. Plum", GamePiece.MAGENTA_RACER, Location.STUDY);
		clue.addPlayer("Invailid Player", GamePiece.RED_RACER, Location.BILLIARD_ROOM);
		
		clue.moveTwoPlayers(new String[] {"Ms. Scarlett", "Prof. Plum"}, new Location[] {Location.HALL, Location.HALL});
		clue.moveTwoPlayers(new String[] {"Prof. Plum", "Ms. Scarlett"}, new Location[] {Location.LIBRARY, Location.LIBRARY});
		
		System.out.println(clue.getPlayersAtLocation(Location.LIBRARY));
		System.out.println(clue.getGamePiecesAtLocation(Location.LIBRARY));
		
		System.out.println(clue.getPlayerPieces().toString());
		
		clue.movePlayer("Ms. Scarlett", Location.KITCHEN);
		System.out.println(clue.getPlayerLocations().toString());
		System.out.println(clue.getPlayers().toString());
		
		System.out.println(clue.getPlayerWithGamePiece(GamePiece.GREEN_BOOT));
		System.out.println(clue.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT));
		
		System.out.println(clue.getPlayersLocation("Ms. Peacock"));
		System.out.println(clue.getPlayerGamePiece("Ms. Peacock"));
		
		Color col = Color.RED;
		System.out.println(String.format("Color %s: R: %d G: %d B: %d", col.name(), col.getR(), col.getG(), col.getB()));
		
		Shape shape = Shape.THIMBLE;
		System.out.println(shape.toString());
	}
}
