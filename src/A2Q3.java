/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author moore3607
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        Robot metalguy = new Robot(kw,-1,-3,Direction.SOUTH);
        
        //will execute the following commands if
        //metalguy is on the given location and 
        //facing the right directions
            while(metalguy.getAvenue()>=1){
                
                if(metalguy.getDirection() ==Direction.EAST){
                    metalguy.turnLeft();
                    metalguy.turnLeft();
                }
                if(metalguy.getDirection() ==Direction.SOUTH){
                    metalguy.turnLeft();
                    metalguy.turnLeft();
                    metalguy.turnLeft();}
                
                if(metalguy.getDirection() ==Direction.NORTH){
                    metalguy.turnLeft();}
                    
                metalguy.move();
                
                
                if(metalguy.getAvenue()==0){
                    
                    //breaks the program out of the "while loop"
                    break;
                }
            }  
            
            //will execute the following commands if
        //metalguy is on the given location and 
        //facing the right directions
            while(metalguy.getStreet()>=1){
            
                if(metalguy.getDirection() ==Direction.EAST){
                    metalguy.turnLeft();
                }
                if(metalguy.getDirection() ==Direction.WEST){
                    metalguy.turnLeft();
                    metalguy.turnLeft();
                    metalguy.turnLeft();}
                if(metalguy.getDirection() ==Direction.SOUTH){
                    metalguy.turnLeft();
                    metalguy.turnLeft();}
                metalguy.move();
                    
            
            if(metalguy.getStreet()==0){
                //breaks the program out of the "while loop"
                break;
            }
        }
            //will execute the following commands if
        //metalguy is on the given location and 
        //facing the right directions
            while(metalguy.getAvenue()<0){
                if(metalguy.getDirection() ==Direction.WEST){
                    metalguy.turnLeft();
                    metalguy.turnLeft();
                }
                if(metalguy.getDirection() ==Direction.NORTH){
                    metalguy.turnLeft();
                    metalguy.turnLeft();
                    metalguy.turnLeft();}
                
                if(metalguy.getDirection() ==Direction.SOUTH){
                    metalguy.turnLeft();}
                    
                metalguy.move();
                if(metalguy.getAvenue()==0){
                    break;
                }
                
            }
            //will execute the following commands if
        //metalguy is on the given location and 
        //facing the right directions
            while(metalguy.getStreet()<0){
            
                if(metalguy.getDirection() ==Direction.WEST){
                    metalguy.turnLeft();
                }
                if(metalguy.getDirection() ==Direction.EAST){
                    metalguy.turnLeft();
                    metalguy.turnLeft();
                    metalguy.turnLeft();}
                if(metalguy.getDirection() ==Direction.NORTH){
                    metalguy.turnLeft();
                    metalguy.turnLeft();}
                metalguy.move();
                if(metalguy.getStreet()==0){
                break;
            }
            }
            
        
        
        
        
        
    }
}
