
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make new city
        City kw = new City(); 
                
        //make new robot
        Robot karel = new Robot (kw, 0, 18, Direction.WEST);
        
        if (karel.getStreet()>0);
        {
            karel.turnLeft();
        while (karel.getDirection()!=Direction.NORTH)
        {
            karel.turnLeft();
        }
        if (karel.getDirection()==Direction.NORTH);
        {while (karel.getStreet()!=0)
            karel.move();
        }
        
        } 
        
        if (karel.getAvenue()>0);
        {
        karel.turnLeft();
        if (karel.getDirection()!=Direction.WEST)
        {
            karel.turnLeft();
        }   
        if (karel.getDirection()!=Direction.WEST)
        {
            karel.turnLeft();
        }   
        if (karel.getDirection()!=Direction.WEST)
        {
            karel.turnLeft();
        }   
        
        }
        
        while (karel.getAvenue()!=0)
        {
        karel.move();    
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
    }
}
