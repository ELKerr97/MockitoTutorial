public class Database {
    Connection myConn;
    Database(){
        myConn = new Connection();
    }

    String addUser(String username, String password){
        //TODO connect to database

        return null;
    }
    String getUserId(String username, String password){
        //TODO
        return null;
    }

    void setConnection(Connection connection){
        myConn = connection;
    }
}
