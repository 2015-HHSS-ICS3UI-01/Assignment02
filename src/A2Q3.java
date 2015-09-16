
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();
        
        //make robot
        Robot karel = new Robot(kw, 5,3, Direction.NORTH);
        
        while (true)
            if (karel.getStreet() > 0) {
            karel.move();
        } else if (karel.getStreet() == 0) {
            break;
        } 
        
        karel.turnLeft();
                
        while (true)
            if (karel.getAvenue() > 0) {
                karel.move();
            } else if (karel.getAvenue() == 0) {
                break;
            }
    }
    
}
