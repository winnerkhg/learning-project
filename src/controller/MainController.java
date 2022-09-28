package controller;


import model.Karyawan;
import repository.KaryawanRepository;

public class MainController {
    KaryawanRepository karyawanRepository = new KaryawanRepository();

    // CRUD (Create, Read, Update, Delete)
    public void insertKaryawan(Karyawan karyawan) {
	    Karyawan modelKaryawan = new Karyawan();
        modelKaryawan.setAlamat(karyawan.getAlamat());
        modelKaryawan.setId(karyawan.getId());
        modelKaryawan.setNama(karyawan.getNama());
        karyawanRepository.insertKaryawan(modelKaryawan);
    }

    public void readKaryawan (String jenis, Integer id) { // read tabel
        // "all" atau "by id"
        karyawanRepository.readKaryawan(jenis, id);
    }

    public void updateKaryawan (Karyawan karyawan, Integer id) { // delete menggunakan id
        karyawanRepository.updateKaryawan(karyawan, id);
    }

    public void deleteKaryawan (Integer id) { // delete menggunakan id
        karyawanRepository.deleteKaryawan(id);
    }



    public void createTabel () { // buat tabel
        karyawanRepository.createTabel();
    }

    public void deleteTabel (String namaTabel) { // delete tabel
        karyawanRepository.deleteTabel(namaTabel);
    }
}
