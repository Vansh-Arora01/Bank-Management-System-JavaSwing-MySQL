package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    String pin;

    JButton b1 , b2, b3, b4, b5, b6 ,b7;
    public FastCash(String pin ){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);


        JLabel l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(445,180,700,35);
        l1.setForeground(Color.WHITE);
        l3.add(l1);

        b1 = new JButton("Rs. 100");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(410,272,150,35);
        b1.addActionListener(this);
//        b1.setFont(new Font("System",Font.BOLD,16) );
        l3.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(700,272,150,35);
        b2.addActionListener(this);
//        b2.setFont(new Font("System",Font.BOLD,16) );
        l3.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.WHITE);
        b3.setBounds(410,320,150,35);
        b3.addActionListener(this);
//        b3.setFont(new Font("System",Font.BOLD,16) );
        l3.add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.WHITE);
        b4.setBounds(700,318,150,35);
        b4.addActionListener(this);
//        b3.setFont(new Font("System",Font.BOLD,16) );
        l3.add(b4);

        b5 = new JButton("Rs. 5000");
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.WHITE);
        b5.setBounds(410,365,150,35);
        b5.addActionListener(this);
//        b3.setFont(new Font("System",Font.BOLD,16) );
        l3.add(b5);

        b6 = new JButton("Rs. 10,000");
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.WHITE);
        b6.setBounds(700,365,150,35);
        b6.addActionListener(this);
//        b3.setFont(new Font("System",Font.BOLD,16) );
        l3.add(b6);

        b7 = new JButton("BACK");
        b7.setBackground(new Color(65,125,128));
        b7.setForeground(Color.WHITE);
        b7.setBounds(410,410,150,35);
        b7.addActionListener(this);
//        b3.setFont(new Font("System",Font.BOLD,16) );
        l3.add(b7);




        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b7){
            setVisible(false);
            new Main_class(pin);
        }
        else {
            // BECAUSE E.GETSOURCE RETURN A NOBJECT THAT'S WHY WE HAV TO WRITE JButton
            String amount =( (JButton) e.getSource()).getText().substring(4);
            Con c = new Con();
            Date date = new Date();

            try{
                ResultSet resultSet= c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
                int balance =0 ;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(resultSet.getString("amount"));

                    }else {
                        balance-=Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if(e.getSource()!=b7 && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"INSUFFICIENT BALANCE ");
                    return;
                }
                c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"AMOUNT IS DEBITTED " + "RS. " +amount);

            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new Main_class(pin);
        }


    }

    public static void main(String[] args) {
        new FastCash("");

    }
}
