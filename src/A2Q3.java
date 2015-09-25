
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make a City for the Robot to live in
        City pleb = new City();
        
        //Make a Robot to live in the City
        Robot Ross = new Robot(pleb, 5, 9, Direction.WEST);
        
        while(Ross.getDirection() !=Direction.NORTH)
        {
            Ross.turnLeft();
        }    
        while(Ross.getStreet() !=0)
        {
            Ross.move();
           
        }
        while (Ross.getDirection() !=Direction.WEST)
            
        {
            Ross.turnLeft();
        }
            while(Ross.getAvenue() !=0)
                
            {
                Ross.move();
            }
            }
            
    }
    
}
