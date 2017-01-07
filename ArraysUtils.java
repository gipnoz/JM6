public final class ArraysUtils{

    public ArraysUtils() {
    }

    public static int sum(int array[]) {
        int b = 0;
        for (int i : array) {
            b += i;
        }
        return b;
    }

    public static int min(int array[]) {
        int m = 0;
        for (int i : array) {
            if (i < m) {
                m = i;
            }
        }
        return m;
    }

    public static int max(int array[]) {
        int m = 0;
        for (int i : array) {
            if (i > m) {
                m = i;
            }
        }
        return m;
    }

    public static int maxPositive(int array[]) {
        int m = 0;
        for (int i : array) {
            if ((i > 0) & (i > m)) {
                m = i;
            }
        }
        return m;
    }

    public static int multiplication(int array[]) {
        int m = 1;
        for (int i : array) {
            if (i != 0) {
                m *= i;
                return m;
            }
        }
        return 0;
    }

    public static int modulus(int[] array) {
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[0] != 0) & (array.length - 1 != 0)) {
                b = array[0] % array[array.length - 1];
                return b;
            }
        }
        return b;
    }

    public static int secondLargest(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[array.length - 2];
    }

    public static int[] reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static int[] findEvenElements(int[] array){
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 ==0){
                index++;
            }
        }
        int[] evenElement = new int[index];
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 == 0){
                evenElement[count] = array[i];
                count++;
            }
        }
        return evenElement;
    }

}

