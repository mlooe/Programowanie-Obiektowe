package Zad3;

public class AuthenticationTest {
    public static void main(String[] args) {
        UserAuthentication userAuthentication = new UserAuthentication();
        AdminAuthentication adminAuthentication = new AdminAuthentication();


        System.out.println(userAuthentication.login("asdf", "password"));
        userAuthentication.logout();
        System.out.println(userAuthentication.resetPassword("asdf", "password", "newPassword"));

        System.out.println(adminAuthentication.login("bvcx", "haslo"));
        adminAuthentication.logout();
        System.out.println(adminAuthentication.resetPassword("bvcx", "haslo", "noweHaslo"));

    }
}
