public class BinOps {
    public String sum(String a, String b) {
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        int c = numA + numB;
        return Integer.toBinaryString(c);
    }

    public String mult(String a, String b) {
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        int c = numA * numB;
        return Integer.toBinaryString(c);
    }
}
