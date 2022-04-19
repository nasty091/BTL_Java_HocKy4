package modul;

import java.util.Date;
import java.util.Objects;

public class MacHang {
	private int maMacHang;
	private String tenMacHang;
	private Tinh xuatXu;
	private Date ngayNhap;
	private Date ngayHetHang;
	private float giaNhap;
	private float giaBan;
	private float canNang;
	
	public MacHang() {
		
	}

	public MacHang(int maMacHang, String tenMacHang, Tinh xuatXu, Date ngayNhap, Date ngayHetHang, float giaNhap,
			float giaBan, float canNang) {
		super();
		this.maMacHang = maMacHang;
		this.tenMacHang = tenMacHang;
		this.xuatXu = xuatXu;
		this.ngayNhap = ngayNhap;
		this.ngayHetHang = ngayHetHang;
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

	public Tinh getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(Tinh xuatXu) {
		this.xuatXu = xuatXu;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public Date getNgayHetHang() {
		return ngayHetHang;
	}

	public void setNgayHetHang(Date ngayHetHang) {
		this.ngayHetHang = ngayHetHang;
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
	public String toString() {
		return "MacHang [maMacHang=" + maMacHang + ", tenMacHang=" + tenMacHang + ", xuatXu=" + xuatXu + ", ngayNhap="
				+ ngayNhap + ", ngayHetHang=" + ngayHetHang + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan
				+ ", canNang=" + canNang + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(canNang, giaBan, giaNhap, maMacHang, ngayHetHang, ngayNhap, tenMacHang, xuatXu);
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
				&& Objects.equals(ngayHetHang, other.ngayHetHang) && Objects.equals(ngayNhap, other.ngayNhap)
				&& Objects.equals(tenMacHang, other.tenMacHang) && Objects.equals(xuatXu, other.xuatXu);
	}
	
	
	
	
	
}
