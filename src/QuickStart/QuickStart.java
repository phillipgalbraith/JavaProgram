public class QuickStart{

    public static void main(String[] args){
        System.out.println(Dog.bark());

    }

    public class Dog{
        String breed = "shi-tzu";

        public static String bark(){
            return "bark";
        }
    }
}