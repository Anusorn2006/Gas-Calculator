import javax.swing.*;
import java.io.*;

public class Choosefile {

    private JTextField filenamepath;
    private String filepath = "";

    public Choosefile(JTextField filenamepath)
    {
        this.filenamepath = filenamepath;
    }


    public String loadFile() {
        JFileChooser fileChooser = new JFileChooser(); //สร้างออบเจ็คเพื่อเรีมใช้คำสั่ง หรือ เมดต๊อด

        try {
            int result = fileChooser.showOpenDialog(null);//เรียกใช้เมดต๊อดที่แสดงหน้าเลือกไฟล์

            if (result == JFileChooser.APPROVE_OPTION) { //เช็คการรีเทินค่า ถ้า กดเลือก ไฟลและกดopen จะเข้าเมดต๊อดนี้
                File file = fileChooser.getSelectedFile(); //getSelectedFile คือคำสั่งที่เรียกไฟลของผู็ใช้ที่เก็บไว้ใน JFileChooser มาเก็ยในตัวแปล file
                filepath = file.getPath(); // ดึงข้อมูลจาก file แปลงจาก file เป็น String แล็วเก็บไว้ใน filepath

                filenamepath.setText(filepath);

                JOptionPane.showMessageDialog(null, "File loaded successfully:\n" + filepath);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error loading file: " + e.getMessage());
        }
        return filepath;
    }

    // Getter สำหรับ filepath
    public String getFilepath() {
        return filepath;
    }
}