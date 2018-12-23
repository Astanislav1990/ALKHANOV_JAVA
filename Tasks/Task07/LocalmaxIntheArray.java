public class LocalmaxIntheArray {
    public static void main(String[] args) {
        int a[] = {13, 15, 35, 98, 77, 100};
        int localmax = 0;

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                localmax++;
            }
        }
        System.out.println("Number of LocalMax  - " + localmax);
    }
}
