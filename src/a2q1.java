
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
 * @author lalim9800
 */
public class a2q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creat city
      City a2q2= new City();
      //creat robot
      Robot lali= new Robot(a2q2,1,1,Direction.EAST);
      new Thing (a2q2,1,2);
      new Thing (a2q2,1,3);
      new Thing (a2q2,1,4);
      new Thing (a2q2,1,5);
      new Thing (a2q2,1,6);
      new Thing (a2q2,1,7);
      new Thing (a2q2,1,8);
      new Thing (a2q2,1,9);
      new Thing (a2q2,1,10);
      new Thing (a2q2,1,11);
      lali.move();
      
      while(lali.canPickThing()){
          lali.pickThing();
          lali.move();
          lali.countThingsInBackpack();
          
          
          if(lali.countThingsInBackpack()==7){
              lali.move();
              lali.move();
              lali.move();
          }
      }
            
                    
             
    }
}
