package zad17;

public class UserAuthentication implements Authentication {
    @Override
    public boolean login(String username, String password) {
        return true;
    }

    @Override
    public void logout() {
        System.out.println("User logged out");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return true;
    }
}
