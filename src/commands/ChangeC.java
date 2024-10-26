package commands;

import drawingutils.Coordiantes;
import fractals.ComplexNumber;

public class ChangeC implements ICommand{

    Coordiantes coordiantes;
    public ChangeC(Coordiantes coordiantes){
        this.coordiantes = coordiantes; 
    }
    @Override
    public void execute(String[] args) {
        this.coordiantes.C = new ComplexNumber(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
    }
    
    
}
