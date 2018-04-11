package teste_janela;

import javax.swing.JFrame;

/**
 *
 * @author arjuna
 */
public class Janela{
    public static void main(String[] args) {
        JFrame janela = new JFrame("Fractal");
        Painel p = new Painel();
        janela.add(p);
        janela.setSize(400, 400);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setVisible(true);
    }
}
