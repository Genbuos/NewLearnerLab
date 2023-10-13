import org.junit.jupiter.api.Test;
import testing.People;
import testing.Person;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class TestPeople {

    @Test
    public void testAdd(){
        var p1 = new Person(1, "Julio");

        var people = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        people.add(p1);
        assertNotNull(people);
    }

    @Test
    public void testRemove(){
        var jordy = new Person(1, "j");
        var list = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        list.add(jordy);
        list.remove(jordy);
        assertFalse(list.contains(jordy));
    }

    @Test
    public void testFindById(){
        var devon = new Person(1,"Devon");
        var ppl = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        ppl.add(devon);
        assertTrue(ppl.findById(1) == devon);
    }


}
