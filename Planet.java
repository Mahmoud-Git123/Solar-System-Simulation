public class Planet extends Circle{

    private double planetAngle;

    public Planet(SolarSystem solar, double circleDiameter, double circleDistance, double planetAngle, double circleCentreAngle, double circleCentreRotation, String circleColor){
        super(solar, circleDistance, circleDiameter, planetAngle, circleCentreAngle, circleCentreRotation, circleColor);
        this.planetAngle = planetAngle;
        
    }


}