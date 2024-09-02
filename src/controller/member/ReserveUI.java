package controller.member;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import model.Reserve;
import util.cal;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ReserveUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JComboBox<String> year;
    private JComboBox<String> month;
    private JComboBox<String> date;
    private JComboBox<String> time;
    private JButton btnNewButton;
    private JLabel membername;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ReserveUI frame = new ReserveUI();
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
    public ReserveUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        year = new JComboBox<String>();
        year.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        year.addItem("請選擇時間");
        year.addItem("2024");
        year.setBounds(61, 110, 100, 25);
        contentPane.add(year);

        month = new JComboBox<String>();
        month.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        month.setBounds(171, 110, 100, 25);
        contentPane.add(month);
        month.setEnabled(false);

        date = new JComboBox<String>();
        date.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        date.setBounds(281, 110, 100, 25);
        contentPane.add(date);
        date.setEnabled(false);

        time = new JComboBox<String>();
        time.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        time.setBounds(60, 157, 320, 25);
        contentPane.add(time);
        time.setEnabled(false);
        
        JLabel username = new JLabel("");
        username.setBounds(10, 10, 50, 25);
        username.setForeground(new Color(240, 240, 240));
        contentPane.add(username);
        Member m=(Member)(cal.readFile("member.txt"));
        username.setText(m.getUsername());
        
        membername = new JLabel("");
        membername.setHorizontalAlignment(SwingConstants.RIGHT);
        membername.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        membername.setBounds(50, 25, 100, 25);
        contentPane.add(membername);
        membername.setText(m.getMembername());
        
        membername.setText(m.getMembername());
        lblNewLabel_1 = new JLabel("您好");
        lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        lblNewLabel_1.setBounds(155, 25, 50, 25);
        contentPane.add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("請選擇服務日期與時段");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 18));
        lblNewLabel_2.setBounds(98, 58, 230, 29);
        contentPane.add(lblNewLabel_2);
        
        year.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedYear = (String) year.getSelectedItem();
                if (!selectedYear.equals("請選擇時間")) {

                    month.setEnabled(true);

                    month.removeAllItems();
                    month.addItem("請選擇");
                    month.addItem("1月");
                    month.addItem("2月");
                    month.addItem("3月");
                    month.addItem("4月");
                    month.addItem("5月");
                    month.addItem("6月");
                    month.addItem("7月");
                    month.addItem("8月");
                    month.addItem("9月");
                    month.addItem("10月");
                    month.addItem("11月");
                    month.addItem("12月");
                } else {

                    month.setEnabled(false);
                    date.setEnabled(false);
                    time.setEnabled(false);

                    month.removeAllItems();
                    date.removeAllItems();
                    time.removeAllItems();
                }
            }
        });

        month.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedMonth = (String) month.getSelectedItem();
                if (!selectedMonth.equals("請選擇")) {

                    date.setEnabled(true);

                    date.removeAllItems();
                    date.addItem("請選擇");
                    date.addItem("1日");
                    date.addItem("2日");
                    date.addItem("3日");
                    date.addItem("4日");
                    date.addItem("5日");
                    date.addItem("6日");
                    date.addItem("7日");
                    date.addItem("8日");
                    date.addItem("9日");
                    date.addItem("10日");
                    date.addItem("11日");
                    date.addItem("12日");
                    date.addItem("13日");
                    date.addItem("14日");
                    date.addItem("15日");
                    date.addItem("16日");
                    date.addItem("17日");
                    date.addItem("18日");
                    date.addItem("19日");
                    date.addItem("20日");
                    date.addItem("21日");
                    date.addItem("22日");
                    date.addItem("23日");
                    date.addItem("24日");
                    date.addItem("25日");
                    date.addItem("26日");
                    date.addItem("27日");
                    date.addItem("28日");
                    date.addItem("29日");
                    date.addItem("30日");

                } else {

                    date.setEnabled(false);
                    time.setEnabled(false);

                    date.removeAllItems();
                    time.removeAllItems();
                }
            }
        });

        date.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedDate = (String) date.getSelectedItem();
                if (!selectedDate.equals("請選擇")) {

                    time.setEnabled(true);

                    time.removeAllItems();
                    time.addItem("請選擇");
                    time.addItem("09:00 ~ 09:30");
                    time.addItem("09:30 ~ 10:00");
                    time.addItem("10:00 ~ 10:30");
                    time.addItem("10:30 ~ 11:00");
                    time.addItem("11:00 ~ 11:30");
                    time.addItem("11:30 ~ 12:00");
                    time.addItem("12:00 ~ 12:30");
                    time.addItem("12:30 ~ 13:00");
                    time.addItem("13:00 ~ 13:30");
                    time.addItem("13:30 ~ 14:00");
                    time.addItem("14:00 ~ 14:30");
                    time.addItem("14:30 ~ 15:00");
                    time.addItem("15:00 ~ 15:30");
                    time.addItem("15:30 ~ 16:00");
                    time.addItem("16:00 ~ 16:30");
                    time.addItem("16:30 ~ 17:00");
                    time.addItem("17:00 ~ 17:30");
                    time.addItem("17:30 ~ 18:00");
                    time.addItem("18:00 ~ 18:30");
                    time.addItem("18:30 ~ 19:00");
                    time.addItem("19:00 ~ 19:30");

                } else {

                    time.setEnabled(false);

                    time.removeAllItems();
                }
            }
        });

        btnNewButton = new JButton("選擇服務");
        btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                String selectedYear = (String) year.getSelectedItem();
                String selectedMonth = (String) month.getSelectedItem();
                String selectedDate = (String) date.getSelectedItem();
                String selectedTime = (String) time.getSelectedItem();

                if (selectedYear.equals("請選擇時間") || selectedMonth.equals("請選擇") || selectedDate.equals("請選擇") || selectedTime.equals("請選擇")) {
                    JOptionPane.showMessageDialog(null, "請完整選擇日期和時間", "錯誤", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                Reserve re = new Reserve(m.getUsername(),m.getMembername(),selectedYear, selectedMonth, selectedDate, selectedTime);
                
                cal.saveFile("reserve.txt", re);


                ServiceItemUI siu = new ServiceItemUI();
                siu.setVisible(true);
                siu.setLocationRelativeTo(null);
                dispose();
            }
        });
        btnNewButton.setBounds(155, 216, 125, 25);
        contentPane.add(btnNewButton);

    }
}