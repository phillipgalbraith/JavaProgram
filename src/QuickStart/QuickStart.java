public class QuickStart{

    public static void main(String[] args){
        System.out.println(Dog.bark());
        double[] bases = {1.2, 3.2, 5.4};
        double[] heights = {8.7, 6.5, 4.3};
        for (int i = 0; i < bases.length; i++) {
            calcAreaTriangle(bases[i], heights[i]);
        }
    }

    public class Dog{
        String breed = "shi-tzu";

        public static String bark(){
            return "bark";
        }
        
    }

    public static double calcAreaTriangle(double height, double base){
        double area = height*base/2;
        String areaMsg = "triangle with base "
          .concat(String.valueOf(base))
          .concat(" and height ")
          .concat(String.valueOf(height))
          .concat(" has area ")
          .concat(String.valueOf(area));
        System.out.println(areaMsg);
        return area;
    }
}