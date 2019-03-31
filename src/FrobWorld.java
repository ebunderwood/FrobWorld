
public class FrobWorld implements Constants{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialize World Variables
		int simulationTime = 0;
		Thing[][] frobWorld = new Thing[WORLD_HEIGHT][WORLD_WIDTH];
		
		//  Intialize World Rocks
		for ( int row = 0; row < WORLD_HEIGHT; row++) {
			for (int col = 0; col < WORLD_WIDTH; col++) {
				if ((row == 0 || row == (WORLD_HEIGHT - 1)) ||
				 	(col == 0 || col == (WORLD_WIDTH - 1))){
						frobWorld[row][col] = new Rock (row, col);
				}
				else {
					frobWorld[row][col] = new Thing (row, col, 'e');
				}
			}
		}

		// Get some random rocks in there
		int randomRocks = 0;
		int randomX;
		int randomY;
		while ( randomRocks <= INIT_ROCKS ) {
			randomX = (int )(Math.random() * (WORLD_HEIGHT - 1) + 1);
			randomY = (int )(Math.random() * (WORLD_WIDTH - 1) + 1);
			
			if ( frobWorld[randomX][randomY].getType() == 'e') {
				frobWorld[randomX][randomY] = new Rock ( randomX, randomY );
				randomRocks++;
			}
		}
		
		// Get some random grass in there
		int randomGrass = 0;
		
		while ( randomGrass <= INIT_GRASSES) {
					randomX = (int )(Math.random() * (WORLD_HEIGHT - 1) + 1);
					randomY = (int )(Math.random() * (WORLD_WIDTH - 1) + 1);
					
					if ( frobWorld[randomX][randomY].getType() == 'e') {
						frobWorld[randomX][randomY] = new Grass ( randomX, randomY );
						randomGrass++;
					}
				}
		
		// Print out the World
		for (int row = 0; row < WORLD_HEIGHT; row++) {
			for ( int col = 0; col < WORLD_WIDTH; col++ ) {
				if ( frobWorld[row][col].getType() == 'r' ) {
					System.out.print('r');
				} else if (frobWorld[row][col].getType() == 'e') {
					System.out.print(" ");
				} else if ( frobWorld[row][col].getType() == 'g') {
					System.out.print('g');
				} else {
					System.out.print('f');
				}
			}
			System.out.println();
		}
	}
}
