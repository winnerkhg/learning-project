<<<<<<< HEAD
=======
import controller.MainController;
import model.Karyawan;

>>>>>>> 01594527d629bf9c5d7c24e92f9a44a845db988f
public class MainApp {
    public static void main(String [] args){
        MainController mainController = new MainController();
        Karyawan karyawan = new Karyawan(1,"Winner","Tangerang Selatan");
        mainController.insertKaryawan(karyawan);
    }
}


