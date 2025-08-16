import java.awt.*;

public class VolumeColor {

    String color;
    VolumeColor(){

    }
    Color setColor(int gasper){
       if (gasper > 50)
       {
           return new Color(106,	183,	72);

       } else if (gasper > 0 && gasper < 50)
       {
           return new Color(251,	234,	100);
       }
       else
       {
           return new Color(255, 36, 0);
       }
    }

}
