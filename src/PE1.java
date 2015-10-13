
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
 * @author pircn0556
 */
public class PE1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) 
    {
        // Make city for robot
        City kw = new City();
        
        //Make things in city
        new Thing(kw,1,2,Direction.EAST);
        new Thing(kw,1,3,Direction.EAST);
        new Thing(kw,1,4,Direction.EAST);
        new Thing(kw,1,5,Direction.EAST);
        new Thing(kw,1,6,Direction.EAST);
        new Thing(kw,1,7,Direction.EAST);
        new Thing(kw,1,8,Direction.EAST);
        new Thing(kw,1,9,Direction.EAST);
        new Thing(kw,1,10,Direction.EAST);
        new Thing(kw,1,11,Direction.EAST);
        
        //Make robot for city
        Robot karel = new Robot(kw,1,1,Direction.EAST);
        
        //karel picking up 7 things
        karel.move();
                
        while(karel.countThingsInBackpack() <7){
            karel.pickThing();
            karel.move();
        }
        
        karel.move();
        karel.move();
        karel.move();
  }
}
