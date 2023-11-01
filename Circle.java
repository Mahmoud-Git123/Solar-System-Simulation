public class Circle {

    private double circleDistance;
    private double circleDiameter;
    private double circleAngle;
    private double circleCentreAngle;
    private double circleCentreRotation;
    private String circleColor;
    private SolarSystem solar;

    private double circleSpeed;

    public Circle(SolarSystem solar, double circleDistance, double circleDiameter, double circleAngle, double circleCentreAngle, double circleCentreRotation, String circleColor){
        this.solar = solar;
        this.circleDistance = circleDistance;
        this.circleDiameter = circleDiameter;
        this.circleAngle = circleAngle;
        this.circleCentreAngle = circleCentreAngle;
        this.circleCentreRotation = circleCentreRotation;
        this.circleColor = circleColor;

    }

    public double getCircleDistance(){
        return circleDistance;
    }
    public double getCircleCiameter(){
        return circleDiameter;
    }
    public double getCircleAngle(){
        return circleAngle;
    }
    public double getCircle(){
        return circleDistance;
    }

    public void drawCircle(){
        solar.drawSolarObjectAbout(circleDistance, circleAngle, circleDiameter, circleColor, circleCentreAngle, circleAngle);
    }

    public void moveCircle(){
        circleAngle++;
    }

}
