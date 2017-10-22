public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.init();
        app.run();
    }
    public void init() { }
    public void run() {

        // precompute factorial for one digint
        int[] fact = new int[10];
        for (int i = 0; i < 10; i++) {
            fact[i] = 1;
            for (int j = 1; j <= i; j++) {
                fact[i] *= j;
            }
        }

        int result = 0;

        for (int number = 1; number < 1000000; number++) {
            int current = number;
            int copyCurrent = current;
            int chainLength = 0;
            while (true) {
                copyCurrent = current;
                chainLength++;
                
                if (current == 169 || current == 363601 || current == 1454) {
                    chainLength+=2;
                    break;
                }
                if (current == 871 || current == 45361) {
                    chainLength++;
                    break;
                }
                if (current == 872 || current == 45362) {
                    chainLength++;
                    break;
                }
                if (chainLength > 61) {
                    System.out.println("Error");
                    return;
                }
                int sum = 0;
                while (current != 0) {
                    sum += fact[current % 10];
                    current /= 10;
                }

                //System.out.print(" -> ");
                //System.out.print(sum);
                if (copyCurrent == sum) {
                    break;
                }
                current = sum;
            }
            if (chainLength == 60) {
                result++;
                System.out.print(number);
                System.out.print(":");
                System.out.println(chainLength);
            }
        }
        System.out.println(result);
    }


}