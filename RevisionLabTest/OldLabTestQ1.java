package RevisionLabTest;

import java.util.ArrayList;
import java.util.Random;

public class OldLabTestQ1 {
    public static int randomInteger(ArrayList<Integer> list) {
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(10) + 1);
        }

        int searchKey = rand.nextInt(10) + 1;
        return searchKey;
    }

    public static int lastIndexOf(ArrayList<Integer> list, int target) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (target == list.get(i))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int searchKey = randomInteger(list);

        System.out.println("Random List: " + list);
        System.out.println("Random Search Key Value: " + searchKey);
        System.out.println("Last Index of Search Key Value is: " + lastIndexOf(list, searchKey));
    }
}
