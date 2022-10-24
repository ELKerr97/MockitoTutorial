public class PartOne {
    Database database;
    PartOne(){
        database = new Database();
    }


    //returns the uuid of the user and creates a user if not already present
    String login(String username, String password){
        final String NO_USER = "";

        //database.getUserId() tries to get a user from the database. and returns "" if none found.
        if(database.getUserId(username, password).equals(NO_USER)){
            return database.addUser(username, password); //returns a new user ID if the original one isn't found.
        } else {
            return database.getUserId(username, password); //returns the ID of the user if found.
        }
    }

    void setDatabase(Database database){ //this is used to replace or inject the database being used by this class
        this.database = database;
    }
}
