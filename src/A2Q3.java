
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City eep = new City();
        //make robot
        Robot jimbo = new Robot(eep, 4, 5, Direction. EAST);
        
        while (jimbo.getAvenue()!= 0){
            if (jimbo.getDirection() != Direction.WEST){ 
                jimbo.turnLeft();
            }else if (jimbo.getDirection()==Direction.WEST){
                jimbo.move();
                }
        while (jimbo.getStreet()!=0){
            if (jimbo.getDirection()!=Direction.NORTH){
                jimbo.turnLeft();
            }else if (jimbo.getDirection()==Direction.NORTH)
                jimbo.move();
            }
        }
    }
}
