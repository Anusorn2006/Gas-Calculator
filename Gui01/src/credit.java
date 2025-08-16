import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class credit implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame creditpanal = new JFrame();
        creditpanal.setSize(500, 800);
        creditpanal.setResizable(false);
        creditpanal.setLocationRelativeTo(null);


        Font font1 = new Font("Tohoma", Font.BOLD, 20);


        JPanel mainpanal = new JPanel(new BorderLayout());
        JPanel creditpanalC = new JPanel(new GridLayout(3, 1));
        JLabel Nogas = new JLabel("No Gas");
        JLabel less = new JLabel("67011212072 \n Anusorn Laothong");
        JLabel more = new JLabel("Gas more than 50%");
        less.setFont(font1);
        creditpanalC.add(Nogas);
        creditpanalC.add(less);
        creditpanalC.add(more);

        Button buttonN = new Button("X");
        Button buttonS = new Button("X");
        Button buttonE = new Button("X");

        JPanel creditpanalW = new JPanel(new GridLayout(3, 1));
        creditpanalW.setPreferredSize(new Dimension(200 ,0));
        Panel CSummary1WR = new Panel(new BorderLayout());
        JButton space1C = new JButton();
        space1C.setBackground(new Color(255, 0, 0));
        JPanel space1N = new JPanel();
        JPanel space1S = new JPanel();
        JPanel space1W = new JPanel();
        JPanel space1E = new JPanel();

        // สีเหลือง - แก๊สน้อยกว่า 50%
        JPanel CSummary1WY = new JPanel(new BorderLayout());
        JButton space2C = new JButton();
        space2C.setBackground(new Color(255, 254, 0));
        JPanel space2N = new JPanel();
        JPanel space2S = new JPanel();
        JPanel space2W = new JPanel();
        JPanel space2E = new JPanel();

        // สีเขียว - แก๊สมากกว่า 50%
        JPanel CSummary1WG = new JPanel(new BorderLayout());
        JButton space3C = new JButton();
        space3C.setBackground(new Color(0, 255, 0));
        JPanel space3N = new JPanel();
        JPanel space3S = new JPanel();
        JPanel space3W = new JPanel();
        JPanel space3E = new JPanel();

        CSummary1WG.add(space3C, BorderLayout.CENTER);
        CSummary1WG.add(space3N, BorderLayout.NORTH);
        CSummary1WG.add(space3S, BorderLayout.SOUTH);
        CSummary1WG.add(space3W, BorderLayout.WEST);
        CSummary1WG.add(space3E, BorderLayout.EAST);
        creditpanalW.add(CSummary1WG);

        CSummary1WR.add(space1C, BorderLayout.CENTER);
        CSummary1WR.add(space1N, BorderLayout.NORTH);
        CSummary1WR.add(space1S, BorderLayout.SOUTH);
        CSummary1WR.add(space1W, BorderLayout.WEST);
        CSummary1WR.add(space1E, BorderLayout.EAST);
        creditpanalW.add(CSummary1WR);

        CSummary1WY.add(space2C, BorderLayout.CENTER);
        CSummary1WY.add(space2N, BorderLayout.NORTH);
        CSummary1WY.add(space2S, BorderLayout.SOUTH);
        CSummary1WY.add(space2W, BorderLayout.WEST);
        CSummary1WY.add(space2E, BorderLayout.EAST);
        creditpanalW.add(CSummary1WY);

        mainpanal.add(creditpanalC, BorderLayout.CENTER);
        mainpanal.add(buttonN, BorderLayout.NORTH);
        mainpanal.add(buttonS, BorderLayout.SOUTH);
        mainpanal.add(buttonE, BorderLayout.EAST);
        mainpanal.add(creditpanalW, BorderLayout.WEST);

        creditpanal.add(mainpanal);

        creditpanal.setVisible(true);
    }
}


