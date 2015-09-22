
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
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
public class PE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city for robot
        City kw = new City();

        //Create robot for city
        Robot baymax = new Robot(kw, 2, 0, Direction.EAST);

        //Create hurdles for baymax
        new Wall(kw, 2, 0, Direction.SOUTH);
        new Wall(kw, 2, 0, Direction.EAST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.EAST);
        new Wall(kw, 2, 7, Direction.SOUTH);
        new Wall(kw, 2, 8, Direction.SOUTH);

        //Finish line of hurdle race
        new Thing(kw, 2, 8, Direction.EAST);

        //baymax's race
        while (true) {
            if (baymax.frontIsClear()) {
                baymax.move();
            } else {
                baymax.turnLeft();
                baymax.move();
                baymax.turnLeft();
                baymax.turnLeft();
                baymax.turnLeft();
                baymax.move();
                baymax.turnLeft();
                baymax.turnLeft();
                baymax.turnLeft();
                baymax.move();
                baymax.turnLeft();
            }
            if (baymax.canPickThing()) {
                break;
            }

        }
        baymax.pickThing();
    }
}
