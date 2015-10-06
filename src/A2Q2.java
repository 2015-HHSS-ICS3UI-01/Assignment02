
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eadil1765
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City L = new City();
        Robot Liam = new Robot(L, 1, 1, Direction.EAST);
        Liam.setColor(Color.YELLOW);
        Liam.setLabel("Liam");
        new Thing (L, 1, 9);

        new Wall(L, 1, 1, Direction.SOUTH);
        new Wall(L, 1, 2, Direction.SOUTH);
        new Wall(L, 1, 3, Direction.SOUTH);
        new Wall(L, 1, 4, Direction.SOUTH);
        new Wall(L, 1, 5, Direction.SOUTH);
        new Wall(L, 1, 6, Direction.SOUTH);
        new Wall(L, 1, 7, Direction.SOUTH);
        new Wall(L, 1, 8, Direction.SOUTH);
        new Wall(L, 1, 9, Direction.SOUTH);

        new Wall(L, 1, 1, Direction.EAST);
        new Wall(L, 1, 2, Direction.EAST);
        new Wall(L, 1, 4, Direction.EAST);
        new Wall(L, 1, 7, Direction.EAST);

        while (true) {
            if (!Liam.frontIsClear()) {
                Liam.turnLeft();
            } else {

                Liam.move();
                if (!Liam.frontIsClear()) { }
                Liam.turnLeft();
                Liam.turnLeft();
                Liam.turnLeft();

            }
        }
    }
}