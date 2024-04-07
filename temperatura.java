import java.util.Scanner;

public class temperatura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double somaTemperaturas = 0;
        int temperaturasTotal = 12;
        

        for( int i = 1; i <= temperaturasTotal; i++){
            double temperatura;
            do {
                System.out.println("Digite a temperatura: "+i+ " (de 10 e a 4 graus celsius)");
                temperatura = input.nextDouble();
            } while(temperatura <4 || temperatura > 10);

            somaTemperaturas += temperatura;

        }

double media = somaTemperaturas/temperaturasTotal;
System.out.println("A media das temperaturas é: " + media + "C");

input.close();
    }
}
