package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;
import rocks.zipcode.assessment2.generics.ageable.Cat;
import rocks.zipcode.assessment2.generics.ageable.Person;

import java.util.List;
import java.util.function.Supplier;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> extends Ageable {

    private int yearOfBirth;
    Shelter<Person> farmHouse = new Shelter<Person>();


    public Shelter() {
        this.yearOfBirth = 0;

          }


    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return farmHouse.size();
    }

    public void add(Object object) {
        farmHouse.add(object);

    }

    public Boolean contains(Object object) {
        Shelter s = new Shelter();
        if(!s.equals(object))
            return false;
        else return true;

    }

    public void remove(Object object) {
    }

    public Object get(Integer index) {
        return null;
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
    }
}