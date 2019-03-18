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
	/**
	 * Each player is associated with a unique game piece, as defined by the GamePiece enum.
	 */
	protected LinkedHashMap<String, GamePiece> playerPieces;
	
	/**
	 * Each player places their game piece at a location on the board, as defined by the Location enum.
	 */
	protected LinkedHashMap<String, Location> playerLocations; 
	
	/**
	 * BoardGame constructor.
	 */
	public BoardGame()
	{
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new  LinkedHashMap<String, Location>();
	}
	
	/**
	 * Adds a player to the board game object. Players are uniquely associated with a game piece. These game pieces
	 * represent the player in the board game. Each player has only one game piece, and each game piece can be
	 * associated with only one player. As such, when adding a player, a check must be done to ensure that a player
	 * is not already associated with the game piece. Players are represented by their names.
	 * Players/GamePieces are given a location in the board game (a location inside a mansion). 
	 * MultiplePlayers/GamePieces may be in the same location. Remember that a player is uniquely associated with a single
	 * game piece, so a "player at a location" is essentially the same as a "game piece at a location".
	 * 
	 * @param playerName The name of the player to be added. Players are referenced only by their names.
	 * @param gamePiece The game piece to be associated with the player being added.
	 * @param initialLocation The initial location of the game piece in the board game.
	 * @return false if there already is a player associated with the game piece.
	 */
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{
		if(!playerPieces.containsKey(playerName))
		{
			playerPieces.put(playerName, gamePiece);
			playerLocations.put(playerName, initialLocation);
			return true;
		}
		return false;
	}
	
	/**
	 * Given a player's name, find the game piece associated with that player. Remember that game pieces are unique,
	 * and are assigned to a unique player (i.e. it is a one-to-one relationship).
	 * 
	 * @param playerName The player name for which we want to find an associated game piece.
	 * @return The game piece associated with the player.
	 */
	public GamePiece getPlayerGamePiece(String playerName)
	{
		//TODO: Finish method
		return null;
	}
	
	/**
	 * Given a game piece, find the player associated with that game piece. Remember that game pieces are unique,
	 * and are assigned to a unique player (i.e. it is a one-to-one relationship).
	 * 
	 * @param gamePiece The game piece for which we want to find an associated player.
	 * @return If a player is correlated with the game piece, return that player name.Else, return null.
	 */
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		//TODO: Finish method
		return null;
	}
	
	/**
	 * Moves a player to a new location in the board game. Remember that a player is uniquely associated with a single
	 * game piece, so "moving the player" is essentially equivalent to "moving the player's game piece".
	 * 
	 * @param playerName The player to be moved.
	 * @param newLocation The new location for the player.
	 */
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocations.put(playerName,  newLocation);
	}
	
	/**
	 * Method to use when two players each want to move at the same time. Movements must be taken individually, so
	 * the system must determine which player moves first. Each player is associated with a game piece, and game
	 * pieces determine who moves first by the movesFirst() method. That is, the player that move first is the player
	 * with the game piece that has the first priority.You may assume that the arrays are always the appropriate length.
	 * Index i in the player array is associated with index i in the locations array. That is, the player at players[i]
	 * wishes to move to the location at newLocations[i].You should leverage the code in the movePlayer() method.
	 * 
	 * @param playerNames The two players to be moved
	 * @param newLocations The two locations to move the players to.
	 * @return The players, sorted in the order in which the two players move (the first player to move is at
	 * index 0 of the returned array).
	 */
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		int first = 0;
		int second = 1;
		
		if(playerPieces.get(playerNames[1]).equals(GamePiece.movesFirst(playerPieces.get(playerNames[1]), playerPieces.get(playerNames[0]))))
		{
			first = 1;
			second = 0;
		}
		else
		movePlayer(playerNames[first], newLocations[first]);
		movePlayer(playerNames[second], newLocations[second]);
		return new String[] {playerNames[first], playerNames[second]};
	}
	
	/**
	 * Gets the location of a player. Be careful that you don't confuse this with getPlayerLocations!
	 * 
	 * @param player The player for whom we want to find the location.
	 * @return The location of the player.
	 */
	public Location getPlayersLocation(String player)
	{
		//TODO: Finish method
		return null;
	}
	
	/**
	 * Given a location, find all players at that location.
	 * 
	 * @param loc The location at which we want to find players.
	 * @return The players at the given location.
	 */
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		//TODO: Finish method
		return null;
	}
	
	/**
	 * Given a location, find the game pieces associated with all the players at that location.
	 * 
	 * @param loc The location at which we want to find game pieces.
	 * @return The game pieces for which an associated player is at the given location.
	 */
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		//TODO: Finish method
		return null;
	}
	
	/**
	 * Gets all players recorded in the game.
	 * 
	 * @return The list of players in the board game.
	 */
	public Set<String> getPlayers()
	{
		//TODO: Finish method
		return null;
	}
	
	/**
	 * Gets all locations that the players are at (not all possible locations).
	 * Be careful that you don't confuse this with getPlayersLocation!
	 * 
	 * @return The set of locations (i.e. no duplicate elements) at which at least one player is present.
	 * Hint: look at the javadocs for the HashSet.
	 */
	public Set<Location> getPlayerLocations()
	{
		//TODO: Finish method
		return null;
	}
	
	/**
	 * Gets all game pieces associated with the players (not all possible game pieces).
	 * 
	 * @return The set of game pieces (i.e. no duplicate elements) that have been associated with a player.
	 * Hint: look at the javadocs for the HashSet.
	 */
	public Set<GamePiece> getPlayerPieces()
	{
		//TODO: Finish method
		return null;
	}
}
