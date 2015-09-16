
import becker.robots.Wall;
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class Programming_Exercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot matt = new Robot (kw,1,1,Direction.EAST);
        
        new Thing (kw,1,2);
        new Thing (kw,1,3);
        new Thing (kw,1,4);
        new Thing (kw,1,5);
        new Thing (kw,1,6);
        new Thing (kw,1,7);
        new Thing (kw,1,8);
        new Thing (kw,1,9);
        new Thing (kw,1,10);
        new Thing (kw,1,11);
        
            if (matt.countThingsInBackpack() <=7);
            matt.move();
            matt.pickThing();
            
        
        
        }
    
}
