package JFrame;

import javax.swing.*;
import java.awt.*;

public class JanelaBotoes extends JFrame {

    public JanelaBotoes(){
        super();
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JButton botao =  new JButton("Ok");
        contentPane.add(botao, BorderLayout.CENTER);

        setVisible(true);
    }


}
