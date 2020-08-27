import java.util.TreeSet;

public class Lesson3 {

    public static void main(String[] args) {
        // System.out.println(factorial(5));
        // System.out.println(reverseString("llort"));
        //System.out.println(isPrime(18));
        int[] marks = {1, 2, 3, 4};
        System.out.println(sum(sort(marks)));
    }

    public static int sum(int x, int y) {
        // TODO liida kokku ja tagasta x ja y väärtus
        return x + y;
    }

    public static int sum(int[] x) {
        // Todo liida kokku kõik numbrid massivis x
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int x) {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 4*3*2*1 = 24
        if (x >= 1)
            return x * factorial(x - 1);
        else
            return 1;
    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}

        int counter = 0;
        int[] result = new int[a.length];
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < a.length; i++) {
            treeSet.add(a[i]);
        }
        for (int x : treeSet) {
            result[counter] = x;
            counter++;
        }

        return result;
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        // Näiteks:
        // a = "Test";
        // return tseT";
        String returnString = "";
        for (int i = 0; i < a.length(); i++) {
            returnString = a.substring(i, i + 1) + returnString;
        }
        return returnString;
    }

    public static boolean isPrime(int x) {
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        for (int i = 2; i < x; i++)
            if (x % i == 0) {
                return false;
            }

        return true;
    }
}
