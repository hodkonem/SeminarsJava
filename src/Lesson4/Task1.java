package Lesson4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task1 {
    public static void main(String[] args) {
        Deque<Integer> num1 = new ArrayDeque<>(Arrays.asList(-3, 2, 1));
        Deque<Integer> num2 = new ArrayDeque<>(Arrays.asList(5, 4, 3));

        // Умножение
        Deque<Integer> product = convertNumberToDeque(convertDequeToNumber(num1) * convertDequeToNumber(num2));
        System.out.println(product);

        // Сложение
        Deque<Integer> sum = convertNumberToDeque(convertDequeToNumber(num1) + convertDequeToNumber(num2));
        System.out.println(sum);
    }

    // Конвертация из числа в список
    public static Deque<Integer> convertNumberToDeque(int num) {
        Deque<Integer> deque = new ArrayDeque<>();
        String strNum = String.valueOf(num);
        for (char digit : strNum.toCharArray()) {
            if (digit == '-') {
                deque.add(-Character.getNumericValue(strNum.charAt(1)));
                strNum = strNum.substring(2);
                continue;
            }
            deque.add(Character.getNumericValue(digit));
        }
        return deque;
    }

    public static int convertDequeToNumber(Deque<Integer> deque) {
        StringBuilder strNum = new StringBuilder();
        while (!deque.isEmpty()) {
            int dig = deque.removeLast();
            if (dig < 0) {
                strNum.append("-");
                dig *= -1;
            }
            strNum.append(dig);
        }
        return Integer.parseInt(strNum.toString());
    }
}
