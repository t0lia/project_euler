public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.init();
        app.run();
    }
    public void init() { }
    public void run() {
        int max = 0;
        int maxCounter = 0;
 LOOP:  for (int num = 1; num < 1000000; num++) {
            int i = num;
            int counter = 0;
            
            boolean[] checked = new boolean[1000000];
            for (int j = 0; j < 1000000; j++) {
                checked[j] = false;
            }
            while (true) {

                //System.out.printf("%d ", i);
                if (i >= 1000000) {
                    continue LOOP;
                }
                if (checked[i] && i == num) {
                //    System.out.printf("\nBreaks on %d\n", i);
                    break;
                }
                else if (checked[i] && i != num) {
                    continue LOOP;
                }
              /*  else if (checked[i] && i == num) {
                //    System.out.printf("\nBreaks on %d", i);
                    break;
                }*/
                else {
                    checked[i] = true;
                }
                i = next(i);
                counter++;
            }
            if (maxCounter < counter) {
                maxCounter = counter;
                max = num;
            }
            if(counter >= 3) 
                System.out.printf("%d : length is %d\n",num , counter);
            if(counter >= 1) {
                //System.out.printf("%d : %d\n",num, counter); 
            }
        }
        System.out.printf("Longest chain start with %d\n", max);
        

        boolean[] checked = new boolean[1000000];
        int min = max;
        int i = max;
        while (true) {
            if (min > i) {
                min = i;
            }
            i = next(i);
            if (checked[i]) {
                break;
            }
            else {
                checked[i] = true;
            }
        }
        System.out.printf("Smallest member is %d\n", min);
    }

    public static int next(int num) {
        int sum = 0;
        for (int i : Arithmetic.factoring(num)) {
            sum += i;
        }
        return sum;
    }
}