package roman.romanov.IX.circle;

public class Circle {
    private String circleName;
    private double radius;
    private double circlePerymetr;
    private double circleArea;

    public String getCircleName() {
        return circleName;
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCirclePerymetr() {
        circlePerymetr = 2 * Math.PI * radius;
        return circlePerymetr;
    }

    public double getCircleArea() {
        circleArea = Math.PI * (radius * radius);
        return circleArea;
    }
}
