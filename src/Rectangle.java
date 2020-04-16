public class Rectangle extends Shape implements Resizeable {
    int side1, side2;
    public Rectangle(){};
    public Rectangle( int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    public Rectangle(String color, Boolean filled, int side1, int side2){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public void resize(double percent) {
        side1 += side1*percent;
        side2 += side2*percent;
    }
    @Override
    public String display(){
        return super.display() + ". The rectangle has side 1: " + getSide1() + " and side 2: " + getSide2();
    }
}
