import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.1233;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("Bom dia! Flor do dia.");

        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        System.out.println("RESULTADO = " + x + " METROS" );
        System.out.printf("RESULTADO = %.2f metros", x);

        String nome = "Mariah Juana";
        int idade = 33;
        double renda = 1412.0;

        System.out.printf("%n%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }
}