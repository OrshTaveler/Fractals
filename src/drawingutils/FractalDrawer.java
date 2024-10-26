package drawingutils;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import fractals.ComplexNumber;
import fractals.Fractal;
import fractals.JuliaFractal;
import fractals.MandelbrotFractal;

public class FractalDrawer extends Canvas {
        

        private int iterations;
        private Coordiantes coordiantes;

        private Fractal fractal;

        public FractalDrawer(int width, int height,Coordiantes coordiantes, int iterations){
            this.iterations = iterations;
            this.coordiantes = coordiantes;
            this.setSize(width, height);
            this.fractal = new MandelbrotFractal(width, height,this.iterations,this.coordiantes);
            
        } 

        public void setFractal(Fractal fractal){
            this.fractal = fractal;
        }

        @Override
        public void paint(Graphics g){
            this.fractal.paint(g);
        }


}
