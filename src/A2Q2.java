
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();
        
        //make walls (hurdles)
        new Wall(kw, 3,0, Direction.SOUTH);
        new Wall(kw, 3,1, Direction.SOUTH);
        new Wall(kw, 3,2, Direction.SOUTH);
        new Wall(kw, 3,3, Direction.SOUTH);
        new Wall(kw, 3,4, Direction.SOUTH);
    }
}
