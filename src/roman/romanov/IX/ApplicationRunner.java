package roman.romanov.IX;

import roman.romanov.IX.circle.Circle;
import roman.romanov.IX.square.Square;
import roman.romanov.IX.triangle.Triangle;

public class ApplicationRunner {
    public static void main(String[] args) {

/////////////////////////////////////////////////////////
        Square square = new Square();
        square.setNameSquare("SQUARE ");
        square.setSide(12.5);
        System.out.println(square.getNameSquare() +
                " \t  Side = " + square.getSide() +
                ",  Perymetr " + square.getPer() +
                ",  Area = " + square.getArea());
/////////////////////////////////////////////////////////
        Circle circle = new Circle();
        circle.setCircleName("CIRCLE ");
        circle.setRadius(9.3);
        System.out.println(circle.getCircleName() +
                " \t  Radius = " + circle.getRadius() +
                ",  Perymetr = " + circle.getCirclePerymetr() +
                ",  Area = " + circle.getCircleArea());
/////////////////////////////////////////////////////////
        Triangle triangle = new Triangle();
        triangle.setTriangleName("TRIANGLE ");
        triangle.setTriangleSideOne(10.0);
        triangle.setTriangleSideTwo(10.0);
        triangle.setTriangleSideThree(10.0);
        System.out.println(triangle.getTriangleName() +
                " \t  Side one:  " + triangle.getTriangleSideOne() +
                ",  Side two:  " + triangle.getTriangleSideTwo() +
                ",  Side three:  " + triangle.getTriangleSideThree());
        System.out.println("\t\t\t  Perymetr:  " + triangle.getTrianglePer());
        System.out.println("\t\t\t  Semi per:  " + triangle.getSemiPer());
        System.out.println("\t\t\t  Area triangle:   " + triangle.getTriangleArea());
        System.out.println("\t\t\t  Side height:  " + triangle.getTriangleHeight());
////////////////////////////////////////////////////////


    }
}
