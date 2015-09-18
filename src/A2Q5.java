
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
 * @author kulla6503
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the Robot to live in
        City NYC = new City();

        
        
        Robot karel = new Robot(NYC, 0, 2, Direction.SOUTH);
        Robot tina = new Robot(NYC, 0, 2, Direction.SOUTH); 
        
       
        
         new Wall(NYC, 0, 0, Direction.WEST);
         new Wall(NYC, 1, 0, Direction.WEST);
         new Wall(NYC, 2, 0, Direction.WEST);
         new Wall(NYC, 3, 0, Direction.WEST);
         new Wall(NYC, 4, 0, Direction.WEST);
         new Wall(NYC, 5, 0, Direction.WEST);
         new Wall(NYC, 6, 0, Direction.WEST);
         new Wall(NYC, 7, 0, Direction.WEST);
         new Wall(NYC, 8, 0, Direction.WEST);
         new Wall(NYC, 9, 0, Direction.WEST);
         new Wall(NYC, 0, 1, Direction.EAST);
         new Wall(NYC, 1, 1, Direction.EAST);
         new Wall(NYC, 2, 1, Direction.EAST);
         new Wall(NYC, 3, 1, Direction.EAST);
         new Wall(NYC, 4, 1, Direction.EAST);
         new Wall(NYC, 5, 1, Direction.EAST);
         new Wall(NYC, 6, 1, Direction.EAST);
         new Wall(NYC, 7, 1, Direction.EAST);
         new Wall(NYC, 8, 1, Direction.EAST);
         new Wall(NYC, 9, 1, Direction.EAST);
         new Wall(NYC, 0, 2, Direction.EAST);
         new Wall(NYC, 1, 3, Direction.NORTH);
         new Wall(NYC, 1, 4, Direction.NORTH);
         new Wall(NYC, 1, 5, Direction.NORTH);
         new Wall(NYC, 1, 6, Direction.NORTH);
         new Wall(NYC, 1, 6, Direction.EAST);
         new Wall(NYC, 2, 6, Direction.EAST);
         new Wall(NYC, 2, 6, Direction.SOUTH);
         new Wall(NYC, 2, 5, Direction.SOUTH);
         new Wall(NYC, 2, 4, Direction.SOUTH);
         new Wall(NYC, 2, 3, Direction.SOUTH);
         new Wall(NYC, 3, 2, Direction.EAST);
         new Wall(NYC, 4, 3, Direction.NORTH);
         new Wall(NYC, 4, 4, Direction.NORTH);
         new Wall(NYC, 4, 5, Direction.NORTH);
         new Wall(NYC, 4, 5, Direction.EAST);
         new Wall(NYC, 4, 5, Direction.SOUTH);
         new Wall(NYC, 4, 3, Direction.SOUTH);
         new Wall(NYC, 4, 4, Direction.SOUTH);
         new Wall(NYC, 5, 2, Direction.EAST);
         new Wall(NYC, 6, 2, Direction.EAST);
         new Wall(NYC, 7, 3, Direction.NORTH);
         new Wall(NYC, 7, 4, Direction.NORTH);
         new Wall(NYC, 7, 5, Direction.NORTH);
         new Wall(NYC, 7, 6, Direction.NORTH);
         new Wall(NYC, 7, 7, Direction.NORTH);
         new Wall(NYC, 7, 7, Direction.EAST);
         new Wall(NYC, 8, 7, Direction.EAST);
         new Wall(NYC, 8, 7, Direction.SOUTH);
         new Wall(NYC, 8, 6, Direction.SOUTH);
         new Wall(NYC, 8, 5, Direction.SOUTH);
         new Wall(NYC, 8, 4, Direction.SOUTH);
         new Wall(NYC, 8, 3, Direction.SOUTH);
         new Wall(NYC, 9, 2, Direction.EAST);
         new Wall(NYC, 9, 2, Direction.SOUTH);
         
         new Thing(NYC, 0, 1); 
         new Thing(NYC, 1, 0); 
         new Thing(NYC, 2, 0); 
         new Thing(NYC, 3, 0); 
         new Thing(NYC, 3, 1); 
         new Thing(NYC, 4, 0); 
         new Thing(NYC, 5, 1); 
         new Thing(NYC, 7, 0); 
         new Thing(NYC, 7, 1); 
         new Thing(NYC, 8, 1); 
         new Thing(NYC, 9, 0); 
         new Thing(NYC, 9, 1); 
         
         new Thing(NYC, 1, 2); 
         new Thing(NYC, 1, 3); 
         new Thing(NYC, 1, 4); 
         new Thing(NYC, 1, 5); 
         new Thing(NYC, 2, 2); 
         new Thing(NYC, 2, 4); 
         new Thing(NYC, 2, 6);
         
         new Thing(NYC, 4, 2); 
         new Thing(NYC, 4, 3); 
         new Thing(NYC, 4, 4); 
         
         new Thing(NYC, 7, 2); 
         new Thing(NYC, 7, 3); 
         new Thing(NYC, 7, 7); 
         new Thing(NYC, 8, 3); 
         new Thing(NYC, 8, 4); 
         new Thing(NYC, 8, 6); 
         
         new Thing(NYC, 0, 3); 
         new Thing(NYC, 0, 4); 
         new Thing(NYC, 0, 6); 
         new Thing(NYC, 1, 7); 
         new Thing(NYC, 3, 4); 
         new Thing(NYC, 3, 6); 
         new Thing(NYC, 4, 6); 
         new Thing(NYC, 4, 7); 
         new Thing(NYC, 5, 5); 
         new Thing(NYC, 5, 7); 
         new Thing(NYC, 6, 4); 
         new Thing(NYC, 6, 6); 
         new Thing(NYC, 9, 3); 
         new Thing(NYC, 9, 4); 
         new Thing(NYC, 9, 6); 
         
         karel.move(); 
         karel.turnLeft(); 
         karel.move();
      while(karel.frontIsClear() ) 
         if(karel.canPickThing() ) {
             karel.pickThing();
             karel.move();
         }
      
          karel.turnLeft(); 
          karel.turnLeft(); 
          karel.turnLeft(); 
          karel.move();
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
          karel.pickThing(); 
          
          
          while(karel.frontIsClear() )
          {
              karel.move();
              karel.move(); 
              if(karel.canPickThing() ) {
              karel.pickThing();
             
         }
          } 
          karel.turnLeft();
          karel.putThing();
          karel.move(); 
          karel.putThing();
          karel.move();
          karel.turnLeft();
          karel.move();
          
           while(karel.canPickThing() ) {
              karel.pickThing();
              karel.move();
             
         }
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         karel.move();
         karel.move();
         karel.turnLeft();
         karel.move();
         karel.putThing(); 
         karel.move();
         karel.putThing(); 
         karel.move();
         karel.turnLeft();
         karel.move(); 
         
          if(karel.canPickThing() ) {
             karel.pickThing();
             karel.move();
             karel.move();
             karel.move();
             karel.move();
             
          }
            if(karel.frontIsClear() ) {
              karel.move();
          }else{
             karel.turnLeft(); 
             karel.turnLeft(); 
             karel.turnLeft(); 
             karel.pickThing();
             karel.move();
             karel.turnLeft();
             karel.turnLeft();
             karel.turnLeft();
             karel.move();
             karel.pickThing();
             karel.move();
             karel.move();
             karel.pickThing();
             karel.move();
             karel.pickThing();
             karel.move();
             karel.turnLeft(); 
    
          }
            while(karel.frontIsClear() ) {
              karel.putThing();
              karel.move();
             
         } 
         if(karel.frontIsClear() ) {
              karel.move();
          }else{
             karel.putThing();
         } 
           while(tina.frontIsClear() ) {
               tina.move();
               tina.pickThing();
           }
         
         
         
            
       
          
         
         
        
          
         
          
          
          
           
          
         
            
       
         
             
          
         

        
    
      
          
          
      
         
         
            
            
         
         

    }
}
