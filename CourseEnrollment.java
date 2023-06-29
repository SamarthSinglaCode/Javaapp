import javax.swing.*;
import java.awt.event.*;

class CourseEnrollment extends ExtraActivities implements ActionListener{

    int num, fees = 60000, Confirmation;
    JFrame JFCourse;
    JPanel Cpanel;
    JLabel Cname, prof;
    JTextField textname, textprof ;
    String options;
    JComboBox<String> Ccourselist;
    JComboBox<String> Cproflist;
    JButton Submit, ok;
    JButton confirm = new JButton("Confirm");
    String courseoptions;
    String profoptions;

    static String view, pro;


    void GUI(){
        JFCourse = new JFrame("University of the Fraser Valley");
        Cpanel = new JPanel();

        Cname = new JLabel("Select Course: ");
        String[] courseoptions = {" ","COMP 155 - Object Oriented Programming", "COMP 150 - Introduction to Programming",
         "Math 125 - Discrete mathematics", "CIS 192 - Introduction to Networking", "BUS 100 - Introduction to Business"};
        Ccourselist = new JComboBox<>(courseoptions);

        // view = (String)Ccourselist.getSelectedItem().toString();

        prof = new JLabel("Select Professor: ");
        String[] profoptions = {" ","Sunil Dhawan","Aseem Raj Kaur                          ","Puneet Sharma", "Preet Kamal", "Giacomo Mengucci"};
        Cproflist = new JComboBox<>(profoptions);

        ok = new JButton("OK");
        ok.addActionListener(this);

        Submit = new JButton("Enroll");
        Submit.addActionListener(this);

        Cpanel.add(Cname);
        Cpanel.add(Ccourselist);
        Cpanel.add(ok);
        // Cpanel.add(prof);
        // Cpanel.add(Cproflist);
        // Cpanel.add(Submit);
        JFCourse.add(Cpanel);
        JFCourse.setVisible(true);
        JFCourse.setSize(390, 300);
        JFCourse.setResizable(false);
    }
    // void Info(){
    //     try{
    //     num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of courses you want to Enroll (Max 5): "));
    //         if(num > 5){
    //             JOptionPane.showMessageDialog(null,"Can't choose more than 5 courses");
    //             JFCourse.dispose();           
    //         }
    //     }
    //     catch(NumberFormatException e){
    //     JOptionPane.showMessageDialog(null,"Invalid Input");
    //     JFCourse.dispose();
    //     }
    // }
    
        void paydues(){
            // fees = fees * num;
                JOptionPane.showMessageDialog(null,"Total Payable amount: "+ fees);
            try{
                Confirmation = Integer.parseInt(JOptionPane.showInputDialog("To confirm your payment, Press 1: "+fees));
                    
                    if(Confirmation == 1){
                        JOptionPane.showMessageDialog(null,"Payment of Rs " + fees + " succesfull!");
                        }else{
                            JFCourse.dispose();
                        }
            }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Kindly choose correct option!");
                        JFCourse.dispose();
                    }
        }


    public void actionPerformed(ActionEvent e) {
    if (e.getSource()== Submit){
        // courseoptions = (String)Ccourselist.getSelectedItem();
        // profoptions = (String)Cproflist.getSelectedItem();
        JOptionPane.showMessageDialog(null,"Enrolled!" + "\nCourse: " + view + " \nProfessor: " + pro);
        JFCourse.dispose();
    }

    if(e.getSource() == ok){
        String chk = (String)Ccourselist.getSelectedItem().toString();
        
        
        if( chk == "COMP 155 - Object Oriented Programming"){
            view = chk;
            String[] prof155 = {"Sunil Dhawan                                   ", "Aseem Raj Kaur", "Preet Kamal"};
            JComboBox plist155 = new JComboBox<>(prof155);
            pro = plist155.getSelectedItem().toString();
            Cpanel.add(prof);
            Cpanel.add(plist155);
            Cpanel.add(Submit);
            JFCourse.add(Cpanel);
            Cpanel.remove(ok);
            paydues();
            JFCourse.setVisible(true);
        }
        else if(chk == "COMP 150 - Introduction to Programming"){
            view = chk;
            String[] prof150 = {"Deepinder kaur                                 ", "Preet Kamal"};
            JComboBox plist150 = new JComboBox<>(prof150);
            pro = plist150.getSelectedItem().toString();
            Cpanel.add(prof);
            Cpanel.add(plist150);
            JFCourse.add(Cpanel);
            Cpanel.add(Submit);
            Cpanel.remove(ok);
            paydues();
            JFCourse.setVisible(true);
        }
        else if(chk == "Math 125 - Discrete mathematics"){
            view = chk;
            String[] prof124 = {"Puneet Sharma                               ", "Manoj Sharma"};
            JComboBox plist124 = new JComboBox<>(prof124);
            pro = plist124.getSelectedItem().toString();
            Cpanel.add(prof);
            Cpanel.add(plist124);
            Cpanel.add(Submit);
            JFCourse.add(Cpanel);
            Cpanel.remove(ok);
            paydues();
            JFCourse.setVisible(true);
        }
        else if(chk == "CIS 192 - Introduction to Networking"){
            view = chk;
            String[] prof190 = {"Sunil Dhawan                                ", "Amit Sharma"};
            JComboBox plist190 = new JComboBox<>(prof190);
            pro = plist190.getSelectedItem().toString();
            Cpanel.add(prof);
            Cpanel.add(plist190);
            Cpanel.add(Submit);
            Cpanel.remove(ok);
            JFCourse.add(Cpanel);
            paydues();
            JFCourse.setVisible(true);
        }
        else if(chk == "BUS 100 - Introduction to Business"){
            view = chk;
             String[] prof100 = {"Giacomo Mengucci                                  ","Olga"};
            JComboBox plist100 = new JComboBox<>(prof100);
            pro = plist100.getSelectedItem().toString();
            Cpanel.add(prof);
            Cpanel.add(plist100);
            Cpanel.add(Submit);
            Cpanel.remove(ok);
            JFCourse.add(Cpanel);
            paydues();
            JFCourse.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Select a Course!");
        }
    }
}

    public static void main(String args[]){
        CourseEnrollment s1 = new CourseEnrollment();
        // s1.Info();
        s1.GUI();
        // s1.paydues();

        // CourseEnrollment s[] = new CourseEnrollment[5];
        //     for(int i=1; i<=s1.num; i++){
        //     s[i] = new CourseEnrollment();
        //              s[i].GUI();
        //     }
    }
}
