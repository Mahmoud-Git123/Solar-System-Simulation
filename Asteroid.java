public class Asteroid extends Circle{

    private Asteroid asteroidObj;
    public Asteroid(SolarSystem solar, double circleDiameter, double circleAngle, double circleCentreRotation,  double circleCentreAngle, double circleDistance, String circleColor){
        super(solar, circleDistance, circleDiameter, circleAngle, circleCentreAngle, circleCentreRotation, circleColor);
    }

    public void drawBelt(){
        for (int i = 0; i < 100; i++){
            Asteroid asteroid = new Asteroid(getSolar(), 2, 70 + i*10, 0, 0, 300, "white");
            asteroid.drawCircle();

        }

        for (int i = 0; i < 100; i++){
            Asteroid asteroid = new Asteroid(getSolar(), 2, 70 + i*5, 0, 0, 320, "white");
            asteroid.drawCircle();

        }
    }

    public void moveBelt(){

    }
}
