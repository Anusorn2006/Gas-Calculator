import java.io.*;

public class ReadAndCal {

    // สร้างอาเรย์เพื่อเก็บผลลัพธ์
    private int[] sumv;
    private int[] gasper;

    int btred = 0;
    int btyellow = 0;
    int btgreen = 0;

    // Constructor สำหรับการคำนวณและเก็บผลลัพธ์
    ReadAndCal() {
        try {
            BufferedReader bfd = new BufferedReader(new FileReader("dept.txt"));

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
            gasper = new int[Number.length];  // อาเรย์เก็บค่า gaspercent (เปอร์เซ็นต์ของแก๊ส)



            // คำนวณและเก็บผลลัพธ์ในอาเรย์
            for (int i = 0; i < Number.length; i++) {
                num[i] = Integer.parseInt(Number[i]);  // แปลงค่าจาก String เป็น int
                int sum = 150 * 150 * (2500 - (num[i] - 200)); // คำนวณ sum
                double gaspercent = (sum / area) * 100; // คำนวณ gaspercent

                // เก็บผลลัพธ์ในอาเรย์
                sumv[i] = sum;
                gasper[i] = (int) gaspercent; // แปลงค่า gaspercent เป็น int เพื่อเก็บในอาเรย์

                if (gasper[i] < 50 && gasper[i] > 0)
                {
                    btyellow++;
                }
                else if (gasper[i] > 50)
                {
                    btgreen++;
                }else
                {
                    btred++;
                }
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
    public int[] getGasper() {
        return gasper;
    }

    public int getBtred() {
        return btred;
    }
    public int getBtyellow() {
        return btyellow;
    }
    public int getBtgreen() {
        return btgreen;
    }



}
