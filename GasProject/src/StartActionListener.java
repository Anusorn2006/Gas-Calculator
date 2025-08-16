import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartActionListener implements ActionListener {
    private Choosefile readerFile;
    private SetFluidActionListener setFluid;
    private ReadAndCal readAndCal;
    private ButtonVolume buttonVolume;


    public StartActionListener(Choosefile readerFile, SetFluidActionListener setFluid, ReadAndCal readAndCal, ButtonVolume buttonVolume) {
        this.readerFile = readerFile;
        this.setFluid = setFluid;
        this.readAndCal = readAndCal;
        this.buttonVolume = buttonVolume;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String filepath = readerFile.getFilepath();
        int fluid = setFluid.getFluid();

        if (filepath == null || filepath.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please choose a file first.");
            return;
        }

        if (fluid == 0) {
            JOptionPane.showMessageDialog(null, "Please set fluid value first.");
            return;
        }

        // เรียกคำนวณ
        readAndCal.startCalculation(filepath, fluid);

// ดึงค่า gasper
        double[] gasper = readAndCal.getGasper();

        // เปลี่ยนสีของปุ่มใน Gui
        buttonVolume.updateButtonColors(gasper);  // เรียกเมธอดใน Gui เพื่ออัพเดตสี

        // แจ้งเตือนว่าเสร็จแล้ว
        JOptionPane.showMessageDialog(null, "Calculation and color update complete!");
    }
}
