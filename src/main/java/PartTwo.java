import java.sql.SQLException;
import java.util.UUID;

public class PartTwo {
    Database2 database;
    String errorMesage;


    PartTwo(){
        database = new Database2();
    }
    PartTwo(Database2 newDatabase) {database = newDatabase;}

    String login(String username, String password){
        try{
            return database.getUserId(username,password);
        } catch (SQLException e){
            errorMesage = "It appears we are having a bit of trouble, please try again later";
            return "";
        }
    }

    String register(String username, String password, String email, String accountType) throws SQLException {
        String uuid = UUID.randomUUID().toString(); //note: UUID stands for universally unique id
        database.addUser(username, password, email, uuid, accountType);
        return accountType;
    }

    void logAccountUse(String uuid){
        String accountType = database.getAccountType(uuid);
        switch (accountType){
            case "Admin": database.logAdminUse(uuid);
                break;
            case "Staff": database.logStaffUse(uuid);
                break;
            case "Student" : database.logStudentUse(uuid);
                break;
                default:
                    break;
        }

    }

    void deleteUserAccount(String username, String password) {
        try {
            String uuid = database.getUserId(username, password);
            if(!database.deleteUserAccount(uuid)) {
                database.logErrorMessage("Deletion attempt: User was not deleted");
            }
        } catch (SQLException e) {
            database.logErrorMessage("SQL Error during Deletion");
        }
    }

}
