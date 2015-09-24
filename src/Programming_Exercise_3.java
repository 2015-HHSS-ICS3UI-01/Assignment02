
import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.EAST;
import static becker.robots.Direction.WEST;
import becker.robots.Robot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matt
 */
public class Programming_Exercise_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot matt = new Robot(kw, 7,10, Direction.EAST);
        
        while (matt.getDirection() != WEST){
            matt.turnLeft();
            if (matt.getDirection() == WEST){
                break;
            }
        }if (matt.getDirection() == WEST){
            matt.move();
            while (matt.getAvenue() >0){
                matt.move();
                if (matt.getAvenue() == 0){
                    break;
                }
            }matt.turnLeft();
            matt.turnLeft();
            matt.turnLeft();
            
            while (matt.getStreet() >= 0){
                matt.move();
                if (matt.getStreet() == 0){
                    break;
                }
            }
        
        }
    }
    
}
