package Techlab;
import java.util.Scanner;

/*public class Main {
    public static void main (String [] args){
        AtivoTI servidor = new AtivoTI (1, "PAT-2026-001", "Dell PowerEdge R740", "Ativo"); 
        
        System.out.println("===Ativo Cadastrado==="); 
        System.out.println("Patrimonio: " + servidor.getcodigopatrimonio()); 
        System.out.println("Modelo: " + servidor.getmodelo()); 
        System.out.println("Status Inicial: " + servidor.getstatus()); 
        
        servidor.setstatus(status: "Em Manutenco"); 
        System.out.println("Status Final: " + servidor.getstatus());
        }
        } */

public class Main{

    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("=== Cadastro de Ativo TI===");

        System.out.println("Digite o ID do Ativo: ");
        int idAtivo = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o codigo de patrimonio: ");
        String codigoPatrimonio = leitor.nextLine();
        

    }
}
