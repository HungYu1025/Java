package controller.manage.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.EmployeeDaoImpl;
import dao.impl.MemberDaoImpl;
import model.Employee;
import model.Member;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class AddMemberManageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	private JTextField membername;
	private JTextField gender;
	private JTextField city;
	private JTextField area;
	private JTextField road;
	private JTextField email;
	private JTextField phone;
	private JButton enter;
	private JButton back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMemberManageUI frame = new AddMemberManageUI();
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
	public AddMemberManageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("會員帳號");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel.setBounds(100, 50, 75, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("會員密碼");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_1.setBounds(100, 100, 75, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("姓名");
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_2.setBounds(100, 150, 75, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("性別");
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_3.setBounds(100, 200, 75, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("住址");
		lblNewLabel_3_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(100, 250, 75, 25);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Email");
		lblNewLabel_3_2.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_3_2.setBounds(100, 350, 67, 26);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("電話");
		lblNewLabel_3_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_3_2_1.setBounds(100, 400, 67, 26);
		contentPane.add(lblNewLabel_3_2_1);
		
		username = new JTextField();
		username.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		username.setBounds(225, 50, 150, 25);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		password.setColumns(10);
		password.setBounds(225, 100, 150, 25);
		contentPane.add(password);
		
		membername = new JTextField();
		membername.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		membername.setColumns(10);
		membername.setBounds(225, 150, 150, 25);
		contentPane.add(membername);
		
		gender = new JTextField();
		gender.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		gender.setColumns(10);
		gender.setBounds(225, 200, 150, 25);
		contentPane.add(gender);
		
		city = new JTextField();
		city.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		city.setColumns(10);
		city.setBounds(225, 250, 70, 25);
		contentPane.add(city);
		
		area = new JTextField();
		area.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		area.setColumns(10);
		area.setBounds(305, 250, 70, 25);
		contentPane.add(area);
		
		road = new JTextField();
		road.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		road.setColumns(10);
		road.setBounds(225, 300, 150, 25);
		contentPane.add(road);
		
		email = new JTextField();
		email.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		email.setColumns(10);
		email.setBounds(225, 350, 150, 25);
		contentPane.add(email);
		
		phone = new JTextField();
		phone.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		phone.setColumns(10);
		phone.setBounds(225, 400, 150, 25);
		contentPane.add(phone);
		
		enter = new JButton("確認送出");
		enter.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e1) {
				JFrame frame = new JFrame("");
				String Username = username.getText().trim();
				if (Username.isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "請輸入帳號", "Error", JOptionPane.ERROR_MESSAGE);
				    return;
				}
				Member m = new MemberDaoImpl().querMember(Username);
				Employee e = new EmployeeDaoImpl().querEmployee(Username);
				if (m != null)
				{
					JOptionPane.showMessageDialog(frame, "此帳號已使用，請使用其它帳號", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else if (e != null)
				{
					JOptionPane.showMessageDialog(frame, "此帳號已使用，請使用其它帳號", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else 
				{
					String Password = password.getText().trim();
					if (Password.isEmpty())
					{
						JOptionPane.showMessageDialog(frame, "請輸入密碼", "Error", JOptionPane.ERROR_MESSAGE);
					    return;
					}
					String Membername = membername.getText();
					if (Membername.isEmpty())
					{
						Membername = null;
					}
					String Gender = gender.getText();
					if (Gender.isEmpty())
					{
						Gender = null;
					}
					String City = city.getText();
					if (City.isEmpty())
					{
						City = null;
					}
					String Area = area.getText();
					if (Area != null && !Area.isEmpty())
					{
						Area = null;
					}
					String Road = road.getText();
					if (Road.isEmpty())
					{
						Road = null;
					}
					String Email = email.getText();
					if (Email.isEmpty())
					{
						Email = null;
					}
					String Phone = phone.getText();
					if (Phone.isEmpty())
					{
						Phone = null;
					}
					Member mr = new Member(Username,Password,Membername,Gender,City,Area,Road,Email,Phone);
					new MemberDaoImpl().add(mr);
					
					username.setText("");
			        password.setText("");
			        membername.setText("");
			        gender.setText("");
			        city.setText("");
			        area.setText("");
			        road.setText("");
			        email.setText("");
			        phone.setText("");
			        
			        JOptionPane.showMessageDialog(frame, "帳號已新增", "Success", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		enter.setBounds(300, 500, 125, 35);
		contentPane.add(enter);
		
		back = new JButton("返回管理介面");
		back.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MemberManageUI mmu = new MemberManageUI();
				mmu.setVisible(true);
				mmu.setLocationRelativeTo(null);
				dispose();
			}
		});
		back.setBounds(100, 500, 125, 35);
		contentPane.add(back);
	}
}
