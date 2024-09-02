package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.MemberDaoImpl;
import dao.impl.EmployeeDaoImpl;
import model.Employee;
import model.Member;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JComboBox;

public class AddMemberUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	private JTextField membername;
	private JTextField road;
	private JTextField email;
	private JTextField phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMemberUI frame = new AddMemberUI();
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
	public AddMemberUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("建立新帳號");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 634, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_1.setBounds(200, 100, 50, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("密碼");
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(200, 150, 50, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("姓名");
		lblNewLabel_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(200, 200, 50, 25);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("性別");
		lblNewLabel_2_3.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setBounds(200, 250, 50, 25);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("城市");
		lblNewLabel_2_4.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setBounds(200, 300, 50, 25);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("區域");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_2_5.setBounds(200, 350, 46, 25);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("街道");
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_6.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_2_6.setBounds(200, 400, 46, 25);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("E-mail");
		lblNewLabel_2_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_7.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2_7.setBounds(200, 450, 50, 25);
		contentPane.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_8 = new JLabel("電話");
		lblNewLabel_2_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_8.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_2_8.setBounds(200, 500, 46, 25);
		contentPane.add(lblNewLabel_2_8);
		
		username = new JTextField();
		username.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		username.setBounds(321, 100, 130, 23);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		password.setColumns(10);
		password.setBounds(321, 150, 130, 23);
		contentPane.add(password);
		
		membername = new JTextField();
		membername.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		membername.setColumns(10);
		membername.setBounds(321, 200, 130, 23);
		contentPane.add(membername);
		
		JComboBox<String> gender = new JComboBox<>();
		gender.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		gender.addItem("請選擇性別");
		gender.addItem("男");
		gender.addItem("女");
		gender.setBounds(321, 250, 130, 23);
		contentPane.add(gender);
		
		JComboBox<String> city = new JComboBox<>();
		city.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		city.addItem("請選擇縣市");
		city.addItem("基隆市");
		city.addItem("台北市");
		city.addItem("新北市");
		city.addItem("桃園市");
		city.addItem("新竹市");
		city.addItem("新竹縣");
		city.addItem("苗栗縣");
		city.addItem("台中市");
		city.addItem("彰化縣");
		city.addItem("南投縣");
		city.addItem("雲林縣");
		city.addItem("嘉義市");
		city.addItem("嘉義縣");
		city.addItem("台南市");
		city.addItem("高雄市");
		city.addItem("屏東縣");
		city.addItem("台東縣");
		city.addItem("花蓮縣");
		city.addItem("宜蘭縣");
		city.addItem("澎湖縣");
		city.addItem("金門縣");
		city.addItem("連江縣");
		city.setBounds(321, 300, 130, 23);
		contentPane.add(city);
		
		JComboBox<String> area = new JComboBox<>();
		area.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		area.setBounds(321, 350, 130, 23);
		contentPane.add(area);
		
		city.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        area.removeAllItems();
		        String selectedCity = (String) city.getSelectedItem();
		        if (selectedCity.equals("基隆市"))
		        {
		            area.addItem("仁愛區");
		            area.addItem("信義區");
		            area.addItem("中正區");
		            area.addItem("中山區");
		            area.addItem("安樂區");
		            area.addItem("暖暖區");
		            area.addItem("七堵區");
		            
		        }
		        else if (selectedCity.equals("台北市"))
		        {
		            area.addItem("中正區");
		            area.addItem("大同區");
		            area.addItem("中山區");
		            area.addItem("松山區");
		            area.addItem("大安區");
		            area.addItem("萬華區");
		            area.addItem("信義區");
		            area.addItem("士林區");
		            area.addItem("北投區");
		            area.addItem("內湖區");
		            area.addItem("南港區");
		            area.addItem("文山區");
		        }
		        else if (selectedCity.equals("新北市"))
		        {
		            area.addItem("萬里區");
		            area.addItem("金山區");
		            area.addItem("汐止區");
		            area.addItem("板橋區");
		            area.addItem("深坑區");
		            area.addItem("石碇區");
		            area.addItem("瑞芳區");
		            area.addItem("平溪區");
		            area.addItem("雙溪區");
		            area.addItem("貢寮區");
		            area.addItem("新店區");
		            area.addItem("坪林區");
		            area.addItem("烏來區");
		            area.addItem("永和區");
		            area.addItem("中和區");
		            area.addItem("土城區");
		            area.addItem("三峽區");
		            area.addItem("樹林區");
		            area.addItem("鶯歌區");
		            area.addItem("三重區");
		        }
		        else if (selectedCity.equals("桃園市"))
		        {
		            area.addItem("中壢區");
		            area.addItem("平鎮區");
		            area.addItem("龍潭區");
		            area.addItem("楊梅區");
		            area.addItem("新屋區");
		            area.addItem("觀音區");
		            area.addItem("桃園區");
		            area.addItem("龜山區");
		            area.addItem("八德區");
		            area.addItem("大溪區");
		            area.addItem("復興區");
		            area.addItem("大園區");
		            area.addItem("蘆竹區");
		        }
		        else if (selectedCity.equals("新竹市"))
		        {
		            area.addItem("東區");
		            area.addItem("北區");
		            area.addItem("香山區");
		        }
		        else if (selectedCity.equals("新竹縣"))
		        {
		        	area.addItem("竹北市");
		            area.addItem("湖口鄉");
		            area.addItem("新豐鄉");
		            area.addItem("新埔鎮");
		            area.addItem("關西鎮");
		            area.addItem("芎林鄉");
		            area.addItem("寶山鄉");
		            area.addItem("竹東鎮");
		            area.addItem("五峰鄉");
		            area.addItem("橫山鄉");
		            area.addItem("尖石鄉");
		            area.addItem("北埔鄉");
		            area.addItem("峨嵋鄉");
		        }
		        else if (selectedCity.equals("苗栗縣"))
		        {
		            area.addItem("竹南鎮");
		            area.addItem("頭份市");
		            area.addItem("三灣鎮");
		            area.addItem("南庄鄉");
		            area.addItem("獅潭鄉");
		            area.addItem("後龍鎮");
		            area.addItem("通霄鎮");
		            area.addItem("苑裡鎮");
		            area.addItem("苗栗市");
		            area.addItem("造橋鄉");
		            area.addItem("頭屋鄉");
		            area.addItem("公館鄉");
		            area.addItem("大湖鄉");
		            area.addItem("泰安鄉");
		            area.addItem("銅鑼鄉");
		            area.addItem("三義鄉");
		            area.addItem("西湖鄉");
		            area.addItem("卓蘭鎮");
		        }
		        else if (selectedCity.equals("台中市"))
		        {
		            area.addItem("中區");
		            area.addItem("東區");
		            area.addItem("南區");
		            area.addItem("西區");
		            area.addItem("北區");
		            area.addItem("北屯區");
		            area.addItem("西屯區");
		            area.addItem("南屯區");
		            area.addItem("太平區");
		            area.addItem("大里區");
		            area.addItem("霧峰區");
		            area.addItem("烏日區");
		            area.addItem("豐原區");
		            area.addItem("后里區");
		            area.addItem("石岡區");
		            area.addItem("東勢區");
		            area.addItem("和平區");
		            area.addItem("新社區");
		            area.addItem("潭子區");
		            area.addItem("大雅區");
		            area.addItem("神岡區");
		            area.addItem("大肚區");
		            area.addItem("沙鹿區");
		            area.addItem("梧棲區");
		            area.addItem("清水區");
		            area.addItem("大甲區");
		            area.addItem("外埔區");
		            area.addItem("大安區");
		        }
		        else if (selectedCity.equals("彰化縣"))
		        {
		            area.addItem("彰化市");
		            area.addItem("芬園鄉");
		            area.addItem("花壇鄉");
		            area.addItem("秀水鄉");
		            area.addItem("鹿港鎮");
		            area.addItem("福興鄉");
		            area.addItem("線西鄉");
		            area.addItem("和美鎮");
		            area.addItem("伸港鄉");
		            area.addItem("員林市");
		            area.addItem("社頭鄉");
		            area.addItem("永靖鄉");
		            area.addItem("埔心鄉");
		            area.addItem("溪湖鎮");
		            area.addItem("大村鄉");
		            area.addItem("埔鹽鄉");
		            area.addItem("田中鎮");
		            area.addItem("北斗鎮");
		            area.addItem("田尾鄉");
		            area.addItem("埤頭鄉");
		            area.addItem("溪州鄉");
		            area.addItem("竹塘鄉");
		            area.addItem("二林鎮");
		            area.addItem("大城鄉");
		            area.addItem("芳苑鄉");
		            area.addItem("二水鎮");
		        }
		        else if (selectedCity.equals("南投縣"))
		        {
		            area.addItem("南投市");
		            area.addItem("中寮鄉");
		            area.addItem("草屯鎮");
		            area.addItem("國姓鄉");
		            area.addItem("埔里鎮");
		            area.addItem("仁愛鄉");
		            area.addItem("名間鄉");
		            area.addItem("集集鎮");
		            area.addItem("水里鄉");
		            area.addItem("魚池鄉");
		            area.addItem("信義鄉");
		            area.addItem("竹山鎮");
		            area.addItem("鹿谷鄉");
		        }
		        else if (selectedCity.equals("雲林縣"))
		        {
		            area.addItem("斗南鎮");
		            area.addItem("大埤鄉");
		            area.addItem("虎尾鎮");
		            area.addItem("土庫鎮");
		            area.addItem("褒忠鄉");
		            area.addItem("東勢鄉");
		            area.addItem("台西鄉");
		            area.addItem("崙背鄉");
		            area.addItem("麥寮鄉");
		            area.addItem("斗六市");
		            area.addItem("林內鄉");
		            area.addItem("古坑鄉");
		            area.addItem("莿桐鄉");
		            area.addItem("西螺鎮");
		            area.addItem("二崙鄉");
		            area.addItem("北港鎮");
		            area.addItem("水林鄉");
		            area.addItem("湖口鄉");
		            area.addItem("四湖鄉");
		            area.addItem("元長鄉");
		        }
		        else if (selectedCity.equals("嘉義市"))
		        {
		            area.addItem("東區");
		            area.addItem("西區");
		        }
		        else if (selectedCity.equals("嘉義縣"))
		        {
		            area.addItem("番路鄉");
		            area.addItem("梅山鄉");
		            area.addItem("竹崎鄉");
		            area.addItem("阿里山鄉");
		            area.addItem("中埔鄉");
		            area.addItem("大埔鄉");
		            area.addItem("水上鄉");
		            area.addItem("鹿草鄉");
		            area.addItem("太保市");
		            area.addItem("朴子市");
		            area.addItem("東石鄉");
		            area.addItem("六腳鄉");
		            area.addItem("新港鄉");
		            area.addItem("民雄鄉");
		            area.addItem("大林鎮");
		            area.addItem("溪口鄉");
		            area.addItem("義竹鄉");
		            area.addItem("布袋鎮");
		        }
		        else if (selectedCity.equals("台南市"))
		        {
		            area.addItem("中西區");
		            area.addItem("東區");
		            area.addItem("南區");
		            area.addItem("北區");
		            area.addItem("安平區");
		            area.addItem("安南區");
		            area.addItem("永康區");
		            area.addItem("歸仁區");
		            area.addItem("新化區");
		            area.addItem("左鎮區");
		            area.addItem("玉井區");
		            area.addItem("楠西區");
		            area.addItem("南化區");
		            area.addItem("仁德區");
		            area.addItem("關廟區");
		            area.addItem("龍崎區");
		            area.addItem("官田區");
		            area.addItem("麻豆區");
		            area.addItem("佳里區");
		            area.addItem("西港區");
		            area.addItem("七股區");
		            area.addItem("將軍區");
		            area.addItem("學甲區");
		            area.addItem("北門區");
		            area.addItem("新營區");
		            area.addItem("後壁區");
		            area.addItem("白河區");
		            area.addItem("東山區");
		            area.addItem("六甲區");
		            area.addItem("下營區");
		            area.addItem("柳營區");
		            area.addItem("鹽水區");
		            area.addItem("善化區");
		            area.addItem("大內區");
		            area.addItem("山上區");
		            area.addItem("新市區");
		            area.addItem("安定區");
		        }
		        else if (selectedCity.equals("高雄市"))
		        {
		            area.addItem("新興區");
		            area.addItem("前金區");
		            area.addItem("苓雅區");
		            area.addItem("鹽埕區");
		            area.addItem("鼓山區");
		            area.addItem("旗津區");
		            area.addItem("前鎮區");
		            area.addItem("三民區");
		            area.addItem("楠梓區");
		            area.addItem("小港區");
		            area.addItem("左營區");
		            area.addItem("仁武區");
		            area.addItem("大社區");
		            area.addItem("岡山區");
		            area.addItem("路竹區");
		            area.addItem("阿蓮區");
		            area.addItem("田寮區");
		            area.addItem("燕巢區");
		            area.addItem("橋頭區");
		            area.addItem("梓官區");
		            area.addItem("彌陀區");
		            area.addItem("永安區");
		            area.addItem("湖內區");
		            area.addItem("鳳山區");
		            area.addItem("大寮區");
		            area.addItem("林園區");
		            area.addItem("鳥松區");
		            area.addItem("大樹區");
		            area.addItem("旗山區");
		            area.addItem("美濃區");
		            area.addItem("六龜區");
		            area.addItem("內門區");
		            area.addItem("杉林區");
		            area.addItem("甲仙區");
		            area.addItem("桃源區");
		            area.addItem("那瑪夏區");
		            area.addItem("茂林區");
		            area.addItem("茄萣區");
		        }
		        else if (selectedCity.equals("屏東縣"))
		        {
		            area.addItem("屏東市");
		            area.addItem("三地門鄉");
		            area.addItem("霧台鄉");
		            area.addItem("瑪家鄉");
		            area.addItem("九如鄉");
		            area.addItem("里港鄉");
		            area.addItem("高樹鄉");
		            area.addItem("鹽埔鄉");
		            area.addItem("長治鄉");
		            area.addItem("麟洛鄉");
		            area.addItem("竹田鄉");
		            area.addItem("內埔鄉");
		            area.addItem("萬丹鄉");
		            area.addItem("潮州鎮");
		            area.addItem("泰武鄉");
		            area.addItem("來義鄉");
		            area.addItem("萬巒鄉");
		            area.addItem("崁頂鄉");
		            area.addItem("新埤鄉");
		            area.addItem("南州鄉");
		            area.addItem("林邊鄉");
		            area.addItem("東港鎮");
		            area.addItem("琉球鄉");
		            area.addItem("佳冬鄉");
		            area.addItem("新園鄉");
		            area.addItem("枋寮鄉");
		            area.addItem("枋山鄉");
		            area.addItem("春日鄉");
		            area.addItem("獅子鄉");
		            area.addItem("車城鄉");
		            area.addItem("牡丹鄉");
		            area.addItem("恆村鎮");
		            area.addItem("滿州鄉");
		        }
		        else if (selectedCity.equals("台東縣"))
		        {
		            area.addItem("台東市");
		            area.addItem("綠島鄉");
		            area.addItem("蘭嶼鄉");
		            area.addItem("延平鄉");
		            area.addItem("卑南鄉");
		            area.addItem("鹿野鄉");
		            area.addItem("關山鎮");
		            area.addItem("海端鄉");
		            area.addItem("池上鄉");
		            area.addItem("東河鄉");
		            area.addItem("成功鎮");
		            area.addItem("長濱鄉");
		            area.addItem("太麻里鄉");
		            area.addItem("金峰鄉");
		            area.addItem("大武鄉");
		            area.addItem("達仁鄉");
		        }
		        else if (selectedCity.equals("花蓮縣"))
		        {
		            area.addItem("花蓮市");
		            area.addItem("新城鄉");
		            area.addItem("秀林鄉");
		            area.addItem("吉安鄉");
		            area.addItem("壽豐鄉");
		            area.addItem("鳳林鎮");
		            area.addItem("光復鄉");
		            area.addItem("豐濱鄉");
		            area.addItem("瑞穗鄉");
		            area.addItem("萬榮鄉");
		            area.addItem("玉里鎮");
		            area.addItem("卓溪鄉");
		            area.addItem("富里鄉");
		        }
		        else if (selectedCity.equals("宜蘭縣"))
		        {
		            area.addItem("宜蘭市");
		            area.addItem("頭城鎮");
		            area.addItem("礁溪鄉");
		            area.addItem("壯圍鄉");
		            area.addItem("員山鄉");
		            area.addItem("羅東鎮");
		            area.addItem("三星鄉");
		            area.addItem("大同鄉");
		            area.addItem("五結鄉");
		            area.addItem("冬山鄉");
		            area.addItem("蘇澳鎮");
		            area.addItem("南澳鄉");
		        }
		        else if (selectedCity.equals("澎湖縣"))
		        {
		            area.addItem("馬公市");
		            area.addItem("西嶼鄉");
		            area.addItem("望安鄉");
		            area.addItem("七美鄉");
		            area.addItem("白沙鄉");
		            area.addItem("湖西鄉");
		        }
		        else if (selectedCity.equals("金門縣"))
		        {
		            area.addItem("金沙鎮");
		            area.addItem("金湖鎮");
		            area.addItem("金寧鄉");
		            area.addItem("金城鎮");
		            area.addItem("烈嶼鄉");
		            area.addItem("烏坵鄉");
		        }
		        else if (selectedCity.equals("連江縣"))
		        {
		            area.addItem("南竿鄉");
		            area.addItem("北竿鄉");
		            area.addItem("莒光鄉");
		            area.addItem("東引鄉");
		        }
		    }
		});
		
		road = new JTextField();
		road.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		road.setColumns(10);
		road.setBounds(321, 400, 130, 23);
		contentPane.add(road);

		email = new JTextField();
		email.setFont(new Font("Arial", Font.PLAIN, 14));
		email.setColumns(10);
		email.setBounds(321, 450, 130, 23);
		contentPane.add(email);

		phone = new JTextField();
		phone.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		phone.setColumns(10);
		phone.setBounds(321, 500, 130, 23);
		contentPane.add(phone);
		
		JButton btnNewButton = new JButton("確認送出");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btnNewButton.addMouseListener(new MouseAdapter() {
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
					AddMemberErrorUI ame = new AddMemberErrorUI();
					ame.setVisible(true);
					ame.setLocationRelativeTo(null);
					dispose();
				}
				else if (e != null)
				{
					AddMemberErrorUI ame = new AddMemberErrorUI();
					ame.setVisible(true);
					ame.setLocationRelativeTo(null);
					dispose();
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
					String Gender = (String) gender.getSelectedItem();
					if (Gender.isEmpty())
					{
						Gender = null;
					}
					String City = (String) city.getSelectedItem();
					if (City.isEmpty())
					{
						City = null;
					}
					String Area = (String) area.getSelectedItem();
					if (Area != null && !Area.isEmpty())
					{
						Area = null;
					} 
					else
					{
					   
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
					Member mb = new Member(Username,Password,Membername,Gender,City,Area,Road,Email,Phone);
					new MemberDaoImpl().add(mb);
					AddMemberSuccessUI amu = new AddMemberSuccessUI();
					amu.setVisible(true);
					amu.setLocationRelativeTo(null);
					dispose();					
				}
				
			}
		});
		btnNewButton.setBounds(350, 625, 100, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginUI lu = new LoginUI();
				lu.setVisible(true);
				lu.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1.setBounds(225, 625, 100, 25);
		contentPane.add(btnNewButton_1);
		
	}
}
