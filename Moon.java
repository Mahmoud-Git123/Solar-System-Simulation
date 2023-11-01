public class Moon extends Circle{

    private double moonCentreAngle = getCircleCenterAngle();
    private double moonAngle = getCircleAngle();

    public Moon(SolarSystem solar, double circleDiameter, double circleAngle, double circleCentreRotation,  double circleCentreAngle, double circleDistance, String circleColor){
        super(solar, circleDistance, circleDiameter, circleAngle, circleCentreAngle, circleCentreRotation, circleColor);
        //this.moonCentreAngle = moonCentreAngle;
    }
    //Animating moon movement

    // public void moveMoon2(){
    //     Moon.moveCircle();
    // }
    
    // public void moveMoon(){
    //     //moonAngle = moonAngle + moonSpeed;
    //     moonCentreAngle++;
    //     setCentreAngle(moonCentreAngle);
    // }

    //finished drawing method
    // public void finishedDrawing(){
    //     solar.finishedDrawing();
    // }



}