import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner o = new Scanner(System.in);
        System.out.println("Podaj ciag znaków");
        String a = o.nextLine();

        int len = a.length();
    System.out.println("Długość ciagu znaków: " + len);
  }
}