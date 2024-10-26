package commands;

import drawingutils.Coordiantes;

public class Move implements ICommand{

    Coordiantes coordiantes;
    public Move(Coordiantes coordiantes){
        this.coordiantes = coordiantes; 
    }

    @Override
    public void execute(String[] args) {
        try{
         int x = Integer.parseInt(args[1]);
         int y = Integer.parseInt(args[2]);
         coordiantes.STARTX += x;
         coordiantes.STARTY += y;
        }
        catch (Exception e){
            System.out.println("Argument must be in x y format!");
        }
    }
}
