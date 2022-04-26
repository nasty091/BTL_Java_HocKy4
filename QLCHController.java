package Controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JOptionPane;

import model.DaiLy;
import model.MacHang;
import view.QLCHView;

public class QLCHController implements Action {
	private static final String CuaHang = null;
	public QLCHView view;

	public QLCHController(QLCHView view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Hiện khi bấm các nút vd: Đã thêm, Đã Xóa
		String cm = e.getActionCommand();
		JOptionPane.showMessageDialog(view, "Đã " + cm);
		// các chức năng
		if (cm.equals("Thêm")) {
			this.view.xoaForm();
			this.view.model.setLuaChon("Thêm");
		} else if (cm.equals("Lưu")) {
			try {
				//private int maMacHang;
				int maMacHang = Integer.valueOf(this.view.textField_ID.getText());
				//private String tenMacHang;
				String tenMacHang = (this.view.textField_TenMacHang.getText());
				// private DaiLy xuatXu;
				int xuatXu = this.view.comboBox_DaiLy.getSelectedIndex();
				DaiLy daiLy = DaiLy.getDaiLyById(xuatXu-1);
				// private Date ngayNhap;
				Date ngayNhap =  new Date(this.view.textField_NgayNhap.getText());
				// private Date ngayHetHan;
				Date ngayHetHan = new Date(this.view.textField_NgayHetHan.getText());
				// private float giaNhap;
				float giaNhap = Float.valueOf(this.view.textField_GiaNhap.getText());
				// private float giaBan;
				float giaBan = Float.valueOf(this.view.textField_GiaBan.getText());
				// private float canNang;
				float canNang = Float.valueOf(this.view.textField_CanNang.getText());
				
				MacHang mh = new MacHang(maMacHang, tenMacHang, daiLy, ngayNhap, ngayHetHan, giaNhap, giaBan, canNang);
				
				this.view.themHoacCapNhapMacHang(mh);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} else if (cm.equals("Cập nhật")) {
				this.view.hienThiThongTin();
		}
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}
	
}
