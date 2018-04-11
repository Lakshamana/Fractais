package teste_janela;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author arjuna
 */
public class Painel extends JPanel{
    
    private final Vector2 v1 = new Vector2(200, 50);
    private final Vector2 v2 = new Vector2(50, 300);
    private final Vector2 v3 = new Vector2(350, 300);
    private Fractal f;
    
    @Override
    public void paintComponent(Graphics g){
        f = new Fractal2(g, 4);
        super.paintComponent(g);
        setOpaque(true);
        g.setColor(Color.BLACK);
        setBackground(Color.yellow);
        f.fractal(v1, v2, v3, 0);
    }
}
