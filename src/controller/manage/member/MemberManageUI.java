package controller.manage.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.manage.ManageUI;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class MemberManageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberManageUI frame = new MemberManageUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MemberManageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("新增會員資料");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddMemberManageUI aemu = new AddMemberManageUI();
				aemu.setVisible(true);
				aemu.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setBounds(100, 50, 125, 35);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("變更會員資訊");
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RenewMemberManageUI dem = new RenewMemberManageUI();
				dem.setVisible(true);
				dem.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1.setBounds(225, 50, 125, 35);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_3 = new JButton("刪除會員資料");
		btnNewButton_3.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DelMemberManageUI dem = new DelMemberManageUI();
				dem.setVisible(true);
				dem.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_3.setBounds(100, 100, 125, 35);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_3_2 = new JButton("查詢預約資料");
		btnNewButton_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MemberReserveManageUI mrmu = new MemberReserveManageUI();
				mrmu.setVisible(true);
				mrmu.setLocationRelativeTo(null);
				dispose();
			}
		});

		JButton btnNewButton_3_1 = new JButton("返回管理介面");
		btnNewButton_3_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManageUI mu = new ManageUI();
				mu.setVisible(true);
				mu.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_3_1.setBounds(100, 150, 250, 35);
		contentPane.add(btnNewButton_3_1);

		btnNewButton_3_2.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton_3_2.setBounds(225, 100, 125, 35);
		contentPane.add(btnNewButton_3_2);
	}

}
