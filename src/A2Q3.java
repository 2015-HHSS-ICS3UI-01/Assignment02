
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dawsr2694
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //Make City
        City A2Q3 = new City();
        
        //Make Robot
        Robot karel = new Robot(A2Q3, 35, 60, Direction.EAST);
        
        while( karel.getDirection() !=Direction.NORTH){
            karel.turnLeft();
        }
        
        //Move Robot
        while( karel.getStreet() !=0 ){
            karel.move();
        }
        
        if( karel.getStreet()==0 && karel.getDirection()!=Direction.EAST){
            karel.turnLeft();
            karel.move();
        }
        
        while( karel.getAvenue() !=0){
            karel.move();
        }
        
            
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    }
}
