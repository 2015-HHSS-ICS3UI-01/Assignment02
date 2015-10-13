
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
 * @author agott2059
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city, robot and environment
        
        City thomas=new City();
        
        Robot tom = new Robot(thomas,3,1, Direction.NORTH);
        
        new Wall(thomas, 1,1, Direction.NORTH);
        new Wall(thomas, 1,1, Direction.EAST);
        new Wall(thomas, 1,1, Direction.SOUTH);
        new Wall(thomas, 1,1, Direction.WEST);
        new Wall(thomas, 2,2, Direction.NORTH);
        new Wall(thomas, 2,2, Direction.WEST);
        new Wall(thomas, 3,2, Direction.WEST);
        new Wall(thomas, 4,1, Direction.WEST);
        new Wall(thomas, 4,1, Direction.NORTH);
        new Wall(thomas, 4,1, Direction.SOUTH);
        new Wall(thomas, 4,1, Direction.EAST);
        new Wall(thomas, 2,3, Direction.NORTH);
        new Wall(thomas, 3,2, Direction.SOUTH);
        new Wall(thomas, 3,3, Direction.SOUTH);
        new Wall(thomas, 4,4, Direction.WEST);
        new Wall(thomas, 4,4, Direction.NORTH);
        new Wall(thomas, 4,4, Direction.EAST);
        new Wall(thomas, 4,4, Direction.SOUTH);
        new Wall(thomas, 3,3, Direction.EAST);
        new Wall(thomas, 2,3, Direction.EAST);
        new Wall(thomas, 1,4, Direction.EAST);
        new Wall(thomas, 1,4, Direction.SOUTH);
        new Wall(thomas, 1,4, Direction.NORTH);
        new Wall(thomas, 1,4, Direction.WEST);
        
        //a right side following robot

        //loop program
        while (true) {
            if (tom.frontIsClear()) {
                tom.turnLeft();
                tom.turnLeft();
                tom.turnLeft();

                if (tom.frontIsClear()) {
                    tom.move();
                }

            } else {

                tom.turnLeft();
                tom.move();

            }
        }
    }
}
    

