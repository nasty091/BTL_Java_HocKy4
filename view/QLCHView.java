package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLCHModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class QLCHView extends JFrame {

	private JPanel contentPane;
	QLCHModel model;
	private JTextField textField_MaMacHang;
	private JTable table;
	private JTextField textField_ID;
	private JTextField textField_TenMacHang;
	private JLabel lblID;
	private JTextField textField_NgayNhap;
	private JTextField textField_NgayHetHan;
	private JTextField textField_GiaNhap;
	private JTextField textField_GiaBan;
	private JTextField textField_CanNang;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLCHView frame = new QLCHView();
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
	public QLCHView() {
		this.model = new QLCHModel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 824);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setBackground(Color.WHITE);
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuFile.add(menuOpen);
		
		JMenuItem menuClose = new JMenuItem("CLose");
		menuClose.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuFile.add(menuClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutMe = new JMenuItem("About Me");
		menuAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuAbout.add(menuAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDaiLy = new JLabel("\u0110\u1EA1i l\u00FD");
		lblDaiLy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDaiLy.setBounds(28, 29, 62, 47);
		contentPane.add(lblDaiLy);
		
		JLabel lblMaMacHang = new JLabel("M\u00E3 m\u1EB7c h\u00E0ng");
		lblMaMacHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaMacHang.setBounds(400, 29, 126, 47);
		contentPane.add(lblMaMacHang);
		
		textField_MaMacHang = new JTextField();
		textField_MaMacHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_MaMacHang.setColumns(10);
		textField_MaMacHang.setBounds(536, 29, 176, 47);
		contentPane.add(textField_MaMacHang);
		
		JButton btnTiemKiem = new JButton("Ti\u1EC1m ki\u1EBFm");
		btnTiemKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTiemKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTiemKiem.setBounds(755, 29, 133, 47);
		contentPane.add(btnTiemKiem);
		
		JComboBox comboBox_DaiLy = new JComboBox();
		comboBox_DaiLy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_DaiLy.setBounds(93, 29, 270, 47);
		contentPane.add(comboBox_DaiLy);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 96, 905, 2);
		contentPane.add(separator_1);
		
		JLabel lblDanhSachMacHang = new JLabel("Danh s\u00E1ch m\u1EB7c h\u00E0ng");
		lblDanhSachMacHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSachMacHang.setBounds(28, 103, 198, 47);
		contentPane.add(lblDanhSachMacHang);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "M\u00E3 h\u00E0ng", "T\u00EAn h\u00E0ng", "\u0110\u1EA1i l\u00FD", "Ng\u00E0y nh\u1EADp", "Ng\u00E0y h\u1EBFt h\u1EA1n", "Gi\u00E1 nh\u1EADp", "Gi\u00E1 b\u00E1n", "C\u00E2n n\u1EB7ng"
			}
		));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 151, 905, 213);
		contentPane.add(scrollPane);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 388, 905, 2);
		contentPane.add(separator_1_1);
		
		JLabel lblThngTinMc = new JLabel("Th\u00F4ng tin m\u1EB7c h\u00E0ng");
		lblThngTinMc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblThngTinMc.setBounds(29, 400, 198, 47);
		contentPane.add(lblThngTinMc);
		
		lblID = new JLabel("M\u00E3 m\u1EB7c h\u00E0ng");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblID.setBounds(28, 450, 126, 47);
		contentPane.add(lblID);
		
		textField_ID = new JTextField();
		textField_ID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_ID.setColumns(10);
		textField_ID.setBounds(174, 458, 176, 31);
		contentPane.add(textField_ID);
		
		JLabel lblTenMacHang = new JLabel("T\u00EAn m\u1EB7c h\u00E0ng");
		lblTenMacHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTenMacHang.setBounds(29, 505, 133, 47);
		contentPane.add(lblTenMacHang);
		
		textField_TenMacHang = new JTextField();
		textField_TenMacHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_TenMacHang.setColumns(10);
		textField_TenMacHang.setBounds(174, 513, 176, 31);
		contentPane.add(textField_TenMacHang);
		
		JLabel lblDaiLy2 = new JLabel("\u0110\u1EA1i l\u00FD");
		lblDaiLy2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDaiLy2.setBounds(29, 559, 133, 47);
		contentPane.add(lblDaiLy2);
		
		JLabel lblNgayNhap = new JLabel("Ng\u00E0y nh\u1EADp");
		lblNgayNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNgayNhap.setBounds(29, 613, 133, 47);
		contentPane.add(lblNgayNhap);
		
		textField_NgayNhap = new JTextField();
		textField_NgayNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_NgayNhap.setColumns(10);
		textField_NgayNhap.setBounds(174, 621, 176, 31);
		contentPane.add(textField_NgayNhap);
		
		JComboBox comboBox_DaiLy_1 = new JComboBox();
		comboBox_DaiLy_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_DaiLy_1.setBounds(174, 566, 176, 33);
		contentPane.add(comboBox_DaiLy_1);
		
		JLabel lblNgayHetHan = new JLabel("Ng\u00E0y h\u1EBFt h\u1EA1n");
		lblNgayHetHan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNgayHetHan.setBounds(466, 450, 126, 47);
		contentPane.add(lblNgayHetHan);
		
		textField_NgayHetHan = new JTextField();
		textField_NgayHetHan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_NgayHetHan.setColumns(10);
		textField_NgayHetHan.setBounds(612, 458, 176, 31);
		contentPane.add(textField_NgayHetHan);
		
		JLabel lblGiaNhap = new JLabel("Gi\u00E1 nh\u1EADp");
		lblGiaNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGiaNhap.setBounds(466, 505, 126, 47);
		contentPane.add(lblGiaNhap);
		
		textField_GiaNhap = new JTextField();
		textField_GiaNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_GiaNhap.setColumns(10);
		textField_GiaNhap.setBounds(612, 513, 176, 31);
		contentPane.add(textField_GiaNhap);
		
		JLabel lblGiaBan = new JLabel("Gi\u00E1 b\u00E1n");
		lblGiaBan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGiaBan.setBounds(466, 559, 126, 47);
		contentPane.add(lblGiaBan);
		
		textField_GiaBan = new JTextField();
		textField_GiaBan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_GiaBan.setColumns(10);
		textField_GiaBan.setBounds(612, 567, 176, 31);
		contentPane.add(textField_GiaBan);
		
		JLabel lblCanNang = new JLabel("C\u00E2n n\u1EB7ng");
		lblCanNang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCanNang.setBounds(466, 613, 126, 47);
		contentPane.add(lblCanNang);
		
		textField_CanNang = new JTextField();
		textField_CanNang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_CanNang.setColumns(10);
		textField_CanNang.setBounds(612, 621, 176, 31);
		contentPane.add(textField_CanNang);
		
		JButton btnThem = new JButton("Th\u00EAm");
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnThem.setBounds(28, 689, 133, 37);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("X\u00F3a ");
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoa.setBounds(217, 689, 133, 37);
		contentPane.add(btnXoa);
		
		JButton btnCapNhat = new JButton("C\u1EADp nh\u1EADt");
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCapNhat.setBounds(405, 689, 133, 37);
		contentPane.add(btnCapNhat);
		
		JButton btnLuu = new JButton("L\u01B0u");
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLuu.setBounds(594, 689, 133, 37);
		contentPane.add(btnLuu);
		
		JButton btnHuyBo = new JButton("H\u1EE7y b\u1ECF");
		btnHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHuyBo.setBounds(782, 689, 133, 37);
		contentPane.add(btnHuyBo);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(28, 670, 887, 9);
		contentPane.add(separator_2);
		
		this.setVisible(true);
	}
}
