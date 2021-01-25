import java.util.ArrayList;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        ArrayList<String> array3 = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            String a = array1[i];
            for (int j = 0; j < array2.length; j++) {
                if (a == array2[j] && !array3.contains(a)) {
                    array3.add(a);
                    break;
                }
            }
        }
        return array3.toArray(new String[0]);
    }
}