package build_figure;

// We define a implementation of the interface
public class CircleImplement implements FigureInterface {
    // We need to define the attributes as a public, because we need to shared it with the implementation class
    public int value;

    // We have to override whole method in the interface FigureInterface
    @Override
    public float area() {
        return this.value*3.5f;
    }

    @Override
    public float lxl() {
        return value*value;
    }
}
