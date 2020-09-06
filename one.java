import java.io.*;
class one {
  public static void main(String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    int i[] = new int[5];
    double a = 0, b = 0, c = 0, d = 0;
    for (int j = 0; j < 5; j++) {
      i[j] = Integer.parseInt(stdin.readLine());
    }
    for (int j = 0; j < 5; j++) {
      a = i[0] + i[1] + i[2] + i[3] + i[4];
      b = i[0] - i[1] - i[2] - i[3] - i[4];
      c = i[0] * i[1] * i[2] * i[3] * i[4];
      d = i[0] / i[1] / i[2] / i[3] / i[4];
    }
    System.out.println("plus = " + a);
    System.out.println("Minus = " + b);
    System.out.println("Multi = " + c);
    System.out.println("Divide = " + d);
  }
}