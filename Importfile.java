import javax.swing.*;
import java.io.File;
public class Importfile {

    String filepath = "";
    Importfile() {

//        try{
            JFileChooser fileChooser = new JFileChooser(); //สร้างออบเจ็คเพื่อเรีนใช้คำสั่ง หรือ เมดต๊อด
            int result = fileChooser.showOpenDialog(null); //เรียกใช้เมดต๊อดที่แสดงหน้าเลือกไฟล์
            if (result == JFileChooser.APPROVE_OPTION) { //เช็คการรีเทินค่า ถ้า กดเลือก ไฟลและกดopen จะเข้าเมดต๊อดนี้
                File file = fileChooser.getSelectedFile();//getSelectedFile คือคำสั่งที่เรียกไฟลของผู็ใช้ที่เก็บไว้ใน JFileChooser มาเก็ยในตัวแปล file
//                readFile(file);//ส่งค่าตัวแปล file ไปเมดต๊อด readFile
                 filepath = file.getPath();
                JOptionPane.showMessageDialog(null, "File loaded successfully!");
            }
//        }catch (IOException e){
//
//        }
    }

    String getfilepath(){
        return filepath;
    }


//    private static List<String> lines = new ArrayList<>();
//
//    private static void readFile(File file) throws IOException {
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
////            lines.clear();
////            String line;
////            while ((line = br.readLine()) != null) {
////                lines.add(line);
//            }
//            JOptionPane.showMessageDialog(null, "File loaded successfully!");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error loading file: " + e.getMessage());
//        }
//
//    }
}

