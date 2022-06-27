 class Main {
 public static void main(String[] args)
 {
 int x, y;
 System.out.println("Program oblicza wartość funkcji y = 5*x");
 System.out.println("dla x zmieniającego się od 0 do 10.");
 for (x = 0; x <= 10; x++)
 {
 y = 5*x;
 System.out.println("x = " + x + '\t' + "y = " + y);
 }
 }
}