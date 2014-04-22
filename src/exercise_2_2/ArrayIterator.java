package exercise_2_2;

import java.util.ArrayList;

public class ArrayIterator {
    public static void main (String[] args) {
        ArrayList<Float> fishLengthList = new ArrayList<Float>();
        fishLengthList.add(10.0f);
        fishLengthList.add(15.5f);
        fishLengthList.add(18.0f);
        fishLengthList.add(29.5f);
        fishLengthList.add(45.5f);
        for (Float f: fishLengthList) if (f >= 28) System.out.println(f);

    }

}
