
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a City
        City kw=new City();
        
        // Make a Robot
        Robot karel=new Robot(kw,5,8,Direction.WEST);
        
        if (karel.getStreet()>=0);
        {
            karel.turnLeft();
            
           while (karel.getDirection()!=Direction.NORTH)
           {    
               karel.turnLeft();
           }  
           while (karel.getStreet()!=0)
               karel.move();
           {
               if (karel.getStreet()>=0)
                   karel.turnLeft();
           }
               
           {
               while (karel.getAvenue()!=0)
                   karel.move();
           }
        }
    }
}
