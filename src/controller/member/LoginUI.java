package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.manage.ManageUI;
import model.Employee;
import model.Member;
import service.impl.EmployeeServiceImpl;
import service.impl.MemberServiceImpl;
import util.cal;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
					frame.setVisible(true);
	                frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign In");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 634, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(200, 200, 50, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("密碼");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(200, 250, 50, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JCheckBox chckbxShowPW = new JCheckBox("顯示密碼");
		chckbxShowPW.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		chckbxShowPW.setFocusable(false);
		chckbxShowPW.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			        if (chckbxShowPW.isSelected()) {
			            password.setEchoChar((char) 0);
			        } else {
			            password.setEchoChar('*');
			        }
			    }
			});
		chckbxShowPW.setBounds(470, 252, 95, 23);
		contentPane.add(chckbxShowPW);
		
		JLabel time = new JLabel("");
		time.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setBounds(424, 586, 200, 15);
		contentPane.add(time);
		time.setHorizontalAlignment(JLabel.CENTER);
		Timer timer = new Timer(1000, e -> {
			SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
            String formattedTime = dateFormat.format(new Date());
            time.setText("現在時間: " + formattedTime);
        });
        timer.start();
        
		username = new JTextField();
		username.setFont(new Font("Arial", Font.BOLD, 16));
		username.setBounds(321, 200, 130, 25);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Arial", Font.BOLD, 16));
		password.setBounds(321, 250, 130, 25);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton btnNewButton = new JButton("建立帳戶");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddMemberUI amu = new AddMemberUI();
				amu.setVisible(true);
				amu.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setBounds(225, 375, 100, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("登入");
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e1) {
				String Username = username.getText();
				String Password = String.valueOf(password.getPassword());
				Member m = new MemberServiceImpl().queryMember(Username, Password);
				Employee e = new EmployeeServiceImpl().queryEmployee(Username, Password);
				if (m != null) 
				{
					cal.saveFile("member.txt", m);
					LoginSuccessUI lsu = new LoginSuccessUI();
					lsu.setVisible(true);
					lsu.setLocationRelativeTo(null);
					dispose();
					
				}
				else if (e != null) 
				{
					cal.saveFile("employee.txt", e);
					ManageUI man = new ManageUI();
					man.setVisible(true);
					man.setLocationRelativeTo(null);
					dispose();
					
				}
				else 
				{
					LoginErrorUI leu = new LoginErrorUI();
					leu.setVisible(true);
	                leu.setLocationRelativeTo(null);
					dispose();
				}
				
			}
		});
		btnNewButton_1.setBounds(350, 375, 100, 25);
		contentPane.add(btnNewButton_1);
		
	}
}