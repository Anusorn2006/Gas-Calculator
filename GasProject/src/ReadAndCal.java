
import javax.swing.*;
import java.io.*;

public class ReadAndCal {

    // สร้างอาเรย์เพื่อเก็บผลลัพธ์
    private int[] sumv;
    private double[] gasper;

    int btred = 0;
    int btyellow = 0;
    int btgreen = 0;

    // Constructor สำหรับการคำนวณและเก็บผลลัพธ์
    public void startCalculation(String filepath, int fluid) {
        try {

            BufferedReader bfd = new BufferedReader(new FileReader(filepath));

            String str = "";
            for (; ; ) {
                String line = bfd.readLine();
                if (line == null) {
                    break;
                }
                str = str + line;
            }

            String[] Number = str.split(" ");  // แยกข้อมูลที่ได้จากไฟล์
            int[] num = new int[Number.length];  // อาเรย์เก็บตัวเลขจากไฟล์
            double area = 150 * 150 * 200;    // พื้นที่คำนวณ (ตัวอย่าง)

            // สร้างอาเรย์เพื่อเก็บผลลัพธ์
            sumv = new int[Number.length];    // อาเรย์เก็บค่าปริมาตร (sum)
            gasper = new double[Number.length];  // อาเรย์เก็บค่า gaspercent (เปอร์เซ็นต์ของแก๊ส)



            // คำนวณและเก็บผลลัพธ์ในอาเรย์
            for (int i = 0; i < Number.length; i++) {
                num[i] = Integer.parseInt(Number[i]);  // แปลงค่าจาก String เป็น int
                int sum = 150 * 150 * (fluid - (num[i] - 200)); // คำนวณ sum
                double gaspercent = ((double) sum / area) * 100; // คำนวณ gaspercent


                if(gaspercent > 100){
                    gaspercent = 100;
                }
                else if (gaspercent < 0){
                    gaspercent = 0;
                    sum = 0;
                }

                // เก็บผลลัพธ์ในอาเรย์
                sumv[i] = sum;
                gasper[i] =  gaspercent; // แปลงค่า gaspercent เป็น int เพื่อเก็บในอาเรย์

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    // Getter สำหรับ sumv[] (ค่าปริมาตร)
    public int[] getSumv() {
        return sumv;
    }

    // Getter สำหรับ gasper[] (เปอร์เซ็นต์ของแก๊ส)
    public double[] getGasper() {
        return gasper;
    }

}
