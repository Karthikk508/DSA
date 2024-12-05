import java.util.ArrayList;
import java.util.List;

public class NUmber {
    public static void main(String[] args) {
        int testNum = 675421;
        List<Integer> digitList = new ArrayList<Integer>();
        collectDigits(testNum, digitList);
        Object[] resultArr = digitList.toArray();
        int listSize = resultArr.length;
        for (int listCount = 0; listCount < listSize; listCount++) {
            System.out.println("result["+listCount+"] = "+resultArr[listCount]);
        }
    }

    private static void collectDigits(int num, List<Integer> digits) {
        if (num / 10 > 0) {
            collectDigits(num / 10, digits);
        }
        digits.add(num % 10);
    }
}
