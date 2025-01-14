package zad17;

public class Main {
    public static void main(String[] args) {
        UserAuthentication ua = new UserAuthentication();
        AdminAuthentication aa = new AdminAuthentication();

        System.out.println(ua.login("User123", "password"));
        System.out.println(ua.resetPassword("User123", "password", "newPassword"));
        ua.logout();

        System.out.println(aa.login("User123", "password"));
        System.out.println(aa.resetPassword("User123", "password", "newPassword"));
        aa.logout();
    }
}
