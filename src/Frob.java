
public class Frob extends Thing implements Constants{
	// members
	byte[] dna = new byte[DNA_LENGTH];
	
	// constructor
	public Frob( int x, int y ) {
		super( x, y, 'f' );
	}

}
