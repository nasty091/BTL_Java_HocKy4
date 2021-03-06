package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DaiLy;
import model.MatHang;
import model.QLCHModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLCHController;

public class QLCHView extends JFrame {

	private JPanel contentPane;
	public QLCHModel model;
	public JTextField textField_MaMacHang_TimKiem;
	public JTable table;
	public JTextField textField_ID;
	public JTextField textField_TenMacHang;
	public JLabel lblID;
	public JTextField textField_NgayNhap;
	public JTextField textField_NgayHetHan;
	public JTextField textField_GiaNhap;
	public JTextField textField_GiaBan;
	public JTextField textField_CanNang;
	public JComboBox comboBox_DaiLy;
	private JComboBox comboBox_DaiLy_TimKiem;
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
		this.model = new QLCHModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 805);
		setResizable(false);
		
		//T???o n??t ????? nh???n v??o vd: th??m , s???a 
		Action action = new QLCHController(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setBackground(Color.WHITE);
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.addActionListener(action);
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuFile.add(menuOpen);
		//Th??m icon cho open
		menuOpen.setIcon(new ImageIcon("ImageIcon/icon_open.png"));
		//=============================
		
		JMenuItem menuSave = new JMenuItem("Save");
		menuSave.addActionListener(action);
		menuSave.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuFile.add(menuSave);
		//Th??m icon cho save
		menuSave.setIcon(new ImageIcon("ImageIcon/icon_save.png"));
		//=============================
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.addActionListener(action);
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuFile.add(menuExit);
		//Th??m icon cho exit
		menuExit.setIcon(new ImageIcon("ImageIcon/icon_exit.png"));
		//=============================
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.addActionListener(action);
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutMe = new JMenuItem("About Me");
		menuAboutMe.addActionListener(action);
		menuAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuAbout.add(menuAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//Th??m icon cho about me
		menuAboutMe.setIcon(new ImageIcon("ImageIcon/icon_aboutme.png"));
		//=============================
		
		JLabel lblDaiLy = new JLabel("\u0110\u1EA1i l\u00FD");
		lblDaiLy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDaiLy.setBounds(28, 29, 100, 47);
		contentPane.add(lblDaiLy);
		//Th??m icon cho ?????i l??
		lblDaiLy.setIcon(new ImageIcon("ImageIcon/icon_shop.png"));
		//=============================
		JLabel lblMaMacHang = new JLabel("M\u00E3 m\u1EB7c h\u00E0ng");
		lblMaMacHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaMacHang.setBounds(338, 29, 154, 47);
		contentPane.add(lblMaMacHang);
		//Th??m icon cho m?? m???t h??ng
		lblMaMacHang.setIcon(new ImageIcon("ImageIcon/icon_itemcode.png"));
		//=============================
		textField_MaMacHang_TimKiem = new JTextField();
		textField_MaMacHang_TimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_MaMacHang_TimKiem.setColumns(10);
		textField_MaMacHang_TimKiem.setBounds(493, 29, 154, 47);
		contentPane.add(textField_MaMacHang_TimKiem);
		
		JButton btnTim = new JButton("T??m");
		btnTim.addActionListener(action);
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTim.setBounds(657, 29, 115, 47);
		contentPane.add(btnTim);
		//Th??m icon cho t??m
		btnTim.setIcon(new ImageIcon("ImageIcon/icon_search.png"));
		//=============================
		comboBox_DaiLy_TimKiem = new JComboBox();
		//T???o b???ng ch???n cho ?????i l??
		ArrayList<DaiLy> listDaiLy = DaiLy.getDSDaiLy();
		comboBox_DaiLy_TimKiem.addItem("");
		for (DaiLy daiLy : listDaiLy) {
			comboBox_DaiLy_TimKiem.addItem(daiLy.getTenDaiLy());
		}
		comboBox_DaiLy_TimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_DaiLy_TimKiem.setBounds(111, 29, 217, 47);
		contentPane.add(comboBox_DaiLy_TimKiem);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 96, 905, 2);
		contentPane.add(separator_1);
		
		JLabel lblDanhSachMacHang = new JLabel("Danh s\u00E1ch m\u1EB7c h\u00E0ng");
		lblDanhSachMacHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSachMacHang.setBounds(10, 94, 216, 47);
		contentPane.add(lblDanhSachMacHang);
		//Th??m icon cho danh s??ch m???t h??ng
		lblDanhSachMacHang.setIcon(new ImageIcon("ImageIcon/icon_itemlist.png"));
		//=============================
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 h\u00E0ng", "T\u00EAn h\u00E0ng", "\u0110\u1EA1i l\u00FD", "Ng\u00E0y nh\u1EADp", "Ng\u00E0y h\u1EBFt h\u1EA1n", "Gi\u00E1 nh\u1EADp", "Gi\u00E1 b\u00E1n", "C\u00E2n n\u1EB7ng"
			}
		));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 151, 905, 213);
		contentPane.add(scrollPane);
			
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 431, 905, 2);
		contentPane.add(separator_1_1);
		
		JLabel lblThngTinMc = new JLabel("Th\u00F4ng tin m\u1EB7c h\u00E0ng");
		lblThngTinMc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblThngTinMc.setBounds(10, 386, 217, 47);
		contentPane.add(lblThngTinMc);
		//Th??m icon cho th??ng tin m???t h??ng
		lblThngTinMc.setIcon(new ImageIcon("ImageIcon/icon_iteminformation.png"));
		//=============================
		lblID = new JLabel("M\u00E3 m\u1EB7c h\u00E0ng");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblID.setBounds(10, 446, 154, 47);
		contentPane.add(lblID);
		//Th??m icon cho m?? m???t h??ng
		lblID.setIcon(new ImageIcon("ImageIcon/icon_itemcode.png"));
		//=============================
		textField_ID = new JTextField();
		textField_ID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_ID.setColumns(10);
		textField_ID.setBounds(174, 457, 176, 31);
		contentPane.add(textField_ID);
		
		JLabel lblTenMacHang = new JLabel("T??n m???c h??ng");
		lblTenMacHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTenMacHang.setBounds(10, 502, 158, 47);
		contentPane.add(lblTenMacHang);
		//Th??m icon cho t??n m???t h??ng
		lblTenMacHang.setIcon(new ImageIcon("ImageIcon/icon_itemname.png"));
		//=============================
		textField_TenMacHang = new JTextField();
		textField_TenMacHang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_TenMacHang.setColumns(10);
		textField_TenMacHang.setBounds(174, 513, 176, 31);
		contentPane.add(textField_TenMacHang);
		
		JLabel lblDaiLy2 = new JLabel("\u0110\u1EA1i l\u00FD");
		lblDaiLy2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDaiLy2.setBounds(10, 562, 133, 47);
		contentPane.add(lblDaiLy2);
		//Th??m icon cho ?????i l??
		lblDaiLy2.setIcon(new ImageIcon("ImageIcon/icon_authorizeddealer.png"));
		//=============================
		JLabel lblNgayNhap = new JLabel("Ng\u00E0y nh\u1EADp");
		lblNgayNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNgayNhap.setBounds(10, 619, 133, 47);
		contentPane.add(lblNgayNhap);
		//Th??m icon cho ng??y nh???p
		lblNgayNhap.setIcon(new ImageIcon("ImageIcon/icon_dateadded.png"));
		//=============================
		textField_NgayNhap = new JTextField();
		textField_NgayNhap.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_NgayNhap.setColumns(10);
		textField_NgayNhap.setBounds(174, 621, 176, 31);
		contentPane.add(textField_NgayNhap);
		
		comboBox_DaiLy = new JComboBox();
		//T???o b???ng ch???n cho ?????i l??
		comboBox_DaiLy.addItem("");
		for (DaiLy daiLy : listDaiLy) {
			comboBox_DaiLy.addItem(daiLy.getTenDaiLy());
		}
		comboBox_DaiLy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_DaiLy.setBounds(174, 566, 176, 33);
		contentPane.add(comboBox_DaiLy);
		
		JLabel lblNgayHetHan = new JLabel("Ng\u00E0y h\u1EBFt h\u1EA1n");
		lblNgayHetHan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNgayHetHan.setBounds(466, 446, 154, 47);
		contentPane.add(lblNgayHetHan);
		//Th??m icon cho ng??y h???t h???n
		lblNgayHetHan.setIcon(new ImageIcon("ImageIcon/icon_expirationdate.png"));
		//=============================
		textField_NgayHetHan = new JTextField();
		textField_NgayHetHan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_NgayHetHan.setColumns(10);
		textField_NgayHetHan.setBounds(630, 457, 176, 31);
		contentPane.add(textField_NgayHetHan);
		
		JLabel lblGiaNhap = new JLabel("Gi\u00E1 nh\u1EADp");
		lblGiaNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGiaNhap.setBounds(466, 505, 126, 47);
		contentPane.add(lblGiaNhap);
		//Th??m icon cho gi?? nh???p
		lblGiaNhap.setIcon(new ImageIcon("ImageIcon/icon_entryprice.png"));
		//=============================
		textField_GiaNhap = new JTextField();
		textField_GiaNhap.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_GiaNhap.setColumns(10);
		textField_GiaNhap.setBounds(630, 513, 176, 31);
		contentPane.add(textField_GiaNhap);
		
		JLabel lblGiaBan = new JLabel("Gi\u00E1 b\u00E1n");
		lblGiaBan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGiaBan.setBounds(466, 559, 126, 47);
		contentPane.add(lblGiaBan);
		//Th??m icon cho gi?? b??n
		lblGiaBan.setIcon(new ImageIcon("ImageIcon/icon_price.png"));
		//=============================
		textField_GiaBan = new JTextField();
		textField_GiaBan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_GiaBan.setColumns(10);
		textField_GiaBan.setBounds(630, 573, 176, 31);
		contentPane.add(textField_GiaBan);
		
		JLabel lblCanNang = new JLabel("C\u00E2n n\u1EB7ng");
		lblCanNang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCanNang.setBounds(466, 613, 126, 47);
		contentPane.add(lblCanNang);
		//Th??m icon cho c??n n???ng
		lblCanNang.setIcon(new ImageIcon("ImageIcon/icon_weight.png"));
		//=============================
		textField_CanNang = new JTextField();
		textField_CanNang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_CanNang.setColumns(10);
		textField_CanNang.setBounds(630, 630, 176, 31);
		contentPane.add(textField_CanNang);
		
		JButton btnXoa = new JButton("X??a");
		//D??ng c??c n??t nh???n
		btnXoa.addActionListener(action);
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoa.setBounds(61, 689, 133, 37);
		contentPane.add(btnXoa);
		//Th??m icon cho x??a
		btnXoa.setIcon(new ImageIcon("ImageIcon/icon_delete.png"));
		//=============================
		JButton btnCapNhat = new JButton("C\u1EADp nh\u1EADt");
		//D??ng c??c n??t nh???n
		btnCapNhat.addActionListener(action);
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCapNhat.setBounds(282, 689, 142, 37);
		contentPane.add(btnCapNhat);
		//Th??m icon cho c???p nh???t
		btnCapNhat.setIcon(new ImageIcon("ImageIcon/icon_update.png"));
		JButton btnLuu = new JButton("L\u01B0u");
		btnLuu.addActionListener(action);
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLuu.setBounds(506, 689, 133, 37);
		contentPane.add(btnLuu);
		//Th??m icon cho l??u
		btnLuu.setIcon(new ImageIcon("ImageIcon/icon_save2.png"));
		//=============================
		JButton btnHuyBo = new JButton("H\u1EE7y b\u1ECF");
		//D??ng c??c n??t nh???n
		btnHuyBo.addActionListener(action);
		btnHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHuyBo.setBounds(731, 689, 133, 37);
		contentPane.add(btnHuyBo);
		//Th??m icon cho h???y b???
		btnHuyBo.setIcon(new ImageIcon("ImageIcon/icon_cancel.png"));
		//=============================
		JButton btnHuyTim = new JButton("H???y t??m");
		btnHuyTim.addActionListener(action);
		btnHuyTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHuyTim.setBounds(782, 29, 133, 47);
		contentPane.add(btnHuyTim);
		//Th??m icon cho h???y t??m
		btnHuyTim.setIcon(new ImageIcon("ImageIcon/icon_cancelsearch.png"));
		//=============================
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 676, 905, 2);
		contentPane.add(separator_1_1_1);
		
		this.setVisible(true);
	}

	public void xoaForm() {
		textField_ID.setText("");
		textField_TenMacHang.setText("");
		textField_NgayNhap.setText("");
		textField_NgayHetHan.setText("");
		textField_GiaNhap.setText("");
		textField_GiaBan.setText("");
		textField_CanNang.setText("");
		comboBox_DaiLy.setSelectedIndex(-1);
	}
	
	//H??m ?????y c??c th??ng tin ???? nh???p l??n b???ng
	public void themMacHangVaoTable(MatHang mh) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(
				new Object[] {
						mh.getMaMacHang()+"",
						mh.getTenMacHang(),
						mh.getXuatXu().getTenDaiLy(),
						mh.getNgayNhap().getDate() + "/" + (mh.getNgayHetHan().getMonth() + 1) + "/"
							+ (mh.getNgayHetHan().getYear() + 1900),
						mh.getNgayHetHan().getDate() + "/" + (mh.getNgayHetHan().getMonth() + 1) + "/"
							+ (mh.getNgayHetHan().getYear() + 1900),
						mh.getGiaNhap()+"",
						mh.getGiaBan()+"",
						mh.getCanNang()+"",
				});
	}
	
	//H??m s???a ch???a th??ng tin c?? v?? update th??ng tin m???i
	public void themHoacCapNhapMacHang(MatHang mh) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if(!this.model.kiemTraTonTai(mh)) {
			this.model.insert(mh);
			this.themMacHangVaoTable(mh);
		}else {
			this.model.update(mh);
			int soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0)+"";
				if(id.equals(mh.getMaMacHang()+"")) {
					model_table.setValueAt(mh.getMaMacHang()+"",i,0);
					model_table.setValueAt(mh.getTenMacHang()+"",i,1);
					model_table.setValueAt(mh.getXuatXu().getTenDaiLy()+"",i,2);
					model_table.setValueAt(mh.getNgayNhap().getDate() + "/" + (mh.getNgayHetHan().getMonth() + 1) + "/"+ (mh.getNgayHetHan().getYear() + 1900),i,3);
					model_table.setValueAt(mh.getNgayHetHan().getDate() + "/" + (mh.getNgayHetHan().getMonth() + 1) + "/"+ (mh.getNgayHetHan().getYear() + 1900),i,4);
					model_table.setValueAt(mh.getGiaNhap()+"",i,5);
					model_table.setValueAt(mh.getGiaBan()+"",i,6);
					model_table.setValueAt(mh.getCanNang()+"",i,7);
				}
			}
		}
	}

	//H??m L??u
		public void thucHienLuu() {
			//private int maMacHang;
			int maMacHang = Integer.valueOf(this.textField_ID.getText());
			//private String tenMacHang;
			String tenMacHang = (this.textField_TenMacHang.getText());
			// private DaiLy xuatXu;
			int xuatXu = this.comboBox_DaiLy.getSelectedIndex()-1;
			DaiLy daiLy = DaiLy.getDaiLyById(xuatXu);
			// private Date ngayNhap;
			Date ngayNhap =  new Date(this.textField_NgayNhap.getText());
			// private Date ngayHetHan;
			Date ngayHetHan = new Date(this.textField_NgayHetHan.getText());
			// private float giaNhap;
			float giaNhap = Float.valueOf(this.textField_GiaNhap.getText());
			// private float giaBan;
			float giaBan = Float.valueOf(this.textField_GiaBan.getText());
			// private float canNang;
			float canNang = Float.valueOf(this.textField_CanNang.getText());
			
			MatHang mh = new MatHang(maMacHang, tenMacHang, daiLy, ngayNhap, ngayHetHan, giaNhap, giaBan, canNang);
			
			this.themHoacCapNhapMacHang(mh);
		}
		
	//H??m l???y th??ng tin t??? b???ng 
	public MatHang getMacHangDangChon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		
		//private int maMacHang;
		int maMacHang = Integer.valueOf(model_table.getValueAt(i_row, 0)+"");
		//private String tenMacHang;
		String tenMacHang = model_table.getValueAt(i_row, 1)+"";
		// private DaiLy xuatXu;
		DaiLy daiLy = DaiLy.getDaiLyByTen(model_table.getValueAt(i_row, 2)+"");
		// private Date ngayNhap;
		String d_ngayNhap = model_table.getValueAt(i_row, 3)+"";
		Date ngayNhap =  new Date(d_ngayNhap);
		// private Date ngayHetHan;
		String d_ngayHetHan = model_table.getValueAt(i_row, 4)+"";
		Date ngayHetHan = new Date(d_ngayHetHan);
		// private float giaNhap;
		float giaNhap = Float.valueOf(model_table.getValueAt(i_row, 5)+"");
		// private float giaBan;
		float giaBan = Float.valueOf(model_table.getValueAt(i_row, 6)+"");
		// private float canNang;
		float canNang = Float.valueOf(model_table.getValueAt(i_row, 7)+"");
		
		MatHang mh = new MatHang(maMacHang, tenMacHang, daiLy, ngayNhap, ngayHetHan, giaNhap, giaBan, canNang);
		return mh;
	}
	
	//H??m c???p nh???t
	public void hienThiThongTin() {
		MatHang mh = getMacHangDangChon();
		
		this.textField_ID.setText(mh.getMaMacHang()+"");
		this.textField_TenMacHang.setText(mh.getTenMacHang()+"");
		this.comboBox_DaiLy.setSelectedItem(mh.getXuatXu().getTenDaiLy());
		String d_ngayNhap = mh.getNgayNhap().getDate() + "/" + (mh.getNgayHetHan().getMonth() + 1) + "/"+ (mh.getNgayHetHan().getYear() + 1900);
		this.textField_NgayNhap.setText(d_ngayNhap+"");
		String d_ngayHetHan = mh.getNgayHetHan().getDate() + "/" + (mh.getNgayHetHan().getMonth() + 1) + "/"+ (mh.getNgayHetHan().getYear() + 1900);
		this.textField_NgayHetHan.setText(d_ngayHetHan+"");
		this.textField_GiaNhap.setText(mh.getGiaNhap()+"");
		this.textField_GiaBan.setText(mh.getGiaBan()+"");
		this.textField_CanNang.setText(mh.getCanNang()+"");
	}
	
	//H??m X??a
	public void thucHienXoa() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n x??a kh??ng?");
		if(luaChon == JOptionPane.YES_OPTION) {
			MatHang mh = getMacHangDangChon();
			this.model.delete(mh);
			model_table.removeRow(i_row);
		}
	}
	

	//H??m T??m ki???m
	public void thucHienTim() {
		//H??m th???c hi???n h???y t??m, n???u kh??ng c?? s??? b??? l???i d??? li???u 
		this.thucHienTaiLaiDuLieu();
		
		//H??m th???c hi???n t??m
		int xuatXu = this.comboBox_DaiLy_TimKiem.getSelectedIndex()-1;
		String maCuaHangTimKiem = this.textField_MaMacHang_TimKiem.getText();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int soLuongDong = model_table.getRowCount();
		
		Set<Integer> maCuaHangCanXoa = new TreeSet<Integer>();
		if(xuatXu >= 0 ) {
			DaiLy daiLyDaChon = DaiLy.getDaiLyById(xuatXu);
			for (int i = 0; i < soLuongDong; i++) {
				String tenDaiLy = model_table.getValueAt(i,2)+"";
				String id = model_table.getValueAt(i,0)+"";
				if(!tenDaiLy.equals(daiLyDaChon.getTenDaiLy())) {
					maCuaHangCanXoa.add(Integer.valueOf(id));
					
				}
			}
		}
		if(maCuaHangTimKiem.length()>0) {
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i,0)+"";
				if(!id.equals(maCuaHangTimKiem)) {
					maCuaHangCanXoa.add(Integer.valueOf(id));
					
				}
			}
		}
		for (Integer idCanXoa : maCuaHangCanXoa) {
			soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String idTrongTable = model_table.getValueAt(i,0)+"";
				if(idTrongTable.equals(idCanXoa.toString())) {
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
	}
	
	//H??m h???y t??m v?? t???i l???i d???u li???u ???? nh???p l??n b???ng
	public void thucHienTaiLaiDuLieu() {
		//X??a c??i t??m trong b???ng ??i
		while (true) {
			DefaultTableModel model_table = (DefaultTableModel) table.getModel();
			int soLuongDong = model_table.getRowCount();
			if (soLuongDong == 0)
				break;
			else
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		//H??m hi???n l???i danh s??ch ???? nh???p
		for (MatHang mh : this.model.getDsMacHang()) {
			this.themMacHangVaoTable(mh);
		}
	}

	public void hienThiAbout() {
		JOptionPane.showMessageDialog(this, "Ph???n m???m qu???n l?? m???c h??ng 2.0!");
	}

	public void thoatKhoiChuongTrinh() {
		int luaChon = JOptionPane.showConfirmDialog(
			    this,
			    "B???n c?? mu???n tho??t kh???i ch????ng tr??nh?",
			    "Exit",
			    JOptionPane.YES_NO_OPTION);
		if(luaChon == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public void saveFile(String path) {
		try {
			this.model.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(MatHang mh : this.model.getDsMacHang()) {
				oos.writeObject(mh);
			}
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void openFile(File file) {
		ArrayList<MatHang> ds = new ArrayList<MatHang>();
		try {
			this.model.setTenFile(file.getAbsolutePath());
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			MatHang mh = null;
			while((mh = (MatHang) ois.readObject()) != null){
				ds.add(mh);
			}
			ois.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.model.setDsMacHang(ds);
	}
	

	public void thucHienSaveFile() {
		if(this.model.getTenFile().length() > 0) {
			saveFile(this.model.getTenFile());
		}else {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				saveFile(file.getAbsolutePath());
			}
		}
	}

	public void thucHienOpenFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			openFile(file);
			thucHienTaiLaiDuLieu();
		}
	}
}
