public class Driver{
    public static void main(String args[]){

        //SOLAR SYSTEM
        SolarSystem solar = new SolarSystem(1000, 1000);

        //SUN
        Sun sunObj = new Sun(solar, 120, 0,0, 0, 0, "yellow");

        //EARTH
        Planet earthObj = new Planet(solar, 30, 210, 80, 0, 0, "blue");
        Moon earthMoonObj = new Moon(solar, 10, earthObj.getCircleAngle() + 50, earthObj.getCircleDistance(), earthObj.getCircleAngle(), 25 , "grey");

        //MARS
        Planet marsObj = new Planet(solar, 25, 270, 35, 0, 0, "red");
        Moon marsMoonObj1 = new Moon(solar, 8, marsObj.getCircleAngle() + 50, marsObj.getCircleDistance(), marsObj.getCircleAngle(), 25 , "grey");
        Moon marsMoonObj2 = new Moon(solar, 5, marsObj.getCircleAngle() + 10, marsObj.getCircleDistance(), marsObj.getCircleAngle(), 23 , "grey");

        //VENUS
        Planet venusObj = new Planet(solar, 20, 140, 25, 0, 0, "orange");
        
        //MERCURY
        Planet mercuryObj = new Planet(solar, 16, 100, 200, 0, 0, "orange");

        //JUPITER
        Planet jupiterObj = new Planet(solar, 70, 365, 120, 0, 0, "red");
        Moon jupiterMoonObj1 = new Moon(solar, 8, jupiterObj.getCircleAngle() + 0, jupiterObj.getCircleDistance(), jupiterObj.getCircleAngle(), 50 , "grey");
        Moon jupiterMoonObj2 = new Moon(solar, 12, jupiterObj.getCircleAngle() + 120, jupiterObj.getCircleDistance(), jupiterObj.getCircleAngle(), 50 , "grey");
        Moon jupiterMoonObj3 = new Moon(solar, 10, jupiterObj.getCircleAngle() + 210, jupiterObj.getCircleDistance(), jupiterObj.getCircleAngle(),50 , "grey");
        Moon jupiterMoonObj4 = new Moon(solar, 5, jupiterObj.getCircleAngle() + 180, jupiterObj.getCircleDistance(), jupiterObj.getCircleAngle(), 50 , "grey");

        //SATURN (WITH RINGS)
        Planet saturnObj = new Planet(solar, 45, 370, 220, 0, 0, "yellow");
        Planet saturnRingShade = new Planet(solar, 80, 370, 220, 0, 0, "black");
        Planet saturnRingObj = new Planet(solar, 110, 370, 220, 0, 0, "grey");

        //URANUS
        Planet uranusObj = new Planet(solar, 35, 380, 160, 0, 0, "grey");
        Moon uranusMoon1 = new Moon(solar, 8, uranusObj.getCircleAngle() + 0, uranusObj.getCircleDistance(), uranusObj.getCircleAngle(), 28 , "grey");
        Moon uranusMoon2 = new Moon(solar, 12, uranusObj.getCircleAngle() + 120, uranusObj.getCircleDistance(), uranusObj.getCircleAngle(), 28 , "grey");
        Moon uranusMoon3 = new Moon(solar, 10, uranusObj.getCircleAngle() + 210, uranusObj.getCircleDistance(), uranusObj.getCircleAngle(),28 , "grey");
        Moon uranusMoon4 = new Moon(solar, 5, uranusObj.getCircleAngle() + 180, uranusObj.getCircleDistance(), uranusObj.getCircleAngle(), 28 , "grey");
        Moon uranusMoon5 = new Moon(solar, 5, uranusObj.getCircleAngle() + 200, uranusObj.getCircleDistance(), uranusObj.getCircleAngle(), 28 , "grey");

        //NEPTUNE
        Planet neptuneObj = new Planet(solar, 25, 470, 200, 0, 0, "blue");
        Moon neptuneMoonObj = new Moon(solar, 8, neptuneObj.getCircleAngle() + 0, neptuneObj.getCircleDistance(), neptuneObj.getCircleAngle(), 20 , "grey");


        Asteroid ast = new Asteroid(solar, 0, 0, 0, 0, 0, "white");



        while(true){

            //Drawing the asteroid belt
            ast.drawBelt();

            //Drawing the sun
            sunObj.drawCircle();

            //Drawing earth
            earthObj.drawCircle();
            earthObj.moveCircle1(1);

            //Drawing earth's moon
            earthMoonObj.drawCircle();
            earthMoonObj.moveCircle2(6);

            //Drawing mercury
            mercuryObj.drawCircle();
            mercuryObj.moveCircle1(3);

            //Drawing mars
            marsObj.drawCircle();
            marsObj.moveCircle1(1);

            //Drawing mars' moon
            marsMoonObj1.drawCircle();
            marsMoonObj1.moveCircle2(3);
            marsMoonObj2.drawCircle();
            marsMoonObj2.moveCircle2(3.5);

            //Drawing venus (no moons)
            venusObj.drawCircle();
            venusObj.moveCircle1(1.5);

            //Drawing Jupiter
            jupiterObj.drawCircle();
            jupiterObj.moveCircle1(1);

            //Drawing 4 main moons of jupiter
            jupiterMoonObj1.drawCircle();
            jupiterMoonObj2.drawCircle();
            jupiterMoonObj3.drawCircle();
            jupiterMoonObj4.drawCircle();
            jupiterMoonObj1.moveCircle2(3);
            jupiterMoonObj2.moveCircle2(3);
            jupiterMoonObj3.moveCircle2(3);
            jupiterMoonObj4.moveCircle2(3);


            //Drawing Saturn Rings
            saturnRingObj.drawCircle();
            saturnRingObj.moveCircle1(1);

            
            saturnRingShade.drawCircle();
            saturnRingShade.moveCircle1(1);

            //Drawing Saturn
            saturnObj.drawCircle();
            saturnObj.moveCircle1(1);

            //Drawing Uranus
            uranusObj.drawCircle();
            uranusObj.moveCircle1(1);

            //Drawing Uranus' Moons
            uranusMoon1.drawCircle();
            uranusMoon2.drawCircle();
            uranusMoon3.drawCircle();
            uranusMoon4.drawCircle();
            uranusMoon5.drawCircle();
            uranusMoon1.moveCircle2(3);
            uranusMoon2.moveCircle2(3);
            uranusMoon3.moveCircle2(3);
            uranusMoon4.moveCircle2(3);
            uranusMoon5.moveCircle2(3);

            //Drawing Neptune
            neptuneObj.drawCircle();
            neptuneObj.moveCircle1(1);

            //Drawing Neptune's moons
            neptuneMoonObj.drawCircle();
            neptuneMoonObj.moveCircle2(3);

            //Finished drawing
            solar.finishedDrawing();
    

        }
    }
}