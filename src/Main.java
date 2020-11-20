import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        board.display();
        
        int move = 1;
        boolean win = false;
        while (move <= 9 && win == false) {
        	if (move % 2 != 0) {		//odd number move is X's turn
        		System.out.print("Player X: ");
        		String tile = scanner.next();
        		board.setTile(tile, 'X');
        		board.display();
        	} else {
        		System.out.print("Player O: ");
        		String tile = scanner.next();
        		board.setTile(tile,  'O');
        		board.display();
        	}
        	
        	if (board.isConnect() == true) {
        		if (move % 2 != 0) {		//Game ended on odd move 
        			System.out.println("Player X wins!");
        		} else {
        			System.out.println("Player O wins!");
        		}
        		win = true;
        	} else if (move == 9 && board.isConnect() == false) {
        		System.out.println("Tie, no tiles left");
        	}
        	move++;
        }
    }
}