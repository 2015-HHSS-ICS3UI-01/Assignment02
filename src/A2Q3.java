
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       City kw = new City();
       
       Robot commando = new Robot(kw, 4, 2, Direction.EAST);
       
       while(commando.getDirection() !=Direction.NORTH){
           commando.turnLeft();
       
    }
    while(commando.getStreet() !=0) {
        commando.move();
        
    }
    
    if(commando.getAvenue() >0){
        commando.turnLeft();
        
    }
    
    while(commando.getAvenue() !=0){
        
       commando.move();
    }
    
    }
}
