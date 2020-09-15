import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Classroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     *
     */
    public List<Student> students = new ArrayList<Student>();
    
    public Classroom()
    {
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130);
        TogglePeriodBtn toggleperiodbtn = new TogglePeriodBtn();
        addObject(toggleperiodbtn, 5,5);
        prepare();
        setPeriod(toggleperiodbtn.getCurrentPeriod());
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

     private void prepare()
    {
//added 3rd parameter for each student - period number
// adding joshua as student
        JoshuaChon joshuachon = new JoshuaChon("Joshua", "Chon", 1, 3, 3);
        addObject(joshuachon, 1, 3);
        joshuachon.sitDown();
// adding sharvin as student
        SharvinM SharvinManjrekar = new SharvinM("Sharvin", "Manjrekar", 2, 3, 3);
        addObject(SharvinManjrekar, 2, 3);
        SharvinManjrekar.sitDown();
// adding anirudh as student
        AnirudhNagasamudra anirudhnagasamudra = new AnirudhNagasamudra("Anirudh", "Nagasamudra", 2, 2, 3);
        addObject(anirudhnagasamudra, 2, 2);
        anirudhnagasamudra.sitDown();
// adding sai as student        
        SaiBalakumar saibalakumar = new SaiBalakumar("Sai", "Balakumar", 1, 2, 2);
        addObject(saibalakumar, 1, 2);
        saibalakumar.sitDown();
// adding tanish as student       
        TanishB tanishbaranwal = new TanishB("Tanish", "Baranwal", 1, 1, 2);
        addObject(tanishbaranwal, 1, 1);
        tanishbaranwal.sitDown();  
// adding joey as student        
        JoeyHuang joeyhuang = new JoeyHuang("Joey", "Huang", 2, 1, 2);
        addObject(joeyhuang, 2, 1);
        joeyhuang.sitDown(); 
// making a list of all the students        
        students = getObjects(Student.class);    
 }    
    public void setPeriod(int currentPeriod){
       // iterating through the students in the list
        for (Student student : students) {
            if (student.Getperiod() == currentPeriod) {
	// adding students in the current period
                addObject(student, student.myRow, student.mySeat);
            } else {
// removes student if they are not in the period that is toggled
                removeObject(student);
            }
        }
    }
}
