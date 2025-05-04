package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.sql.*;

public class Signup extends JFrame implements ActionListener {


    // to get data from textfield and store in mysql that why need to declare globally
    JTextField textName , textFName , textEmail  , textAdd , textCity , textPin ,textSt;
    JRadioButton r1,r2 ,r3,rm1,rm2;
    JButton next;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong()%9000L)+1000L;
    String first = " "+Math.abs(first4);
     Signup(){
         super("APPLICATION FORM");
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
         Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(25,10,100,100);
         add(image);

         JLabel label1 = new JLabel("APPLICATION FORM NO. "+first);
         label1.setBounds(160,20,600,40);
         label1.setFont(new Font("Railway",Font.BOLD,38));
         add(label1);


         JLabel label2 = new JLabel("Page 1");
         label2.setFont(new Font("Railway",Font.BOLD,22));
         label2.setBounds(360,70,600,30);
         add(label2);

         JLabel label3 = new JLabel("PERSONAL INFORMATION");
         label3.setFont(new Font("Raleway",Font.BOLD,22));
         label3.setBounds(280,95,600,30);
         add(label3);


         JLabel labelName = new JLabel("Name :");
         labelName.setFont(new Font("Raleway",Font.BOLD,20));
         labelName.setBounds(100,190,100,30);
         add(labelName);

         textName = new JTextField();
         textName.setFont(new Font("Raleway",Font.BOLD,20));
         textName.setBounds(300,193,400,30);
         add(textName);


         JLabel labelFName = new JLabel("Father's Name :");
         labelFName.setFont(new Font("Raleway",Font.BOLD,20));
         labelFName.setBounds(100,250,200,30);
         add(labelFName);

         textFName = new JTextField();
         textFName.setFont(new Font("Raleway",Font.BOLD,20));
         textFName.setBounds(300,253,400,30);
         add(textFName);

         JLabel DOB = new JLabel("Date OF Birth :");
         DOB.setFont(new Font("Raleway",Font.BOLD,20));
         DOB.setBounds(100,350,200,30);
         add(DOB);

         dateChooser =new JDateChooser();
         dateChooser.setForeground(new Color(105,105,105));
         dateChooser.setBounds(300,350,400,30);
         add(dateChooser);
         // FOR calender USE cLassjar.chooser

         JLabel Gender = new JLabel("Gender");
         Gender.setFont(new Font("Raleway",Font.BOLD,20));
         Gender.setBounds(100,300,200,30);
         add(Gender);

         r1=new JRadioButton("Male");
         r1.setFont(new Font("Raleway",Font.BOLD,14));
         r1.setBounds(300,300,60,30);
         r1.setBackground(new Color(222,255,200));
         add(r1);
         r2=new JRadioButton("Female");
         r2.setFont(new Font("Raleway",Font.BOLD,14));
         r2.setBounds(400,300,90,30);
         r2.setBackground(new Color(222,255,200));
         add(r2);
         r3=new JRadioButton("Other");
         r3.setFont(new Font("Raleway",Font.BOLD,14));
         r3.setBounds(520,300,80,30);
         r3.setBackground(new Color(222,255,200));
         add(r3);

         // TO PREVENTION OF SELECTION OF BOTH BUTTONS SIMULTA

         ButtonGroup buttonGroup = new ButtonGroup();
         buttonGroup.add(r1);
         buttonGroup.add(r2);
         buttonGroup.add(r3);
         // WE GROUP THEM

         JLabel labelEm = new JLabel("Email :");
         labelEm.setFont(new Font("Raleway",Font.BOLD,20));
         labelEm.setBounds(100,395,200,30);
         add(labelEm);

         textEmail = new JTextField();
         textEmail.setFont(new Font("Raleway",Font.BOLD,20));
         textEmail.setBounds(300,400,400,30);
         add( textEmail);

         JLabel labelMs = new JLabel("Maritial_Status :");
         labelMs.setFont(new Font("Raleway",Font.BOLD,20));
         labelMs.setBounds(100,445,200,30);
         add(labelMs);


         rm1=new JRadioButton("Married");
         rm1.setFont(new Font("Raleway",Font.BOLD,14));
         rm1.setBounds(300,450,100,30);
         rm1.setBackground(new Color(222,255,200));
         add(rm1);
         rm2=new JRadioButton("Unmarried");
         rm2.setFont(new Font("Raleway",Font.BOLD,14));
         rm2.setBounds(450,450,120,30);
         rm2.setBackground(new Color(222,255,200));
         add(rm2);
         // TO PREVENTION OF SELECTION OF BOTH BUTTONS SIMULTA

         ButtonGroup buttonGroupm = new ButtonGroup();
         buttonGroupm.add(rm1);
         buttonGroupm.add(rm2);
         // WE GROUP THEM

//         textMs = new JTextField();
//         textMs.setFont(new Font("Raleway",Font.BOLD,20));
//         textMs.setBounds(300,450,400,30);
//         add( textMs);

         JLabel labelAdd = new JLabel("Address :");
         labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
         labelAdd.setBounds(100,495,200,30);
         add(labelAdd);

         textAdd = new JTextField();
         textAdd.setFont(new Font("Raleway",Font.BOLD,20));
         textAdd.setBounds(300,498,400,30);
         add(textAdd);

         JLabel labelCity = new JLabel("CITY :");
         labelCity.setFont(new Font("Raleway",Font.BOLD,20));
         labelCity.setBounds(100,545,200,30);
         add(labelCity);

         textCity = new JTextField();
         textCity.setFont(new Font("Raleway",Font.BOLD,20));
         textCity.setBounds(300,549,400,30);
         add(textCity);

         JLabel labelPin = new JLabel("Pin Code :");
         labelPin.setFont(new Font("Raleway",Font.BOLD,20));
         labelPin.setBounds(100,600,200,30);
         add(labelPin);

         textPin = new JTextField();
         textPin.setFont(new Font("Raleway",Font.BOLD,20));
         textPin.setBounds(300,604,400,30);
         add(textPin);

         JLabel labelState = new JLabel("State :");
         labelState.setFont(new Font("Raleway",Font.BOLD,20));
         labelState.setBounds(100,648,200,30);
         add(labelState);

         textSt = new JTextField();
         textSt.setFont(new Font("Raleway",Font.BOLD,20));
         textSt.setBounds(300,650,400,30);
         add(textSt);

         next = new JButton("Next");
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.setBackground(Color.BLACK);
         next.setForeground(Color.white);
         next.setBounds(620,710,80,30);
         next.addActionListener(this);
         add(next);

/// IMPORTANT CONCEPT
         getContentPane().setBackground(new Color(222,255,200));
         setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);



     }

    @Override
    public void actionPerformed(ActionEvent e) {
         String formno = first;
         String name = textName.getText();
         String fname = textFName.getText();
         // HARD TO UNDERSTAND
         String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
         String gender = null;
         if(r1.isSelected()){
             gender= "Male";
         }else if(r2.isSelected()){
             gender ="Female";
         } else if (r3.isSelected()) {
             gender="Other";

         }
         String email = textEmail.getText();
         String marital = null;
        if(rm1.isSelected()){
            marital = "Married";
        }else if(rm2.isSelected()){
            marital = "Unmarried";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textSt.getText();


        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                Con c = new Con();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                c.statement.executeUpdate(q);
//                new Signup2(formno);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();

    }
}
