
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class a2q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new City for robot 
        City a2q5 = new City();
        //make robots for city 
        
        
        //make walls left side of road 
        new Wall(a2q5,1,0,Direction.WEST);
        new Wall(a2q5,2,0,Direction.WEST);
        new Wall(a2q5,3,0,Direction.WEST);
        new Wall(a2q5,4,0,Direction.WEST);
        new Wall(a2q5,5,0,Direction.WEST);
        new Wall(a2q5,6,0,Direction.WEST);
        new Wall(a2q5,7,0,Direction.WEST);
        new Wall(a2q5,8,0,Direction.WEST);
        new Wall(a2q5,9,0,Direction.WEST);
        new Wall(a2q5,0,0,Direction.WEST);
        
        
       //make walls right side of road 
        new Wall(a2q5,0,1,Direction.EAST);
        new Wall(a2q5,1,1,Direction.EAST);
        new Wall(a2q5,2,1,Direction.EAST);
        new Wall(a2q5,3,1,Direction.EAST);
        new Wall(a2q5,4,1,Direction.EAST);
        new Wall(a2q5,5,1,Direction.EAST);
        new Wall(a2q5,6,1,Direction.EAST);
        new Wall(a2q5,7,1,Direction.EAST);
        new Wall(a2q5,8,1,Direction.EAST);
        new Wall(a2q5,9,1,Direction.EAST);
        
        new Wall(a2q5,0,2,Direction.EAST);
        
       new Wall(a2q5,1,3,Direction.NORTH);
       new Wall(a2q5,1,4,Direction.NORTH);
       new Wall(a2q5,1,5,Direction.NORTH);
       new Wall(a2q5,1,6,Direction.NORTH);
       
       new Wall(a2q5,1,6,Direction.EAST);
       new Wall(a2q5,2,6,Direction.EAST);
       
      new Wall(a2q5,2,3,Direction.SOUTH);
      new Wall(a2q5,2,4,Direction.SOUTH);
      new Wall(a2q5,2,5,Direction.SOUTH);
      new Wall(a2q5,2,6,Direction.SOUTH);
      
      new Wall(a2q5,3,2,Direction.EAST);
      
      
      new Wall(a2q5,4,3,Direction.NORTH);
      new Wall(a2q5,4,4,Direction.NORTH);
      new Wall(a2q5,4,5,Direction.NORTH);
      
     
      new Wall(a2q5,4,3,Direction.SOUTH);
      new Wall(a2q5,4,4,Direction.SOUTH);
      new Wall(a2q5,4,5,Direction.SOUTH);
      
    }
}
