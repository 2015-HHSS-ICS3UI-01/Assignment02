
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
 * @author vickj2854
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot karel = new Robot(kw, 1,1, Direction.SOUTH);
        
        new Wall(kw, 2,2, Direction.WEST);
        new Wall(kw, 2,3, Direction.WEST);
        
        
    }
}
