package repository;

import configurasi.DataSource;
import model.Karyawan;

import java.sql.PreparedStatement;

public class KaryawanRepository {
    DataSource dataSource = new DataSource();
    public void insertKaryawan(Karyawan karyawan) {
        String insertStatement = "INSERT INTO karyawan VALUES(?,?,?)";
        try {
            PreparedStatement stmt= dataSource.connection().prepareStatement(insertStatement);
            stmt.setInt(1,karyawan.getId());
            stmt.setString(2,karyawan.getNama());
            stmt.setString(3,karyawan.getAlamat());
            int res = stmt.executeUpdate();
            System.out.println(res+" Karyawan Inserted");
        } catch (Exception e) {
            System.out.println("Karyawan not Inserted");
        }
    }
    public void updateKaryawan (Karyawan karyawan, Integer id) {
        String insertStatement = "UPDATE karyawan " +
            "SET id=?, nama=?, alamat=? " +
            "WHERE id=?";
        try {
            PreparedStatement stmt= dataSource.connection().prepareStatement(insertStatement);
            stmt.setInt(1,karyawan.getId());
            stmt.setString(2,karyawan.getNama());
            stmt.setString(3,karyawan.getAlamat());
            stmt.setInt(4,id);
            int res = stmt.executeUpdate();
            System.out.println (res + " Karyawan Updated");
        } catch (Exception e) {
            System.out.println ("Karyawan not Updated");
            System.out.println (e);
        }
    }
    public void deleteKaryawan (Integer id) {
        String insertStatement = "DELETE FROM karyawan WHERE id=?";
        try {
            PreparedStatement stmt= dataSource.connection().prepareStatement(insertStatement);
            stmt.setInt(1, id);
            int res = stmt.executeUpdate();
            System.out.println (res + " Karyawan Deleted");
        } catch (Exception e) {
            System.out.println ("Karyawan not Deleted");
        }
    }
}
