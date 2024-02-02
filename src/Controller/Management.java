package controller;

import java.util.ArrayList;
import model.Doctor;
import responsitory.DoctorResponsitory;
import view.Menu;

public class Management extends Menu {

    private static ArrayList<Doctor> arr = new ArrayList();

    public Management() {
    }

    public Management(String title, String[] s) {
        super(title, s);
    }

    @Override
    public void execute(int choice) {
        DoctorResponsitory Dt = new DoctorResponsitory();
        switch (choice) {
            case 1:
                Dt.createDoctor(arr);
                break;
            case 2:
                Dt.updateDoctor(arr);
                break;
            case 3:
                Dt.deleteDoctor(arr);
                break;
            case 4:
                Dt.searchDoctor(arr);
                break;
            case 5:
                System.out.println("Exited");
                return;
            default:
                System.err.println("Choose 1-5");
                break;
        }
    }
}
