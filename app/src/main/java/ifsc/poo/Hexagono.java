package ifsc.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.*;

public class Hexagono extends Figura {
    public Hexagono(double x, double y, double tamanho, Color cor, boolean preenchido) {
        super(x, y, tamanho, cor, preenchido);
    }

    public void desenhar(Draw draw) {
        draw.setPenColor(cor);

        double[] xs = new double[6];
        double[] ys = new double[6];
        double angulo;

        for (int i = 0; i < 6; i++) {
            angulo = 2 * Math.PI * i / 6;
            xs[i] = x + tamanho * Math.cos(angulo);
            ys[i] = y + tamanho * Math.sin(angulo);
        }

        if (preenchido) {
            draw.filledPolygon(xs, ys);
            draw.setPenColor(Color.BLACK);
            draw.polygon(xs, ys);
        } else
            draw.polygon(xs, ys);
    }

    public double getArea() {
        return (3 * Math.sqrt(3) * tamanho * tamanho) / 2;
    }

    public double getPerimetro() {
        return 6 * tamanho;
    }
}