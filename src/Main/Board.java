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
public abstract class Board {
    
    ArrayList<ArrayList> rows;
    
    public Board(ArrayList<ArrayList> rows){
        this.rows = rows;   
    }
    public abstract void takeDamage(int row, int column, int dmg);
    
    public abstract int findEmpty();
    
    public abstract void printBoard();
    
}
