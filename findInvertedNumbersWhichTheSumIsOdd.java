import java.util.HashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        Set<Integer> control = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            String invertedSequence = invertSequence(String.valueOf(i));
            int invertedNumber = Integer.parseInt(invertedSequence);
            int sumValue = i + invertedNumber;
            if (!control.contains(invertedNumber)) {
                control.add(i);
                if (sumValue % 2 != 0) {
                    System.out.printf("%s + %s = %s \n", i, invertedNumber, sumValue);
                }
            }
        }
    }

    static String invertSequence(String sequence) {
        char[] ch = new char[sequence.length()];
        for (int i = 0; i < sequence.length(); i++) {
            ch[i] = sequence.charAt(i);
        }
        return invertArray(ch);
    }

    static String invertArray(char[] sequence) {
        char[] inverted = new char[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            inverted[sequence.length - i - 1] = sequence[i];
        }
        return String.valueOf(inverted);
    }

}
