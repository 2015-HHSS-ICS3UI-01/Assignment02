
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

        //City for Robot to live in
        City kw = new City();

        //New Robot to live in city
        Robot karel = new Robot(kw, 5, 5, Direction.WEST);

        //if direction isn't north then Robot turns until it is facing North
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

            //if Robot is not on street 0 then he move until he is
            while (karel.getStreet() != 0) {
                karel.move();
            }
            //Robot turns left to go to 0,0
            if (karel.getDirection() != Direction.WEST) {
                karel.turnLeft();
            }
            //if Robot is not on avenue 0 then he moves until he is
            while (karel.getAvenue() != 0) {
                karel.move();
            }
            //if Robot is on 0,0 then he stops
            if (karel.getAvenue() == 0 && karel.getStreet() == 0) {
                break;
            }

        }
    }
}
