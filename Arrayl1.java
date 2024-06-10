import java.util.ArrayList;

public class Arrayl1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(100);
        l1.add(200);
        l1.add(300);



        ArrayList<Integer> l2 = new ArrayList<>();

        l2.add(100);
        l2.add(400);
        l1.add(500);
        l2.add(600);


        // if you want to add one collection at the end of another collection.
        
        // l2.addAll(l1);



        // add the value based on specified index.

        // l2.addAll(0,l1);


// Reatain all the elements from l1 in l2.

        l2.retainAll(l1);

        System.out.println(l2);






        

    }
}
