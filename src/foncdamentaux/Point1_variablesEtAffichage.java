package foncdamentaux;

public class Point1_variablesEtAffichage {
    public static void main(String[] args) {
        int age = 44; // age EST_DU_TYPE nombre
        String nom = "Lisangola"; //nom EST_DU_TYPE chaine
        String prenom = "Christain";
        double poid = 80.5;
        /* convention JAVA, nom varialbe: nghiemDepTraiNhatTheGioi
        nom peut pas etre commencer avec les chiffles
        nom peut pas contenir les mots clés réserver au language comme int, main, string
         */

        // commenter 1 đoạn bằng cách bôi đen đoạn đó rồi control+/

        String txt = "We are the so-called \"Vikings\" from the north.";
        String txt1 = "We are the so-called \'Vikings\' from the north.";
        String txt2 = "We are the so-called \\Vikings\\ from the north.";
        // cách thêm dấu ', '', \ vào string
        System.out.println(age); //shortcut sout
        System.out.println(nom);
        System.out.println(prenom);
        System.out.println(nom+" "+prenom+",j'ai "+age+" et je pese "+poid);
        System.out.printf("%s %s\n, j'ai %d et je pese %f",nom,prenom,age,poid);
        // use printf for this type of print string %s:String, %d:int, %f: float
        // có thể làm tròn số float bằng cách %1f( chỉ lấy 1 số sau dấu phẩy)
        // %2f (lấy 1 số sau dấu phẩy)
        // \n dùng để xuống hàng trong printf
        System.out.println(poid);
        System.out.println(txt);
        System.out.println(txt1);
        System.out.println(txt2);
    }
}

