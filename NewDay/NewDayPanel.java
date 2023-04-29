package github.NewDay;


import java.awt.*;
import javax.swing.*;


public class NewDayPanel extends javax.swing.JPanel{


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        signaturePersonelle(g); //Comment, uncomment or remove this signature how you like

    }
    public void signaturePersonelle(Graphics g) {
        int k = 400;
        
        k = 200;
        g.setColor(Color.BLACK);
        g.drawRect(20 + k, 300 + k, 140, 60);
        Font font = new Font("DejaVu Serif", 1, 16);
        g.setFont(font);
        g.drawString("Fait par", 30 + k, 320 + k);
        g.drawString("Vahé Tildian", 30 + k, 340 + k);
    }


    public static void runApplication(){
        JFrame frame = new JFrame(" NewDay ");
        NewDayPanel panel = new NewDayPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setSize(580, 650);
        frame.setLocation(100, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        System.out.println("Hello GitHub!");
        SwingUtilities.invokeLater(() -> runApplication());
    }

}