import controller.MainController;
import model.Karyawan;

public class MainApp {
    public static void main(String [] args){
        MainController mainController = new MainController();
        Karyawan karyawan = new Karyawan(1,"Winner","Tangerang Selatan");
        mainController.insertKaryawan(karyawan);
    }
}


