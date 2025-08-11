import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ChooseFileActionListener implements ActionListener {

    private JTextField filenameField;
    private String filepath;  // เก็บพาธของไฟล์ที่ผู้ใช้เลือก

    // Constructor รับ JTextField เพื่อให้สามารถตั้งค่าชื่อไฟล์
    public ChooseFileActionListener(JTextField filenameField) {
        this.filenameField = filenameField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // เรียกฟังก์ชันเพื่อให้ผู้ใช้เลือกไฟล์
        filepath = chooseFile();

        // หากเลือกไฟล์สำเร็จ, แสดงพาธของไฟล์ใน filenameField
        if (filepath != null) {
            filenameField.setText(filepath);  // ตั้งค่าพาธของไฟล์ใน JTextField
        }
    }

    // ฟังก์ชันสำหรับเลือกไฟล์
    private String chooseFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a File");

        // แสดงหน้าต่างเลือกไฟล์
        int result = fileChooser.showOpenDialog(null);

        // ตรวจสอบว่าผู้ใช้ได้เลือกไฟล์หรือไม่
        if (result == JFileChooser.APPROVE_OPTION) {
            // ถ้าเลือกไฟล์แล้ว, คืนค่าพาธของไฟล์
            File selectedFile = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(null, "File loaded successfully!");
            return selectedFile.getPath();  // คืนค่าพาธของไฟล์
        }

        return null;  // หากไม่ได้เลือกไฟล์
    }

    // Getter สำหรับ filepath
    public String getFilepath() {
        return filepath;
    }
}
