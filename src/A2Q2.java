
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
 * @author iorgs3184
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        City kw = new City();
        
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 7, Direction.SOUTH);
        new Wall(kw, 2, 8, Direction.SOUTH);
        new Wall(kw, 2, 8, Direction.EAST);
        new Wall(kw, 2, 9, Direction.SOUTH);
        new Wall(kw, 2, 10, Direction.SOUTH);
        
        new Thing(kw, 2, 10);
    
        Robot karel = new Robot(kw, 2, 2, Direction.EAST);
    
      while(karel.getStreet() == 2)
      {
          if(karel.frontIsClear())
          {
              karel.move();
          }               
          else if(!karel.frontIsClear() )
          {
              karel.turnLeft();
              karel.move();
              karel.turnLeft();
              karel.turnLeft();
              karel.turnLeft();
              karel.move();
              karel.turnLeft();
              karel.turnLeft();
              karel.turnLeft();
              karel.move();
              karel.turnLeft();
          }
        
          if(karel.canPickThing())
          {
              break;
          }           
      }            
   }
}
