import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GasCalculator {
    public static void main(String[] args) {

        // ====================  การตั้งค่าหน้าต่างหลัก ====================
        JFrame frame = new JFrame("Gas Calculator");

        frame.setSize(1500, 800);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // ====================  การกำหนดฟอนต์และสี ====================
        Font font1 = new Font("Tohoma", Font.BOLD, 20);    // ฟอนต์เล็ก
        Font font = new Font("Tohoma", Font.BOLD, 100);    // ฟอนต์ใหญ่สำหรับหัวเรื่อง



        ReadAndCal calculator = new  ReadAndCal();

        // ====================  Layout และ Panel Structure ====================
        JPanel panel = new JPanel(new BorderLayout());

        // สร้าง Panel เว้นระยะห่างรอบๆ
        JPanel edgeN = new JPanel();
        edgeN.setBackground(new Color(149, 149, 149));
        JPanel edgeS = new JPanel();
        edgeS.setBackground(new Color(149, 149, 149));
        JPanel edgeW = new JPanel();
        edgeW.setBackground(new Color(149, 149, 149));
        JPanel edgeE = new JPanel();
        edgeE.setBackground(new Color(149, 149, 149));

        JPanel panel1 = new JPanel(new BorderLayout());

        // ====================  ส่วนหัว (Header) ====================
        JLabel namePj = new JLabel("Gas Calculator", JLabel.CENTER);
        namePj.setForeground(new Color(86,86,86));
        namePj.setPreferredSize(new Dimension(0, 100));
        namePj.setFont(font); // ใช้ฟอนต์ขนาด 100



        // ==================== ตารางแสดงข้อมูลหลัก (Main Grid) ====================
        JPanel panelTable = new JPanel(new BorderLayout());

        // Panel เว้นระยะห่างรอบตาราง
        JPanel TableN = new JPanel();
        TableN.setBackground(new Color(149, 149, 149));
        JPanel TableS = new JPanel();
        TableS.setBackground(new Color(149, 149, 149));
        JPanel TableE = new JPanel();
        TableE.setBackground(new Color(149, 149, 149));

        // สร้างตารางกริด 10x20 = 200 ปุ่ม
        JPanel TableC = new JPanel(new BorderLayout());
        JPanel Table = new JPanel(new GridLayout(10, 20));

        JButton []buttons = new JButton[200];
        String []strV = {"---"};    // ค่าปริมาตร
        String []strPer = {"---"} ;  // ค่าเปอร์เซ็นต์

        JPanel VolumeOrarea = new JPanel(new GridLayout(2, 1));
        JPanel volume = new JPanel(new GridLayout(1, 2));


        JLabel textVolume = new JLabel("Volume : "+ strV[0] , JLabel.CENTER);
        JLabel textgas = new JLabel("Percen : " + "  " + strPer[0] + " %", JLabel.CENTER);


        ButtonVolume buttonVolume = new ButtonVolume();
        for (int i = 0; i < 200; i++) {
            buttonVolume.buttons[i] = new JButton();
            buttonVolume.buttons[i].setBackground(new Color(255, 255, 255));
            buttonVolume.buttons[i].setActionCommand(i + "");
            buttonVolume.buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int[] sumv = calculator.getSumv();
                        double[] gasper = calculator.getGasper();

                        // ดึงค่าของ index จาก actionCommand
                        int index = Integer.parseInt(e.getActionCommand());

                        // แสดงค่าใน console
                        System.out.println(sumv[index] + " " + gasper[index]);

                        // อัพเดตค่า strV
                        strV[0] = String.valueOf(sumv[index]);
                        strPer[0] = String.format("%.2f", gasper[index]);


                        textVolume.setText("Volume : " + strV[0]);
                        textgas.setText("Percent : " + strPer[0] + " %");
                    }catch (NullPointerException ex){

                    }

                }
            });
            //เพิ่มปุ่มไปยังตาราง (panel หรือ grid)
            Table.add(buttonVolume.buttons[i]);
        }


        // ==================== 6. แถบควบคุม (Control Panel) ====================
        JPanel controlTable = new JPanel(new BorderLayout());
        controlTable.setPreferredSize(new Dimension(0, 100));



        // ส่วนเลือกไฟล์ (ด้านซ้าย)
        JPanel CTableS1W = new JPanel(new GridLayout(2, 1));
        JTextField filename = new JTextField("File.txt");
        JButton chooseFile = new JButton("Choose File");
        chooseFile.setBackground(new Color(214, 214, 214));
        Choosefile readFile = new Choosefile(filename);

        chooseFile.addActionListener(e -> {

            readFile.loadFile();
        });

        CTableS1W.add(filename);
        CTableS1W.add(chooseFile);
        CTableS1W.setPreferredSize(new Dimension(500, 0));

        // ส่วนตั้งค่าของเหลว (ด้านขวา)
        JPanel CTableS1E = new JPanel(new GridLayout(2, 1));
        JTextField textFluid = new JTextField("depth");
        textFluid.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // เมื่อคลิกที่ฟิลด์ ข้อความ "depth" จะหายไป และพร้อมให้ผู้ใช้กรอกข้อมูล
                if (textFluid.getText().equals("depth")) {
                    textFluid.setText("");  // ลบข้อความ "depth" ออก
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // ถ้าฟิลด์ว่างและไม่มีการกรอกข้อความ ก็ให้ใส่ข้อความ "depth" กลับไป
                if (textFluid.getText().isEmpty()) {
                    textFluid.setText("depth");  // ใส่ข้อความ "depth" กลับไป
                }
            }
        });
        JButton inputfluid = new JButton("Set Fluid");
        inputfluid.setBackground(new Color(214, 214, 214));
        SetFluidActionListener setFluid = new SetFluidActionListener(textFluid);
        inputfluid.addActionListener(setFluid);
        CTableS1E.add(textFluid);
        CTableS1E.add(inputfluid);
        CTableS1E.setPreferredSize(new Dimension(500, 0));


        // ปุ่ม Start ตรงกลาง
        JPanel CTableS1N = new JPanel();
        CTableS1N.setBackground(new Color(149, 149, 149));
        JButton start = new JButton("Start");
        start.setBackground(new Color(117, 117, 117));
        start.setForeground(new Color(255, 255, 255));
        start.addActionListener(new StartActionListener(readFile, setFluid, calculator, buttonVolume));
        start.setFont(font1);

        // ==================== แผงสรุปผล (Summary Panel) ====================
        JPanel panelSummary = new JPanel(new BorderLayout());
        panelSummary.setPreferredSize(new Dimension(300, 0));

        //  ส่วนแสดงค่าปริมาตรและเปอร์เซ็นต์
        JPanel panelSummary1N = new JPanel(new BorderLayout());
        panelSummary1N.setPreferredSize(new Dimension(0, 250));


        //  ส่วนแสดงเปอร์เซ็นต์ของพื้นที่
        JPanel Ofarea = new JPanel(new BorderLayout());
        JPanel edgesum = new JPanel();
        edgesum.setBackground(new Color(149, 149, 149));

        //========= credit ========
        JButton buttoncredit = new JButton("Credit");
        buttoncredit.setBackground(new Color(255, 69, 0));
         buttoncredit.setForeground(new Color(255, 255, 255));
        buttoncredit.setFont(font1);
        buttoncredit.addActionListener(new credit());



        // ====================  คำอธิบายระบบสี (Color Legend) ====================
        JPanel panelSummary1C = new JPanel(new BorderLayout());
        JPanel CSummary1C = new JPanel(new GridLayout(3, 1));

        // ข้อความอธิบาย
        JLabel Nogas = new JLabel("No Gas");
        JLabel less = new JLabel("Gas less than 50%");
        JLabel more = new JLabel("Gas more than 50%");
        Nogas.setFont(font1);
        less.setFont(font1);
        more.setFont(font1);
            CSummary1C.add(Nogas);
            CSummary1C.add(less);
            CSummary1C.add(more);

        // ปุ่มแสดงสีตัวอย่าง
        Panel CSummary1W = new Panel(new GridLayout(3, 1));
        CSummary1W.setPreferredSize(new Dimension(100, 0));

        // สีแดง - ไม่มีแก๊ส
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

        // ==================== 9. การจัดวาง Layout ทั้งหมด ====================

        // จัดวางตาราง
        panelTable.add(TableC, BorderLayout.CENTER);
        panelTable.add(TableN, BorderLayout.NORTH);
        panelTable.add(TableS, BorderLayout.SOUTH);
        panelTable.add(TableE, BorderLayout.EAST);

        // จัดวางแถบควบคุม
        controlTable.add(start, BorderLayout.CENTER);
        controlTable.add(CTableS1N, BorderLayout.NORTH);
        controlTable.add(CTableS1W, BorderLayout.WEST);
        controlTable.add(CTableS1E, BorderLayout.EAST);

        // รวมตารางและแถบควบคุม
        TableC.add(Table, BorderLayout.CENTER);
        TableC.add(controlTable, BorderLayout.SOUTH);

        // จัดวางสีในแผงสรุปผล
        CSummary1WR.add(space1C, BorderLayout.CENTER);
        CSummary1WR.add(space1N, BorderLayout.NORTH);
        CSummary1WR.add(space1S, BorderLayout.SOUTH);
        CSummary1WR.add(space1W, BorderLayout.WEST);
        CSummary1WR.add(space1E, BorderLayout.EAST);
        CSummary1W.add(CSummary1WR);

        CSummary1WY.add(space2C, BorderLayout.CENTER);
        CSummary1WY.add(space2N, BorderLayout.NORTH);
        CSummary1WY.add(space2S, BorderLayout.SOUTH);
        CSummary1WY.add(space2W, BorderLayout.WEST);
        CSummary1WY.add(space2E, BorderLayout.EAST);
        CSummary1W.add(CSummary1WY);

        CSummary1WG.add(space3C, BorderLayout.CENTER);
        CSummary1WG.add(space3N, BorderLayout.NORTH);
        CSummary1WG.add(space3S, BorderLayout.SOUTH);
        CSummary1WG.add(space3W, BorderLayout.WEST);
        CSummary1WG.add(space3E, BorderLayout.EAST);
        CSummary1W.add(CSummary1WG);

        // volume และ percen
        volume.add(textVolume);
        volume.add(textgas);
        //  เปอร์เซ็นพื้นที่
        Ofarea.add(edgesum, BorderLayout.NORTH);
        Ofarea.add(buttoncredit, BorderLayout.CENTER);
        // summmary แย่ก 2 ช่อง
        VolumeOrarea.add(volume);
        VolumeOrarea.add(Ofarea);

        panelSummary1C.add(CSummary1C, BorderLayout.CENTER);
        panelSummary1C.add(CSummary1W, BorderLayout.WEST);

        panelSummary1N.add(VolumeOrarea, BorderLayout.CENTER);
        panelSummary1N.add(new JPanel() {{
            setBackground(new Color(149, 149, 149));
        }}, BorderLayout.NORTH);
        panelSummary1N.add(new JPanel() {{
            setBackground(new Color(149, 149, 149));
        }}, BorderLayout.SOUTH);

        panelSummary.add(panelSummary1C, BorderLayout.CENTER);
        panelSummary.add(panelSummary1N, BorderLayout.NORTH);
        panelSummary.add(new JPanel() {{setBackground(new Color(149, 149, 149));
        }}, BorderLayout.SOUTH);
        panelSummary.add(new JPanel(), BorderLayout.EAST);

        // รวม Panel หลักทั้งหมด
        panel1.add(panelTable, BorderLayout.CENTER);
        panel1.add(namePj, BorderLayout.NORTH);
        panel1.add(panelSummary, BorderLayout.EAST);

        // รวม Panel หลักกับเว้นระยะห่างรอบๆ
        panel.add(panel1, BorderLayout.CENTER);
        panel.add(edgeN, BorderLayout.NORTH);
        panel.add(edgeS, BorderLayout.SOUTH);
        panel.add(edgeW, BorderLayout.WEST);
        panel.add(edgeE, BorderLayout.EAST);

        // แสดงผล
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        //-------------------------------------------
    }
}











