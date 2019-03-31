
public class Thing {
	// Members
	private int x;
	private int y;
	private char type;
	private int birthMass;
	private int mass;
	private int birthPercent;
	private int updatePeriod;
	private int nextUpdate;
	private int massTaxMills;
	
	// Constructor
	public Thing ( int x, int y, char type ) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	// Getters
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

	public char getType() {
		return type;
	}
	
	// Setters
	public void setX( int x ) {
		this.x = x;
	}
	
	public void setY( int y ) {
		this.y = y;
	}
	
	public void setMass (int mass ) {
		this.mass = mass;
	}
}
