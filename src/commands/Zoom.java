package commands;

import drawingutils.Coordiantes;

public class Zoom implements ICommand {

   Coordiantes coordiantes;
    public Zoom(Coordiantes coordiantes){
        this.coordiantes = coordiantes; 
    }

    @Override
    public void execute(String[] args) {
        try{
         int zoom = Integer.parseInt(args[1]);
         coordiantes.SCALE += zoom;
        }
        catch (Exception e){
            System.out.println("Argument must be in zoom format!");
        }
    }
    
}
