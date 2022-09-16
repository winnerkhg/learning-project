package controller;


public class MainController {
	private MainController Karyawan;
	private MainController Absen;
	
	   public MainController(MainController karyawan, MainController absen) {  
	          this.Karyawan  = Karyawan; 
	          this.Absen  = Absen; 
	
	   }
	   
	   ////Setter getter Karyawan
	   public void setId(String id) {
			Karyawan.setId(id);
			}
	   public String getId() {
			return Karyawan.getId();
			}
	   
	   public void setNama(String nama) {
			Karyawan.setNama(nama);
			}
	   public String getNama() {
			return Karyawan.getNama();
			}
	   public void setAlamat(String alamat) {
			Karyawan.setAlamat(alamat);
			}
	   public String getAlamat() {
			return Karyawan.getAlamat();
			}
	   
	   //Setter getter absen
		public void setStart(String start) {
			Absen.setStart(start);
		}
		public String getStart(String start) {
			return Absen.getStart(start);
		}
		public void setEnd(String end) {
			Absen.setEnd(end);
		}
		public String getEnd(String end) {
			return Absen.getEnd(end);
		}

		

		
}
