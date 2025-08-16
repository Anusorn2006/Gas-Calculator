import java.awt.*;

public class VolumeColor {

    String color;
    VolumeColor(){

    }
    Color setColor(int gasper){
       if (gasper > 50){
           return Color.GREEN;
       } else if (gasper > 0 && gasper < 50)
       {
           return Color.YELLOW;
       }
       else
       {
           return Color.RED;
       }
    }

}
