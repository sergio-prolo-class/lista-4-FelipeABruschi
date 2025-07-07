package ifsc.poo;

import edu.princeton.cs.algs4.Draw;
import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private final List<Figura> figuras;

    public Gerenciador() {
        this.figuras = new ArrayList<>();
    }

    public void adicionar(Figura fig) {
        figuras.add(fig);
    }

    public void desenharTodas(Draw draw) {
        for (Figura fig : figuras) {
            fig.desenhar(draw);
        }
    }

    public void mover(double dx, double dy) {
        for (Figura fig : figuras) {
            fig.x += dx;
            fig.y += dy;
        }
    }

    public void limpar() {
        figuras.clear();
    }

    public int getQuantidade() {
        return figuras.size();
    }

    public double getAreaMedia() {
        if (figuras.isEmpty())
            return 0;
        double soma = 0;
        for (Figura fig : figuras)
            soma += fig.getArea();
        return soma / figuras.size();
    }

    public double getPerimetroTotal(){
        double soma = 0;
        for(Figura fig : figuras)
            soma += fig.getPerimetro();
        return soma;
    }
}