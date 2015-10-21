
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitws6356
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot kar = new Robot(kw, 10, 11, Direction.NORTH);
        while (kar.getDirection() != Direction.WEST) {
            kar.turnLeft();
        }
        while (kar.getAvenue() != 0) {
            kar.move();
        }
        kar.turnLeft();
        kar.turnLeft();
        kar.turnLeft();

        while (kar.getStreet() != 0) {
            kar.move();
        }
    }
}
