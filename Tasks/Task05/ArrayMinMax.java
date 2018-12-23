
public class ArrayMinMax {
    public static void main(String[] args) {
        int[] array = {13, 15, 35, 98, 77, 100};

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min> array[i])
                min = array[i];
        }
        System.out.println("\nmin = " + min);
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]  )
                max = array[i];
        }
        System.out.println("\nmax = " + max);
    }

}
