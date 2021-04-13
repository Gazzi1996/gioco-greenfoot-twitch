import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    private int direction = 10;
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
        {
        moveActor();
        eat();
    }    
    
    private void moveActor(){
        if(Greenfoot.isKeyDown("right")){
           setLocation(getX() + direction,getY());
        }
        if(Greenfoot.isKeyDown("left")){
           setLocation(getX() - direction,getY());
        }
         if(Greenfoot.isKeyDown("up")){
           setLocation(getX(),getY() - direction);
        }
         if(Greenfoot.isKeyDown("down")){
           setLocation(getX(),getY() + direction);
        }
    }
       
    public void eat(){
        Actor apple;
        apple = getOneObjectAtOffset(0,0,Apple.class);         
        if(apple != null){
        World world = getWorld();
        world.removeObject(apple);
        MyWorld w = (MyWorld) getWorld();
        Counter counter = w.getCounter();
        counter.appleCount(1);
        world.addObject(new Apple(),Greenfoot.getRandomNumber(1100),Greenfoot.getRandomNumber(710));

        }
    }
    
}
