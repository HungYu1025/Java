package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.ReserveDaoImpl;
import model.Reserve;
import util.cal;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class ServiceItemUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JComboBox<String> shampoo;
    private JComboBox<String> haircut;
    private JComboBox<String> perm;
    private JComboBox<String> haircoloring;
    private JComboBox<String> scalpcare;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ServiceItemUI frame = new ServiceItemUI();
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
    public ServiceItemUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabe1 = new JLabel("頭皮護理");
        lblNewLabe1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        lblNewLabe1.setBounds(125, 50, 100, 25);
        contentPane.add(lblNewLabe1);

        JLabel lblNewLabe2 = new JLabel("洗髮");
        lblNewLabe2.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        lblNewLabe2.setBounds(125, 100, 100, 25);
        contentPane.add(lblNewLabe2);

        JLabel lblNewLabe3 = new JLabel("剪髮");
        lblNewLabe3.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        lblNewLabe3.setBounds(125, 150, 100, 25);
        contentPane.add(lblNewLabe3);

        JLabel lblNewLabe4 = new JLabel("染髮");
        lblNewLabe4.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        lblNewLabe4.setBounds(125, 200, 100, 25);
        contentPane.add(lblNewLabe4);

        JLabel lblNewLabe5 = new JLabel("燙髮");
        lblNewLabe5.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        lblNewLabe5.setBounds(125, 250, 100, 25);
        contentPane.add(lblNewLabe5);
        
        scalpcare = new JComboBox<String>();
        scalpcare.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        scalpcare.addItem("請選擇");
        scalpcare.addItem("頭皮保養");
        scalpcare.setBounds(225, 50, 100, 25);
        contentPane.add(scalpcare);

        shampoo = new JComboBox<String>();
        shampoo.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        shampoo.addItem("請選擇");
        shampoo.addItem("基礎洗髮");
        shampoo.addItem("SPA洗髮");
        shampoo.setBounds(225, 100, 100, 25);
        contentPane.add(shampoo);

        haircut = new JComboBox<String>();
        haircut.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        haircut.addItem("請選擇");
        haircut.addItem("剪瀏海");
        haircut.addItem("造型剪髮");
        haircut.setBounds(225, 150, 100, 25);
        contentPane.add(haircut);

        perm = new JComboBox<String>();
        perm.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        perm.addItem("請選擇");
        perm.addItem("局部瀏海燙髮");
        perm.addItem("局部髮根燙");
        perm.addItem("溫塑燙髮");
        perm.addItem("質感溫塑燙髮");
        perm.addItem("特殊燙髮");
        perm.setBounds(225, 200, 100, 25);
        contentPane.add(perm);

        haircoloring = new JComboBox<String>();
        haircoloring.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        haircoloring.addItem("請選擇");
        haircoloring.addItem("單色染髮");
        haircoloring.addItem("雙色染髮");
        haircoloring.addItem("手刷染髮");
        haircoloring.addItem("特殊染髮");
        haircoloring.addItem("補染髮根");
        haircoloring.setBounds(225, 250, 100, 25);
        contentPane.add(haircoloring);
        
        Reserve re = (Reserve) cal.readFile("reserve.txt");
        
        
        JButton btnNewButton = new JButton("確認");
        btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	JFrame frame = new JFrame("");
            	
                String selectedScalpcare = scalpcare.getSelectedItem().equals("請選擇") ? null : (String) scalpcare.getSelectedItem();
                String selectedShampoo = shampoo.getSelectedItem().equals("請選擇") ? null : (String) shampoo.getSelectedItem();
                String selectedHaircut = haircut.getSelectedItem().equals("請選擇") ? null : (String) haircut.getSelectedItem();
                String selectedPerm = perm.getSelectedItem().equals("請選擇") ? null : (String) perm.getSelectedItem();
                String selectedHaircoloring = haircoloring.getSelectedItem().equals("請選擇") ? null : (String) haircoloring.getSelectedItem();

                if (selectedScalpcare == null && selectedShampoo == null && selectedHaircut == null && selectedPerm == null && selectedHaircoloring == null) {
                    JOptionPane.showMessageDialog(null, "您尚未選擇任何服務項目", "錯誤", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Reserve reserve = new Reserve();
                reserve.setScalpcare(selectedScalpcare);
                reserve.setShampoo(selectedShampoo);
                reserve.setHaircut(selectedHaircut);
                reserve.setPerm(selectedPerm);
                reserve.setHaircoloring(selectedHaircoloring);

                reserve.merge(re);

                new ReserveDaoImpl().addAll(reserve);
                
                cal.saveFile("reserve.txt", reserve);
                
                JOptionPane.showMessageDialog(frame, "預約成功", "", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        });
        btnNewButton.setBounds(235, 331, 125, 25);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("重新選擇時段");
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
        btnNewButton_1.setBounds(99, 331, 125, 25);
        contentPane.add(btnNewButton_1);
    }
}
