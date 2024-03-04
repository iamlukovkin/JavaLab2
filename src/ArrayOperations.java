import java.util.ArrayList;

public class ArrayOperations {
    public static ArrayList<Long> BubbleSortByLength(ArrayList<Long> arr) {
        ArrayList<Long> finalArray = new ArrayList<>(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int firstValueLength = Long.toString(arr.get(i)).length();
                int secondValueLength = Long.toString(arr.get(j)).length();
                if (firstValueLength > secondValueLength) {
                    long temp = arr.get(i);
                    finalArray.set(i, arr.get(j));
                    finalArray.set(j, temp);
                }
            }
        }
        return finalArray;
    }

}
