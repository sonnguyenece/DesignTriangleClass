import com.sun.org.apache.xerces.internal.impl.xs.XSAttributeGroupDecl;

public class Test {
    public static void main(String[] args) {
//        Shape shape=new Shape("blue",true);
//        System.out.println(shape);
//
//        Triangle triangle=new Triangle();
//        triangle.setColor("red");
//        triangle.setFilled(false);
//        System.out.println(triangle);
        Triangle triangle=new Triangle();
        triangle.setColor("grey");
        triangle.setFilled(true);
        triangle.inputSide();
        System.out.println(triangle);
    }
}
