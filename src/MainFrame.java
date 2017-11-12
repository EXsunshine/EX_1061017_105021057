
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private JPanel pan = new JPanel(new GridLayout(3,3));
    private JButton jbl[] = new JButton[9];
    private JTextField tex = new JTextField();
    private LoginFrame log;
    public MainFrame(LoginFrame a){
        init();
        log = a;
        MainFrame.this.setVisible(false);
        log.setVisible(true);
    }
    private void init(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBounds(300,300,600,500);
        tex.setEditable(false);
        this.setLayout(new BorderLayout(1,1));
        this.add(tex,BorderLayout.NORTH);
        this.add(pan,BorderLayout.CENTER);
        MainFrame.this.setVisible(false);
        log.setVisible(true);
        for(int i =0;i<9;i++){
            jbl[i]=new JButton(Integer.toString(i));
            pan.add(jbl[i]);
            jbl[i].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tmp = (JButton)e.getSource();
                    tex.setText(tex.getText()+tmp.getText());
                }
            });
        }


    }


}
