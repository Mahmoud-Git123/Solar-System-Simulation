public class Asteroid extends Circle{

    //base angle which is incremented to move
    private double angle = 70;
    private int i = 0;  //To be used in loops


    //constructor
    public Asteroid(SolarSystem solar, double circleDiameter, double circleAngle, double circleCentreRotation,  double circleCentreAngle, double circleDistance, String circleColor){
        super(solar, circleDistance, circleDiameter, circleAngle, circleCentreAngle, circleCentreRotation, circleColor);
    }

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


