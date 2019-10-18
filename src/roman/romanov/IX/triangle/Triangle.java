package roman.romanov.IX.triangle;

public class Triangle {
    private String triangleName;
    private double triangleSideOne;
    private double triangleSideTwo;
    private double triangleSideThree;
    private double trianglePer;
    private double semiPer;
    private double triangleArea;
    private double triangleHeight;

    public String getTriangleName() {
        return triangleName;
    }

    public void setTriangleName(String triangleName) {
        this.triangleName = triangleName;
    }

    public double getTriangleSideOne() {
        return triangleSideOne;
    }

    public void setTriangleSideOne(double triangleSideOne) {
        this.triangleSideOne = triangleSideOne;
    }

    public double getTriangleSideTwo() {
        return triangleSideTwo;
    }

    public void setTriangleSideTwo(double triangleSideTwo) {
        this.triangleSideTwo = triangleSideTwo;
    }

    public double getTriangleSideThree() {
        return triangleSideThree;
    }

    public void setTriangleSideThree(double triangleSideThree) {
        this.triangleSideThree = triangleSideThree;
    }

    public double getTrianglePer() {
        trianglePer = triangleSideOne + triangleSideTwo + triangleSideThree;
        return trianglePer;
    }

    public void setTrianglePer(double trianglePer) {
        this.trianglePer = trianglePer;
    }

    public double getSemiPer() {
        semiPer = trianglePer / 2;
        return semiPer;
    }

    public void setSemiPer(double semiPer) {
        this.semiPer = semiPer;
    }

    public double getTriangleArea() {
        triangleArea = Math.sqrt(semiPer * (semiPer - triangleSideOne) *
                (semiPer - triangleSideOne) * (semiPer - triangleSideThree));
        return triangleArea;
    }

    public void setTriangleArea(double triangleArea) {
        this.triangleArea = triangleArea;
    }

    public double getTriangleHeight() {
        triangleHeight = (triangleArea * 2) / triangleSideOne;
        return triangleHeight;
    }

    public void setTriangleHeight(double triangleHeght) {
        this.triangleHeight = triangleHeght;
    }

}
