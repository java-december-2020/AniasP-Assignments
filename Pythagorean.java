public class Pythagorean{
    public static void main(String[] args){
      System.out.println(Pythag(3, 8));
    }
    public static double Pythag(int legA, int legB){
        int squaredA = legA*legA;
        int squaredB = legB*legB;
        return Math.sqrt(squaredA + squaredB);
    }
}