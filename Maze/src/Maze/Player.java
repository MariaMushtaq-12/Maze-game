package Maze;

public class Player {

	/** Player's display name. */
	private String name;

	/** Player X coordinate (column). */
	private int playerX;

	/** Player Y coordinate (row). */
	private int playerY;

	/** Player remaining energy/lives. */
	private int playerEnergy;
    
	/**
	 * Create a new player starting at (0,0) with the given energy.
	 */
	public Player(String name, int playerEnergy) {
		this.name = name;
		this.playerX = 0;
		this.playerY = 0;
		this.playerEnergy = playerEnergy;
	}

	/** Return the player's name. */
	public String getName() {
		return name;
	}

	/** Return the player's remaining energy. */
	public int getPlayerEnergy() {
		return playerEnergy;
	}

	/** Return player's X coordinate. */
	public int getPlayerX() {
		return this.playerX;
	}
    
	/** Return player's Y coordinate. */
	public int getPlayerY() {
		return this.playerY;
	}
    
	/** Move the player up by decreasing Y. */
	public void moveUp() {
		this.playerY = this.playerY - 1;
	}
    
	/** Move the player down by increasing Y. */
	public void moveDown() {
		this.playerY = this.playerY + 1;
	}
    
	/** Move the player left by decreasing X. */
	public void moveLeft() {
		this.playerX = this.playerX - 1;
	}
    
	/** Move the player right by increasing X. */
	public void moveRight() {
		this.playerX = this.playerX + 1;
	}
    
	/** Reduce player's energy by one unit. */
	public void reduceEnergy() {
		this.playerEnergy = this.playerEnergy - 1;
	}
    
}

