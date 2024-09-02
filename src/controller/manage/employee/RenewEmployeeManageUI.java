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

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JScrollPane;
import java.awt.Font;

public class RenewEmployeeManageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable show;
	private JTextField employeeusername;
	private JTextField password;
	private JTextField employeename;
	private JTextField gender;
	private JTextField city;
	private JTextField area;
	private JTextField road;
	private JTextField email;
	private JTextField phone;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RenewEmployeeManageUI frame = new RenewEmployeeManageUI();
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

	public RenewEmployeeManageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 330);
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
	
		employeeusername = new JTextField("請輸入帳號");
		employeeusername.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		employeeusername.setBounds(10, 175, 170, 25);
		contentPane.add(employeeusername);
		employeeusername.setColumns(10);

		employeeusername.addFocusListener(new FocusListener() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (employeeusername.getText().equals("請輸入帳號")) {
		        	employeeusername.setText("");
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        if (employeeusername.getText().isEmpty()) {
		        	employeeusername.setText("請輸入帳號");
		        }
		    }
		});
		
		
		
		password = new JTextField();
		password.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		password.setColumns(10);
		password.setBounds(10, 210, 80, 20);
		contentPane.add(password);
		
		employeename = new JTextField();
		employeename.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		employeename.setColumns(10);
		employeename.setBounds(100, 210, 80, 20);
		contentPane.add(employeename);
		
		gender = new JTextField();
		gender.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		gender.setColumns(10);
		gender.setBounds(190, 210, 80, 20);
		contentPane.add(gender);
		
		city = new JTextField();
		city.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		city.setColumns(10);
		city.setBounds(280, 210, 80, 20);
		contentPane.add(city);
		
		area = new JTextField();
		area.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		area.setColumns(10);
		area.setBounds(370, 210, 80, 20);
		contentPane.add(area);
		
		road = new JTextField();
		road.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		road.setColumns(10);
		road.setBounds(460, 210, 80, 20);
		contentPane.add(road);
		
		email = new JTextField();
		email.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		email.setColumns(10);
		email.setBounds(550, 210, 80, 20);
		contentPane.add(email);
		
		phone = new JTextField();
		phone.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		phone.setColumns(10);
		phone.setBounds(640, 210, 80, 20);
		contentPane.add(phone);
		
		btnNewButton_1 = new JButton("提交修改資料");
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e2) {
				JFrame frame = new JFrame("");
				String Password = password.getText().trim();
				Employee e = new EmployeeDaoImpl().querEmployee(Password);
				if (Password.isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "請輸入密碼", "Error", JOptionPane.ERROR_MESSAGE);
				    return;
				}
				String Employeename = employeename.getText();
				if (Employeename.isEmpty())
				{
					Employeename = null;
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
				
				e.setPassword(Password);
				e.setEmployeename(Employeename);
				e.setGender(Gender);
				e.setCity(City);
				e.setArea(Area);
				e.setRoad(Road);
				e.setEmail(Email);
				e.setPhone(Phone);
				
				new EmployeeDaoImpl().employeepdate(e);
				
				employeeusername.setText("");
		        password.setText("");
		        employeename.setText("");
		        gender.setText("");
		        city.setText("");
		        area.setText("");
		        road.setText("");
		        email.setText("");
		        phone.setText("");
		        
		        JOptionPane.showMessageDialog(frame, "帳號資料已更新", "Success", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1.setBounds(330, 175, 135, 25);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("提取修改帳號");
		btnNewButton_2.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e1) {
				
				String Username = employeeusername.getText();
				Employee e = new EmployeeServiceImpl().queryByUsername(Username);
				if (e != null) 
				{
					password.setText(e.getPassword());
					employeename.setText(e.getEmployeename());
					gender.setText(e.getGender());
					city.setText(e.getCity());
					area.setText(e.getArea());
					road.setText(e.getRoad());
					email.setText(e.getEmail());
					phone.setText(e.getPhone());
				}
				else 
				{
		            JOptionPane.showMessageDialog(contentPane, "查無此帳號", "Error", JOptionPane.ERROR_MESSAGE);
		        }
				
			}
		});
		btnNewButton_2.setBounds(190, 175, 135, 25);
		contentPane.add(btnNewButton_2);
		
		JButton back = new JButton("返回管理介面");
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
		back.setBounds(730, 250, 125, 25);
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