
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City eep = new City();
        
        //make road{
        //left side
        new Wall (eep, 0, 0, Direction.WEST);
        new Wall (eep, 1, 0, Direction.WEST);
        new Wall (eep, 2, 0, Direction.WEST);
        new Wall (eep, 3, 0, Direction.WEST);
        new Wall (eep, 4, 0, Direction.WEST);
        new Wall (eep, 5, 0, Direction.WEST);
        new Wall (eep, 6, 0, Direction.WEST);
        new Wall (eep, 7, 0, Direction.WEST);
        new Wall (eep, 8, 0, Direction.WEST);
        new Wall (eep, 9, 0, Direction.WEST);
        
        //right side}
        new Wall (eep, 0, 1, Direction.EAST);
        new Wall (eep, 1, 1, Direction.EAST);
        new Wall (eep, 2, 1, Direction.EAST);
        new Wall (eep, 3, 1, Direction.EAST);
        new Wall (eep, 4, 1, Direction.EAST);
        new Wall (eep, 5, 1, Direction.EAST);
        new Wall (eep, 6, 1, Direction.EAST);
        new Wall (eep, 7, 1, Direction.EAST);
        new Wall (eep, 8, 1, Direction.EAST);
        new Wall (eep, 9, 1, Direction.EAST);
        
        //make sidewalk + driveways
        new Wall (eep, 0, 2, Direction.EAST);
        new Wall (eep, 3, 2, Direction.EAST);
        new Wall (eep, 5, 2, Direction.EAST);
        new Wall (eep, 6, 2, Direction.EAST);
        new Wall (eep, 9, 2, Direction.EAST);
        new Wall (eep, 9, 2, Direction.SOUTH);
        
        new Wall (eep, 1, 3, Direction.NORTH);
        new Wall (eep, 1, 4, Direction.NORTH);
        new Wall (eep, 1, 5, Direction.NORTH);
        new Wall (eep, 1, 6, Direction.NORTH);
        new Wall (eep, 1, 6, Direction.EAST);
        new Wall (eep, 2, 6, Direction.EAST);
        
        
        //make robot
        
        
    }
}
