
import becker.robots.Wall;
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class Programming_Exercise_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot matt = new Robot(kw,1,1,Direction.EAST);
        
        new Wall (kw,1,1,Direction.EAST);
        new Wall (kw,1,2,Direction.EAST);
        new Wall (kw,1,4,Direction.EAST);
        new Wall (kw,1,7,Direction.EAST);
        
        new Thing (kw,1,9);
        
    }
    
}
