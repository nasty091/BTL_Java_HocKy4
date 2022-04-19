package modul;

import java.util.ArrayList;

public class QLCHModel {
	private ArrayList<MacHang> dsMacHang;

	public QLCHModel() {
		this.dsMacHang = new ArrayList<MacHang>();
	}

	public QLCHModel(ArrayList<MacHang> dsMacHang) {
		this.dsMacHang = dsMacHang;
	}
	
	public ArrayList<MacHang> getDsMacHang() {
		return dsMacHang;
	}
	
	public void setDsMacHang(ArrayList<MacHang> dsMacHang) {
		this.dsMacHang = dsMacHang;
	}
	
	public void insert(MacHang macHang) {
		this.dsMacHang.add(macHang);
	}
	
	public void delete(MacHang macHang) {
		this.dsMacHang.remove(macHang);
	}
	
	public void update(MacHang macHang) {
		this.dsMacHang.remove(macHang);
		this.dsMacHang.add(macHang);
	}
	
	
}

