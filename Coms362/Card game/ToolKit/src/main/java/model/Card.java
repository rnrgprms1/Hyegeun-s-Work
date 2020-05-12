package model;

/**
 * @author Robert Ward
 *
 */

// TODO: replace x,y with Location object. 
public class Card {
	
	private static int serialId = 0; 
	
	public static final String suits[] = {"h", "s", "d", "c"};

	private String suit;
    private int number;
    private int id;
    private int x;
    private int y;
    private int rotate;
    private boolean faceUp;
    
    public Card() {
    	id = ++serialId;
    }
    
    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getRotate() {
        return rotate;
    }
    public void setRotate(int rotate) {
        this.rotate = rotate;
    }
    public boolean isFaceUp() {
        return faceUp;
    }
    public void setFaceUp(boolean faceUp) {
        this.faceUp = faceUp;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
