package repository;

import conifgurasi.DataSource;
import model.Karyawan;

import java.sql.PreparedStatement;

public class KaryawanRepository {
    DataSource dataSource = new DataSource();
    public void insertKayawan(Karyawan karyawan){
        String inserStatement = "INSERT INTO karyawan values(?,?,?)";
        try{
            PreparedStatement stmt= dataSource.connection().prepareStatement(inserStatement);
            stmt.setInt(1,karyawan.getId());
            stmt.setString(2,karyawan.getNama());
            stmt.setString(3,karyawan.getAlamat());
            int res = stmt.executeUpdate();
            System.out.println(res+" Karyawan Inserted");
        }catch (Exception e) {
            System.out.println("Karyawan not Inserted");
        }
    }


}
