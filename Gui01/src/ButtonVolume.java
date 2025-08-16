import javax.swing.*;

public class ButtonVolume {
    // ปุ่มทั้งหมด 200 ปุ่ม
    JButton[] buttons = new JButton[200];
    String[] strV = {"---"};    // ค่าปริมาตร
    String[] strPer = {"---"};  // ค่าเปอร์เซ็นต์

    public void updateButtonColors(double[] gasper) {
        VolumeColor color = new VolumeColor();
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBackground(color.setColor((int) gasper[i])); // เปลี่ยนสีของปุ่มตามค่า gasper
        }
    }
}