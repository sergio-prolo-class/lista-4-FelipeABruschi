package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.awt.event.KeyEvent;

public abstract class Figura {
    protected double x;
    protected double y;
    protected double tamanho;
    protected Color cor;
    protected boolean preenchido;

    public Figura(double x, double y, double tamanho, Color cor, boolean preenchido){
        this.x = x;
        this.y = y;
        this.tamanho = tamanho;
        this.cor = cor;
        this.preenchido = preenchido;
    }

    public abstract void desenhar(Draw draw);

    public abstract double getArea();

    public abstract double getPerimetro();
}

