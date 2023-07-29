public class SumOfNumbers {
    public static void main(String[] args) {
        //you can choose to first initialize the numbers
        int num1 = 10;
        int num2 = 15;
        //call the method to add the two numbers
        add(num1,num2);

        //alternatively call the method and pass the numbers direct
        System.out.println();//to print new line between the two solutions
        add(10, 15);
    }

    //the method takes two numbers, finds the sum, prints the sum
    public static void add(int a, int b){
        int sum = a + b;

        //print the sum
        System.out.println("The sum of " + a +  " and "  + b + " is " + sum);
    }
}
