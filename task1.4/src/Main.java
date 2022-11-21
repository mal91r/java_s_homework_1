public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{4, 1, 2, 5, 3};
        int tmp;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j+1]){
                    tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int j : array) {
            System.out.printf("%d%n", j);
        }
    }
}