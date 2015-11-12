
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
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot kar = new Robot(kw, 1, 3, Direction.SOUTH);
        Robot tin = new Robot(kw, 1, 3, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 6, 1, Direction.WEST);
        new Wall(kw, 7, 1, Direction.WEST);
        new Wall(kw, 8, 1, Direction.WEST);
        new Wall(kw, 9, 1, Direction.WEST);
        new Wall(kw, 10, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 6, 2, Direction.EAST);
        new Wall(kw, 7, 2, Direction.EAST);
        new Wall(kw, 8, 2, Direction.EAST);
        new Wall(kw, 9, 2, Direction.EAST);
        new Wall(kw, 10, 2, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 4, 3, Direction.EAST);
        new Wall(kw, 6, 3, Direction.EAST);
        new Wall(kw, 7, 3, Direction.EAST);
        new Wall(kw, 10, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 6, Direction.NORTH);
        new Wall(kw, 2, 7, Direction.NORTH);
        new Wall(kw, 2, 7, Direction.EAST);
        new Wall(kw, 3, 7, Direction.EAST);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.NORTH);
        new Wall(kw, 5, 5, Direction.NORTH);
        new Wall(kw, 5, 6, Direction.NORTH);
        new Wall(kw, 5, 7, Direction.NORTH);
        new Wall(kw, 5, 7, Direction.SOUTH);
        new Wall(kw, 5, 7, Direction.EAST);
        new Wall(kw, 5, 6, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 8, 4, Direction.NORTH);
        new Wall(kw, 8, 5, Direction.NORTH);
        new Wall(kw, 8, 6, Direction.NORTH);
        new Wall(kw, 8, 7, Direction.NORTH);
        new Wall(kw, 8, 7, Direction.EAST);
        new Wall(kw, 8, 7, Direction.SOUTH);
        new Wall(kw, 8, 6, Direction.SOUTH);
        new Wall(kw, 8, 5, Direction.SOUTH);
        new Wall(kw, 8, 4, Direction.SOUTH);
        new Wall(kw, 9, 3, Direction.EAST);
        new Wall(kw, 10, 3, Direction.SOUTH);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 5);
        new Thing(kw, 2, 6);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 5);
        new Thing(kw, 4, 3);
        new Thing(kw, 5, 3);
        new Thing(kw, 6, 3);
        new Thing(kw, 8, 5);
        new Thing(kw, 8, 6);
        new Thing(kw, 5, 3);
        new Thing(kw, 5, 4);
        while (kar.frontIsClear()) {
            kar.move();
            if (kar.canPickThing()) {
                kar.pickThing();
            }
            kar.turnLeft();
            while (kar.frontIsClear()) {
                kar.move();
                if (kar.canPickThing()) {
                    kar.pickThing();
                }
                if (!kar.frontIsClear()) {
                    kar.turnLeft();
                    kar.turnLeft();
                    while (kar.frontIsClear()) {
                        kar.move();
                    }
                    kar.turnLeft();
                    kar.move();
                    kar.turnLeft();
                }
            }
            if (!kar.frontIsClear()) {
                kar.turnLeft();
                kar.turnLeft();
                kar.turnLeft();

            }
        }
        while (tin.frontIsClear()) {
            tin.move();
            if (tin.canPickThing()) {
                tin.pickThing();
            }
        }
    }
}
