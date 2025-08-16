import javax.swing.*;
import java.awt.event.*;

public class SetFluidActionListener implements ActionListener {

    private JTextField fluidField;  // TextField สำหรับกรอก Fluid
    private int fluid;              // ตัวเก็บค่า Fluid ล่าสุด

    public SetFluidActionListener(JTextField fluidField) {
        this.fluidField = fluidField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            fluid = Integer.parseInt(fluidField.getText()); // กดปุ่ม set fluid แล้ว จะอ่านค่า จาก fluidFieid ด้วยคำสั่ง gettext
            JOptionPane.showMessageDialog(null, "Fluid Contact set to: " + fluid);
            System.out.println(fluid);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Fluid Contact value.");
        }
    }

    // Getter  สำหรับค่า Fluid
    public int getFluid() {
        return fluid;
    }

}
