package fractals;

import java.awt.Color;
import java.awt.Graphics;

import drawingutils.Coordiantes;

public class JuliaFractal extends Fractal {

    private final int iterations;
    private int width;
    private int height;
    private Coordiantes coordiantes;
    public JuliaFractal(int width, int height,int iterations,Coordiantes coordiantes){
        this.iterations = iterations;
        this.width = width;
        this.height = height;
        this.coordiantes = coordiantes;
        
    }


    @Override
    protected boolean validate(ComplexNumber number) {

        for (int i = 0; i < this.iterations; i++){
            number = number.times(number).add(coordiantes.C);
            if (number.abs() > 2.0) return false;
        }

        return true;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(0,0,0));
            for (int x = (-1)*this.coordiantes.STARTX; x < this.width-this.coordiantes.STARTX; x++){
                for (int y = (-1)*this.coordiantes.STARTY; y < this.height - this.coordiantes.STARTY; y++){
                    double a = (double) x/this.coordiantes.SCALE;
                    double b = (double) y/this.coordiantes.SCALE;
                    ComplexNumber z = new ComplexNumber(a,b);
                    int x1 = x+this.coordiantes.STARTX;
                    int y1 = y+this.coordiantes.STARTY;
                    if (validate(z)){ 
                        g.drawLine(x1,y1,x1,y1);
                    }
                }
            }
    }
    
}
