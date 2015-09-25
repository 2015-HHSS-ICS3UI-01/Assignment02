
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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        Robot karel = new Robot(kw, 3, 1, Direction.EAST);
        
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.EAST);
        new Wall(kw, 3, 8, Direction.SOUTH);
        new Wall(kw, 3, 9, Direction.SOUTH);
        
        while(true) {
            
            if(!karel.frontIsClear()){
                karel.turnLeft();
                
                
            }else{ 
                karel.move();
                
                if(karel.frontIsClear()){
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                }
            
            
            
            }
        }
    }
}
