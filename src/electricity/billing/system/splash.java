
package electricity.billing.system;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class splash extends JFrame implements Runnable{
   Thread t;
    splash(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2=i1.getImage().getScaledInstance(730,550,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
         setVisible(true);
         int x=1;
        for(int i=2;i<600;i+=4,x+=1){
         setSize(i+x,i);
        setLocation(700-((i+x)/2),400-(i/2));   
        try{
            Thread.sleep(2);
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        t=new Thread(this::run);
        t.start();
       setVisible(true);
       
    }
    
    public static void main(String[] args){
        new splash();
    }

    @Override
    public void run() {
           try{
               Thread.sleep(7000);
               setVisible(false);
               
               //login frame
               new login();
           }catch(Exception e){
               e.printStackTrace();
           }
    }
}
