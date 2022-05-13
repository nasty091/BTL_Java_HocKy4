package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class DaiLy implements Serializable {
	private int maDaiLy;
	private String tenDaiLy;
	
	
	public DaiLy(int maDaiLy, String tenDaiLy) {
		this.maDaiLy = maDaiLy;
		this.tenDaiLy = tenDaiLy;
	}
	
	public int getMaDaiLy() {
		return maDaiLy;
	}

	public void setMaDaiLy(int maDaiLy) {
		this.maDaiLy = maDaiLy;
	}

	public String getTenDaiLy() {
		return tenDaiLy;
	}

	public void setTenDaiLy(String tenDaiLy) {
		this.tenDaiLy = tenDaiLy;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maDaiLy, tenDaiLy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DaiLy other = (DaiLy) obj;
		return maDaiLy == other.maDaiLy && Objects.equals(tenDaiLy, other.tenDaiLy);
	}

	@Override
	public String toString() {
		return "DaiLy [maDaiLy=" + maDaiLy + ", tenDaiLy=" + tenDaiLy + "]";
	}


	public static ArrayList<DaiLy> getDSDaiLy(){
		String[] arr_daiLy = {"Fresta",
							  "An Farm",
							  "Trái cây nhập khẩu CEVIS",
							  "Shop trái cây Miền Nam",
							  "Klever Fruits",
							  "Shop quà tặng trái cây",
							  "Greeny house",
							  "Minh Phương Fruit",
							  "FS – Trái Cây Tươi",
							  "Han Fruit",
							  "Trái cây nhập khẩu Vinfruit",
							  " Khang Foods & Fruits",
							  "GreenSpace Store",
							  "Rau quả Bình thuận",
							  "Garden Market",
							  "Smart Fruits",
							  "Trái cây 141",
				
		};
		ArrayList<DaiLy> listDaiLy = new ArrayList<DaiLy>();
		int i = 0;
		for (String tenDaiLy : arr_daiLy) {
			DaiLy t = new DaiLy(i, tenDaiLy);
			listDaiLy.add(t);
		}
		return listDaiLy;
	}
	
	public static DaiLy getDaiLyById(int xuatXu) {
		return DaiLy.getDSDaiLy().get(xuatXu);
	}

	public static DaiLy getDaiLyByTen(String tenDaiLy) {
		ArrayList<DaiLy> listDaiLy = DaiLy.getDSDaiLy();
		for(DaiLy daiLy : listDaiLy) {
			if(daiLy.tenDaiLy.equals(tenDaiLy))
				return daiLy;
		}
		return null;
	}
	
}
