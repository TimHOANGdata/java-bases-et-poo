import java.util.Scanner;

//Ecrivez un programme qui affiche en console les nombres de 1 à n:
//pour les multiples de trois, il affiche “fizz” à la place du nombre
//et pour les multiples de cinq de cinq, imprimez “buzz”.
//Pour les nombres qui sont des multiples multiples à la fois de trois et de cinq, imprimez “fizzbuzz”.
//Sinon, il affiche le nombre
//Exemple
//Si n = 5
//1
//2
//fizz
//4
//Buzz
public class TP13 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre : ");
        int n = keyboardInput.nextInt();
        for(int i = 1; i<=n;i++){
            if(i%3==0){
                System.out.println("fizz");
            }else if(i%5==0){
                System.out.println("fizzbuzz");
            }else{
                System.out.printf("%d\n",i);
            }
        }

    }
}
