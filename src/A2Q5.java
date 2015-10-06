
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
 * @author eadil1765
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City L = new City();
        new Wall(L, 1, 1, Direction.WEST);
        new Wall(L, 2, 1, Direction.WEST);
        new Wall(L, 3, 1, Direction.WEST);
        new Wall(L, 4, 1, Direction.WEST);
        new Wall(L, 5, 1, Direction.WEST);
        new Wall(L, 6, 1, Direction.WEST);
        new Wall(L, 7, 1, Direction.WEST);
        new Wall(L, 8, 1, Direction.WEST);
        new Wall(L, 9, 1, Direction.WEST);
        new Wall(L, 10, 1, Direction.WEST);

        new Wall(L, 1, 2, Direction.EAST);
        new Wall(L, 2, 2, Direction.EAST);
        new Wall(L, 3, 2, Direction.EAST);
        new Wall(L, 4, 2, Direction.EAST);
        new Wall(L, 5, 2, Direction.EAST);
        new Wall(L, 6, 2, Direction.EAST);
        new Wall(L, 7, 2, Direction.EAST);
        new Wall(L, 8, 2, Direction.EAST);
        new Wall(L, 9, 2, Direction.EAST);
        new Wall(L, 10, 2, Direction.EAST);

        new Wall(L, 1, 3, Direction.EAST);
        new Wall(L, 2, 4, Direction.NORTH);
        new Wall(L, 2, 5, Direction.NORTH);
        new Wall(L, 2, 6, Direction.NORTH);
        new Wall(L, 2, 7, Direction.NORTH);
        new Wall(L, 2, 7, Direction.EAST);
        new Wall(L, 3, 7, Direction.EAST);
        new Wall(L, 3, 6, Direction.SOUTH);
        new Wall(L, 3, 5, Direction.SOUTH);
        new Wall(L, 3, 4, Direction.SOUTH);
        new Wall(L, 3, 7, Direction.SOUTH);
        new Wall(L, 4, 3, Direction.EAST);
        new Wall(L, 5, 4, Direction.NORTH);
        new Wall(L, 5, 5, Direction.NORTH);
        new Wall(L, 5, 6, Direction.NORTH);
        new Wall(L, 5, 6, Direction.EAST);
        new Wall(L, 5, 6, Direction.SOUTH);
        new Wall(L, 5, 5, Direction.SOUTH);
        new Wall(L, 5, 4, Direction.SOUTH);
        new Wall(L, 6, 3, Direction.EAST);
        new Wall(L, 7, 3, Direction.EAST);
        new Wall(L, 8, 4, Direction.NORTH);
        new Wall(L, 8, 5, Direction.NORTH);
        new Wall(L, 8, 6, Direction.NORTH);
        new Wall(L, 8, 7, Direction.NORTH);
        new Wall(L, 8, 8, Direction.NORTH);
        new Wall(L, 8, 8, Direction.EAST);
        new Wall(L, 9, 8, Direction.EAST);
        new Wall(L, 10, 8, Direction.NORTH);
        new Wall(L, 10, 7, Direction.NORTH);
        new Wall(L, 10, 6, Direction.NORTH);
        new Wall(L, 10, 5, Direction.NORTH);
        new Wall(L, 10, 4, Direction.NORTH);
        new Wall(L, 10, 3, Direction.EAST);
        new Wall(L, 10, 3, Direction.SOUTH);

        new Thing(L, 2, 3);
        new Thing(L, 3, 3);
        new Thing(L, 2, 4);
        new Thing(L, 2, 5);
        new Thing(L, 2, 6);
        new Thing(L, 3, 5);
        new Thing(L, 3, 7);
        new Thing(L, 5, 3);
        new Thing(L, 5, 4);
        new Thing(L, 5, 5);
        new Thing(L, 8, 3);
        new Thing(L, 8, 4);
        new Thing(L, 9, 4);
        new Thing(L, 9, 5);
        new Thing(L, 9, 7);

        Robot Liam = new Robot(L, 1, 3, Direction.SOUTH);
        Robot Jamez = new Robot(L, 1, 3, Direction.SOUTH);

        while (Liam.frontIsClear()) {
            Liam.turnLeft();

            if (Liam.frontIsClear()) {
                while (Liam.frontIsClear()) {
                    Liam.move();
                    if (Liam.canPickThing()) {
                        Liam.pickThing();

                    }
                }
                Liam.turnLeft();
                Liam.turnLeft();

                while (Liam.frontIsClear()) {
                    Liam.move();
                }
                while (Liam.countThingsInBackpack() > 0) {
                    Liam.putThing();
                }
                Liam.turnLeft();
                Liam.move();


            } else {
                Liam.turnLeft();
                Liam.turnLeft();
                Liam.turnLeft();
                Liam.move();
            }
        }
        while (Jamez.frontIsClear()) {
            Jamez.move();

            while (Jamez.canPickThing()) {
                Jamez.pickThing();
            }
        }
    }
}
