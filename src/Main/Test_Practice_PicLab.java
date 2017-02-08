/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author adilettad
 */
public class Test_Practice_PicLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ArrayList> rows = new ArrayList<>();
        ArrayList<GamePiece> c1 = new ArrayList<>();
        ArrayList<GamePiece> c2 = new ArrayList<>();
        ArrayList<GamePiece> c3 = new ArrayList<>();
        rows.add(c1);
        rows.add(c2);
        rows.add(c3);
        
        //create a class that extends Board
        //create a constructor that fills the game board with pieces
        Board game = new GameBoard(rows);
        
        //gets the GamePiece at row, column and subtracts health by dmg
        game.takeDamage(0, 0, 10);
        
        //loop through the rows and columns and prints each game piece
        game.printBoard();
        
        System.out.println("As you can see, there are " + game.findEmpty() +
                "empty spots");
    }
    
}
