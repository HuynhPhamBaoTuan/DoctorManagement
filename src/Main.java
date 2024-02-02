import controller.Management;

public class Main {

    public static void main(String[] args) {
        String title = "========== Doctor Management ============";
        String[] s = new String[]{"Add a Doctor", "Update Doctor", "Delete Doctor", "Search Doctor", "Exit"};
        Management manage = new Management(title, s);
        manage.run();
    }
}
