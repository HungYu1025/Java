package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MemberUI;
import dao.impl.MemberDaoImpl;
import model.Member;
import util.cal;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class LoginSuccessUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static MemberDaoImpl mdi = new MemberDaoImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSuccessUI frame = new LoginSuccessUI();
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
	public LoginSuccessUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel memberShow = new JLabel("");
		memberShow.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		memberShow.setHorizontalAlignment(SwingConstants.RIGHT);
		memberShow.setBounds(0, 100, 317, 50);
		contentPane.add(memberShow);
		
		JLabel lblNewLabel_1 = new JLabel("　您好");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(317, 100, 317, 50);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("帳戶資訊");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MemberUI mu = new MemberUI();
				mu.setVisible(true);
				mu.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setBounds(192, 196, 125, 35);
		contentPane.add(btnNewButton);
					
		Object o = cal.readFile("member.txt");
		Member m = (Member) o;
		mdi.memberupdate(m);
		memberShow.setText(m.getMembername());
		
		JButton btnNewButton_1 = new JButton("預約服務");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ReserveUI ru = new ReserveUI();
				ru.setVisible(true);
				ru.setLocationRelativeTo(null);
				dispose();
				
			}
		});
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));

		btnNewButton_1.setBounds(317, 196, 125, 35);
		contentPane.add(btnNewButton_1);
	}
}