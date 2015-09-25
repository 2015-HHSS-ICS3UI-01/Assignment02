/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author moore3607
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //made a new grid in which to place things in
        City kw = new City();
        //made a new robot in which to command
        Robot beep = new Robot(kw,0,0,Direction.EAST);
        //made walls
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,1,Direction.SOUTH);
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,1,Direction.EAST);
        new Wall(kw,1,4,Direction.WEST);
        new Wall(kw,1,4,Direction.SOUTH);
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,4,Direction.EAST);
        new Wall(kw,1,4,Direction.WEST);
        new Wall(kw,4,1,Direction.SOUTH);
        new Wall(kw,4,1,Direction.NORTH);
        new Wall(kw,4,1,Direction.EAST);
        new Wall(kw,4,1,Direction.WEST);
        new Wall(kw,4,4,Direction.SOUTH);
        new Wall(kw,4,4,Direction.NORTH);
        new Wall(kw,4,4,Direction.EAST);
        new Wall(kw,4,4,Direction.WEST);
        new Wall(kw,2,2,Direction.NORTH);
        new Wall(kw,2,2,Direction.WEST);
        new Wall(kw,2,3,Direction.NORTH);
        new Wall(kw,2,3,Direction.EAST);
        new Wall(kw,3,2,Direction.SOUTH);
        new Wall(kw,3,2,Direction.WEST);
        new Wall(kw,3,3,Direction.SOUTH);
        new Wall(kw,3,3,Direction.EAST);
        
        //beep will execute the following commands no matter what
        while(true){
           beep.move();
        beep.move();
        beep.turnLeft();
        beep.turnLeft();
        beep.turnLeft();
        beep.move();
        beep.turnLeft();
        beep.move();
        beep.turnLeft();
        beep.move();
        beep.turnLeft();
        beep.turnLeft();
        beep.turnLeft();
        beep.move();
        beep.move();
        beep.turnLeft();
        beep.turnLeft();
        beep.turnLeft();
        }
            
            
        
        
        
        
        
    }
}
