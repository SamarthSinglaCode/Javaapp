import java.awt.Dimension;
import java.util.*;
import javax.swing.*;

import org.w3c.dom.css.Counter;

import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ALogin extends CourseEnrollment implements ActionListener {
    JFrame al = new JFrame("University of Fraser Valley");
    JPanel alp = new JPanel();
    JButton EIC = new JButton("Enroll In Course");
    JButton EA = new JButton("Extra Activities");
    JButton V = new JButton("View");
    JButton AUFV = new JButton("About UFV");
    JLabel welc = new JLabel("                  Welcome to UFV!                   " );
    JButton lout = new JButton("Logout!");
    

    void aloginframe(){
        al.add(alp);
        
        alp.add(welc);
        EIC.setPreferredSize(new Dimension(150,50));
        alp.add(EIC);
        EIC.addActionListener(this);

        EA.setPreferredSize(new Dimension(150, 50));
        alp.add(EA);
        EA.addActionListener(this);

        V.setPreferredSize(new Dimension(150, 50));
        alp.add(V);
        V.addActionListener(this);

        AUFV.setPreferredSize(new Dimension(150, 50));
        alp.add(AUFV);
        AUFV.addActionListener(this);

        lout.setPreferredSize(new Dimension(150, 50));
        alp.add(lout);
        lout.addActionListener(this);

        al.setVisible(true);
        al.setSize(310,350);
        al.setResizable(false);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == EIC){
            CourseEnrollment s1 = new CourseEnrollment();
            // s1.Info();
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
    public static void main(String[] args){
        ALogin a = new ALogin();
        a.aloginframe();
    }
}
