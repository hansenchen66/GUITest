import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Test {

    private JFrame frame;
    private JTextField txtGreetingsUser;
    private JTextField textField;
    static private ArrayList<String> username = new ArrayList<String>();
    static private ArrayList<String> password = new ArrayList<String>();
    private JButton btnRegister;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Test window = new Test();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Test() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JButton btnStart = new JButton("Log in");
        btnStart.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                if(loginCheck(txtGreetingsUser.getText(),textField.getText())){
                    JOptionPane.showMessageDialog(null, "Login Sucess");
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Username or password");
                }
            }
        });
        btnStart.setBounds(172, 99, 97, 25);
        frame.getContentPane().add(btnStart);
        
        txtGreetingsUser = new JTextField();
        txtGreetingsUser.setBounds(153, 36, 116, 22);
        frame.getContentPane().add(txtGreetingsUser);
        txtGreetingsUser.setColumns(10);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(83, 39, 58, 16);
        frame.getContentPane().add(lblUsername);
        
        JLabel lblPassword = new JLabel("password");
        lblPassword.setBounds(83, 73, 58, 16);
        frame.getContentPane().add(lblPassword);
        
        textField = new JTextField();
        textField.setBounds(153, 70, 116, 22);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        btnRegister = new JButton("Register");
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String newUserName = JOptionPane.showInputDialog("New Login: ");
                username.add(newUserName);
                String newPassword = JOptionPane.showInputDialog("New Password: ");
                password.add(newPassword);
            }
        });
        btnRegister.setBounds(172, 137, 97, 25);
        frame.getContentPane().add(btnRegister);
    }
    private boolean loginCheck(String Uname,String pWord){
        boolean foundname = false;
        boolean foundpass = false;
        for(int i =0;i<username.size();i++){
            if (username.get(i).equals(Uname)){
                foundname = true;
            }
        }
        for(int j =0;j<password.size();j++){
            if (username.get(j).equals(Uname)){
                foundpass = true;
            }
        }
        if (foundname == true && foundpass == true){
            return true;
        }else{
            return false;
        }
    }
}
