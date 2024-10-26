import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;

import commands.ChangeC;
import commands.ChangeFractal;
import commands.ICommand;
import commands.Move;
import commands.Zoom;
import drawingutils.*;
import fractals.ComplexNumber;
import fractals.Fractal;
import fractals.JuliaFractal;
import fractals.MandelbrotFractal;
public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FRACTAL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        int width = 500;
        int height = 500;
        int scale = 300;
        Coordiantes coordiantes = new Coordiantes(width/2, height/2,scale,new ComplexNumber(0.377, -0.248));
        FractalDrawer canvas = new FractalDrawer(width,height,coordiantes,100);

        Fractal mandelbrot = new MandelbrotFractal(width, height, scale, coordiantes);
        Fractal julia = new JuliaFractal(width, height, scale, coordiantes);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

        HashMap<String, ICommand> commands = new HashMap<>();
        commands.put("move", new Move(coordiantes));
        commands.put("zoom", new Zoom(coordiantes));
        commands.put("Mandelbrot", new ChangeFractal(canvas,mandelbrot,coordiantes));
        commands.put("Julia", new ChangeFractal(canvas,julia,coordiantes));
        commands.put("chngc",new ChangeC(coordiantes));

        while (true) {
               try{ 
                Scanner in = new Scanner(System.in);
                System.out.print(">");
                String[] command_arguments = in.nextLine().split(" ");
                ICommand command = commands.get(command_arguments[0]);
                command.execute(command_arguments);
                canvas.repaint();
                }
                catch(Exception e){
                    System.out.println("NO SUCH COMMAND!");
                }

        }
    }
}
