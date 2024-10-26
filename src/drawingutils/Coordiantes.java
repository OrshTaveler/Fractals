package drawingutils;
import java.awt.Graphics;

import fractals.ComplexNumber;

public class Coordiantes {
    public int STARTX;
    public int STARTY;
    public int SCALE;
    public ComplexNumber C;


    public final int DEF_STARTX;
    public final int DEF_STARTY;
    public final int DEF_SCALE;
    public final ComplexNumber DEF_C;
    
    public Coordiantes(int startx, int starty, int scale, ComplexNumber C){
            this.STARTX = startx;
            this.STARTY = starty;
            this.SCALE = scale;
            this.C = C;

            this.DEF_STARTX = startx;
            this.DEF_STARTY = starty;
            this.DEF_SCALE = scale;
            this.DEF_C = C;
    }

    public void setDefults(){
            this.STARTX = this.DEF_STARTX;
            this.STARTY = this.DEF_STARTY;
            this.SCALE = this.DEF_SCALE;
            this.C = this.DEF_C;
    }

}
