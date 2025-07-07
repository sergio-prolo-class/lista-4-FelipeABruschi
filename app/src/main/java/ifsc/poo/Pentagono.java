package ifsc.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.*;

public class Pentagono extends Figura {
    public Pentagono(double x, double y, double tamanho, Color cor, boolean preenchido) {
        super(x, y, tamanho, cor, preenchido);
    }

    public void desenhar(Draw draw) {
        draw.setPenColor(cor);

        double[] xs = new double[5];
        double[] ys = new double[5];
        double angulo;

        for (int i = 0; i < 5; i++) {
            angulo = 2 * Math.PI * i / 5;
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
        return (5 * tamanho * tamanho) / (4 * Math.tan(Math.PI / 5));
    }

    public double getPerimetro() {
        return 5 * tamanho;
    }
}