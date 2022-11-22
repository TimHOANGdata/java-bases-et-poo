package TPs_JAVA_POO;

public class TP9 {
    public static boolean maMethode(String text){
        boolean isCorrect = false;
        String text1 = text.toLowerCase();
        for(int i =0;i<text1.length()-1;i++){
            if(text1.charAt(i)==text1.charAt(i+1)){
                isCorrect = true;
            }
        }return isCorrect;
    }

    public static void main(String[] args) {
        String a = "terrific";
        String b = "chats";
        String c = "chats !!";
        System.out.println(maMethode(c));
    }
}
