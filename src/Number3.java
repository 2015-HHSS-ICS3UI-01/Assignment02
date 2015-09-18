
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Number3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new City
        City kw = new City();
        //New Robot
        Robot jim = new Robot(kw, 10, 5, Direction.EAST);
        
        while(jim.getDirection() != Direction.NORTH){
            jim.turnLeft();}
        
        while(jim.getStreet() != 0){
            jim.move();
        }
        
        if(jim.getAvenue() > 0){
            jim.turnLeft();
            
        while(jim.getAvenue() != 0){
            jim.move();}
        
        }
       
        
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

