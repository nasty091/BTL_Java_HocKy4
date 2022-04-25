package model;

import java.util.ArrayList;

public class QLCHModel {
	private ArrayList<MacHang> dsMacHang;

	public QLCHModel(ArrayList<MacHang> dsMacHang) {
		super();
		this.dsMacHang = dsMacHang;
	}

	public ArrayList<MacHang> getDsMacHang() {
		return dsMacHang;
	}

	public void setDsMacHang(ArrayList<MacHang> dsMacHang) {
		this.dsMacHang = dsMacHang;
	}
	//Hàm thêm hàng
	public void insert(MacHang macHang) {
		this.dsMacHang.add(macHang);
	}
	//Hàm xóa hàng
	public void delete(MacHang macHang) {
		this.dsMacHang.remove(macHang);
	}
	//Hàm cập nhập hàng
	public void update(MacHang macHang) {
		this.dsMacHang.remove(macHang);
		this.dsMacHang.add(macHang);
	}
	
}

