/*
 * @Name: Gruhith Yerramalli   
 * @Description: To calculate the hypotenuse of right triangles.
 * @Date: 10/3/2022
 */

public class PyTheorem {
    public static void main (String [] args) {
        double sideA = (int)(Math.random() * 17) + 5;
        double sideB = (int)(Math.random() * 17) + 5;


        System.out.print("Triangle 1 -  ");
        System.out.print("Side A: " + sideA);
        System.out.print("  Side B: " + sideB);
        double Hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        System.out.println("  Hypotenuse: " + Hypotenuse);

        double sideC = (int)(Math.random() * 17) + 5;
        double sideD = (int)(Math.random() * 17) + 5;
        

        System.out.print("Triangle 2 -  ");
        System.out.print("Side C: " + sideC);
        System.out.print("  Side D: " + sideD);
        double Hypotenuse2 = Math.sqrt(Math.pow(sideC, 2) + Math.pow(sideD, 2));
        System.out.println("  Hypotenuse: " + Hypotenuse2);
    }
}