import javax.swing.*;
import javax.swing.border.Border;
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
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);


        JPanel mainpanal = new JPanel(new BorderLayout());
        JPanel creditpanalC = new JPanel(new GridLayout(3, 1));

        JLabel nameTea = new JLabel("<html> &nbsp;&nbsp;&nbsp; 67011212164<p></p>  Thawisap sonangam </html>", JLabel.CENTER);
        JLabel nameFour = new JLabel("<html> &nbsp;&nbsp;&nbsp; 67011212072<p></p>  Anusorn Laothong </html>", JLabel.CENTER);
        JLabel more = new JLabel("<html> &nbsp;&nbsp;&nbsp; 67011212155<p></p>  Kiatprawut singsim </html>", JLabel.CENTER);
        nameTea.setBorder(border);
        nameFour.setBorder(border);
        more.setBorder(border);

        nameTea.setFont(font1);
        nameFour.setFont(font1);
        more.setFont(font1);

        creditpanalC.add(nameTea);
        creditpanalC.add(nameFour);
        creditpanalC.add(more);

        JPanel buttonN = new JPanel();
        JPanel buttonS = new JPanel();
        JPanel buttonE = new JPanel();

        JPanel creditpanalW = new JPanel(new GridLayout(3, 1));
        creditpanalW.setPreferredSize(new Dimension(200 ,0));


        JPanel panelFour = new JPanel(new BorderLayout());
        ImageIcon Four = new ImageIcon("C:\\1-68\\oop\\Gui01\\src\\Four.jpg");
        Image imgFour = Four.getImage(); // ดึงภาพจาก ImageIcon
        Image scaledImg = imgFour.getScaledInstance(200, 250, Image.SCALE_SMOOTH); // ปรับขนาดเป็น 200x200
        ImageIcon iconFour = new ImageIcon(scaledImg); // สร้าง ImageIcon ใหม่ที่มีขนาดที่ปรับแล้ว
        JLabel imageFour = new JLabel(iconFour);
        JPanel space1N = new JPanel();
        JPanel space1S = new JPanel();
        JPanel space1W = new JPanel();
        JPanel space1E = new JPanel();


        JPanel panelPor = new JPanel(new BorderLayout());
        ImageIcon Por = new ImageIcon("C:\\1-68\\oop\\Gui01\\src\\Por.jpg");
        Image imgPor = Por.getImage(); // ดึงภาพจาก ImageIcon
        Image setPor = imgPor.getScaledInstance(200, 250, Image.SCALE_SMOOTH); // ปรับขนาดเป็น 200x200
        ImageIcon iconPor = new ImageIcon(setPor); // สร้าง ImageIcon ใหม่ที่มีขนาดที่ปรับแล้ว
        JLabel imagePor = new JLabel(iconPor);
        JPanel space2N = new JPanel();
        JPanel space2S = new JPanel();
        JPanel space2W = new JPanel();
        JPanel space2E = new JPanel();

        JPanel panalTae = new JPanel(new BorderLayout());
        ImageIcon Tae = new ImageIcon("C:\\1-68\\oop\\Gui01\\src\\Tae.jpg");
        Image imgTae = Tae.getImage(); // ดึงภาพจาก ImageIcon
        Image setTae = imgTae.getScaledInstance(200, 250, Image.SCALE_SMOOTH); // ปรับขนาดเป็น 200x200
        ImageIcon iconTae = new ImageIcon(setTae); // สร้าง ImageIcon ใหม่ที่มีขนาดที่ปรับแล้ว
        JLabel imageTae = new JLabel(iconTae);
        JPanel space3N = new JPanel();
        JPanel space3S = new JPanel();
        JPanel space3W = new JPanel();
        JPanel space3E = new JPanel();

        panalTae.add(imageTae, BorderLayout.CENTER);
        panalTae.add(space3N, BorderLayout.NORTH);
        panalTae.add(space3S, BorderLayout.SOUTH);
        panalTae.add(space3W, BorderLayout.WEST);
        panalTae.add(space3E, BorderLayout.EAST);
        creditpanalW.add(panalTae);

        panelFour.add(imageFour, BorderLayout.CENTER);
        panelFour.add(space1N, BorderLayout.NORTH);
        panelFour.add(space1S, BorderLayout.SOUTH);
        panelFour.add(space1W, BorderLayout.WEST);
        panelFour.add(space1E, BorderLayout.EAST);
        creditpanalW.add(panelFour);

        panelPor.add(imagePor, BorderLayout.CENTER);
        panelPor.add(space2N, BorderLayout.NORTH);
        panelPor.add(space2S, BorderLayout.SOUTH);
        panelPor.add(space2W, BorderLayout.WEST);
        panelPor.add(space2E, BorderLayout.EAST);
        creditpanalW.add(panelPor);

        mainpanal.add(creditpanalC, BorderLayout.CENTER);
        mainpanal.add(buttonN, BorderLayout.NORTH);
        mainpanal.add(buttonS, BorderLayout.SOUTH);
        mainpanal.add(buttonE, BorderLayout.EAST);
        mainpanal.add(creditpanalW, BorderLayout.WEST);

        creditpanal.add(mainpanal);

        creditpanal.setVisible(true);
    }
}


