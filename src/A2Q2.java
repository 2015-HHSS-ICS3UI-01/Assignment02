
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
 * @author dawsr2694
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Make City
        City A2Q2 = new City();
        
        //Make Robot
        Robot karel = new Robot(A2Q2, 4, 1, Direction.EAST);
        
        //Make Race course
        new Wall(A2Q2, 4, 1, Direction.SOUTH);
        new Wall(A2Q2, 4, 2, Direction.SOUTH);
        new Wall(A2Q2, 4, 3, Direction.SOUTH);
        new Wall(A2Q2, 4, 4, Direction.SOUTH);
        new Wall(A2Q2, 4, 5, Direction.SOUTH);
        new Wall(A2Q2, 4, 6, Direction.SOUTH);
        new Wall(A2Q2, 4, 7, Direction.SOUTH);
        new Wall(A2Q2, 4, 8, Direction.SOUTH);
        new Wall(A2Q2, 4, 9, Direction.SOUTH);
        
        new Wall(A2Q2, 4, 1, Direction.EAST);
        new Wall(A2Q2, 4, 2, Direction.EAST);
        new Wall(A2Q2, 4, 4, Direction.EAST);
        new Wall(A2Q2, 4, 7, Direction.EAST);
        
        //Make Thing
        new Thing(A2Q2, 4, 9);
        
        do{
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
        while( !karel.frontIsClear() );
        
        while( karel.frontIsClear() ){
            karel.move();
        }
        
            
        
        
        
        
        
                
                
                

        
        
        
        
        
        
        
    }
}
