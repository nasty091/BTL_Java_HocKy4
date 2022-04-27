package model;

import java.util.Objects;

public class DaiLy {
	private String tenDaiLy;
	private String DiaChi;
	private int SDT;
	
	public DaiLy(String tenDaiLy, String diaChi, int sDT) {
		super();
		this.tenDaiLy = tenDaiLy;
		DiaChi = diaChi;
		SDT = sDT;
	}

	public String getTenDaiLy() {
		return tenDaiLy;
	}

	public void setTenDaiLy(String tenDaiLy) {
		this.tenDaiLy = tenDaiLy;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public int getSDT() {
		return SDT;
	}

	public void setSDT(int sDT) {
		SDT = sDT;
	}

	@Override
	public String toString() {
		return "Daily [tenDaiLy=" + tenDaiLy + ", DiaChi=" + DiaChi + ", SDT=" + SDT + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(DiaChi, SDT, tenDaiLy);
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
		return Objects.equals(DiaChi, other.DiaChi) && SDT == other.SDT && Objects.equals(tenDaiLy, other.tenDaiLy);
	}
	
}
