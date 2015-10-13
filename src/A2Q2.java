
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
 * @author agott2059
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City thomas = new City();

        Robot tom = new Robot(thomas, 2, 0, Direction.EAST);

        new Thing(thomas, 2, 6);

        new Wall(thomas, 2, 0, Direction.SOUTH);
        new Wall(thomas, 2, 0, Direction.EAST);
        new Wall(thomas, 2, 1, Direction.SOUTH);
        new Wall(thomas, 2, 2, Direction.SOUTH);
        new Wall(thomas, 2, 3, Direction.SOUTH);
        new Wall(thomas, 2, 4, Direction.SOUTH);
        new Wall(thomas, 2, 3, Direction.EAST);
        new Wall(thomas, 2, 2, Direction.EAST);
        new Wall(thomas, 2, 5, Direction.SOUTH);
        new Wall(thomas, 2, 6, Direction.SOUTH);
        new Wall(thomas, 2, 5, Direction.EAST);


        while (true) {
            if (tom.frontIsClear()) {
                if (tom.canPickThing()) {
                    tom.pickThing();
                    break;
                }

                tom.move();


            } else {
                tom.turnLeft();
                tom.move();
                tom.turnLeft();
                tom.turnLeft();
                tom.turnLeft();
                tom.move();
                tom.turnLeft();
                tom.turnLeft();
                tom.turnLeft();
                tom.move();
                tom.turnLeft();
                tom.turnLeft();
                tom.turnLeft();
                tom.turnLeft();
                tom.turnLeft();


            }
        }
    }
}
