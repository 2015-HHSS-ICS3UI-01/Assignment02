
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vickj2854
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // make city
   City kw = new City();
   // make the robot karel 
   Robot jim = new Robot(kw, 1,1, Direction.EAST);
   // make walls
   new Wall(kw, 1,1, Direction.SOUTH);
   new Wall(kw, 1,2, Direction.SOUTH);
   new Wall(kw, 1,3, Direction.SOUTH);
   new Wall(kw, 1,4, Direction.SOUTH);
   new Wall(kw, 1,5, Direction.SOUTH);
   new Wall(kw, 1,6, Direction.SOUTH);
   new Wall(kw, 1,7, Direction.SOUTH);
   new Wall(kw, 1,8, Direction.SOUTH);
   new Wall(kw, 1,9, Direction.SOUTH);
   new Wall(kw, 1,1, Direction.EAST);
   new Wall(kw, 1,2, Direction.EAST);
   new Wall(kw, 1,4, Direction.EAST);
   new Wall(kw, 1,7, Direction.EAST);
   // make thing
   new Thing(kw, 1,9);
   // make karel move

     while( true){
                
//                karel.move();
//              
                if(karel.frontIsClear())
                {
                    break;
                }else{
                    karel.turnLeft();
                    karel.move();
                  
                    
                }
                      
   
   
  
   
    }
}
    }
    

