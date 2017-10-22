import java.util.Queue;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Iterator;

public class Arithmetic {

    //  наибольший общий делитель (Алгоритм Евклида)
    public static long gcd(long a,long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    //  генерация простых числел. Решето Эратосфена
    public static Iterable<Integer> generatePrimeEratosphen(int maxBound) {
        Queue<Integer> queue = new ArrayDeque<Integer>();

        boolean[] primes = new boolean[maxBound];
        for (int i = 0; i < maxBound; i++) {
            primes[i] = true;
        }
        int squareRoot = (int)Math.rint(Math.sqrt(maxBound));
        for (int d = 2; d <= squareRoot; d++) {
            if (primes[d]) {
                for (int j = (int)Math.pow(d, 2); j < maxBound; j += d) {
                    primes[j] = false;
                }
            }
        }
        for(int i = 1; i < maxBound; i++) {
            if(primes[i]) {
                queue.add(i);
            }
        }
        return queue;
    }
    
    public static boolean[] generatePrimeEratosphenTable(int maxBound) {
        boolean[] primes = new boolean[maxBound];
        for (int i = 0; i < maxBound; i++) {
            primes[i] = true;
        }
        int squareRoot = (int)Math.rint(Math.sqrt(maxBound));
        for (int d = 2; d <= squareRoot; d++) {
            if (primes[d]) {
                for (int j = (int)Math.pow(d, 2); j < maxBound; j += d) {
                    primes[j] = false;
                }
            }
        }
        
        return primes;
    }



    private static Iterable<Integer> prms = null;
    //  каноническое разложение на простые числа (Основная теорема арифметики)
    public static Iterable<Integer> canonicalRepresentation(int num) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        if (prms == null) {
            prms = generatePrimeEratosphen(1000000);
        }
        Iterator<Integer> i = prms.iterator();

        // remove 1
        if(i.hasNext()) {
            i.next();
        }

        while (i.hasNext()) {
            int current = i.next();
            if ( current > num) {
                break;
            }
            while (num % current == 0) {
                queue.add(current);
                num /= current;
            }
        }
        if (queue.isEmpty()) {
            queue.add(num);
        }
        return queue;
    }

    // разложение на множители
    public static Iterable<Integer> factoring(int num) {
        ArrayDeque<Integer> result = new ArrayDeque<Integer>();
        
        int prev = -1;
        int size = 0;
    
        for (int i : canonicalRepresentation(num)) {
            if (prev != i) {
                size++;
                prev = i;
            }
        }
        int[] count = new int[size];
        int[] digit = new int[size];


        prev = -1;
        int idx = -1;
        for (int i : canonicalRepresentation(num)) {
            if (prev != i) {
                idx++;   
                digit[idx] = i;
                count[idx]++;
                prev = i;
            }
            else {
                count[idx]++;
            }
        }
        factoring(result, 1, digit, count, size - 1);
        result.removeLast();
        return result;
    }
    
    private static void factoring(ArrayDeque<Integer> result, int mul, int[] digit, int[] count, int depth) {
        if (depth >= 0) {
            int c = count[depth];
            int num = digit[depth];
            for (int i = 0; i <= c; i++) {
                factoring(result, mul, digit, count, depth-1);
                mul *= num;
            }

        }
        else {
            result.add(mul);
        }
    }
}