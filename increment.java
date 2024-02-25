public class increment {
    public static void main(String[] args) {
        
      int m = 5;
      int n = 10;
      int result = ++m * n--;

      System.out.println("Result: " + result);
      System.out.println("Updated value of m: " + m);
      System.out.println("Updated value of n: " + n);
    }
    
}
