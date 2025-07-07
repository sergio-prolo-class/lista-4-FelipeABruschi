package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Circulo extends Figura{
    public Circulo(double x, double y, double tamanho, Color cor, boolean preenchido) {
        super(x, y, tamanho, cor, preenchido);
    }

    public void desenhar(Draw draw){
        draw.setPenColor(cor);
        if (this.preenchido){
            draw.filledCircle(x, y, tamanho);
            draw.setPenColor(Color.BLACK);
            draw.circle(x, y, tamanho);
        }
        else
            draw.circle(x, y, tamanho);
    }

    public double getArea() {
        return Math.PI * tamanho * tamanho;
    }

    public double getPerimetro() {
        return 2 * Math.PI * tamanho;
    }
}