package model;

import java.io.Serializable;
import java.util.Date;

public class MacHang implements Serializable {
	private int maMacHang;
	private String tenMacHang;
	private DaiLy xuatXu;
	private Date ngayNhap;
	private Date ngayHetHan;
	private float giaNhap;
	private float giaBan;
	private float canNang;
	
	public MacHang() {
		
	}

	public MacHang(int maMacHang, String tenMacHang, DaiLy xuatXu, Date ngayNhap, Date ngayHetHan, float giaNhap,
			float giaBan, float canNang) {
		this.maMacHang = maMacHang;
		this.tenMacHang = tenMacHang;
		this.xuatXu = xuatXu;
		this.ngayNhap = ngayNhap;
		this.ngayHetHan = ngayHetHan;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.canNang = canNang;
	}

	public int getMaMacHang() {
		return maMacHang;
	}

	public void setMaMacHang(int maMacHang) {
		this.maMacHang = maMacHang;
	}

	public String getTenMacHang() {
		return tenMacHang;
	}

	public void setTenMacHang(String tenMacHang) {
		this.tenMacHang = tenMacHang;
	}

	public DaiLy getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(DaiLy xuatXu) {
		this.xuatXu = xuatXu;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public Date getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public float getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(float giaNhap) {
		this.giaNhap = giaNhap;
	}

	public float getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}

	public float getCanNang() {
		return canNang;
	}

	public void setCanNang(float canNang) {
		this.canNang = canNang;
	}

	@Override
	public int hashCode() {
		return Objects.hash(canNang, giaBan, giaNhap, maMacHang, ngayHetHan, ngayNhap, tenMacHang, xuatXu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MacHang other = (MacHang) obj;
		return Float.floatToIntBits(canNang) == Float.floatToIntBits(other.canNang)
				&& Float.floatToIntBits(giaBan) == Float.floatToIntBits(other.giaBan)
				&& Float.floatToIntBits(giaNhap) == Float.floatToIntBits(other.giaNhap) && maMacHang == other.maMacHang
				&& Objects.equals(ngayHetHan, other.ngayHetHan) && Objects.equals(ngayNhap, other.ngayNhap)
				&& Objects.equals(tenMacHang, other.tenMacHang) && Objects.equals(xuatXu, other.xuatXu);
	}

	@Override
	public String toString() {
		return "MacHang [maMacHang=" + maMacHang + ", tenMacHang=" + tenMacHang + ", xuatXu=" + xuatXu + ", ngayNhap="
				+ ngayNhap + ", ngayHetHan=" + ngayHetHan + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", canNang="
				+ canNang + "]";
	}

	
}
	