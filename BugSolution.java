public class BugSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = 0; 
        if (y != 0) {
            z = x / y;
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }
        System.out.println(z);
    }
}