import java.awt.*;
import javax.swing.JFrame;
import java.io.*;

public class MapMaker extends Canvas {
  public void paint(Graphics g){
    Toolkit t=Toolkit.getDefaultToolkit();
    Image FB=t.getImage("Mapimages/tex_fallback.png");
    Image SP=t.getImage("Mapimages/tex_hires_danger.png");
    Image MB=t.getImage("Mapimages/tex_hires_metal.png");
    Image GR=t.getImage("Mapimages/tex_hires_soil.png");
    Image backGround=t.getImage("Mapimages/bkgd.jpg.jpg");
    g.drawImage(backGround, 0,0, 1000, 1000, this);
    
    
    String line ="";
    int lineNumber = 0;
    

    for(int n = 1; n < 8; n++){
    try{
    FileReader readfile = new FileReader("Map.txt");
      BufferedReader readbuffer = new BufferedReader(readfile);
      for (lineNumber = 1; lineNumber < 8; lineNumber++) {
        if (lineNumber == n) {
          line = readbuffer.readLine();
        } else
          readbuffer.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    int z = n - 1;
    int y = 16 * z;
    String map = line.replace(",","");
    String[] cars = map.split("");
  for(int i = 0; i < map.length(); i++){
    int x = 0;
    if(cars[i].equals("1")){
      x = 16 * i;
      g.drawImage(GR, x, y, 16, 16, this);
    }else if(cars[i].equals("2")){
      x = 16 * i;
      g.drawImage(MB, x, y, 16, 16, this);
    }else if(cars[i].equals("0")){
    }else if(cars[i].equals("3")){
      x = 16 * i;
      g.drawImage(SP, x, y, 16, 16, this);
    }else if(cars[i].equals("4")){
      x = 16 * i;
      g.drawImage(FB, x, y, 16, 16, this);
    }
  }
  }
  }  
}