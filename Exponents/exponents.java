import java.util.*;

public class exponents {




    public static void main(String []args){
        int a = 100;
        int b = 100;
        List<Double> myList = new ArrayList<Double>();

        //sets the base number
        for(int i = 2; i < a; i++) {
            double c = i;

            //sets the exponent
            for (int j = 2; j < a; j++) {
                double d = j;
                //base number to power of J
                double result = Math.pow(c, d);
                //add result to ArrayList
                myList.add(result);
            }
        }

        //to get rid of duplicates add items in myList to LinkedHashSet for no duplicates with order retained
        Set<Double> noDup = new LinkedHashSet<>();
        noDup.addAll(myList);

        //print size with duplicates
        System.out.println("Array size with duplicates: " + myList.size());

        //print size without duplicates
        System.out.println("Array size without duplicates: "+ noDup.size());

        //print the array without duplicates
        System.out.println("Array without duplicates: "+Arrays.toString(noDup.toArray()));

    }

}
