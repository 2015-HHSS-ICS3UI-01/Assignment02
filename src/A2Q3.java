
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulla6503
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the Robot to live in
        City NYC = new City(); 
        
        Robot karel = new Robot(NYC, 5, 20, Direction.WEST); 
        
       
      // Make Robot Move To Origin
      
       while(karel.getDirection() != Direction.NORTH) {
           karel.turnLeft();
       }
       while(karel.getStreet() != 0 ) {
           karel.move();
       }
       if(karel.getAvenue() > 0) {
           karel.turnLeft(); 
       }
       
       while(karel.getAvenue() != 0 ) {
           karel.move();
       }
       
       
           
   }
}
      
    

