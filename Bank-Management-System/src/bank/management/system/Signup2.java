package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2  extends JFrame implements ActionListener {
    JComboBox comboBox , comboBox2, comboBox3 , comboBox4 , comboBox5;
    JTextField textpan , textaadhar;
    JRadioButton r1, r2 ,r1e,r2e;
    JButton next;

    String formno;
    public Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,05,100,100);
        add(image);
        this.formno=formno;


        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);


        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,130,120,30);
        add(l3);
        // TO GET A DROPDOWN WE USE COMBO BOX
        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setFont(new Font("Raleway",Font.BOLD,18));
        comboBox.setBackground(new Color(234, 76, 252));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);



        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,200,30);
        add(l4);
        // to get DRpDOWN
        String category[]={"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,18));
        comboBox2.setBackground(new Color(234, 76, 252));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);


        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,210,200,30);
        add(l5);
        // to get DRpDOWN
        String Income[]={"NUll","<1,50,000","<2,50,000","<500000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,18));
        comboBox3.setBackground(new Color(234, 76, 252));
        comboBox3.setBounds(350,210,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational Details : ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,260,200,30);
        add(l6);
        // to get DRpDOWN
        String education[]={"Non-Graduate","Graduate","Post-Graduate","Doctorate","Other",};
        comboBox4 = new JComboBox(education);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,18));
        comboBox4.setBackground(new Color(234, 76, 252));
        comboBox4.setBounds(350,260,320,30);
        add(comboBox4);


        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,310,200,30);
        add(l7);
        // to get DRpDOWN
        String occupation[]={"Salaried","Self-employed","Business","Student","Retired","Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,18));
        comboBox5.setBackground(new Color(234, 76, 252));
        comboBox5.setBounds(350,310,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN NO. :-");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,380,200,30);
        add(l8);

         textpan = new JTextField();
         textpan.setFont(new Font("Raleway",Font.BOLD,18));
        textpan.setBounds(350,380,320,30);
        textpan.setBackground(new Color(234, 76, 252));
        add(textpan);

        JLabel l9 = new JLabel("AADHAR NO. :-");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,430,200,30);
        add(l9);

        textaadhar= new JTextField();
        textaadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textaadhar.setBounds(350,430,320,30);
        textaadhar.setBackground(new Color(234, 76, 252));
        add(textaadhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,200,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(234, 76, 252));
        r1.setBounds(350,490,100,30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(234, 76, 252));
        // REMEMBER SOMETIMES THEY JUST OVERLAPP CAUSING NOT APPEARENCE
        // SO BE CAUTION ON DECLARING SIZES
        r2.setBounds(450,490,100,30);
        add(r2);


        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,210,30);
        add(l11);

        r1e = new JRadioButton("Yes");
        r1e.setFont(new Font("Raleway",Font.BOLD,14));
        r1e.setBackground(new Color(234, 76, 252));
        r1e.setBounds(350,540,100,30);
        add(r1e);
        r2e = new JRadioButton("No");
        r2e.setFont(new Font("Raleway",Font.BOLD,14));
        r2e.setBackground(new Color(234, 76, 252));
        r2e.setBounds(450,540,100,30);
        add(r2e);

        JLabel l13 = new JLabel("Form No :-");
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(700,10,100,30);
        add(l13);

        JLabel l14 = new JLabel(formno);
        l14.setFont(new Font("Raleway",Font.BOLD,11));
        l14.setBounds(760,10,100,30);
        add(l14);


        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.YELLOW);
        next.setForeground(Color.BLUE);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

















        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(234, 76, 252));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc =(String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ =(String) comboBox5.getSelectedItem();
        String pan = textpan.getText();
        String aadd = textaadhar.getText();

        String scitizen = " ";
        if(r1.isSelected()){
            scitizen="Yes";
        } else if (r2.isSelected()) {
            scitizen ="NO";
        }

        String eAccount = " ";
        if(r1e.isSelected()){
            eAccount="Yes";
        } else if (r2e.isSelected()) {
            eAccount ="NO";
        }

        try {
            if(textpan.getText().equals("")|| textaadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con c1 = new Con();
                String q = "insert into signuptwo values('"+formno+"', '"+rel+"', '"+cate+"', '"+inc+"', '"+edu+"', '"+occ+"', '"+pan+"', '"+aadd+"', '"+scitizen+"', '"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();


        }


//        String cate = (String) comboBox2.getSelectedItem();
//        String income =(String) comboBox3.getSelectedItem();



    }

    public static void main(String[] args) {

        new Signup2("");
    }
}
