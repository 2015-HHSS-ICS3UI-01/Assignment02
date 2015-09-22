
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class PE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city for robot
        City kw = new City();

        //Create robot for city
        Robot karel = new Robot(kw, 5, 5, Direction.EAST);

        //Algorithm for returning to 0,0
        while (karel.getDirection() != Direction.WEST) {
            if (true) {
                karel.turnLeft();
            }
        }
        while (karel.getAvenue() != 0) {
            if (karel.frontIsClear()) {
                karel.move();
            }
        }
        while (karel.getDirection() != Direction.NORTH) {
            if (true) {
                karel.turnLeft();
            }
        }
        while (karel.getStreet() != 0) {
            if (true) {
                karel.move();
            }
        }
    }
}
