
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
 * @author snowc4636
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the robot to live in
        City ee = new City();
        
        //Make a robot to live in the City
        Robot Zach = new Robot(ee, 1, 1, Direction.EAST);
        
        //Make a Thing
        new Thing(ee,1, 2);
        new Thing(ee,1, 3);
        new Thing(ee,1, 4);
        new Thing(ee,1, 5);
        new Thing(ee,1, 6);
        new Thing(ee,1, 7);
        new Thing(ee,1, 8);
        new Thing(ee,1, 9);
        new Thing(ee,1, 10);
        new Thing(ee,1, 11);
        
   
        Zach.move();
        
        //make Zach pick up 7 things
        while(Zach.canPickThing())
        {    
            Zach.pickThing();
            Zach.move();
            Zach.countThingsInBackpack();
            if(Zach.countThingsInBackpack()==7)
            {        
                Zach.move();
                Zach.move();
                Zach.move();
            }
        }
       
            
          
        
        

        
        
        
    }
}
