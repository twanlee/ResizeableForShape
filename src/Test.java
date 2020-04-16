public class Test {
    public static void main(String[] args) {
        Circle c = new Circle("Black", true, 5);
        System.out.println(c.display());
        c.resize(3);
        System.out.println("After resized: "+ c.display());
        System.out.println("=========");
        Rectangle r = new Rectangle("Black",true,5,8);
        System.out.println(r.display());
        r.resize(4);
        System.out.println("After resized: " + r.display());
        System.out.println("=========");
        Square s = new Square(5);
        System.out.println(s.display());
        s.resize(3);
        System.out.println("After resize: " + s.display());
    }
}
