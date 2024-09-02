package controller.manage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.manage.employee.EmployeeManageUI;
import controller.manage.member.MemberManageUI;
import controller.member.LoginUI;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class ManageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageUI frame = new ManageUI();
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
	public ManageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("員工管理");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EmployeeManageUI emu = new EmployeeManageUI();
				emu.setVisible(true);
				emu.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setBounds(100, 75, 125, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("會員管理");
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MemberManageUI mmu = new MemberManageUI();
				mmu.setVisible(true);
				mmu.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1.setBounds(225, 75, 125, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("登出");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginUI lu = new LoginUI();
				lu.setVisible(true);
				lu.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton_2.setBounds(100, 150, 250, 35);
		contentPane.add(btnNewButton_2);
	}
}
