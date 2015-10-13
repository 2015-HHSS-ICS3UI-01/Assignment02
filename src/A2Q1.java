
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agott2059
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City thomas = new City();

        Robot tom = new Robot(thomas, 1, 1, Direction.EAST);

        new Thing(thomas, 1, 2);
        new Thing(thomas, 1, 3);
        new Thing(thomas, 1, 4);
        new Thing(thomas, 1, 5);
        new Thing(thomas, 1, 6);
        new Thing(thomas, 1, 7);
        new Thing(thomas, 1, 8);
        new Thing(thomas, 1, 9);
        new Thing(thomas, 1, 10);
        new Thing(thomas, 1, 11);

        tom.move();
        
        while (true) {
           
      
            if (tom.countThingsInBackpack() <7) {
                tom.pickThing();
                tom.move();
                    
                }else{
                break; 
            }
            
        }
            tom.move();
            tom.move();
            tom.move();
        
    }
        
    }
