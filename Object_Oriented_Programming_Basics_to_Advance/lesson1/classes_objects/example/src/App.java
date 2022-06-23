import build_figure.Circle;
import build_figure.CircleImplement;

public class App {
    public static void main(String[] args) throws Exception {
        Product prod = new Product(1, "Potato");
        // Create the instance of Circle class
        Circle circle = new Circle();
        // Add value to the radio
        circle.radio = 4;
        // Call the method area to calculate the radio with the new value
        CircleImplement circleImplement = new CircleImplement();
        circleImplement.value=4;
        System.out.println(circle.area());
        System.out.println(circleImplement.area());
        System.out.println(circleImplement.lxl());
        System.out.println(prod);
    }
}
