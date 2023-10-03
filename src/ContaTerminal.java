import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception{

        Scanner accountInput = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Bem-vindo ao banco DigiTal. Vamos realizar o cadastro da sua conta.");

        System.out.println("Por favor, digite o número da sua conta (sem caracteres especiais), conforme informado pelo seu gerente");
        int numero = accountInput.nextInt();

        System.out.println("Digite a sua agência (consulte seu gerente)");
        String agencia = accountInput.next();

        accountInput.nextLine(); //Ocorria um erro com nextLine por não consumir o line break \n antes de ler a string do nomeCompleto

        System.out.println("Digite seu nome completo por gentileza");
        String nomeCompleto = accountInput.nextLine();

        System.out.println("Insira o saldo inicial a ser validado");
        double saldo = accountInput.nextDouble();

        // fake loading
        
        int a = 1;

        for (int i=0; i<1000000; i++) {
            a = a+1;
        }

        System.out.println("Olá "+nomeCompleto+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
        

    }

}
