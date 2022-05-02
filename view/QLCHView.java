package view;

import java.awt.BorderLayout;

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
		
		//Tạo nút để nhấn vào vd: thêm , sửa 
		Action action = new QLCHController(this);
		
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
		lblDaiLy.setBounds(28, 29, 100, 47);
		contentPane.add(lblDaiLy);
		
		JLabel lblMaMacHang = new JLabel("M\u00E3 m\u1EB7c h\u00E0ng");
		lblMaMacHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaMacHang.setBounds(350, 29, 126, 47);
		contentPane.add(lblMaMacHang);
		
		textField_MaMacHang_TimKiem = new JTextField();
		textField_MaMacHang_TimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_MaMacHang_TimKiem.setColumns(10);
		textField_MaMacHang_TimKiem.setBounds(471, 29, 176, 47);
		contentPane.add(textField_MaMacHang_TimKiem);
		
		JButton btnTim = new JButton("Tìm");
		btnTim.addActionListener(action);
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTim.setBounds(657, 29, 115, 47);
		contentPane.add(btnTim);
		
		comboBox_DaiLy_TimKiem = new JComboBox();
		//Tạo bảng chọn cho đại lý
		ArrayList<DaiLy> listDaiLy = DaiLy.getDSDaiLy();
		comboBox_DaiLy_TimKiem.addItem("");
		for (DaiLy daiLy : listDaiLy) {
			comboBox_DaiLy_TimKiem.addItem(daiLy.getTenDaiLy());
		}
		comboBox_DaiLy_TimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_DaiLy_TimKiem.setBounds(86, 29, 254, 47);
		contentPane.add(comboBox_DaiLy_TimKiem);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 96, 905, 2);
		contentPane.add(separator_1);
		
		JLabel lblDanhSachMacHang = new JLabel("Danh s\u00E1ch m\u1EB7c h\u00E0ng");
		lblDanhSachMacHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSachMacHang.setBounds(68, 96, 198, 47);
		contentPane.add(lblDanhSachMacHang);
		
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
		textField_ID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_ID.setColumns(10);
		textField_ID.setBounds(174, 458, 176, 31);
		contentPane.add(textField_ID);
		
		JLabel lblTenMacHang = new JLabel("T\u00EAn m\u1EB7c h\u00E0ng");
		lblTenMacHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTenMacHang.setBounds(29, 505, 133, 47);
		contentPane.add(lblTenMacHang);
		
		textField_TenMacHang = new JTextField();
		textField_TenMacHang.setFont(new Font("Tahoma", Font.PLAIN, 12));
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
		textField_NgayNhap.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_NgayNhap.setColumns(10);
		textField_NgayNhap.setBounds(174, 621, 176, 31);
		contentPane.add(textField_NgayNhap);
		
		comboBox_DaiLy = new JComboBox();
		//Tạo bảng chọn cho đại lý
		comboBox_DaiLy.addItem("");
		for (DaiLy daiLy : listDaiLy) {
			comboBox_DaiLy.addItem(daiLy.getTenDaiLy());
		}
		comboBox_DaiLy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_DaiLy.setBounds(174, 566, 176, 33);
		contentPane.add(comboBox_DaiLy);
		
		JLabel lblNgayHetHan = new JLabel("Ng\u00E0y h\u1EBFt h\u1EA1n");
		lblNgayHetHan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNgayHetHan.setBounds(466, 450, 126, 47);
		contentPane.add(lblNgayHetHan);
		
		textField_NgayHetHan = new JTextField();
		textField_NgayHetHan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_NgayHetHan.setColumns(10);
		textField_NgayHetHan.setBounds(612, 458, 176, 31);
		contentPane.add(textField_NgayHetHan);
		
		JLabel lblGiaNhap = new JLabel("Gi\u00E1 nh\u1EADp");
		lblGiaNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGiaNhap.setBounds(466, 505, 126, 47);
		contentPane.add(lblGiaNhap);
		
		textField_GiaNhap = new JTextField();
		textField_GiaNhap.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_GiaNhap.setColumns(10);
		textField_GiaNhap.setBounds(612, 513, 176, 31);
		contentPane.add(textField_GiaNhap);
		
		JLabel lblGiaBan = new JLabel("Gi\u00E1 b\u00E1n");
		lblGiaBan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGiaBan.setBounds(466, 559, 126, 47);
		contentPane.add(lblGiaBan);
		
		textField_GiaBan = new JTextField();
		textField_GiaBan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_GiaBan.setColumns(10);
		textField_GiaBan.setBounds(612, 567, 176, 31);
		contentPane.add(textField_GiaBan);
		
		JLabel lblCanNang = new JLabel("C\u00E2n n\u1EB7ng");
		lblCanNang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCanNang.setBounds(466, 613, 126, 47);
		contentPane.add(lblCanNang);
		
		textField_CanNang = new JTextField();
		textField_CanNang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_CanNang.setColumns(10);
		textField_CanNang.setBounds(612, 621, 176, 31);
		contentPane.add(textField_CanNang);
		
		JButton btnXoa = new JButton("Xóa");
		//Dùng các nút nhấn
		btnXoa.addActionListener(action);
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoa.setBounds(68, 689, 133, 37);
		contentPane.add(btnXoa);
		
		JButton btnCapNhat = new JButton("C\u1EADp nh\u1EADt");
		//Dùng các nút nhấn
		btnCapNhat.addActionListener(action);
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCapNhat.setBounds(245, 689, 133, 37);
		contentPane.add(btnCapNhat);
		
		JButton btnLuu = new JButton("L\u01B0u");
		btnLuu.addActionListener(action);
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLuu.setBounds(420, 689, 133, 37);
		contentPane.add(btnLuu);
		
		JButton btnHuyBo = new JButton("H\u1EE7y b\u1ECF");
		//Dùng các nút nhấn
		btnHuyBo.addActionListener(action);
		btnHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHuyBo.setBounds(601, 689, 133, 37);
		contentPane.add(btnHuyBo);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(28, 670, 887, 9);
		contentPane.add(separator_2);
		
		JButton btnHuyTim = new JButton("Hủy tìm");
		btnHuyTim.addActionListener(action);
		btnHuyTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHuyTim.setBounds(782, 29, 115, 47);
		contentPane.add(btnHuyTim);

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
	
    //Hàm đẩy các thông tin đã nhập lên bảng
	public void themMacHangVaoTable(MacHang mh) {
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
	
	//Hàm sửa chữa thông tin cũ và update thông tin mới
	public void themHoacCapNhapMacHang(MacHang mh) {
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

	//Hàm Lưu
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
			
			MacHang mh = new MacHang(maMacHang, tenMacHang, daiLy, ngayNhap, ngayHetHan, giaNhap, giaBan, canNang);
			
			this.themHoacCapNhapMacHang(mh);
		}
		
	//Hàm lấy thông tin từ bảng 
	public MacHang getMacHangDangChon() {
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
		
		MacHang mh = new MacHang(maMacHang, tenMacHang, daiLy, ngayNhap, ngayHetHan, giaNhap, giaBan, canNang);
		return mh;
	}
	
	//Hàm cập nhật
	public void hienThiThongTin() {
		MacHang mh = getMacHangDangChon();
		
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
	
	//Hàm Xóa
	public void thucHienXoa() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
		if(luaChon == JOptionPane.YES_OPTION) {
			MacHang mh = getMacHangDangChon();
			this.model.delete(mh);
			model_table.removeRow(i_row);
		}
	}
	

	//Hàm Tìm kiếm
	public void thucHienTim() {
		//Hàm thực hiện hủy tìm, nếu không có sẽ bị lỗi dữ liệu 
		this.thucHienHuyTim();
		
		//Hàm thực hiện tìm
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
	
	//Hàm hủy tìm và tải lại dữu liệu đã nhập lên bảng
	public void thucHienHuyTim() {
		//Xóa cái tìm trong bảng đi
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
		//Hàm hiện lại danh sách đã nhập
		for (MacHang mh : this.model.getDsMacHang()) {
			this.themMacHangVaoTable(mh);
		}
	}
}
