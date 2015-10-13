
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
 * @author ramli8368
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kw = new City();
        
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 6, Direction.SOUTH);
        new Wall(kw, 4, 7, Direction.SOUTH);
        new Wall(kw, 4, 7, Direction.EAST);
        new Wall(kw, 4, 8, Direction.SOUTH);
        new Wall(kw, 4, 9, Direction.SOUTH);
        
        new Thing(kw, 4, 9);
        
        Robot commando = new Robot(kw, 4, 1, Direction.EAST);
   
   
        commando.turnLeft();
        commando.move();
        commando.turnLeft();
        commando.turnLeft();
        commando.turnLeft();

        
        if( commando.frontIsClear() ) {
      commando.move();
        }
        
        while(commando.frontIsClear())
{
    commando.turnLeft();
    commando.turnLeft();
    commando.turnLeft();
   commando.move();
           commando.turnLeft();
        commando.turnLeft();
     
        break;
    
}
        
        
           while(commando.frontIsClear())
               
           {commando.move();
           commando.turnLeft();
                   commando.turnLeft();
        commando.turnLeft(); 

        {  
               
               break;
        
        
         
              
            
            
              
                      
                  }
        
       
        
 
        
           }

        }
        

        // TODO code application logic here
    }

