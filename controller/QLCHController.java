package controller;

import java.awt.event.ActionEvent;

public class QLCHController implements Action {
	private static final String CuaHang = null;
	public QLCHView view;

	public QLCHController(QLCHView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Hiện khi bấm các nút vd: Đã thêm, Đã Xóa
		String cm = e.getActionCommand();
		// các chức năng
		if (cm.equals("Lưu")) {
			try {
				this.view.thucHienLuu();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} else if (cm.equals("Cập nhật")) {
				this.view.hienThiThongTin();
		} else if (cm.equals("Xóa")) {
				this.view.thucHienXoa();
		} else if (cm.equals("Hủy bỏ")) {
				this.view.xoaForm();
		} else if (cm.equals("Tìm")) {
				this.view.thucHienTim();
		} else if (cm.equals("Hủy tìm")) {
				this.view.thucHienHuyTim();
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
