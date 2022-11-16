public class Point13_Foreach {
    public static void main(String[] args) {
        String programmingLanguages[] = {"C","C++","Go","Rust","Java","Typescript",
        "Python"};

//        for(int i = 0;i < programmingLanguages.length-1;i++){
//            System.out.println(programmingLanguages[i]);
//        }

        for(String language:programmingLanguages){// boucle iterer sur tout le table
            System.out.println(language);
        }
    }
}
