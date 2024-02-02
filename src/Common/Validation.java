package Common;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;

public class Validation {

    private final static Scanner in = new Scanner(System.in);

    public static String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.println("Enter again");
            } else {
                return result;
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkCodeExist(ArrayList<Doctor> doctors, String code) {

        for (Doctor doctor : doctors) {
            if (code.equalsIgnoreCase(doctor.getCode())) {
                return false;
            }
        }
        return true;
    }

    public static String checkNewInputString(String oldInfomation) {
        String result = in.nextLine().trim();
        if (result.isEmpty()) {
            return oldInfomation;
        } else {
            return result;
        }
    }

    public static int checkNewInputInt(int oldInformation) {
        String result = in.nextLine().trim();
        if (result.isBlank()) {
            return oldInformation;
        } else {
            while (true) {
                try {
                    int newInformation = Integer.parseInt(result);
                    return newInformation;
                } catch (NumberFormatException e) {
                    System.err.println("Please input number integer");
                    System.out.print("Enter again: ");
                }
            }
        }
    }

    public static boolean checkChangeInfo(Doctor doctor, String code,
            String name, String specialization, int availability) {
        if (doctor.getCode().equalsIgnoreCase(code)
                && doctor.getName().equalsIgnoreCase(name)
                && doctor.getSpecialization().equalsIgnoreCase(specialization)
                && doctor.getAvailability() == availability) {
            return false;
        }
        return true;
    }

}
