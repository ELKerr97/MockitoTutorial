import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PartOneTest {
    PartOne partOne;
    Database databaseMock;


    @BeforeEach
    public void setUp() throws Exception {
        partOne = new PartOne();
    }

    @Test
    public void loginTest() {
        String existingUser;
        String newUser;

        existingUser = partOne.login("john", "pass123"); //stores the uuid of john
        //newUser = partOne.login("newUser", "newPass"); //stores the uuid of the new user

        Assertions.assertEquals( "existingUserUUID", existingUser); //checks that the uuid matches the one we set earlier
        //Assertions.assertEquals("newUserUUID", newUser); //checks that the uuid matches the one we set earlier
    }
}