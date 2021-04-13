import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    int speed = 5;
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAround();
        gameOver();
    }    
    
    private void gameOver(){
        if(isTouching(Elephant.class)){
            Greenfoot.stop();
        }
    }
    
    private void moveAround(){
        move(speed);
        if(Greenfoot.getRandomNumber(100) < 10){
            turn(Greenfoot.getRandomNumber(100) - 45);
        }
        if(getX() <= 10 || getX() > getWorld().getWidth()-10){
            turn(180);
        }
        if(getY() <= 10 || getY() > getWorld().getHeight()-10){
            turn(180);
        }
}
}
