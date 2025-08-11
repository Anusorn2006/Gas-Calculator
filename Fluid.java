import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Fluid implements MouseListener {
    private JTextField textfluid;

    int fluidnumber = 0;
        // Constructor รับ JTextField เพื่อให้สามารถอ่านค่าจาก textfluid
    public Fluid(JTextField textfluid) {
        this.textfluid = textfluid;
    }

        @Override
        public void mouseClicked (MouseEvent e){
        // สามารถเพิ่มโค้ดที่ต้องการเมื่อคลิกปุ่มที่นี่
    }

        @Override
        public void mousePressed (MouseEvent e){
        // เมื่อมีการกดปุ่ม
        BtfluidPressed(e);
    }
        @Override
        public void mouseReleased (MouseEvent e){
        // โค้ดที่ต้องการเมื่อปล่อยปุ่ม
    }

        @Override
        public void mouseEntered (MouseEvent e){
        // โค้ดที่ต้องการเมื่อเมาส์เข้ามาในปุ่ม
    }

        @Override
        public void mouseExited (MouseEvent e){
        // โค้ดที่ต้องการเมื่อเมาส์ออกจากปุ่ม
    }

        private void BtfluidPressed (MouseEvent e){
        try{
            String fluid = textfluid.getText();  // อ่านค่าจาก JTextField
            int F = Integer.parseInt(fluid);// แปลงค่าจาก String เป็น int
            fluidnumber = F;
            System.out.println("Fluid value: " + fluidnumber);  // แสดงค่าที่อ่านได้

        }catch (NumberFormatException ex){
                JFrame frame = new JFrame();
                frame.setSize(300, 150);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JLabel label = new JLabel("Please enter a valid number!", JLabel.CENTER);
                frame.add(label);
                frame.setVisible(true);
        }

    }
    public int getFluidnumber(){
        return fluidnumber;
    }
}
