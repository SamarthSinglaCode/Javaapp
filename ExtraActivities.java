import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
public class ExtraActivities extends About {
    public static void main(String[] args) {
    details abc=new details();
    abc.select();
    }
}
class details extends JFrame implements ActionListener{
    JFrame frame;
    JPanel p1,p2;
    JButton enrl;
    JLabel activity,time;
    JComboBox ComBoA,ComBoT;

    static String a,t;

        String arr[]={"(none)","Sports Club","Toastmasters Club ","Debate CLub","Gaming Club ","Impresario  ","Metanoia (Theatre) Club ",};
        String tym[]={"(none)"," 9:00 - 11:00"," 12:00 - 2:00                               "," 3:00 - 5:00"};
    void select(){
        frame=new JFrame();
        p1=new JPanel();
        frame.add(p1);




        activity=new JLabel("Extra Activities: ");
        ComBoA=new JComboBox<>(arr);


        time=new JLabel("Timeline");
        ComBoT=new JComboBox<>(tym);

        enrl=new JButton("Enroll");


        p1.add(activity);
        p1.add(ComBoA);
        p1.add(time);
        p1.add(ComBoT);
        p1.add(enrl);

        ComBoA.addActionListener(this);
        ComBoT.addActionListener(this);
        enrl.addActionListener(this);

        p1.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("Extra Activities");
        frame.setSize(310,300);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()==enrl){
        String activities=(String) ComBoA.getSelectedItem();
        a = activities;
        String timeline=(String) ComBoT.getSelectedItem();
        t = timeline;
        JOptionPane.showMessageDialog(null,"Extra Activities: "+ activities+"\nTimeline: "+ComBoT.getSelectedItem()
        +"\n Enrolled");
        file();
        frame.dispose();
    }
    }

     void file(){
        String fname = "UFV.txt";

        try{
        File f = new File(fname);
        if (!f.exists()) 
        f.createNewFile();
        FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
        // FileWriter fw = new FileWriter(fname, true);
        details abc=new details();
        CourseEnrollment s1 = new CourseEnrollment();
        UfvApp u1 = new UfvApp();
            fw.write("Student No: " + u1.n + " Course: " + s1.view +" Professor: " + s1.pro  + "\n          Activity: " + abc.a + 
            " Timings: " + abc.t + "\n");
            fw.close();
        }
        catch(Exception ex){

        }
    }
}