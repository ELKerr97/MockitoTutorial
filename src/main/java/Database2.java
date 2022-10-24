import java.sql.SQLException;

public class Database2 {
    String addUser(String username, String password, String email, String uuid, String accountType) throws SQLException {
        //TODO connect to database
        return null;
    }
    String getUserId(String username, String password) throws SQLException{
        //TODO
        return null;
    }

    public String getAccountType(String uuid) {
        //TODO
        return null;
    }

    public void logAdminUse(String uuid) {
        //TODO
    }

    public void logStaffUse(String uuid) {
        //TODO
    }

    public void logStudentUse(String uuid) {
        //TODO
    }

    public boolean deleteUserAccount(String uuid)
    {
        //TODO
        return false;
    }

    public void logErrorMessage(String message)
    {
        //TODO
    }
}
