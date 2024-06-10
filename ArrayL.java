import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args){
        // ArrayList Constructors
        // . ArrayList a1 = new ArrayList();
        // . ArrayList a2 = new ArrayList(int capacity);
        // . ArrayList a3 = new ArrayList(Collection c);

        ArrayList<Integer> l = new ArrayList<>();


        // 1. Array List 
        // .Implement Class of List InterfaceAddress
        // . Duplicate object are allowed 
        // . Insertion order accepted-->  means that a collection will maintain the order in which elements are added . 
        // .Null values are accepted.
        // . internal data structure of ArrayList is growlable Array
        // . Default Capacity is 10

        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);
        l.add(100);  //  Duplicate values are  Allowed
        l.add(600);
        l.add(null);  // Nullvalue are Allowed

        // add the object at the end position
        System.out.println(l);
        l.add(0, 500);

// Add the object in specified index when we use (int index, obj)
        System.out.println(l);
        l.add(3,900);
        System.out.println(l);

        // set replace the object based on the given Index
        l.set(0, 50);
        System.out.println(l);
        
// contains fill the object based on given index 
        System.out.println(l.contains(500));

        // get the object based on the index
        System.out.println(l.get(4));

        // indexOf is the purpose of this method will give the first occurence of the object.
                System.out.println(l.indexOf(400));

        // lastIndexOf is the purpose of this method  will give the last occurence of the object.
        System.out.println(l.lastIndexOf(100));

        // remove the object based on the index
        l.remove(0);
        System.out.println(l);

// index is not available it will give the -1 .
        System.out.println(l.indexOf(522));

        
// size()--> to get  the size of the collection
        System.out.println(l.size());


        
        // clear--> delete the all object
        // l.clear();
        // System.out.println(l);













    }
}