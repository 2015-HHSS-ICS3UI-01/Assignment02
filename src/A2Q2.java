
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitws6356
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        //make a robot to live in the city
        Robot kar = new Robot(kw, 4, 0, Direction.EAST);
        new Wall(kw, 4, 0, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 6, Direction.SOUTH);
        new Wall(kw, 4, 7, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.WEST);
        new Wall(kw, 4, 5, Direction.WEST);
        new Wall(kw, 4, 6, Direction.WEST);
        new Wall(kw, 4, 7, Direction.WEST);
        new Thing(kw, 4, 7);
        //make code loop
        while (true) {
        //let kar move forward if front is clear
            while (kar.frontIsClear()) {
                kar.move();
            }
        //choose directions for kar
            if (!kar.frontIsClear()) {
                kar.turnLeft();
                kar.move();
                kar.turnLeft();
                kar.turnLeft();
                kar.turnLeft();
                kar.move();
                kar.turnLeft();
                kar.turnLeft();
                kar.turnLeft();
                kar.move();
                kar.turnLeft();

            }
        }


    }
}
