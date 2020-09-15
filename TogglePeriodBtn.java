import greenfoot.*;
/**
 * Write a description of class TogglePeriodBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    /**
     * Constructor for objects of class TogglePeriodBtn.
     * 
     */
public class TogglePeriodBtn extends Actor
{
    private int currentPeriod;
    
    public TogglePeriodBtn(){ 
        currentPeriod = 2; 	// default period is 2 	
        setImage("Wall.jpg");	// button’s image
    }
// getting the period     
        public int getCurrentPeriod() {
    	return currentPeriod;
    }
    
//When the button is clicked with the mouse the period is changed from 2 to 3. If the period is 3 change back to period 2.
    public void act()
    {
        if (Greenfoot.mousePressed(this)){ /* when the button is pressed changes the period from one to another */
// switches from second period to third period
        if (currentPeriod == 2){
            currentPeriod = 3;
        }     
// switches from third period to second period    
        else{
            currentPeriod = 2; 
        }
        ((Classroom) getWorld()).setPeriod(currentPeriod); //added button to the world 	
        }
    }
}
