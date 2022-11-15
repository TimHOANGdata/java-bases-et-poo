import java.util.Scanner;

public class Point5_Booleens {
    public static void main(String[] args) {
        Scanner keybpardInput=new Scanner(System.in);
        System.out.print("Votre age : ");
        int age=keybpardInput.nextInt();
        boolean estMajeur=age>=18;
        if(estMajeur){
            System.out.println("Vous êtes un majeur.");
        }else{
            System.out.println("Vous êtes mineur.");
        }
    }
}