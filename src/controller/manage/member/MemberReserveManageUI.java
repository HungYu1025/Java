package controller.manage.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.impl.ReserveDaoImpl;
import model.Reserve;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MemberReserveManageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable show;
	private JButton back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberReserveManageUI frame = new MemberReserveManageUI();
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

	public MemberReserveManageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 850, 150);
		contentPane.add(scrollPane);

		@SuppressWarnings("serial")
		DefaultTableModel model = new DefaultTableModel(new Object[][] {},
				new String[] { "帳號", "姓名", "年", "月", "日", "時段", "護理", "洗髮", "剪髮", "燙髮", "染髮", "Timestamp" }) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		show = new JTable(model);
		scrollPane.setViewportView(show);

		JButton btnNewButton = new JButton("全部查詢");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReserveDaoImpl rdi = new ReserveDaoImpl();
				List<Reserve> l = rdi.selectAll();
				refreshTable(l);
			}
		});
		btnNewButton.setBounds(750, 175, 100, 25);
		contentPane.add(btnNewButton);
		
		back = new JButton("返回管理介面");
		back.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MemberManageUI mmu = new MemberManageUI();
				mmu.setVisible(true);
				mmu.setLocationRelativeTo(null);
				dispose();
			}
		});
		back.setBounds(730, 225, 125, 25);
		contentPane.add(back);
	}

	private void refreshTable(List<Reserve> l) {
		DefaultTableModel dtm = (DefaultTableModel) show.getModel();
		dtm.setRowCount(0);

		for (Reserve reserve : l) {
			Object[] rowData = { reserve.getUsername(), reserve.getMembername(), reserve.getYear(),
					reserve.getMonth(), reserve.getDate(), reserve.getTime(), reserve.getScalpcare(),
					reserve.getShampoo(), reserve.getHaircut(), reserve.getPerm(), reserve.getHaircoloring(), reserve.getStamp() };
				
			dtm.addRow(rowData);
		}
	}
}