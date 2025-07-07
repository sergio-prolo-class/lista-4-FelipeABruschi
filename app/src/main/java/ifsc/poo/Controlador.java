package ifsc.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Controlador implements DrawListener {

    private Draw draw;
    private Gerenciador gerenciador;

    private int figuraSelecionada;
    private int tamanhofig = 50;
    private Color corAtual = Color.BLACK;
    private boolean preenchido = false;

    public Controlador(Draw draw, Gerenciador gerenciador) {
        this.draw = draw;
        this.gerenciador = gerenciador;
    }

    public void keyPressed(int tecla) {
        switch (tecla) {
            case KeyEvent.VK_F1 -> {
                figuraSelecionada = 1;
                System.out.println("Figura: Circulo");
            }
            case KeyEvent.VK_F2 -> {
                figuraSelecionada = 2;
                System.out.println("Figura: Quadrado");
            }
            case KeyEvent.VK_F3 -> {
                figuraSelecionada = 3;
                System.out.println("Figura: Pentagono");
            }
            case KeyEvent.VK_F4 -> {
                figuraSelecionada = 4;
                System.out.println("Figura: Hexagono");
            }

            case KeyEvent.VK_F5 -> {
                corAtual = Color.RED;
                System.out.println("Cor: Vermelho");
            }
            case KeyEvent.VK_F6 -> {
                corAtual = Color.BLUE;
                System.out.println("Cor: Azul");
            }
            case KeyEvent.VK_F7 -> {
                corAtual = Color.GREEN;
                System.out.println("Cor: Verde");
            }
            case KeyEvent.VK_F8 -> {
                corAtual = Color.ORANGE;
                System.out.println("Cor: Laranja");
            }

            case KeyEvent.VK_F -> {
                preenchido = !preenchido;
                if(preenchido)
                    System.out.println("Com preenchimento");
                else
                    System.out.println("Sem preenchimento");
            }

            case KeyEvent.VK_Q -> {
                if(tamanhofig > 10)
                    tamanhofig -= 10;
                System.out.println("Tamanho: " + tamanhofig);
            }

            case KeyEvent.VK_W -> {
                if(tamanhofig < 200)
                    tamanhofig += 10;
                System.out.println("Tamanho: " + tamanhofig);
            }

            case KeyEvent.VK_C -> {
                gerenciador.limpar();
                draw.clear();
            }

            case KeyEvent.VK_P -> {
                System.out.println("Figuras: " + gerenciador.getQuantidade());
                System.out.printf("Área média: %.2f\n", gerenciador.getAreaMedia());
                System.out.printf("Perímetro total: %.2f\n", gerenciador.getPerimetroTotal());
            }

            case KeyEvent.VK_LEFT -> gerenciador.mover(-10, 0);
            case KeyEvent.VK_RIGHT -> gerenciador.mover(10, 0);
            case KeyEvent.VK_UP -> gerenciador.mover(0, 10);
            case KeyEvent.VK_DOWN -> gerenciador.mover(0, -10);
        }

        draw.clear();
        gerenciador.desenharTodas(draw);
        draw.show();
    }

    public void mousePressed(double x, double y) {
        Figura nova = switch (figuraSelecionada) {
            case 1 -> new Circulo(x, y, tamanhofig, corAtual, preenchido);
            case 2 -> new Quadrado(x, y, tamanhofig, corAtual, preenchido);
            case 3 -> new Pentagono(x, y, tamanhofig, corAtual, preenchido);
            case 4 -> new Hexagono(x, y, tamanhofig, corAtual, preenchido);
            default -> null;
        };

        if (nova != null) {
            gerenciador.adicionar(nova);
            draw.clear();
            gerenciador.desenharTodas(draw);
            draw.show();
        }
    }
}