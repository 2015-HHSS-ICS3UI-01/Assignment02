
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
 * @author watsk8668
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();
        
        //make robot
        Robot karel = new Robot(kw, 1,1, Direction.EAST);
        
        //make things
        new Thing(kw, 1,2);
        new Thing(kw, 1,3);
        new Thing(kw, 1,4);
        new Thing(kw, 1,5);
        new Thing(kw, 1,6);
        new Thing(kw, 1,7);
        new Thing(kw, 1,8);
        new Thing(kw, 1,9);
        new Thing(kw, 1,10);
        new Thing(kw, 1,11);
        
        //make karel pick up 7 things then walk past the last 3
        if(karel.getAvenue() <= 8) { 
        karel.move();
        karel.pickThing();
        }
        else if(karel.getAvenue() == 9 || karel.getAvenue() == 10 || karel.getAvenue() == 11) {
        karel.move();
        }
        
}
