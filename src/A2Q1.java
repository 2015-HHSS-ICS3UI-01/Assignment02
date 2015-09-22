
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
 * @author iorgs3184
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //City for Robot to live in
        City kw = new City();

        //Make the robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);

        //Make new Thing
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

        //Make Karel move
        while (karel.getAvenue() <= 11) {
            if (karel.frontIsClear()) {
                karel.move();
            }
            //Make karel pick up Things if he can
            if (karel.canPickThing()) {
                karel.pickThing();
            }
            //Karel counts Things in Backpack
            if (karel.countThingsInBackpack() == 7) {
                karel.move();
                karel.move();
                karel.move();
                karel.move();
            }
        }
    }
}