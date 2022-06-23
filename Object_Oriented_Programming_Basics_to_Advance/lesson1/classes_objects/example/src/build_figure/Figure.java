package build_figure;

public abstract class Figure {
    private int numSides;

    public Figure(){
        numSides=0;
    }
    // This method going to change in the Circle class, so, we defined as an abstract method, perhaps, the class also is
    // An abstract method is a method that going to be override by other class when will use it
    public abstract float area();
}
