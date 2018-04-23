import java.util.*;

public class Main {
  static class People {
    int id;
    int height;
    int weight;
    public People(int id, int weight, int height) {
      this.id = id;
      this.height = height;
      this.weight = weight;
    }
  }

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      People[] people = new People[n];
      for (int i = 0; i < n; ++i) {
        int id = scan.nextInt();
        people[i] = new People(id, scan.nextInt(), scan.nextInt());
      }
      System.out.println(solution(people));
      scanner.close();
  }

  private static int solution(People[] people) {

  }
}
