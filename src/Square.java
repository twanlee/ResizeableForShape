public class Square extends Rectangle implements Resizeable {
    private int size;
    public Square(){};
    public Square(int size){
        super(size,size);
    }
    public Square(String color, Boolean filled, int size){
        super(color,filled,size,size);
    }

    public int getSize() {
        return super.getSide1();
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void resize(double percent){
        super.resize(percent);
    }
    @Override
    public String display(){
        return "This square has 4 size: " + super.getSide1();
    }
}
