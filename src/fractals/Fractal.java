package fractals;
import java.awt.Graphics;

public abstract class Fractal {
    protected abstract boolean validate(ComplexNumber number);
    public abstract void paint(Graphics g);
}
