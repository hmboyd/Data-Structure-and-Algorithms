public class Euclid-EulerTheorem {
    public int pn(int p) {
        return (1 << (p - 1)) * ((1 << p) - 1);
    }
    public boolean checkPerfectNumber(int num) {
        int[] primes=new int[]{2,3,5,7,13,17,19,31};
        for (int prime : primes) {
            if (num == pn(prime))
                return true;
        }
        return false;
    }
}
