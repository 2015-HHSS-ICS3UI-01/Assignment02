
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make new city
        City kw = new City();

        //make a robot
        Robot jon = new Robot(kw, 1, 1, Direction.EAST);

        //make new things
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);

        jon.move();

        //make jon pick up 7 things
        while (jon.canPickThing()) {
            jon.pickThing();
            jon.move();
            jon.countThingsInBackpack();
            if (jon.countThingsInBackpack() == 7) {
                jon.move();
                jon.move();
                jon.move();

            }
        }













    }
}
