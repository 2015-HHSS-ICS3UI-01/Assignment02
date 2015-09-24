
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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Make a city for the Robot to live in
        City NYC = new City(); 
        
        Robot karel = new Robot(NYC, 3, 0, Direction.EAST); 
        
        new Thing(NYC, 3, 8); 
        
        new Wall(NYC, 3, 0, Direction.SOUTH); 
        new Wall(NYC, 3, 0, Direction.EAST);
        new Wall(NYC, 3, 1, Direction.SOUTH); 
        new Wall(NYC, 3, 1, Direction.EAST);
        new Wall(NYC, 3, 2, Direction.SOUTH); 
        new Wall(NYC, 3, 3, Direction.SOUTH); 
        new Wall(NYC, 3, 3, Direction.EAST); 
        new Wall(NYC, 3, 4, Direction.SOUTH); 
        new Wall(NYC, 3, 5, Direction.SOUTH); 
        new Wall(NYC, 3, 6, Direction.SOUTH); 
        new Wall(NYC, 3, 6, Direction.EAST); 
        new Wall(NYC, 3, 7, Direction.SOUTH); 
        new Wall(NYC, 3, 8, Direction.SOUTH); 
    
        if( karel.frontIsClear() ) {
      karel.move();
   }else
       karel.turnLeft(); 
       karel.move(); 
       
      if(karel.canPickThing())                                    
{                                                        
    karel.turnLeft();
} else {                                                   
    karel.turnLeft();  
    karel.turnLeft();
    karel.turnLeft();
    
}   karel.move();
    karel.turnLeft();  
    karel.turnLeft();
    karel.turnLeft();
    karel.move(); 
     if( karel.frontIsClear() ) {
      karel.move();
   }else{
       karel.turnLeft(); 
       karel.turnLeft(); 
       karel.move(); 
       
     } karel.turnLeft();  
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
        if(karel.canPickThing())                                    
{                                                        
    karel.turnLeft();
} else {                                                   
    karel.turnLeft();  
    karel.turnLeft();
    karel.turnLeft();
        } karel.move(); 
     if( karel.frontIsClear() ) {
      karel.move();
   }else
       karel.turnLeft(); 
       karel.move(); 
       if( karel.frontIsClear() ) {
      karel.move();
   }else
       karel.turnLeft(); 
       karel.move(); 
       if(karel.canPickThing())                                    
{                                                        
    karel.turnLeft();
} else {                                                   
    karel.turnLeft();  
    karel.turnLeft();
    karel.turnLeft();
       } karel.move(); 
    if(karel.canPickThing()){                                    
                                                       
    karel.turnLeft();
} else {                                                   
    karel.turnLeft();  
    karel.turnLeft();
    karel.turnLeft();
    } karel.move(); 
    if( karel.frontIsClear() ) {
      karel.move();
   }else{
       karel.turnLeft(); 
       karel.move(); 
    }   karel.move(); 
    if(karel.frontIsClear() ) {
        karel.move();
    }else{karel.turnLeft();
       karel.move(); 
       karel.turnLeft(); 
       karel.turnLeft(); 
       karel.turnLeft(); 
       karel.move(); 
       karel.turnLeft(); 
       karel.turnLeft(); 
       karel.turnLeft(); 
    } karel.move();
    if(karel.frontIsClear() ) {
        karel.move();
    }else{ 
        karel.turnLeft();
        karel.move();
    }
        
        }
   
    }
   
    


    

