import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
;
    private Counter theCounter;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 720, 1); 
        getSpriteInWorld();
    }
    
    private void getSpriteInWorld(){
        addObject(new Elephant(),60,360);
        addObject(new Apple(), 1200-60,360);
        addObject(new Mouse(),Greenfoot.getRandomNumber(1100),Greenfoot.getRandomNumber(710));
        addObject(new Mouse(),Greenfoot.getRandomNumber(1100),Greenfoot.getRandomNumber(710));        addObject(new Mouse(),Greenfoot.getRandomNumber(1100),Greenfoot.getRandomNumber(710));
        addObject(new Mouse(),Greenfoot.getRandomNumber(1100),Greenfoot.getRandomNumber(710));
addObject(new Mouse(),Greenfoot.getRandomNumber(1100),Greenfoot.getRandomNumber(710));
        theCounter = new Counter();
        theCounter.appleCount(0);
        addObject(theCounter,50,50);
    }
   
    public Counter getCounter()
    {
        return theCounter;
    }
    
    
}
