
import controller.MainController;
import model.Karyawan;

public class MainApp {
    public static void main(String [] args){
        MainController mainController = new MainController();

        Karyawan karyawan = new Karyawan(4,"Ari","Sreng");
//        mainController.insertKaryawan(karyawan);
//
//        karyawan.setSemua(4,"Ari","Srengseng");
//        mainController.insertKaryawan(karyawan);

//        mainController.updateKaryawan(karyawan, 4);

//        mainController.deleteKaryawan(3);

//        mainController.createTabel();
//        mainController.deleteTabel("test");
        mainController.readKaryawan("all",0);
        mainController.readKaryawan("by id",1);

    }
}


