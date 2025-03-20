
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;}
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int i, x = 0;
    float prom;
    System.out.println("Los numeros son:");
    for (i = 0; i < 500; i++) {
      int n = 10 + random.nextInt(1001);
      System.out.println(n);
      x = n + x;
    }
    System.out.println("La suma total de los numeros es: " + x);
    prom = x / 500;
    System.out.println("El promedio de los numeros es: " + prom);
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}