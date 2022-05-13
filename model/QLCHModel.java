package model;

import java.util.ArrayList;

public class QLCHModel {
	private ArrayList<MacHang> dsMacHang;
	private String luaChon; //Dùng để lưu
<<<<<<< HEAD
	private String tenFile;
=======
>>>>>>> 03c331c258b0e5dee213c76151e2c81dc651a403
	
	public QLCHModel() {
		this.dsMacHang = new ArrayList<MacHang>();
		this.dsMacHang = dsMacHang;
		this.luaChon = "";// Ms vào là rỗng
<<<<<<< HEAD
		this.tenFile = "";
=======
>>>>>>> 03c331c258b0e5dee213c76151e2c81dc651a403
	}
	
	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
<<<<<<< HEAD
	}
	
	public String getTenFile() {
		return tenFile;
	}

	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
=======
>>>>>>> 03c331c258b0e5dee213c76151e2c81dc651a403
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
	//Hàm kiểm tra mặt hàng đã tồn tại chưa 
	public boolean kiemTraTonTai(MacHang mh) {
		for(MacHang daiLy: dsMacHang) {
			if(daiLy.getMaMacHang() == mh.getMaMacHang())
				return true;
		}
		return false;
	}
	
}

