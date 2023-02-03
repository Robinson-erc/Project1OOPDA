
/**
 * Write a description of class Person2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person2 implements Comparable
{
    private int  id;
    private String name;

    /*
     * constructor method for person 2
     */
    public Person2(int id, String name){
        this.id=id;
        this.name=name;

    }

    /*
     * Accesor for id
     * param none
     * return id
     */
    public int id(){
        return this.id;
    }

    /*
     * Accesor for name
     * param none
     * return name
     */
    public String name(){
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
   
    public int compareTo(Object o){
        return id -((Person2)o).id;
    }
}
