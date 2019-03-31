
public interface Constants {

	// World Variables
	int WORLD_WIDTH = 50;
	int WORLD_HEIGHT = 25;
	int MAX_SIMULATION_LENGTH = 10000;
	int INIT_FROBS = 40;
	int INIT_GRASSES = 40;
	int INIT_ROCKS = 50;
	
	// Hit Penalties
	int ROCK_BUMP_PENALTY = 30;
	int FROB_HIT_PENALTY = 10;
	
	// Grass Constants
	int GRASS_FIXED_OVERHEAD = 0;
	int GRASS_GENESIS_MASS = 10;
	int GRASS_BIRTH_MASS = 30;
	int GRASS_UPDATE_PERIOD = 10;
	int GRASS_CROWD_LIMIT = 	2;
	int GRASS_MAX_UPDATE_PERIOD = 100;
	int GRASS_BIRTH_PERCENT = 40;
	
	// Frob Constants
	int FROB_FIXED_OVERHEAD = 3;
	int FROB_GENESIS_MASS = 100;
	int DNA_MUTATION_ODDS_PER_BYTE = 20;
	
	// Mass Taxes
	int GRASS_MASS_TAX_MILLS = -20;
	int FROB_MASS_TAX_MILLS = 10;
}
