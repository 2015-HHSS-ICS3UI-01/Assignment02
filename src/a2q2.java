
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
 * @author lalim9800
 */
public class a2q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    City a2q2= new City();
    Robot lali= new Robot(a2q2,1,1,Direction.EAST);
    new Wall(a2q2,1,1,Direction.SOUTH);
    new Wall(a2q2,1,2,Direction.SOUTH);
    new Wall(a2q2,1,3,Direction.SOUTH);
    new Wall(a2q2,1,4,Direction.SOUTH);
    new Wall(a2q2,1,5,Direction.SOUTH);
    new Wall(a2q2,1,6,Direction.SOUTH);
    new Wall(a2q2,1,7,Direction.SOUTH);
    new Wall(a2q2,1,8,Direction.SOUTH);
    new Wall(a2q2,1,9,Direction.SOUTH);
    
    new Wall(a2q2,1,1,Direction.EAST);
    
    }
}
