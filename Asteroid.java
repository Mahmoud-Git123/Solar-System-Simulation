/**
 * This class extends the circle class to draw asteroids
 * @author Mahmoud Abdelfattah
 */

public class Asteroid extends Circle{

    //base angle which is incremented to move
    private double angle = 70;
    private int i = 0;  //To be used in loops


    /**
	 * Constructor
	 * @param solar instance of the solar system
	 * @param circleDistance distance of the asteroid from the object revolved/moved around 
     * @param circleDiameter the diameter of the asteroid
     * @param circleAngle the angle of the asteroid in respect to the object revolved/moved around
     * @param circleCentreAngle the centre angle for the the asteroid
     * @param circleCentreRotation the centre point of rotation for the asteroid
     * @param circleColor the color of the asteroid 
	 */
    public Asteroid(SolarSystem solar, double circleDiameter, double circleAngle, double circleCentreRotation,  double circleCentreAngle, double circleDistance, String circleColor){
        super(solar, circleDistance, circleDiameter, circleAngle, circleCentreAngle, circleCentreRotation, circleColor);
    }

    /**
	 * drawBelt method
	 * draws an asteroid belt using for loops to create multiple circles
     * uses the angle to increment and allow belt to move
	 */
    //DrawBelt (includes movement) method
    public void drawBelt(){

     
        //creating the belt (first part)
        for (i = 0; i < 100; i++){
            Asteroid asteroid = new Asteroid(getSolar(), 3, angle + i*10, 0, 0, 300, "white");
            asteroid.drawCircle(); 
            //allows belt to move   
            angle ++; 
        }

        //second part
        for (i = 0; i < 100; i++){
            Asteroid asteroid = new Asteroid(getSolar(), 2, angle + i*5, 0, 0, 310, "white");
            asteroid.drawCircle(); 
            //allows belt to move   
            angle ++; 
        }

    }
}


