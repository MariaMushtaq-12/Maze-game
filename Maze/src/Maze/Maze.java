package Maze;

import java.util.Random;

public class Maze {

	private Tile[][] grid; // 2D discrete grid. 
	private int size;
	
	Maze(int size) {
	    this.size = size; // maze size should be configurable (e.g. 8×8), here just define in main it is declared
	    grid =new Tile [size][size];
	    
	    Random rand = new Random();
	    
	    // Fill grid with tiles and randomly assign walls
	    for(int x=0;x<size;x++) {
	    	 for(int y=0;y<size;y++) {
			boolean wall = rand.nextBoolean();
	    	
	    	grid[x][y] = new Tile(wall, false);
	    	 }
	    }
	    

		
		 //starting tile is not a wall
		grid[0][0]=new Tile (false,false);
		
		// Random exit (not at 0,0)
		int xExit, yExit;
		do {
		    xExit = rand.nextInt(size);
		    yExit = rand.nextInt(size);
		} while (xExit == 0 && yExit == 0);
		grid[xExit][yExit] = new Tile(false, true);

	}



	 public Tile getTile(int x, int y) {
		 return grid[x][y]; 	
	 }
	 
	 public int  getSize() {
		 return this.size;
	 }

}
