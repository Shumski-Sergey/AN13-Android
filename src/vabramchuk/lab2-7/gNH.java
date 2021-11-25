public class gNH {
    private static int sum(int a, int s, int d, int f) {
        int sum = a + s + d;
        return sum + f;
    }

    public static void main(String[] args) {
	// write your code here
        int a = 2, s = 2, d = 2, f = 2;
        int res = sum(a,s,d,f);
        System.out.println(res);


    }
}
