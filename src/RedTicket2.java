public class RedTicket2 {
  public int redTicket(int a, int b, int c) {
    if (a == b && b == c) {
      if (a == 2) {
        return 10;
      } else {
        return 5;
      }
    }
    if (a != b && a != c) {
      return 1;
    } else {
      return 0;
    }
  }
}
