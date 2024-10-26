package commands;

import drawingutils.Coordiantes;
import drawingutils.FractalDrawer;
import fractals.Fractal;

public class ChangeFractal implements ICommand{

    FractalDrawer fractalDrawer;
    Fractal fractal;
    Coordiantes coordiantes;
    public ChangeFractal(FractalDrawer fractalDrawer, Fractal fractal,Coordiantes coordiantes){
            this.fractalDrawer = fractalDrawer;
            this.fractal = fractal; 
            this.coordiantes = coordiantes;
    }

    @Override
    public void execute(String[] args) {
        this.fractalDrawer.setFractal(this.fractal);
        this.coordiantes.setDefults();
    }
    
}
