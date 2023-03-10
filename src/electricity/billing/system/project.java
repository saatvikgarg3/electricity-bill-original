package electricity.billing.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.JFrame;


public class project extends JFrame implements ActionListener {
    String atype,meter;
    project(String atype,String meter){
        this.atype=atype;
        this.meter=meter;
        setExtendedState(JFrame.MAXIMIZED_BOTH); //frame will appear on full screen shortcut
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image i2=i1.getImage().getScaledInstance(1550, 850, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        JMenuBar mb=new JMenuBar();
        setJMenuBar(mb);
        
        JMenu master=new JMenu("Master");
        master.setForeground(Color.BLUE);
        
        
        JMenuItem newcustomer=new JMenuItem("New customer");
        newcustomer.setFont(new Font("monospaces",Font.PLAIN,12));
        newcustomer.setBackground(Color.WHITE);
        ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
       //button mein image directadd in constructor of button initialization and for menuitem use method seticon
        Image image1=icon1.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
        newcustomer.setIcon(new ImageIcon(image1));
        newcustomer.setMnemonic('D');
        newcustomer.addActionListener(this);
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        master.add(newcustomer);
        
        JMenuItem customerdetails=new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaces",Font.PLAIN,12));
        customerdetails.setBackground(Color.WHITE);
        ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
       //button mein image directadd in constructor of button initialization and for menuitem use method seticon
        Image image2=icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
        customerdetails.setIcon(new ImageIcon(image2));
        customerdetails.setMnemonic('M');
        customerdetails.addActionListener(this);
        customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        master.add(customerdetails);
        
        JMenuItem depositdetails=new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("monospaces",Font.PLAIN,12));
        depositdetails.setBackground(Color.WHITE);
        ImageIcon icon3=new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
       //button mein image directadd in constructor of button initialization and for menuitem use method seticon
        Image image3=icon3.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
        depositdetails.setIcon(new ImageIcon(image3));
        depositdetails.setMnemonic('N');
        depositdetails.addActionListener(this);
        depositdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        master.add(depositdetails);
        
        JMenuItem calculatebill=new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaces",Font.PLAIN,12));
        calculatebill.setBackground(Color.WHITE);
        ImageIcon icon4=new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
       //button mein image directadd in constructor of button initialization and for menuitem use method seticon
        Image image4=icon4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
        calculatebill.setIcon(new ImageIcon(image4));
        calculatebill.setMnemonic('B');
        calculatebill.addActionListener(this);
        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        master.add(calculatebill);
        
        JMenu info=new JMenu("Information");
        info.setForeground(Color.red);
        
        
        JMenuItem updateinformation=new JMenuItem("Update Information");
        updateinformation.setFont(new Font("monospaces",Font.PLAIN,12));
        updateinformation.setBackground(Color.WHITE);
        ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
       //button mein image directadd in constructor of button initialization and for menuitem use method seticon
        Image image5=icon5.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
        updateinformation.setIcon(new ImageIcon(image5));
        updateinformation.setMnemonic('P');
        updateinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        info.add(updateinformation);
        
        JMenuItem viewImformation=new JMenuItem("view Information");
        viewImformation.setFont(new Font("monospaces",Font.PLAIN,12));
        viewImformation.setBackground(Color.WHITE);
        ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
       //button mein image directadd in constructor of button initialization and for menuitem use method seticon
        Image image6=icon6.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
        viewImformation.setIcon(new ImageIcon(image6));
        viewImformation.setMnemonic('L');
        viewImformation.addActionListener(this);
        viewImformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        info.add(viewImformation);
        
        JMenu user=new JMenu("User");
        user.setForeground(Color.BLUE);
        
        
        JMenuItem paybill=new JMenuItem("Pay Bill");
        paybill.setFont(new Font("monospaces",Font.PLAIN,12));
        paybill.setBackground(Color.WHITE);
        ImageIcon icon7=new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
       //button mein image directadd in constructor of button initialization and for menuitem use method seticon
        Image image7=icon7.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
        paybill.setIcon(new ImageIcon(image7));
        paybill.setMnemonic('R');
        paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        user.add(paybill);
        
        JMenuItem billdetails =new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaces",Font.PLAIN,12));
        billdetails.setBackground(Color.WHITE);
        ImageIcon icon8=new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
       //button mein image directadd in constructor of button initialization and for menuitem use method seticon
        Image image8=icon8.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
        billdetails.setIcon(new ImageIcon(image8));
        billdetails.setMnemonic('B');
        billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        user.add(billdetails);
        
        JMenu report=new JMenu("Report");
        report.setForeground(Color.RED);
        
        
        JMenuItem generatebill=new JMenuItem("Generate Bill");
        generatebill.setFont(new Font("monospaces",Font.PLAIN,12));
        generatebill.setBackground(Color.WHITE);
        ImageIcon icon9=new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
       //button mein image directadd in constructor of button initialization and for menuitem use method seticon
        Image image9=icon9.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
        generatebill.setIcon(new ImageIcon(image9));
        generatebill.setMnemonic('G');
        generatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
        report.add(generatebill);
        
        JMenu utility=new JMenu("Utility");
        utility.setForeground(Color.BLUE);
        
        
        JMenuItem notepad=new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaces",Font.PLAIN,12));
        notepad.setBackground(Color.WHITE);
        ImageIcon icon10=new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
       //button mein image directadd in constructor of button initialization and for menuitem use method seticon
        Image image10=icon10.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
        notepad.setIcon(new ImageIcon(image10));
        notepad.setMnemonic('N');
        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        utility.add(notepad);
        
        JMenuItem calculator=new JMenuItem("Calucator");
        calculator.setFont(new Font("monospaces",Font.PLAIN,12));
        calculator.setBackground(Color.WHITE);
        ImageIcon icon11=new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
       //button mein image directadd in constructor of button initialization and for menuitem use method seticon
        Image image11=icon11.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
        calculator.setIcon(new ImageIcon(image11));
        calculator.setMnemonic('C');
        calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        utility.add(calculator);
        
        JMenu mexit=new JMenu("Menu Exit");
        mexit.setForeground(Color.RED);
        
        
        JMenuItem exit=new JMenuItem("Exit");
        exit.setFont(new Font("monospaces",Font.PLAIN,12));
        exit.setBackground(Color.WHITE);
        ImageIcon icon12=new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
       //button mein image directadd in constructor of button initialization and for menuitem use method seticon
        Image image12=icon12.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT); 
        exit.setIcon(new ImageIcon(image12));
        exit.setMnemonic('W');
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
        mexit.add(exit);
        
        if(atype.equals("Admin")){
            mb.add(master);
        }
        else{ 
        mb.add(info);
        mb.add(user);
        mb.add(report);
        }
        
        mb.add(utility);
        mb.add(mexit);
        
        
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args){
        
    new project("","");
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg=e.getActionCommand();
        switch (msg) {
            case "New customer":
                new newcustomer();
                break;
            case "Customer Details":
                new customerdeatils();
                break;
            case "Deposit Details":
                new depositdeatils();
                break;
            case "Calculate Bill":
                new calculatebill();
                break;
            case "view Information":
                new viewinformation(meter);
            default:
                break;
        }
    }
}
