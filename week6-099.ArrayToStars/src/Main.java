
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        int l = array.length - 1;
        int i;
        int j;
        for(i = 0 ; i <= l ; i++ ){
            for(j = 1 ; j <= array[i] ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
