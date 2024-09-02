package controller.manage.employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.impl.EmployeeDaoImpl;
import model.Employee;
import service.impl.EmployeeServiceImpl;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JScrollPane;
import java.awt.Font;

public class DelEmployeeManageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable show;
	private JTextField employeeusername;
	private JButton btnNewButton_2;
	private static EmployeeDaoImpl edi = new EmployeeDaoImpl();
	private JButton back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DelEmployeeManageUI frame = new DelEmployeeManageUI();
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

	public DelEmployeeManageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 850, 150);
		contentPane.add(scrollPane);

		@SuppressWarnings("serial")
		DefaultTableModel model = new DefaultTableModel(new Object[][] {},
				new String[] { "帳號", "密碼", "姓名", "性別", "城市", "區域", "街道", "Email", "電話" }) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		show = new JTable(model);
		scrollPane.setViewportView(show);

		JButton btnNewButton = new JButton("查詢");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EmployeeDaoImpl edi = new EmployeeDaoImpl();
				List<Employee> l = edi.selectAll();
				refreshTable(l);
			}
		});
		btnNewButton.setBounds(750, 175, 100, 25);
		contentPane.add(btnNewButton);

		employeeusername = new JTextField();
		employeeusername.setBounds(10, 175, 170, 25);
		contentPane.add(employeeusername);
		employeeusername.setColumns(10);
		
		btnNewButton_2 = new JButton("刪除");
		btnNewButton_2.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e1) {
				
				String Username = employeeusername.getText();
				Employee e = new EmployeeServiceImpl().queryByUsername(Username);
				if (e != null) 
				{
				    if (!Username.equals("admin"))
				    {
				        edi.delete(Username);
				        JOptionPane.showMessageDialog(contentPane, "帳號已刪除", "", JOptionPane.ERROR_MESSAGE);
				        EmployeeDaoImpl edi = new EmployeeDaoImpl();
						List<Employee> l = edi.selectAll();
						refreshTable(l);
				    }
				    else
				    {
				        JOptionPane.showMessageDialog(contentPane, "此帳號無法刪除", "Error", JOptionPane.ERROR_MESSAGE);
				    }
				}  
				else 
				{
		            JOptionPane.showMessageDialog(contentPane, "查無此帳號", "Error", JOptionPane.ERROR_MESSAGE);
		        }
				
			}
		});
		btnNewButton_2.setBounds(190, 175, 100, 25);
		contentPane.add(btnNewButton_2);
		
		back = new JButton("返回管理介面");
		back.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EmployeeManageUI emu = new EmployeeManageUI();
				emu.setVisible(true);
				emu.setLocationRelativeTo(null);
				dispose();
			}
		});
		back.setBounds(730, 250, 125, 35);
		contentPane.add(back);
	}

	private void refreshTable(List<Employee> l) {
		DefaultTableModel dtm = (DefaultTableModel) show.getModel();
		dtm.setRowCount(0);

		for (Employee employee : l) {
			Object[] rowData = { employee.getEmployeeusername(), employee.getPassword(), employee.getEmployeename(),
					employee.getGender(), employee.getCity(), employee.getArea(), employee.getRoad(),
					employee.getEmail(), employee.getPhone() };
			dtm.addRow(rowData);
		}
	}
}