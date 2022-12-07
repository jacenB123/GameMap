import java.awt.*;
import javax.swing.JFrame;
import java.io.*;

class Main {
  public static void main(String[] args) {
    MapMaker MM = new MapMaker();
    JFrame f=new JFrame();
    f.add(MM);
    f.setSize(1024,768);
    f.setVisible(true);
    
  }
}