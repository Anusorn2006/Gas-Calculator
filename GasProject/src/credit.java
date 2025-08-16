import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class credit implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // สร้าง JFrame และตั้งค่าขนาด
        JFrame creditpanal = new JFrame();
        creditpanal.setSize(500, 800); // ขนาดของหน้าต่าง
        creditpanal.setResizable(false); // ปิดการปรับขนาดหน้าต่าง
        creditpanal.setLocationRelativeTo(null); // ตั้งตำแหน่งให้แสดงที่กลางหน้าจอ

        // กำหนดฟอนต์และขอบสำหรับ JLabel
        Font font1 = new Font("Tohoma", Font.BOLD, 20);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);

        // สร้าง JPanel สำหรับแสดงข้อความ
        JPanel mainpanal = new JPanel(new BorderLayout());
        JPanel creditpanalC = new JPanel(new GridLayout(3, 1)); // จัดเรียงข้อความในกริด 3 แถว 1 คอลัมน์

        // สร้าง JLabel เพื่อแสดงชื่อและหมายเลข
        JLabel nameTea = new JLabel("<html> &nbsp;&nbsp;&nbsp; 67011212164<p></p>  Thawisap sonangam </html>", JLabel.CENTER);
        JLabel nameFour = new JLabel("<html> &nbsp;&nbsp;&nbsp; 67011212072<p></p>  Anusorn Laothong </html>", JLabel.CENTER);
        JLabel more = new JLabel("<html> &nbsp;&nbsp;&nbsp; 67011212155<p></p>  Kiatprawut singsim </html>", JLabel.CENTER);

        // กำหนดขอบและฟอนต์ให้กับ JLabel
        nameTea.setBorder(border);
        nameFour.setBorder(border);
        more.setBorder(border);

        nameTea.setFont(font1);
        nameFour.setFont(font1);
        more.setFont(font1);

        // เพิ่ม JLabel ที่สร้างขึ้นไปยัง creditpanalC
        creditpanalC.add(nameTea);
        creditpanalC.add(nameFour);
        creditpanalC.add(more);

        // สร้าง JPanel สำหรับปุ่ม (แต่ไม่ได้ใช้งานในโค้ดนี้)
        JPanel buttonN = new JPanel();
        JPanel buttonS = new JPanel();
        JPanel buttonE = new JPanel();

        // สร้าง JPanel สำหรับการจัดเรียงรูปภาพ
        JPanel creditpanalW = new JPanel(new GridLayout(3, 1));
        creditpanalW.setPreferredSize(new Dimension(200 ,0));

        // สร้าง JPanel สำหรับรูปภาพบุคคลแรก (Four)
        JPanel panelFour = new JPanel(new BorderLayout());
        ImageIcon Four = new ImageIcon("C:\\1-68\\oop\\GasProject\\src\\Four.jpg"); // โหลดรูปภาพ Four
        Image imgFour = Four.getImage(); // ดึงภาพจาก ImageIcon
        Image scaledImg = imgFour.getScaledInstance(200, 250, Image.SCALE_SMOOTH); // ปรับขนาดภาพเป็น 200x250
        ImageIcon iconFour = new ImageIcon(scaledImg); // สร้าง ImageIcon ใหม่ที่มีขนาดที่ปรับแล้ว
        JLabel imageFour = new JLabel(iconFour);

        // สร้างพื้นที่ว่างในแต่ละตำแหน่งของ BorderLayout
        JPanel space1N = new JPanel();
        JPanel space1S = new JPanel();
        JPanel space1W = new JPanel();
        JPanel space1E = new JPanel();

        // สร้าง JPanel สำหรับรูปภาพบุคคลที่สอง (Por)
        JPanel panelPor = new JPanel(new BorderLayout());
        ImageIcon Por = new ImageIcon("C:\\1-68\\oop\\GasProject\\src\\Por.jpg"); // โหลดรูปภาพ Por
        Image imgPor = Por.getImage(); // ดึงภาพจาก ImageIcon
        Image setPor = imgPor.getScaledInstance(200, 250, Image.SCALE_SMOOTH); // ปรับขนาดภาพเป็น 200x250
        ImageIcon iconPor = new ImageIcon(setPor); // สร้าง ImageIcon ใหม่ที่มีขนาดที่ปรับแล้ว
        JLabel imagePor = new JLabel(iconPor);

        // สร้างพื้นที่ว่างในแต่ละตำแหน่งของ BorderLayout
        JPanel space2N = new JPanel();
        JPanel space2S = new JPanel();
        JPanel space2W = new JPanel();
        JPanel space2E = new JPanel();

        // สร้าง JPanel สำหรับรูปภาพบุคคลที่สาม (Tae)
        JPanel panalTae = new JPanel(new BorderLayout());
        ImageIcon Tae = new ImageIcon("C:\\1-68\\oop\\GasProject\\src\\Tae.jpg"); // โหลดรูปภาพ Tae
        Image imgTae = Tae.getImage(); // ดึงภาพจาก ImageIcon
        Image setTae = imgTae.getScaledInstance(200, 250, Image.SCALE_SMOOTH); // ปรับขนาดภาพเป็น 200x250
        ImageIcon iconTae = new ImageIcon(setTae); // สร้าง ImageIcon ใหม่ที่มีขนาดที่ปรับแล้ว
        JLabel imageTae = new JLabel(iconTae);

        // สร้างพื้นที่ว่างในแต่ละตำแหน่งของ BorderLayout
        JPanel space3N = new JPanel();
        JPanel space3S = new JPanel();
        JPanel space3W = new JPanel();
        JPanel space3E = new JPanel();

        // การจัดเรียงรูปภาพบุคคลที่สาม (Tae)
        panalTae.add(imageTae, BorderLayout.CENTER);
        panalTae.add(space3N, BorderLayout.NORTH);
        panalTae.add(space3S, BorderLayout.SOUTH);
        panalTae.add(space3W, BorderLayout.WEST);
        panalTae.add(space3E, BorderLayout.EAST);
        creditpanalW.add(panalTae);

        // การจัดเรียงรูปภาพบุคคลที่หนึ่ง (Four)
        panelFour.add(imageFour, BorderLayout.CENTER);
        panelFour.add(space1N, BorderLayout.NORTH);
        panelFour.add(space1S, BorderLayout.SOUTH);
        panelFour.add(space1W, BorderLayout.WEST);
        panelFour.add(space1E, BorderLayout.EAST);
        creditpanalW.add(panelFour);

        // การจัดเรียงรูปภาพบุคคลที่สอง (Por)
        panelPor.add(imagePor, BorderLayout.CENTER);
        panelPor.add(space2N, BorderLayout.NORTH);
        panelPor.add(space2S, BorderLayout.SOUTH);
        panelPor.add(space2W, BorderLayout.WEST);
        panelPor.add(space2E, BorderLayout.EAST);
        creditpanalW.add(panelPor);

        // การจัดเรียงทั้งหมดใน BorderLayout ของ JFrame
        mainpanal.add(creditpanalC, BorderLayout.CENTER); // ข้อความชื่อ
        mainpanal.add(buttonN, BorderLayout.NORTH); // ปุ่มด้านเหนือ
        mainpanal.add(buttonS, BorderLayout.SOUTH); // ปุ่มด้านใต้
        mainpanal.add(buttonE, BorderLayout.EAST); // ปุ่มด้านขวา
        mainpanal.add(creditpanalW, BorderLayout.WEST); // รูปภาพ

        creditpanal.add(mainpanal); // เพิ่มทั้งหมดลงใน creditpanal

        creditpanal.setVisible(true); // ทำให้ JFrame มองเห็น
    }
}
