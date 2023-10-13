package testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{
    List<E> personList = new ArrayList<>();



    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){
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

    public abstract E[] toArray();


    public Iterator<E> iterator(){
       return personList.iterator();
    }
}
