package ca.durhamcollege.oop3200f2022week8b;

public class Person
{
    // Private Instance Members (Data Fields)
    String m_name;
    int m_age;

    // Getters and Setters

    /**
     * This method returns the Person object's name field
     * @return
     */
    public String getName()
    {
        return m_name;
    }

    /**
     * This method sets the Person object's name field
     * @param name
     */
    public void setName(String name)
    {
        m_name = name;
    }

    /**
     * This method returns the Person object's age field
     * @return
     */
    public int getAge()
    {
        return m_age;
    }

    /**
     * This method sets the Person object's age field
     * @param age
     */
    public void setAge(int age)
    {
        m_age = age;
    }

    /**
     * This method sets both the Person object's name and age fields
     * @param name {String}
     * @param age {int}
     */
    public void set(String name, int age)
    {
        setName(name);
        setAge(age);
    }

    // Constructor


    /**
     * Person parameterized Constructor that takes both name and age
     *
     * @param name {String}
     * @param age {int}
     * */
    public Person(String name, int age)
    {
        m_name = name;
        m_age = age;
    }

    /**
     * Default constructor - sets name and age to placeholder values
     */
    public Person()
    {
        m_name = "Unknown";
        m_age = 0;
    }

    // Public Methods

    /**
     * This method outputs the Person's name + " says Hello!"
     */
    public void saysHello()
    {
        System.out.println(getName() + " says Hello!");
    }

    // Private Methods

    // Overridden Methods

    /**
     * This method overrides the built-in toString method belonging to the Object superclass
     * @return
     */
    @Override
    public String toString()
    {
        return "Person ( Name: " + getName() + ", Age: " + getAge() + " )";
    }
}
