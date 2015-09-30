
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in\
        City too = new City();
        
        //Make the robot to live in the city
        Robot Peter = new Robot(too, 17, 18, Direction.EAST);
        
        while(Peter.getDirection() !=Direction.NORTH)
        {    
            Peter.turnLeft();
    
        }
        while(Peter.getStreet() !=0)
        {
            Peter.move();
            
        }
        while(Peter.getDirection() !=Direction.WEST)
            
        {    
            Peter.turnLeft();
        }
            while(Peter.getAvenue()!=0)
                
            {
                Peter.move();
            }    
    }
}
