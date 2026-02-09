package Maze;

import java.util.Scanner;



public class Main {

	 public static void main(String[] args) {
		 
		 Scanner s = new Scanner (System.in);
			
			Player player= new Player("maria",12);
			Maze maze = new Maze(8);
			
			boolean running = true;
			System.out.println("Game Start");

		    System.out.println( "Player Name: " +player.getName());
			
			 while (running) {

		            System.out.println("Player position: (" + player.getPlayerX() + ", " + player.getPlayerY() + ")");
		            System.out.println("Energy: " + player.getPlayerEnergy());
		            System.out.print("Move (W/A/S/D/Q): ");

		            String input = s.nextLine().toUpperCase();

		            int newX = player.getPlayerX();
		            int newY = player.getPlayerY();

		            if (input.equals("W")) newY++;
		            if (input.equals("S")) newY--;
		            if (input.equals("A")) newX--;
		            if (input.equals("D")) newX++;
		            if (input.equals("Q")) break;

		            // Check boundaries
		            if (newX < 0 || newY < 0 || newX >= maze.getSize() || newY >= maze.getSize()) {
		                System.out.println("Out of bounds!");
		                continue;
		            }

		            Tile tile = maze.getTile(newX, newY);

		            if (tile.isWall()) {
		                System.out.println("You hit a wall!");
		                continue;
		            }

		            // Move player
		            if (input.equals("W")) player.moveUp();
		            if (input.equals("S")) player.moveDown();
		            if (input.equals("A")) player.moveLeft();
		            if (input.equals("D")) player.moveRight();

		            player.reduceEnergy();

		            if (tile.isExit()) {
		                System.out.println("You escaped the maze!");
		                break;
		            }

		            if (player.getPlayerEnergy() <= 0) {
		                System.out.println("You ran out of energy!");
		                break;
		            }
		        }

		        s.close();
			
			
	 }
}
