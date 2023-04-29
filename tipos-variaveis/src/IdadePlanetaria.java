import java.util.Scanner;

public class IdadePlanetaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double idadeTerrestre = scanner.nextDouble();
    String planeta = scanner.next();

    if (planeta.equals("Marte")) {
        double idadeMarte = idadeTerrestre / 1.88;
        System.out.printf("Idade equivalente em Marte: %.2f anos", idadeMarte);
    } else if (planeta.equals("Venus")) {
        double idadeVenus = idadeTerrestre / 0.62;
        System.out.printf("Idade equivalente em Venus: %.2f anos", idadeVenus);
    } else if (planeta.equals("Jupiter")) {
        double idadeJupiter = idadeTerrestre / 11.86;
        System.out.printf("Idade equivalente em Jupiter: %.2f anos", idadeJupiter);
    } else {
        System.out.println("Planeta invalido.");
    }
    
    scanner.close();
  }
}

