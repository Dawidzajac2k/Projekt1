import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

    System.out.println("Porgram sumuje liczby z przedziału od 2 do zadanej\n ");
    System.out.println("Podaj liczbe: ");
    int l = scan.nextInt();
    int a = l / 2;
    int a2 = a + 1;
    int suma= a * a2;

    if(l >= 2)
    System.out.println(" Suma liczb parzystych wynosi "+
            suma);
    else
        System.out.println("podano niepoprawną liczbe ");

    }
  }
