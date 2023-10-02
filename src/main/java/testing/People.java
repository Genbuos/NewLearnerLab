package testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {
    List<Person> personList = new ArrayList<Person>();



    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
      for (int i =0; i < personList.size(); i ++){
          var person = personList.get(i);
          if(id == person.getId()){
              return person;
          }
      }
        return null;
    }

    public boolean contains(Person person){
        if(personList.contains(person)){
            return true;
        }
        return false;
    }

    public void remove(Person person){
        personList.remove(person);
    }
    public void remove(long id){
        for (int i = 0; i < personList.size(); i++){
            var person = personList.get(i);
            if(person.getId() == id){
                personList.remove(person);
            }
        }
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        // had to cast personList.toArray(); to
        //person because by its self it will return an array of objects
        return (Person[]) personList.toArray();
    }


    public Iterator iterator(){
       return personList.iterator();
    }
}
