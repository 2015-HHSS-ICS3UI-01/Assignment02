
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
 * @author lalim9800
 */
public class a2q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot
        City a2q4= new City();
        //make robot 
        Robot lali= new Robot(a2q4,0,1,Direction.EAST);
        //create all walls
        new Wall(a2q4,1,1,Direction.SOUTH);
        new Wall(a2q4,1,1,Direction.NORTH);
        new Wall(a2q4,1,1,Direction.EAST);
        new Wall(a2q4,1,1,Direction.WEST);
        
        new Wall(a2q4,4,1,Direction.SOUTH);
        new Wall(a2q4,4,1,Direction.NORTH);
        new Wall(a2q4,4,1,Direction.EAST);
        new Wall(a2q4,4,1,Direction.WEST);
       
        new Wall(a2q4,1,4,Direction.SOUTH);
        new Wall(a2q4,1,4,Direction.NORTH);
        new Wall(a2q4,1,4,Direction.EAST);
        new Wall(a2q4,1,4,Direction.WEST);
        
        new Wall(a2q4,4,4,Direction.WEST);
        new Wall(a2q4,4,4,Direction.EAST);
        new Wall(a2q4,4,4,Direction.NORTH);
        new Wall(a2q4,4,4,Direction.SOUTH);
        
        new Wall(a2q4,2,2,Direction.NORTH);
        new Wall(a2q4,2,3,Direction.NORTH);
       
        new Wall(a2q4,2,2,Direction.WEST);
        new Wall(a2q4,3,2,Direction.WEST);
      
        new Wall(a2q4,3,2,Direction.SOUTH);
        new Wall(a2q4,3,3,Direction.SOUTH);
        
        new Wall(a2q4,2,3,Direction.EAST);
        new Wall(a2q4,3,3,Direction.EAST);
        
        
        while(lali.frontIsClear()){
            lali.move();
            lali.turnLeft();
            lali.turnLeft();
            lali.turnLeft();
            lali.move();
            lali.turnLeft();
            lali.move();
            lali.turnLeft();
            
            lali.move();
            lali.turnLeft();
            lali.turnLeft();
            lali.turnLeft();
            lali.move();
            lali.move();
            lali.turnLeft();
            lali.turnLeft();
            lali.turnLeft();
            lali.move();
                  
            
     
    }
        
}
}
