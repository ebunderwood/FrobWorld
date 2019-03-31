
public class Grass extends Thing implements Constants{

	// Constructor
	public Grass ( int x, int y, int mass ) {
		super( x, y, 'g');
		// TODO Make sure that the nextUpdate is 0 on genesis.
		super.setVitals (mass, GRASS_BIRTH_MASS, GRASS_BIRTH_PERCENT, GRASS_UPDATE_PERIOD, 0, GRASS_MASS_TAX_MILLS);
	}
}
