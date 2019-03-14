/**
 * Enum to represent the game pieces available in a board game. Each game piece has a color and a shape (represented
 * by a GamePieceAppearance object) and move priority (the piece with the lowest priority value gets to move first,
 * turns are taken in priority value order (increasing)).
 * Each constant represents a game piece that a player might choose to use in the board game.
 * 
 * @author Stephen
 * @version 2019-03-13
 */
public enum GamePiece
{
	RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 0),
	BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1),
	RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 10),
	BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8),
	YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7);
	
	private GamePieceAppearance appearance;
	private int priority;
	
	private GamePiece(GamePieceAppearance appearance, int priority)
	{
		this.appearance = appearance;
		this.priority = priority;
	}
	
	/**
	 * Gets the color of the game piece.
	 * 
	 * @return The game piece's color.
	 */
	public Color getColor()
	{
		return appearance.getColor();
	}
	
	/**
	 * Gets the shape of the game piece.
	 * 
	 * @return The game piece's shape.
	 */
	public Shape getShape()
	{
		return appearance.getShape();
	}
	
	/**
	 * Given two game pieces, determines which one takes its turn first.
	 * 
	 * @param a The first game piece.
	 * @param b The second game piece.
	 * @return The game piece with the lowest priority value. That is, the game piece that would take its turn first.
	 */
	public GamePiece movesFirst(GamePiece a, GamePiece b)
	{
		if(a.priority < b.priority)
		{
			return a;
		}
		return b;
	}
	
	/**
	 * Gets information about the game piece.
	 * 
	 * @return A string of the format "%s: a %s %s with priority %d", with replacements in order:
	 * (1) The name of the enum constant (e.g. BLUE_RACER)
	 * (2) The name of the game piece's color
	 * (3) The name of the game piece's shape
	 * (4) The priority value of the game piece
	 */
	@Override
	public String toString()
	{
		return String.format("%s: a %s %s with priority %d", this.name(), appearance.getColor().name().toLowerCase(),
				appearance.getShape().toString(), priority);
	}
}
