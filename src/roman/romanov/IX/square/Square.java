package roman.romanov.IX.square;

public class Square {
    private String nameSquare ;// "SQUARE";
    private double side;
    private  double per;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea (){
        double AreaSquare = side * side;
        return  AreaSquare;
    }

    public double getPer(){
        double PerymSquare = side*4;
        return PerymSquare;
    }
    public void setNameSquare(String square){
        this.nameSquare = square;
    }
    public String getNameSquare(){
        return  nameSquare;
    }

//
}
