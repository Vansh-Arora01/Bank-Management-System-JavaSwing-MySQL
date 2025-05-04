package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Cash_withdraw extends JFrame implements ActionListener {
    JTextField  textField;
    JButton b1, b2;
    String pin;
    public Cash_withdraw(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);


        JLabel label2 = new JLabel("MAXIMUM WITHDRAWL IS Rs 10,000 ");
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,180,700,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAWL ");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,220,400,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        textField = new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        textField.setBounds(460,260,320,25);
        l3.add(textField);


        b1= new JButton("WITHDRAWL");
        b1.setFont(new Font("Raleway", Font.BOLD,16));
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2= new JButton("BACK");
        b2.setFont(new Font("Raleway", Font.BOLD,16));
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
          try{
            String amount= textField.getText();
            Date date = new Date();

            if(textField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"PLease enter the Amount you want to Withdraw");

            }else {
                Con c = new Con();
                String q = "select * from bank where pin = '"+pin+"'";


                ResultSet resultSet = c.statement.executeQuery(q);
                int balance =0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance-=Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if (balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"' ,'"+date+"','Cash_withdraw','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs "+amount+"Debitted Successfully");
                setVisible(false);
                new Main_class(pin);
            }
           }catch (Exception E){
            E.printStackTrace();
           }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new Main_class(pin);

        }

    }

    public static void main(String[] args) {
        new Cash_withdraw("");


    }
}
