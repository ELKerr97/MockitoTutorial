import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PartOneTest {
    PartOne partOne;
    Database databaseMock;


    @BeforeEach
    public void setUp() throws Exception {
        partOne = new PartOne();
        databaseMock = Mockito.mock(Database.class);
        partOne.setDatabase(databaseMock);
    }

    @Test
    public void loginTest() {
        Mockito.when(databaseMock.addUser(Mockito.anyString(), Mockito.anyString()))
                .thenReturn("newUserUUID");
        Mockito.when(databaseMock.getUserId(Mockito.anyString(), Mockito.anyString()))
                        .thenReturn("");
        Mockito.when(databaseMock.getUserId("john","pass123"))
                .thenReturn("existingUserUUID");
        String existingUser;
        String newUser;

        existingUser = partOne.login("john", "pass123"); //stores the uuid of john
        newUser = partOne.login("newUser", "newPass"); //stores the uuid of the new user

        Assertions.assertEquals( "existingUserUUID", existingUser); //checks that the uuid matches the one we set earlier
        Assertions.assertEquals("newUserUUID", newUser); //checks that the uuid matches the one we set earlier
    }
}