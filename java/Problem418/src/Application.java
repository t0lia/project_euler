import java.util.Arrays;
import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.init();
        app.run();
    }
    public void init() { }
    public void run() {
        //System.out.println(Long.MAX_VALUE / (long)Math.pow(10,18));
        long[] bucket = getBucketFact(20);


//  I part
        long sum = Long.MAX_VALUE;
        long[] triple = new long[3];
        for (int k = 0; k < 10000; k++) {

            shuffle(bucket);

            long a = 1, b = 1, c = 1;
            for (int i = 0; i < bucket.length; i++) {
                if (a <= b && a <= c) {
                    a *= bucket[i];
                }else if (b <= a && b <= c) {
                    b *= bucket[i];
                }else {
                    c *= bucket[i];
                }

            }

          
            if (sum > a + b + c) {
                triple[0] = a; triple[1] = b; triple[2] = c;
                sum = a + b + c;
                System.out.printf("a = %d, \tb = %d, \tc = %d, \tsum = %d\n", a, b, c, sum);
            }

        }

//  II part
        Arrays.sort(triple);
/*
        
        System.out.printf("%d : ", triple[0]);
        for (int i : Arithmetic.factoring(triple[0])) {
            System.out.printf(" %d", i);
        }
        System.out.printf("\n");
        System.out.printf("%d : ", triple[1]);
        for (int i : Arithmetic.factoring(triple[1])) {
            System.out.printf(" %d", i);
        }
        System.out.printf("\n");
        System.out.printf("%d : ", triple[2]);
        for (int i : Arithmetic.factoring(triple[2])) {
            System.out.printf(" %d", i);
        }
        System.out.printf("\n");

*/
        if (Math.random() > .3) {
            long swap = triple[2];
            triple[2] = triple[1];
            triple[1] = swap;
        }

        for (int l = 0; l < 1000000; l++) {
            long iFactor = 1;
            long jFactor = 1;
            float delta = (float)triple[2]/triple[0]/2;
            float eps = 100;
            Arrays.sort(triple);
            for (int i : Arithmetic.factoring(triple[0])) {
                for (int j : Arithmetic.factoring(triple[2])) {
                    if ( Math.abs(1 - (float)j/i) < eps && i < j) {
                        eps = Math.abs(delta - (float)j/i);
                        iFactor = i;
                        jFactor = j;
                    }
                }
            }
     
//            System.out.println(iFactor);
//            System.out.println(jFactor);
    
            
            if (triple[0] * jFactor / iFactor + triple[2] * iFactor / jFactor < triple[0] + triple[2]) {
                triple[0] = triple[0] * jFactor / iFactor;
                triple[2] = triple[2] * iFactor / jFactor;
                System.out.printf("a = %d, \tb = %d, \tc = %d, \tsum = %d\n", triple[0], triple[1], triple[2], triple[0] + triple[1] + triple[2]);
            }
 //           Arrays.sort(triple);

   /*
            System.out.printf("%d : ", triple[0]);
            for (int i : Arithmetic.factoring(triple[0])) {
                System.out.printf(" %d", i);
            }
            System.out.printf("\n");
            System.out.printf("%d : ", triple[1]);
            for (int i : Arithmetic.factoring(triple[1])) {
                System.out.printf(" %d", i);
            }
            System.out.printf("\n");
            System.out.printf("%d : ", triple[2]);
            for (int i : Arithmetic.factoring(triple[2])) {
                System.out.printf(" %d", i);
            }
            System.out.printf("\n");
    */
            
        }

    }//1177163577579225600
     //1177163567559383040
     //1177163565500041920
     //1177163565441822720
    public static long[] getBucket(int num) {
        int size = 0;
        Stack<Long> stack = new Stack<Long>();
        for (long i : Arithmetic.canonicalRepresentation(num)) {
            stack.push(i);
        }
        long[] bucket = new long[stack.size()];
        for (int i = 0; !stack.isEmpty(); i++) {
            bucket[i] = stack.pop();
        }
        return bucket;
    }
    public static long[] getBucketFact(int num) {
        int size = 0;
        Stack<Long> stack = new Stack<Long>();
        for (int n = num; n > 1 ; n--) {
            for (long i : Arithmetic.canonicalRepresentation(n)) {
                stack.push(i);
            }
        }

        long[] bucket = new long[stack.size()];
        for (int i = 0; !stack.isEmpty(); i++) {
            bucket[i] = stack.pop();
        }
        return bucket;
    }
    public static void shuffle(long[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // choose index uniformly in [i, N-1]
            int r = i + (int) (Math.random() * (N - i));
            long swap = a[r];
            a[r] = a[i];
            a[i] = swap;
        }
    }
}