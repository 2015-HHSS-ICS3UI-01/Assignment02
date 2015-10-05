
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eadil1765
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City L = new City();
        Robot Liam = new Robot(L, 0, 0, Direction.EAST);

        new Thing(L, 0, 1);
        new Thing(L, 0, 2);
        new Thing(L, 0, 3);
        new Thing(L, 0, 4);
        new Thing(L, 0, 5);
        new Thing(L, 0, 6);
        new Thing(L, 0, 7);
        new Thing(L, 0, 8);
        new Thing(L, 0, 9);
        new Thing(L, 0, 10);

        Liam.move();


        while (true) {
            if (Liam.countThingsInBackpack() < 7) {
                Liam.pickThing();
                Liam.move();

            } else {
                break;
            }
        }

        Liam.move();
        Liam.move();
        Liam.move();



    }
}
