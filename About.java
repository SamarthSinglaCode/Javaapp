import javax.swing.*;
import java.awt.*;


public class About extends JFrame {
    JFrame fab;
    JLabel head;
    JPanel p1;
    JTextArea description;
    JScrollPane scrll;
    void abt(){
        fab=new JFrame("About UFV");
        p1=new JPanel();
        ImageIcon icon=new ImageIcon("D:\\Fraser Valley\\Summer 23\\COMP 155\\ZZ Project\\UFV\\src\\ufv.png");
        fab.setIconImage(icon.getImage());
        fab.add(p1);

        head=new JLabel("About");
        head.setVerticalAlignment(SwingConstants.TOP);
        head.setHorizontalAlignment(SwingConstants.CENTER);

        Font font=new Font("Times New Roman",Font.BOLD,24);
        head.setFont(font);
        head.setBorder(BorderFactory.createEmptyBorder(50,200,0,0));

        description=new JTextArea();
        description.setText("University of the Fraser Valley (UFV) is a fully accredited Canadian public university that enrolls  " +
                "approximately 15,000 students per year. UFV has campuses and locations in Abbotsford, Chilliwack, Mission,  " +
                "Hope, and Chandigarh, India. UFV strives to be a place of learning that recognizes, respects and includes indigenous " +
                "ways of knowing. The genesis of Fraser Valley India lies in the prominent representation of a huge Indian diaspora , especially  " +
                " from Punjab, in Canada. Canada has been an aspirational place to study, work, and live for the Indian community for decades.\n \t Formal discussions began in 2003 between Panjab University," +
                " Chandigarh, and University College of the Fraser Valley (as it was then known) " +
                "on educational collaborations. This resulted in an MoU in 2004, which included ex" +
                "ploration of curriculum development and faculty and student exchange. It was also at" +
                " this time that the idea of delivering UFV academic programs in India took shape, and" +
                " in 2006, UFV and Goswami Ganesh Dutta Sanatan Dharma College (GGD SD College), located " +
                "in Chandigarh, and affiliated with Panjab University, signed an agreement to deliver the " +
                "Bachelor of Business Administration (BBA) program to Indian students at SD College. Since then, " +
                "Fraser Valley India has grown from strength to strength. The students and their parents see immense " +
                "value in starting in India and taking a campus transfer to UFV Canada after their first, second, or third " +
                "year of education. Students stay closer to their home at a time when they have just come out of high school" +
                " and get acquainted with an " +
                "applied education taught by an eclectic mix of Canadian and Indian faculty while absorbing the " +
                "social-cultural nuances of another world. The fourteen-year long journey of Fraser Valley India has" +
                " paid off well. The students, current and graduated, are our biggest referral. We have added more programs " +
                "in the areas of computer information systems (leading to" +
                " Canadian BCIS degree), humanities (leading to Canadian BA), " +
                "and a graduate studies pathway program (MPBC). \n \tCanada and India have " +
                "a long-lasting bilateral relationship built upon shared traditions of democracy" +
                " and an Indian diaspora of more than one million in Canada." +
                " Since 2006, UFV’s location in India has been an important place to visit" +
                " on Canada’s national and provincial trade missions. Dignitaries including the Canadian " +
                "Minister of International Trade and the Premiere of British Columbia have been proudly hosted" +
                " at Fraser Valley India. Immense pride is taken in the fact that Fraser Valley India proudly hoists" +
                " Canadian flag in the Indian education landscape.");


        description.setEditable(false);
        description.setLineWrap(true);
        description.setWrapStyleWord(true);

        scrll=new JScrollPane(description);
        scrll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        description.setBorder(BorderFactory.createEmptyBorder(40,30,20,30));
        JPanel panel=new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
        panel.add(head);
        panel.add(scrll);
        fab.getContentPane().add(panel);



        fab.setSize(500,500);
        fab.setResizable(false);
        fab.setVisible(true);
        fab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        About abc=new About();
        abc.abt();
    }
}
