
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
 * @author alled7036
 */
public class Number2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make City
        City kw = new City();
        // New Robot
        Robot jim = new Robot(kw, 5, 0, Direction.NORTH);
        //Thing
        new Thing(kw, 5, 8);
        //new Wall
        new Wall(kw, 5, 0, Direction.SOUTH);
        new Wall(kw, 5, 0, Direction.EAST);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 1, Direction.EAST);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 3, Direction.SOUTH);
        new Wall(kw, 5, 3, Direction.EAST);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 6, Direction.SOUTH);
        new Wall(kw, 5, 6, Direction.EAST);
        new Wall(kw, 5, 7, Direction.SOUTH);
        new Wall(kw, 5, 8, Direction.SOUTH);
        //Comands
        jim.move();
        jim.turnLeft();
        jim.turnLeft();
        jim.turnLeft();
        jim.move();
        jim.turnLeft();
        jim.turnLeft();
        jim.turnLeft();
        jim.move();
        jim.turnLeft();
        jim.turnLeft();
        jim.move();
        jim.turnLeft();
        jim.turnLeft();
        jim.turnLeft();
        jim.move();
        jim.turnLeft();
        jim.turnLeft();
        jim.turnLeft();
        jim.move();
        jim.turnLeft();
        jim.move();
        jim.turnLeft();
        jim.move();
        jim.turnLeft();
        jim.turnLeft();
        jim.turnLeft();
        jim.move();
        jim.turnLeft();
        jim.turnLeft();
        jim.turnLeft();
        jim.move();
        jim.turnLeft();
        jim.move();
        jim.move();
        jim.turnLeft();
        jim.move();
        jim.turnLeft();
        jim.turnLeft();
        jim.turnLeft();
        jim.move();
        jim.turnLeft();
        jim.turnLeft();
        jim.turnLeft();
        jim.move();
        jim.turnLeft();
        jim.move();
        
        
                
               
                
       
        
        
        
        
        
        
        
    }

    private static void Wall(City kw, int i, int i0, Direction direction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
