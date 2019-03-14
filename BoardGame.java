import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Class to represent a board game. The board game consists of several players (each represented only by their name)
 * moving game pieces to different locations on the board. Each player has a unique, associated game piece (i.e. each
 * player has only one game piece, and a game piece can be assigned to, at most, 1 player).Turns are taken one-at-a-time 
 * in this board game. In the case that two players which to move at the same time,the contest is resolved by the priority 
 * given to the game pieces associated to the two players.
 * 
 * @author Stephen
 * @version 2019-03-13
 */
public class BoardGame
{
	protected LinkedHashMap<String, GamePiece> playerPieces; 
	protected LinkedHashMap<String, Location> playerLocations; 
	
	public BoardGame()
	{
		//TODO: Finish method
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location intialLocation)
	{
		//TODO: Finish method
		return false;
	}
	
	public GamePiece getPlayerGamePiece(String playerName)
	{
		//TODO: Finish method
		return null;
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		//TODO: Finish method
		return null;
	}
	
	public void movePlayer(String playerName, Location newLocation)
	{
		//TODO: Finish method
		
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		//TODO: Finish method
		return null;
	}
	
	public Location getPlayersLocation(String player)
	{
		//TODO: Finish method
		return null;
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		//TODO: Finish method
		return null;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		//TODO: Finish method
		return null;
	}
	
	public Set<String> getPlayers()
	{
		//TODO: Finish method
		return null;
	}
	
	public Set<Location> getPlayerLocations()
	{
		//TODO: Finish method
		return null;
	}
	
	public Set<GamePiece> getPlayerPieces()
	{
		//TODO: Finish method
		return null;
	}
}
