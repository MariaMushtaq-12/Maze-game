package Maze;

public class Tile {

	 private boolean isWall; 
	 private boolean isExit; 
	 
	 Tile( boolean wall,boolean exit){
		 this.isWall=wall;
		 this.isExit=exit;
	 }
	 
	 public boolean isWall() {
		    return isWall;
		}
	 public boolean isExit() {
		    return isExit;
		}

}

