package controller;


import model.Karyawan;
import repository.KaryawanRepository;

public class MainController {
    KaryawanRepository karyawanRepository = new KaryawanRepository();
	public void insertKaryawan(Karyawan karyawan) {
	    Karyawan modelKaryawan = new Karyawan();
        modelKaryawan.setAlamat(karyawan.getAlamat());
        modelKaryawan.setId(karyawan.getId());
        modelKaryawan.setNama(karyawan.getNama());
        karyawanRepository.insertKaryawan(modelKaryawan);
    }
    public void updateKaryawan (Karyawan karyawan, Integer id) { // delete menggunakan id
        karyawanRepository.updateKaryawan(karyawan, id);
    }
    public void deleteKaryawan (Integer id) { // delete menggunakan id
        karyawanRepository.deleteKaryawan(id);
    }

}
