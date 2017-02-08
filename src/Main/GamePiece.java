/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author adilettad
 */
public class GamePiece {
    private int health; 
    
    public GamePiece(){
        health = 100;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int num){
        health = num;
    }
    
    @Override
    public String toString(){
        return "Gamepiece has " + health + "health remaining.";
    }
}
