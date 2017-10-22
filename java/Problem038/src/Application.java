import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.init();
        app.run();
    }
    public void init() { }
    public void run() {
        for (int i = 1; i < 99999; i++) {
            check(i);
        }
    }
    public boolean check(int digit) {
        int productSize = 0;
        int[] product = new int[20];
        int[] digits = new int[10];
        int i = 1;
        int j = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while (productSize < 9) {
            int current = i * digit;
            while (current != 0) {
                if(productSize++ > 9) {
                    return false;
                }
                if (digits[current % 10]++ > 0) {
                    return false;
                }
                stack.push(current % 10);
                current /= 10;
            }
            while(!stack.isEmpty()) {
                product[j++] = stack.pop();
            }
            i++;
        }
        if (digits[0] != 0) {
            return false;
        }
        if (product[0] == 9) {
            for (int k = 0; k < 9; k++) {
                System.out.print(product[k]);
            }
        }
        System.out.println();
        return true;
    }
}