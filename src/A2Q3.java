
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City kw = new City();

        Robot karel = new Robot(kw, 5, 5, Direction.WEST);

        while (karel.getDirection() != Direction.NORTH) {

            while (karel.getDirection() != Direction.NORTH) {
                if (karel.getDirection() == Direction.EAST) {
                    karel.turnLeft();
                }
                if (karel.getDirection() == Direction.SOUTH) {
                    karel.turnLeft();
                }
                if (karel.getDirection() == Direction.WEST) {
                    karel.turnLeft();
                }
            }

            while (karel.getStreet() != 0) {
                karel.move();
            }
            if (karel.getDirection() != Direction.WEST) {
                karel.turnLeft();
            }
            while (karel.getAvenue() != 0) {
                karel.move();
            }
            if (karel.getAvenue() == 0 && karel.getStreet() == 0) {
                break;
            }

        }
    }
}
