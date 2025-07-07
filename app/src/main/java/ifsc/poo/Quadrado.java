package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Quadrado extends Figura{
    public Quadrado(double x, double y, double tamanho, Color cor, boolean preenchido){
        super(x, y, tamanho, cor, preenchido);
    }

    public void desenhar(Draw draw){
        draw.setPenColor(cor);
        if(preenchido){
            draw.filledSquare(x, y, tamanho);
            draw.setPenColor(Color.BLACK);
            draw.square(x, y, tamanho);
        }
        else
            draw.square(x, y, tamanho);
    }

    public double getArea() {
        return tamanho * tamanho;
    }

    public double getPerimetro() {
        return 4 * tamanho;
    }
}