
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
 * @author mitrm7692
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a City
        City kw=new City();
        // Make a Robot
        Robot Karel=new Robot(kw,1,1,Direction.EAST);
        // Make a Thing
        new Thing(kw,1,2);
        new Thing(kw,1,3);
        new Thing(kw,1,4);
        new Thing(kw,1,5);
        new Thing(kw,1,6);
        new Thing(kw,1,7);
        new Thing(kw,1,8);
        new Thing(kw,1,9);
        new Thing(kw,1,10);
        new Thing(kw,1,11);
        // Make Robot move
        Karel.move();
        // Make Robot pick up 7 things
        while(Karel.canPickThing()) 
        {
         Karel.pickThing();
         Karel.move();
         Karel.countThingsInBackpack();    
        if (Karel.countThingsInBackpack()==7)
        { 
            Karel.move();
            Karel.move();
            Karel.move();
            
        }
        }
        
        
                                     

            
 
    }
    }