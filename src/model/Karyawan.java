package model;

public class Karyawan {
	private Integer id;
	private String nama;
	private String alamat;

	public Karyawan() {
	}

	public Karyawan(Integer id, String nama, String alamat) {
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

}
