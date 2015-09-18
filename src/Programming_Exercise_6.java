
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class Programming_Exercise_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                City kw = new City();
        
        new Wall (kw,0,0,Direction.WEST);
        new Wall (kw,1,0,Direction.WEST);
        new Wall (kw,2,0,Direction.WEST);
        new Wall (kw,3,0,Direction.WEST);
        new Wall (kw,4,0,Direction.WEST);
        new Wall (kw,5,0,Direction.WEST);
        new Wall (kw,6,0,Direction.WEST);
        new Wall (kw,7,0,Direction.WEST);
        new Wall (kw,8,0,Direction.WEST);
        new Wall (kw,9,0,Direction.WEST);
        new Wall (kw,10,0,Direction.WEST);
        
        new Wall (kw,0,1,Direction.EAST);
        new Wall (kw,1,1,Direction.EAST);
        new Wall (kw,2,1,Direction.EAST);
        new Wall (kw,3,1,Direction.EAST);
        new Wall (kw,4,1,Direction.EAST);
        new Wall (kw,5,1,Direction.EAST);
        new Wall (kw,6,1,Direction.EAST);
        new Wall (kw,7,1,Direction.EAST);
        new Wall (kw,8,1,Direction.EAST);
        new Wall (kw,9,1,Direction.EAST);
        new Wall (kw,10,1,Direction.EAST);
        
        new Wall (kw,0,2,Direction.EAST);
        new Wall (kw,1,3,Direction.NORTH);
        new Wall (kw,1,4,Direction.NORTH);
        new Wall (kw,1,5,Direction.NORTH);
        new Wall (kw,1,6,Direction.NORTH);
        new Wall (kw,1,6,Direction.EAST);
        new Wall (kw,2,6,Direction.EAST);
        
        
        
                
    }
    
}
