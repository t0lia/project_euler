public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.init();
        app.run();
    }
    public void init() { }
    public void run() {

        for (long i = 1; i < Long.MAX_VALUE; i++) {
            if (check(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public boolean check(long Nx1) {
        int[] digNx1 = new int[10];
        int[] digNx2 = new int[10];
        int[] digNx3 = new int[10];
        int[] digNx4 = new int[10];
        int[] digNx5 = new int[10];
        int[] digNx6 = new int[10];

        long Nx2 = 2 * Nx1;
        long Nx3 = 3 * Nx1;
        long Nx4 = 4 * Nx1;
        long Nx5 = 5 * Nx1;
        long Nx6 = 6 * Nx1;

        while(Nx1 != 0) {
            digNx1[(int)(Nx1 % 10)]++;
            Nx1 = Nx1 / 10;
        }

        while(Nx2 != 0) {
            digNx2[(int)(Nx2 % 10)]++;
            Nx2 = Nx2 / 10;
        }

        while(Nx3 != 0) {
            digNx3[(int)(Nx3 % 10)]++;
            Nx3 = Nx3 / 10;
        }

        while(Nx4 != 0) {
            digNx4[(int)(Nx4 % 10)]++;
            Nx4 = Nx4 / 10;
        }

        while(Nx5 != 0) {
            digNx5[(int)(Nx5 % 10)]++;
            Nx5 = Nx5 / 10;
        }

        while(Nx6 != 0) {
            digNx6[(int)(Nx6 % 10)]++;
            Nx6 = Nx6 / 10;
        }


        for (int i = 0; i < 10; i++) {
            if (digNx1[i] != digNx2[i] 
                    || digNx2[i] != digNx3[i] 
                    || digNx3[i] != digNx4[i] 
                    || digNx4[i] != digNx5[i] 
                    || digNx5[i] != digNx6[i]) {
                return false;
            }
        }
        return true;
    }
}