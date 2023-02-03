
/**
 * Very simple basic Person class
 *
 * @author (Prof R)
 * @version (v2.0, 01/24/2023)
 */
public class Person1 
{
    // attributes/data memebers
    private int     id;
    private String  name;

    /**
     * Constructor for objects of class Person
     */
    public Person1(int id, String name)
    {
        this.id   = id;
        this.name = name;
    }

    /**
     * Accessor for id
     * 
     * @param  none
     * @return the id
     */
    public int GetId()
    {
        return this.id;
    }

    /**
     * Accessor for name
     * 
     * @param  none
     * @return the name
     */
    public String GetName()
    {
        return this.name;
    }

    /**
     * Mutator for id
     * 
     * @param  none
     * @return the id
     */
    public void SetId(int id)
    {
        this.id = id;
    }

    /**
     * Mutator for name
     * 
     * @param  none
     * @return the name
     */
    public void SetName(String name)
    {
        this.name = name;
    }
    @Override
    public String toString(){
       return (id+" "+name);
    }
}
