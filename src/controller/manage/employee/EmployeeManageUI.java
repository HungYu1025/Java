package controller.manage.employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.manage.ManageUI;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class EmployeeManageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeManageUI frame = new EmployeeManageUI();
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
	public EmployeeManageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("新增管理人員");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddEmployeeManageUI aemu = new AddEmployeeManageUI();
				aemu.setVisible(true);
				aemu.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setBounds(100, 50, 125, 35);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("變更管理資訊");
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RenewEmployeeManageUI dem = new RenewEmployeeManageUI();
				dem.setVisible(true);
				dem.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1.setBounds(100, 100, 125, 35);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_3 = new JButton("刪除管理人員");
		btnNewButton_3.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DelEmployeeManageUI dem = new DelEmployeeManageUI();
				dem.setVisible(true);
				dem.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_3.setBounds(225, 50, 125, 35);
		contentPane.add(btnNewButton_3);
		
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
	}

}
