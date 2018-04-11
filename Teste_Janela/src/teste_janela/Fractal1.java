package teste_janela;

import java.awt.Graphics;

/**
 *
 * @author arjuna
 */
public class Fractal1 implements Fractal{
    
    private int MAX_RECURSAO = 10;
    Graphics g;

    public Fractal1(Graphics g){
        MAX_RECURSAO = 5;
        this.g = g;
    }
    
    public Fractal1(Graphics g, int max_r){
        MAX_RECURSAO = max_r;
        this.g = g;
    }
    
    public void drawTriangle(Vector2 v1, Vector2 v2, Vector2 v3){
        g.drawLine(v1.getX(), v1.getY(), v2.getX(), v2.getY());
        g.drawLine(v2.getX(), v2.getY(), v3.getX(), v3.getY());
        g.drawLine(v1.getX(), v1.getY(), v3.getX(), v3.getY());
    }
    
    public Vector2 mid(Vector2 p1, Vector2 p2){
        int mx = (int)(p1.getX() + p2.getX()) / 2;
        int my = (int)(p1.getY() + p2.getY()) / 2;
        return new Vector2(mx, my);
    }
    
    @Override
    public void fractal(Vector2 v1, Vector2 v2, Vector2 v3, int i){
        drawTriangle(v1, v2, v3);
        if(i <= MAX_RECURSAO)
            fractal(mid(v1, v2), mid(v1, v3), mid(v2, v3), ++i);
    }
    
    public void setMaxRecursion(int max){
        this.MAX_RECURSAO = max;
    }
}
