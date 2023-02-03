
/**
 * List of ints for Containers/Lists 
 *
 * @author (Prof R)
 * @version (v1.0 1/24/23)
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
public class ListOfInts
{
    public static void main()
    {
        Ex1();  // ArrayList of ints as a Collection
        Ex2();  // ArrayList of ints as a List
        Ex3();  // LinkedList of ints as a List
        Ex4();  // ArrayList of People as List
        //Ex5();  // ArrayList of People as List
    }

    /**
     * ArrayList of Integers as a Collection
     *
     */

    public static void Ex1()
    {
        System.out.println("ArrayList as a Collection");
        //List listOfInts = new ArrayList<int>(); // Does not compile
        Collection LofInts = new ArrayList<Integer>();  // construct the list of ints using 

        for (int i = 0; i < 10; i++)
        {
            LofInts.add(i);                       // AutoBoxing, kind of like a convert constuctor
        }
        System.out.println(LofInts + " Collection of ints of size " + LofInts.size());

        //        Collections.shuffle(LofInts);             // built in random shuffle method

        System.out.println(LofInts);

        // Collection methods

        System.out.println(LofInts.add(44));     // AutoBoxing
        System.out.println(LofInts.remove(1));  

        System.out.println(LofInts);

        // Collections.sort(LofInts);          // Does not compile

        // System.out.println(LofInts.get(0)); // Does not compile
        // LofInts.set(1, 99);                 // Does not compile

    }

    /**
     * ArrayList of Integers as a List
     *
     */

    public static void Ex2()
    {
        System.out.println("\nArrayList as a List");

        //List listOfInts = new ArrayList<int>(); // Does not compile
        List LofInts = new ArrayList<Integer>();  // construct the list

        for (int i = 0; i < 10; i++)
        {
            LofInts.add(i);                       // AutoBoxing, kind of like a convert constuctor
        }
        System.out.println(LofInts + " List of ints of size " + LofInts.size());

        Collections.shuffle(LofInts);             // built in random shuffle method

        System.out.println(LofInts);

        // Collection methods

        System.out.println(LofInts.add(44));     // AutoBoxing
        System.out.println(LofInts.remove(1));  

        System.out.println(LofInts);

        Collections.sort(LofInts);
        System.out.println(LofInts + " after sort ");

        System.out.println("Object at index 0 is " + LofInts.get(0));
        System.out.println("Object at end is " + LofInts.get(LofInts.size() - 1));  // Random Access

        LofInts.set(1, 99);
        System.out.println(LofInts + " after placing 99 at index 1");               // Random Access

    }

    /**
     * LinkedList of Integers as a List
     *
     */

    public static void Ex3()
    {
        System.out.println("\nLinkedList as a List");

        //List listOfInts = new ArrayList<int>(); // Does not compile
        List LofInts = new LinkedList<Integer>();  // construct the list
        LofInts.isEmpty();

        for (int i = 0; i < 10; i++)
        {
            LofInts.add(i);                       // AutoBoxing, kind of like a convert constuctor
        }
        System.out.println(LofInts + " List of ints of size " + LofInts.size());

        Collections.shuffle(LofInts);             // built in random shuffle method

        System.out.println(LofInts);

        // Collection methods

        System.out.println(LofInts.add(44));     // AutoBoxing
        System.out.println(LofInts.remove(1));  

        System.out.println(LofInts);

        Collections.sort(LofInts);
        System.out.println(LofInts + " after sort ");

        System.out.println("Object at index 0 is " + LofInts.get(0));
        System.out.println("Object at end is " + LofInts.get(LofInts.size() - 1));  // Random Access

        LofInts.set(1, 99);
        System.out.println(LofInts + " after placing 99 at index 1");               // Random Access

    }

    /**
     * ArrayList of Integers as a List
     *
     */

    public static void Ex4()
    {
        System.out.println("\nArrayList of People as a List");

        //List listOfInts = new ArrayList<int>(); // Does not compile
        List LofPeople = new ArrayList<Person1>();  // construct the list

        LofPeople.add(new Person1(1,  "Jake"));
        LofPeople.add(new Person1(42, "Sam"));
        LofPeople.add(new Person1(12, "Kim"));

        System.out.println(LofPeople + " List of People of size " + LofPeople.size());

        Collections.shuffle(LofPeople);             // built in random shuffle method

        System.out.println(LofPeople);

        // Collection methods

        System.out.println(LofPeople.add(new Person1(50, "Mary"))); 
        System.out.println(LofPeople.remove(1));  

        System.out.println(LofPeople);

        //Collections.sort(LofPeople);
        //System.out.println(LofPeople + " after sort ");

        //        System.out.println("Object at index 0 is " + LofInts.get(0));
        //        System.out.println("Object at end is " + LofInts.get(LofInts.size() - 1));  // Random Access

        //        LofInts.set(1, 99);
        //        System.out.println(LofInts + " after placing 99 at index 1");               // Random Access
    }

    /**
     * ArrayList of Integers as a List
     *
     */

    public static void Ex5()
    {
        System.out.println("\nArrayList of People as a List");

        //List listOfInts = new ArrayList<int>(); // Does not compile
        List LofPeople = new ArrayList<Person2>();  // construct the list

        LofPeople.add(new Person2(1,  "Jake"));
        LofPeople.add(new Person2(42, "Sam"));
        LofPeople.add(new Person2(12, "Kim"));

        System.out.println(LofPeople + " List of People of size " + LofPeople.size());

        Collections.shuffle(LofPeople);             // built in random shuffle method
        System.out.println(LofPeople + " List of People after random shuffle");

        // Collection methods

        System.out.println(LofPeople.add(new Person2(50, "Mary"))); 
        System.out.println(LofPeople + " List of People after adding Mary");
        
        System.out.println(LofPeople.remove(1)); 
        System.out.println(LofPeople + " List of People after remove of obj @ index 1");

        Collections.sort(LofPeople);
        System.out.println(LofPeople + " after sort ");

        System.out.println("Object at index 0 is " + LofPeople.get(0));
        System.out.println("Object at end is " + LofPeople.get(LofPeople.size() - 1));  // Random Access

        LofPeople.set(1, new Person2(86, "Max"));
        System.out.println(LofPeople + " after placing Max at index 1");               // Random Access
    }
    
}
