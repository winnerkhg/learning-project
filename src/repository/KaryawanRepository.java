package repository;

import configurasi.DataSource;
import model.Karyawan;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class KaryawanRepository {
    DataSource dataSource = new DataSource();

    // CRUD (Create, Read, Update, Delete)
    public void insertKaryawan (Karyawan karyawan) {
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

    public void readKaryawan (String jenis, Integer id) {
        String insertStatement = "";
        if (jenis == "all") {
            insertStatement = "SELECT * FROM karyawan";
        } else if (jenis == "by id") {
            insertStatement = "SELECT * FROM karyawan WHERE id = ?";
        }
        try {
            PreparedStatement stmt= dataSource.connection().prepareStatement(insertStatement);
            if (jenis == "by id") {
                stmt.setInt(1,id);
            }
            ResultSet rs = stmt.executeQuery();
            System.out.println("Hasil Read:");
            while(rs.next()){
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\n");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Gagal Baca");
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



    public void createTabel () {
        String insertStatement = "CREATE TABLE test(id int PRIMARY KEY NOT NULL AUTO_INCREMENT, nama varchar(45), telepon varchar(15))";
        try {
            PreparedStatement stmt= dataSource.connection().prepareStatement(insertStatement);
            int res = stmt.executeUpdate();
            System.out.println(res+" Tabel Created");
        } catch (Exception e) {
            System.out.println("Tabel not Created");
        }
    }

    public void deleteTabel (String namaTabel) {
        String insertStatement = "DROP TABLE " + namaTabel;
        try {
            PreparedStatement stmt= dataSource.connection().prepareStatement(insertStatement);
            int res = stmt.executeUpdate();
            System.out.println(res+" Tabel Deleted");
        } catch (Exception e) {
            System.out.println("Tabel not Deleted");
            System.out.println(e);
        }
    }
}
