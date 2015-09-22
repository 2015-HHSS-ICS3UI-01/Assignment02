/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author moore3607
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ctreated a new city called kw
        City kw = new City();
        //created a new Robot called metalguy
        Robot metalguy = new Robot(kw,1,1,Direction.EAST);
        
        new Wall(kw,1,1,Direction.SOUTH);
        new Wall(kw,1,1,Direction.EAST);
        new Wall(kw,1,2,Direction.SOUTH);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,1,3,Direction.SOUTH);
        new Wall(kw,1,4,Direction.EAST);
        new Wall(kw,1,4,Direction.SOUTH);
        new Wall(kw,1,5,Direction.SOUTH);
        new Wall(kw,1,6,Direction.SOUTH);
        new Wall(kw,1,7,Direction.SOUTH);
        new Wall(kw,1,7,Direction.EAST);
        new Wall(kw,1,8,Direction.SOUTH);
        new Wall(kw,1,9,Direction.SOUTH);
        
        new Thing(kw,1,9);
        //will execute following commands if metalguy is blocked
        while(!metalguy.frontIsClear()){
            metalguy.turnLeft();
                metalguy.move();
                metalguy.turnLeft();
                metalguy.turnLeft();
                metalguy.turnLeft();
                metalguy.move();
                metalguy.turnLeft();
                metalguy.turnLeft();
                metalguy.turnLeft();
                metalguy.move();
                metalguy.turnLeft();
            //will execute following commands if metalguy isn't blocked
            while(metalguy.frontIsClear()){
                metalguy.move();
             //will execute command if metalguy is standing on a thing   
            if(metalguy.canPickThing()){
                
            
                metalguy.pickThing();
                //breaks the program out of the "while loop"
                break;}
            }
        }
        
        
                
        
        
        
        
    }
}
