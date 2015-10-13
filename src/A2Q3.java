
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City thomas = new City();
        
        Robot tom = new Robot(thomas, 2,2, Direction.SOUTH);
        
       while(tom.getDirection()!= Direction.WEST){
        tom.turnLeft();
    }
       while(tom.getAvenue()!=0){
           tom.move();
       }
       
       tom.turnLeft();
       tom.turnLeft();
       tom.turnLeft();
       
       while(tom.getStreet()!=0){
           tom.move();
           
       }
}
}