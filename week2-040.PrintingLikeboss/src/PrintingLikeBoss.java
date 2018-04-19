public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 1;
        while(i <= amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int k = 1;
        while(k <= amount){
        System.out.print(" ");
        k++;
    }
    }

    public static void printTriangle(int size) {
        // 40.2
        int j = 1;
        while(j <= size){
            printWhitespaces(size - j);
            printStars(j);
            
            j++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        
        int m = 1;
        int l = height + 3;
        while(m <= height){
            
           printWhitespaces(l - 4);
            printStars(l - (l-1));
            printWhitespaces(l - 4);
            l--;
            m++;
       
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
