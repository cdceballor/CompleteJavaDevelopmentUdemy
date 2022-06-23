package build_figure;

// Create the extends to use the Figure class
public class Circle extends Figure{

    public float radio;
    // Override the abstract method by Figure
    @Override
    public float area() {
        return 3.1245f*this.radio;
    }
}
