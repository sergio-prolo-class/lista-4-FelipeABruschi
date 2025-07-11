/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import javax.swing.*;
import java.awt.*;

public class App {
    Draw draw;

    public App(){
        this.draw = new Draw();
        this.draw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.draw.setCanvasSize(600, 600);
        this.draw.setXscale(0, 600);
        this.draw.setYscale(0, 600);
    }

    public static void main(String[] args) {
        App app = new App();

        Gerenciador gerenciador = new Gerenciador();
        Controlador controlador = new Controlador(app.draw, gerenciador);

        app.draw.addListener(controlador);

        app.draw.enableDoubleBuffering();
        app.draw.show();
    }
}