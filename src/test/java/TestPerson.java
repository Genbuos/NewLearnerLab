
import org.junit.jupiter.api.Test;
import testing.Person;
//this import allowed me to access the assert Methods in JUnit
import static org.junit.jupiter.api.Assertions.*;
public class TestPerson {
    @Test
    public void  testConstructor(){
        var p1 = new Person(1,"Naiya");
        var actual = "Naiya";

        assertEquals(1, p1.getId());

        assertEquals(actual, p1.getName());
    }


    @Test
    public void testSetName() {
        var jordy = new Person(1);

        jordy.setName("Jordy");

        var actual = "Jordy";

        assertEquals(actual, jordy.getName());
    }
}
