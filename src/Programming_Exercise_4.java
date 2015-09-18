
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
public class Programming_Exercise_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City camelot = new City ();
        Robot knight = new Robot (camelot,0,0,Direction.EAST);
        
        new Wall (camelot,1,1,Direction.NORTH);
        new Wall (camelot,1,1,Direction.EAST);
        new Wall (camelot,1,1,Direction.SOUTH);
        new Wall (camelot,1,1,Direction.WEST);
        
        new Wall (camelot,1,4,Direction.NORTH);
        new Wall (camelot,1,4,Direction.SOUTH);
        new Wall (camelot,1,4,Direction.EAST);
        new Wall (camelot,1,4,Direction.WEST);
        
        new Wall (camelot,4,1,Direction.NORTH);
        new Wall (camelot,4,1,Direction.EAST);
        new Wall (camelot,4,1,Direction.SOUTH);
        new Wall (camelot,4,1,Direction.WEST);
        
        new Wall (camelot,4,4,Direction.NORTH);
        new Wall (camelot,4,4,Direction.EAST);
        new Wall (camelot,4,4,Direction.WEST);
        new Wall (camelot,4,4,Direction.SOUTH);
        
        new Wall (camelot,2,2,Direction.NORTH);
        new Wall (camelot,2,2,Direction.WEST);
        new Wall (camelot,3,2,Direction.WEST);
        new Wall (camelot,2,3,Direction.NORTH);
        new Wall (camelot,2,3,Direction.EAST);
        new Wall (camelot,3,3,Direction.EAST);
        new Wall (camelot,3,3,Direction.SOUTH);
        new Wall (camelot,3,2,Direction.SOUTH);
        

        
        while(true){
        
        knight.move();
        knight.move();
//turn right
        knight.turnLeft();
        knight.turnLeft();
        knight.turnLeft();
        
        while (knight.frontIsClear()){
            knight.move();
        }knight.turnLeft();
        
        while (knight.frontIsClear()){
            knight.move();
        }knight.turnLeft();
        knight.move();
        knight.turnLeft();
        knight.turnLeft();
        knight.turnLeft();
        knight.move();
        knight.move();
        
        knight.turnLeft();
        knight.turnLeft();
        knight.turnLeft();
                
        
        


        
    }
    }
    
    
}
