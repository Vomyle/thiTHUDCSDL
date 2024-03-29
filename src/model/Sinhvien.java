package model;
// Generated May 13, 2023 3:40:33 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Sinhvien generated by hbm2java
 */
@Entity
@Table(name = "sinhvien", catalog = "sinhvien")
public class Sinhvien implements java.io.Serializable {

	private Integer id;
	private String ten;
	private String ngaysinh;
	private float dtb;

	public Sinhvien() {
	}

	public Sinhvien(String ten, String ngaysinh, float dtb) {
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.dtb = dtb;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "ten", nullable = false, length = 50)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Column(name = "ngaysinh", nullable = false, length = 50)
	public String getNgaysinh() {
		return this.ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	@Column(name = "dtb", nullable = false, precision = 12, scale = 0)
	public float getDtb() {
		return this.dtb;
	}

	public void setDtb(float dtb) {
		this.dtb = dtb;
	}

}
