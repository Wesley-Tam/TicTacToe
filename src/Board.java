import java.util.Arrays;

public class Board {
    /*
    The following code is an example of logic a programmer might want to use.
    Feel free to delete and replace any code you wish to implement differently.
     */

    // representing our cells
	/*
    private char a1 = ' ';
    private char a2 = ' ';
    private char a3 = ' ';
    private char b1 = ' ';
    private char b2 = ' ';
    private char b3 = ' ';
    private char c1 = ' ';
    private char c2 = ' ';
    private char c3 = ' ';
    */
    char[] chars = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};		// {a1, a2, a3, b1, b2, b3, c1, c2, c3}

    /**
     * Displays the board state
     */
    
    public void display() {
        printRow(chars[0], chars[1], chars[2]);
        System.out.println("---|---|---");
        printRow(chars[3], chars[4], chars[5]);
        System.out.println("---|---|---");
        printRow(chars[6], chars[7], chars[8]);
    }

    private static void printRow(char a, char b, char c) {
        System.out.println(" " + a + " | " + b + " | " + c + " ");
    }
    
    public void setTile(String tile, char player) {
    	String char0 = tile.substring(0, 1).toLowerCase();
    	tile = char0 + tile.substring(1);
    	if (tile.equals("a1")) {
    		chars[0] = player;
    	} else if (tile.equals("a2")) {
    		chars[1] = player;
    	} else if (tile.equals("a3")) {
    		chars[2] = player;
    	} else if (tile.equals("b1")) {
        	chars[3] = player;
    	} else if (tile.equals("b2")) {
    		chars[4] = player;
    	} else if (tile.equals("b3")) {
    		chars[5] = player;
    	} else if (tile.equals("c1")) {
        	chars[6] = player;
    	} else if (tile.equals("c2")) {
    		chars[7] = player;
    	} else if (tile.equals("c3")) {
    		chars[8] = player;
    	}
    }
    
    public boolean isConnect() {
    	boolean isWin = false;
    	if (chars[0] != ' ' && chars[0] == chars[1] && chars[0] == chars[2]) {			//row a
    		isWin = true;
    	} else if (chars[3] != ' ' && chars[3] == chars[4] && chars[3] == chars[5]) {	//row b
    		isWin = true;
    	} else if (chars[6] != ' ' && chars[6] == chars[7] && chars[6] == chars[8]) {	//row c
    		isWin = true;
    	} else if (chars[3] != ' ' && chars[0] == chars[3] && chars[0] == chars[6]) {	//column 1
    		isWin = true;
    	} else if (chars[1] != ' ' && chars[1] == chars[4] && chars[1] == chars[7]) {	//column 2
    		isWin = true;
    	} else if (chars[2] != ' ' && chars[2] == chars[5] && chars[2] == chars[8]) {	//column 3
    		isWin = true;
    	} else if (chars[0] != ' ' && chars[0] == chars[4] && chars[0] == chars[8]) {	//diagonal top left
    		isWin = true;
    	} else if (chars[2] != ' ' && chars[2] == chars[4] && chars[2] == chars[6]) {	//diagonal top right
    		isWin = true;
    	}
    	return isWin;
    }
}