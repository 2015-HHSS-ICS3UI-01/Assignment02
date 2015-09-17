
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
 * @author mitrm7692
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a City
        City castle=new City();
        // Make a robot
        Robot guard=new Robot(castle,0,0,Direction.EAST);
        // Make a wall
        new Wall(castle,1,1,Direction.SOUTH);
        new Wall(castle,1,1,Direction.WEST);
        new Wall(castle,1,1,Direction.NORTH);
        new Wall(castle,1,1,Direction.EAST);
        new Wall(castle,1,4,Direction.SOUTH);
        new Wall(castle,1,4,Direction.WEST);
        new Wall(castle,1,4,Direction.NORTH);
        new Wall(castle,1,4,Direction.EAST);
        new Wall(castle,4,1,Direction.SOUTH);
        new Wall(castle,4,1,Direction.WEST);
        new Wall(castle,4,1,Direction.NORTH);
        new Wall(castle,4,1,Direction.EAST);
        new Wall(castle,4,4,Direction.SOUTH);
        new Wall(castle,4,4,Direction.WEST);
        new Wall(castle,4,4,Direction.NORTH);
        new Wall(castle,4,4,Direction.EAST);
        new Wall(castle,3,2,Direction.SOUTH);
        new Wall(castle,2,2,Direction.WEST);
        new Wall(castle,2,2,Direction.NORTH);
        new Wall(castle,3,3,Direction.EAST);
        new Wall(castle,3,3,Direction.SOUTH);
        new Wall(castle,3,2,Direction.WEST);
        new Wall(castle,2,3,Direction.NORTH);
        new Wall(castle,2,3,Direction.EAST);
        // Make robot move
        while(true){
            guard.move();
            guard.move();
            guard.turnLeft();
            guard.turnLeft();
            guard.turnLeft();
            guard.move();
            guard.turnLeft();
            guard.move();
            guard.turnLeft();
            guard.move();
            guard.turnLeft();
            guard.turnLeft();
            guard.turnLeft();
            guard.move();
            guard.move();
            guard.turnLeft();
            guard.turnLeft();
            guard.turnLeft();           
        }
    }
}
