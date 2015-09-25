
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make a City for the Robot to live in
        City Cap = new City();
        
        //Make a Robot to live in the City
        Robot Carter = new Robot(Cap, 0, 0, Direction.EAST);
        
        //Make a Wall
        new Wall(Cap, 1, 1, Direction.NORTH);
        new Wall(Cap, 1, 1, Direction.SOUTH);
        new Wall(Cap, 1, 1, Direction.EAST);
        new Wall(Cap, 1, 1, Direction.WEST);
        
        new Wall(Cap, 4, 1, Direction.WEST);
        new Wall(Cap, 4, 1, Direction.SOUTH);
        new Wall(Cap, 4, 1, Direction.EAST);
        new Wall(Cap, 4, 1, Direction.NORTH);
        
        new Wall(Cap, 1, 4, Direction.WEST);
        new Wall(Cap, 1, 4, Direction.SOUTH);
        new Wall(Cap, 1, 4, Direction.EAST);
        new Wall(Cap, 1, 4, Direction.NORTH);
        
        new Wall(Cap, 4, 4, Direction.WEST);
        new Wall(Cap, 4, 4, Direction.SOUTH);
        new Wall(Cap, 4, 4, Direction.EAST);
        new Wall(Cap, 4, 4, Direction.NORTH);
        
        new Wall(Cap, 2, 2, Direction.WEST);
        new Wall(Cap, 3, 2, Direction.WEST);
        
        new Wall(Cap, 2, 2, Direction.NORTH);
        new Wall(Cap, 2, 3, Direction.NORTH);
        
        new Wall(Cap, 2, 3, Direction.EAST);
        new Wall(Cap, 3, 3, Direction.EAST);
        
        new Wall(Cap, 3, 2, Direction.SOUTH);
        new Wall(Cap, 3, 3, Direction.SOUTH);
        
        while(true){
        
        while(!Carter.frontIsClear()) {
        Carter.move();
        }
            {
            Carter.move();
            Carter.move();
            Carter.turnLeft();
            Carter.turnLeft();
            Carter.turnLeft();
        }
            while(!Carter.frontIsClear()) {
                Carter.move();
            }
            {
                
            Carter.move();
            Carter.turnLeft();
            
           
            
            }
            while(!Carter.frontIsClear()) {
                Carter.move();}
        
            {
               Carter.move();
            Carter.turnLeft();
            
        }
            while(!Carter.frontIsClear()) {
        Carter.move();
        }
            {
            
            Carter.move();
            Carter.turnLeft();
            Carter.turnLeft();
            Carter.turnLeft();
            }
            
            while(!Carter.frontIsClear()) {
                Carter.move();
            }
            {
                Carter.move();
                Carter.move();
                Carter.turnLeft();
                Carter.turnLeft();
                Carter.turnLeft();
            }
            }
          
            
           
        
        
        
        
    }
}
