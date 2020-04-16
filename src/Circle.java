public class Circle extends Shape implements Resizeable {
    private int radius;
    public Circle(){};
    public Circle(String color, Boolean filled, int radius){
        super(color, filled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        radius += radius*percent;
    }
    @Override
    public String display(){
        return super.display()+ ". The circle has radius up to: " + getRadius();
    }
}
