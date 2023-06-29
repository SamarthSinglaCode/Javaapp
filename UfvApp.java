import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class UfvApp extends ALogin{

    Scanner in = new Scanner(System.in);
    JFrame jf;
    JPanel p1;
    JLabel SnoLabel, onetpl;
    JTextField SnoField, onetpf;
    JButton chk,OTP,login;
    ArrayList<String> snol = new ArrayList<String>();
    // Map <Integer,> view = new HashMap<>();
    String stdno;
    int printstdno, size=6;
    String otp;
    int otpchk;

    static String n;
    
    void arrlist(){
        snol.add("300206070");
        snol.add("300206071");
        snol.add("300206072");
        snol.add("300206073");
        snol.add("300206074");
        snol.add("300206075");
    }


    void mainframe(){
        jf = new JFrame("Uiniversity of Fraser Valley");
        p1 = new JPanel();
        
        arrlist();
        login();
        // file();
        jf.setSize(310, 300);
        jf.setResizable(false);
        jf.add(p1);
        jf.setVisible(true);
    }

    void login(){

        SnoLabel = new JLabel("Student No: ");
        p1.add(SnoLabel);

        SnoField = new JTextField(10);
        p1.add(SnoField);

        chk = new JButton("Check");
        p1.add(chk);

        chk.addActionListener(this);

        onetpl = new JLabel("Enter OTP: ");
        onetpf = new JTextField(10);

        login = new JButton("LOGIN");
        login.addActionListener(this);

        OTP = new JButton("OTP");
        OTP.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == chk){
            stdno = SnoField.getText();
            n = stdno;
            boolean chk = snol.contains(stdno);

            if(chk == true){
                JOptionPane.showMessageDialog(null,"User Found!");
                p1.add(onetpl);
                p1.add(onetpf);
                p1.add(OTP);
                p1.add(login);
                jf.add(p1);
                jf.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"User not Found!");
            }
        }

        if(e.getSource() == OTP){
            otpgen();
        }

        if(e.getSource() == login){
            if(Integer.parseInt(onetpf.getText()) == otpchk){
                aloginframe();
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid OTP!");
            }
        }
        if(e.getSource() == EIC){
            CourseEnrollment s1 = new CourseEnrollment();
            // s1.Info();
            // s1.paydues();
            s1.GUI();
            
            // CourseEnrollment s[] = new CourseEnrollment[5];
            // for(int i=1; i<=s1.num; i++){
            // s[i] = new CourseEnrollment();
            //          s[i].GUI();
            // }
        }

        if(e.getSource() == EA){
        details abc=new details();
        abc.select();
        }

        if(e.getSource() == V){
            CourseEnrollment s1 = new CourseEnrollment();
            details abc=new details();
            JOptionPane.showMessageDialog(null,"Course: " + s1.view + " \nProfessor: " + s1.pro  +" \nActivity: " + abc.a + 
            " \nTimings: " + abc.t);
        }

        if(e.getSource() == AUFV){
            abt();
        }

        if(e.getSource() == lout){
            UfvApp u1 = new UfvApp();
            u1.mainframe();
        }
    }


    void otpgen(){
        otp = generateOTP(6);
        JOptionPane.showMessageDialog(null,"OTP: " + otp);
        otpchk = Integer.parseInt(otp);
    }
        public static String generateOTP(int length) {
        String digits = "0123456789";
        Random random = new Random();

        StringBuilder otpBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(digits.length());
            char digit = digits.charAt(index);
            otpBuilder.append(digit);
        }
        return otpBuilder.toString();
    }


    public static void main(String[] args){
        UfvApp u1 = new UfvApp();
        u1.mainframe();
    }
}