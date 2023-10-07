import org.junit.jupiter.api.Test;
import testing.People;
import testing.Person;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class TestPeople {

    @Test
    public void testAdd(){
        var p1 = new Person(1, "Julio");
        var p2 = new Person(2, "Jordy");
        var p3 = new Person(3, "Tilmar");
        var p4 = new Person(4, "Tanzir");
        var p5 = new Person(5, "Ki");
//        var list = new ArrayList<Person>();
//        list.add(p1);
//        list.add(p2);
//        list.add(p3);
//        list.add(p4);
//        list.add(p5);
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
