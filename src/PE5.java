
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class PE5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city for robot
        City kw = new City();
        
        //Create road,sidewalk,driveway
        new Wall(kw,0,0,Direction.WEST);
        new Wall(kw,1,0,Direction.WEST);
        new Wall(kw,2,0,Direction.WEST);
        new Wall(kw,3,0,Direction.WEST);
        new Wall(kw,4,0,Direction.WEST);
        new Wall(kw,5,0,Direction.WEST);
        new Wall(kw,6,0,Direction.WEST);
        new Wall(kw,7,0,Direction.WEST);
        new Wall(kw,8,0,Direction.WEST);
        new Wall(kw,9,0,Direction.WEST);
        new Wall(kw,0,1,Direction.EAST);
        new Wall(kw,1,1,Direction.EAST);
        new Wall(kw,2,1,Direction.EAST);
        new Wall(kw,3,1,Direction.EAST);
        new Wall(kw,4,1,Direction.EAST);
        new Wall(kw,5,1,Direction.EAST);
        new Wall(kw,6,1,Direction.EAST);
        new Wall(kw,7,1,Direction.EAST);
        new Wall(kw,8,1,Direction.EAST);
        new Wall(kw,9,1,Direction.EAST);
        new Wall(kw,0,2,Direction.EAST);
        new Wall(kw,1,3,Direction.NORTH);
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,5,Direction.NORTH);
        new Wall(kw,1,6,Direction.NORTH);
        new Wall(kw,1,6,Direction.EAST);
        new Wall(kw,2,6,Direction.EAST);
        new Wall(kw,2,6,Direction.SOUTH);
        new Wall(kw,2,5,Direction.SOUTH);
        new Wall(kw,2,4,Direction.SOUTH);
        new Wall(kw,2,3,Direction.SOUTH);
        new Wall(kw,3,2,Direction.EAST);
        new Wall(kw,4,3,Direction.NORTH);
        new Wall(kw,4,4,Direction.NORTH);
        new Wall(kw,4,5,Direction.NORTH);
        new Wall(kw,4,5,Direction.EAST);
        new Wall(kw,4,5,Direction.SOUTH);
        new Wall(kw,4,4,Direction.SOUTH);
        new Wall(kw,4,3,Direction.SOUTH);
        new Wall(kw,5,2,Direction.EAST);
        new Wall(kw,6,2,Direction.EAST);
        new Wall(kw,7,3,Direction.NORTH);
        new Wall(kw,7,4,Direction.NORTH);
        new Wall(kw,7,5,Direction.NORTH);
        new Wall(kw,7,6,Direction.NORTH);
        new Wall(kw,7,6,Direction.EAST);
        new Wall(kw,8,6,Direction.EAST);
        new Wall(kw,8,6,Direction.SOUTH);
        new Wall(kw,8,5,Direction.SOUTH);
        new Wall(kw,8,4,Direction.SOUTH);
        new Wall(kw,8,3,Direction.SOUTH);
        new Wall(kw,9,2,Direction.EAST);
        new Wall(kw,9,2,Direction.SOUTH);
        
        //Snow on city
        new Thing(kw,0,2,Direction.EAST);
        new Thing(kw,1,0,Direction.EAST);
        new Thing(kw,2,0,Direction.EAST);
        new Thing(kw,3,0,Direction.EAST);
        
        
        

        
        
    }
}
