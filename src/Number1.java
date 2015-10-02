
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
 * @author alled7036
 */
public class Number1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City(); 
        
        //New Robot
        Robot josh = new Robot(kw, 1, 0, Direction.EAST);
        
        //New Things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        
        josh.move();
        josh.pickThing();
        josh.move();
        josh.pickThing();
        josh.move();
        josh.pickThing();
        josh.move();
        josh.pickThing();
        josh.move();
        josh.pickThing();
        josh.move();
        josh.pickThing();
        josh.move();
        josh.pickThing();
        josh.move();
   if(josh.countThingsInBackpack() >= 7){
   }
       while(true)
       josh.move(); 
       
             
                
        
       
        
        
        
    }
}
