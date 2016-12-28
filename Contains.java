/**
 * Created by joellof on 2016-12-28.
 */
public class Contains {
    public static void main(String args[]) {

        int[] f = {1, 2, 3, 4, 5, 1, 2, 3, 9};
        int[] g = {2, 3, 2};

        System.out.println(containsAsSequence(f, g));

    }

    public static boolean containsAsSequence(int[] source, int[] target) {

        int p = 0;

        if (source == null || target == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        for (int i = 0; i < source.length; i++) {
            if (source[i] == target[0]) {
                for (int n = 0; n < target.length; n++) {
                    if (source[i + n] == target[n])
                        p++;
                    else
                        p = 0;
                    if (p == target.length)
                        return true;
                }
            }
        }

    return false;

}
    }


