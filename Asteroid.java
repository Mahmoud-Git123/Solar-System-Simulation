public class Asteroid extends Circle{

    private double angle = 70;
    public Asteroid(SolarSystem solar, double circleDiameter, double circleAngle, double circleCentreRotation,  double circleCentreAngle, double circleDistance, String circleColor){
        super(solar, circleDistance, circleDiameter, circleAngle, circleCentreAngle, circleCentreRotation, circleColor);
    }

    public void drawBelt(){
        int i = 0; 
     
        //creating the belt
        for (i = 0; i < 100; i++){
            Asteroid asteroid = new Asteroid(getSolar(), 3, angle + i*10, 0, 0, 300, "white");
            asteroid.drawCircle(); 
            //allows belt to move   
            angle ++; 
        }

        for (i = 0; i < 100; i++){
            Asteroid asteroid = new Asteroid(getSolar(), 2, angle + i*5, 0, 0, 310, "white");
            asteroid.drawCircle(); 
            //allows belt to move   
            angle ++; 
        }

    }
}


