abstract public class Shape {
    String color;
    Boolean filled;
    public Shape(){};
    public Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public String display(){
        return "This shape has "+getColor()+" and "+ (filled? "filled": "no filled");
    }
}
