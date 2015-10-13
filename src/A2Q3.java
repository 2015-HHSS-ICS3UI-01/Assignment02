
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    City kw = new City();
    
    Robot karel = new Robot(kw,18,18,Direction.SOUTH);
    
    while (karel.getDirection() != Direction.NORTH)
    {
     karel.turnLeft();
    }
    while (karel.getStreet() != 0)
    {
       karel .move();
    }
    while (karel.getDirection() != Direction.WEST)
    {
    karel.turnLeft();
    }
    while (karel.getAvenue() != 0)
    {
        karel.move();
    }
}
}