import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; ++i) {
      array[i] = scanner.nextInt();
    }
    System.out.println(solution(array));
    scanner.close();
  }

  private static int solution(int n, int[] array){

  }
}
