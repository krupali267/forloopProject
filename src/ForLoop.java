import java.util.Scanner;

public class ForLoop {     // Instance method without parameter is used in all programs

    // Q 1. Print first 10 numbers for the range given by user
    public void numbers() {
        int a;
        int b;

        // have used scanner to enable user to enter the values for each program

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number to start the range"); // requesting user to input the value
        a = scanner.nextInt();

        System.out.println("Please enter number to end the range");
        b = scanner.nextInt();

        for (int i = a; i <= b && i<=a+10; i++) // will print 10 numbers until 1st value becomes same as 2nd value
        {
            System.out.println(i);
        }
    }

    // Q 2. Print n numbers of Fibonacci series

    public void fibonacci() {
        int x = 0;
        int y = 1;
        int z;
        int n;
        System.out.println("Please enter number for limitation");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 0; i <= n; i++)
        {
            System.out.print(x + "  ");
            z = x + y; // declaring value for z
            x = y; // replacing value for x with each loop
            y = z; // replacing value for y with each loop
        }
    }

    // Q 3 Prime Number

    public void prime() {
        int number;
        boolean isPrime = true;
        System.out.println("Enter the number to check prime or not");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number <= 1) // condition to print any number below 1 or 1
        {
            System.out.println(number + "- is not a Prime number");
        } else  // condition will work if given value is above 1
            {
            for (int i = 2; i < number / 2; i++) // for loop will start with value 2 because 1 is not prime or composite number
            {
                if (number % i == 0) // condition will work when modulas of given number is 0
                {
                    System.out.println(number + " - is not a Prime Number");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true)
            {
                System.out.println(number + ":- is a Prime Number");
            }
        }

    }

    // Q 4 Find the reverse number
    public void reverse() {
        int num;
        int reverse = 0;
        int remainder;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        num = scanner.nextInt();

        for (; num != 0; num = num / 10)
        {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is" + " - " + reverse);
    }

    // Q 5 - Factorial number of a number entered by user
    // eg 5! = 5x4x3x2x1 = 120

    public void factorial() {
        int num1;
        int factorial = 1;
        Scanner scanner = new Scanner(System.in); // used for user input
        System.out.println("Enter the number"); // user has to enter the value
        num1 = scanner.nextInt();

        for (int i = num1; i > 0; i--) // for loop initializes with number entered by user, checks condition >0 is met
        // and decrements the value in next iteration
        {
            factorial = factorial * i; // factorial value changes after each iteration and stores a new value achieved
        }
        System.out.println("Factorial number of" + num1 + " is " + factorial);
    }

    // Q 6 Sum of n Natural number

    public void naturalNum() {

        int num2;
        int sum = 0; // will store the total of natural numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the natural number n :");
        num2 = scanner.nextInt();

        for (int j = 1; j <= num2; j++) // for loop initializes with number entered by user, checks condition >2nd number user entered
                                         // is met and increments the value in next iteration
        {
            sum = sum + j; // sum value changes after each iteration and stores new value
        }
        System.out.println("Sum of first " + num2 + " natural numbers is :- " + sum);
    }

    // Q 7 Calculator - one operator and two numbers

    public void calculator() {
        double x, y;
        char operator; // store mathematical operator
        double result = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        x = scanner.nextDouble();
        System.out.println("Enter 2nd number");
        y = scanner.nextDouble();
        System.out.println("Enter the mathematical operator from +, -, * , / - to perform calculation");
        operator = scanner.next().charAt(0);

        // condition will switch according to the mathematical operator entered by user and will print the result accordingly
        switch (operator) {
            case '+':
                result = x + y;
                System.out.println("Addition  of " + x + " & " + y + " is " + result);
                break;
            case '-':
                result = x - y;
                System.out.println("Subtraction  of " + x + " & " + y + " is " + result);
                break;
            case '*':
                result = x * y;
                System.out.println("Multiplication  of " + x + " & " + y + " is " + result);
                break;
            case '/':
                result = x / y;
                System.out.println("Division  of " + x + " & " + y + " is " + result);
                break;

            default:
                System.out.println("Invalid operator"); // will print if any other operator is entered
        }

    }

    // Q 8 - Sum of x ranging from from 1 to 20

    public void range() {
        int userNo;
        int total = 0; // will store total of numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 20");
        userNo = scanner.nextInt();

        for (int i = 1; i <= userNo; i++) // for loop initializes with 1, checks condition <= number entered by user is met
                                        // and increments the value in next iteration
        {
            total = total + i; // total values changes after each iteration and stores new value
        }
        System.out.println("Sum of the numbers of up to " + userNo + " is " + total);
    }

    // Q 9 Numbers divisible by 3 and 5

    public void divisible() {

        System.out.println("Numbers divisible by 3");

        // for loop initializes with 1, checks condition <=100 is met and increments the value in next iteration
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0) // will print if number is divisible by 3
            {
                System.out.print(i + " , ");
            }
        }

        System.out.println("\nNumbers divisible by 5");

        for (int i = 1; i <= 100; i++)
        {
            if (i % 5 == 0) // will print if number is divisible by 5
            {
                System.out.print(i + " , ");
            }
        }
    }

    // Q 10 - Multiplication table of any given number
    public void timeTable() {
        int num;
        int multi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to print the multiplication table of");
        num = scanner.nextInt();

        // for loop initializes with user value, checks condition <= value entered by user is met and increments the value in next iteration
        for (int i = num; i <= num; i++)
        {
            for (int j = 1; j <= 10; j++) // for loop initializes with 1, checks condition <=10 is met
                                        // and increments the value in next iteration
            {
                System.out.println(i + " x " + j + " = " + i * j); // will print the result in form of multiplication table
            }
        }
    }

    // Q 11 Count total no. of 'a' in a given string

    public void string() {

        String input;
        int count = 0; // will store number of character 'a'
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any sentence");
        input = scanner.nextLine();
        input = input.toLowerCase();

        System.out.println("Character / Frequency");

        // for loop will initialize and run until condition <= a is met and 2nd for loop until the input length is covered
        for (char i = 'a'; i <= 'a'; i++)
        {
            for (int j = 0; j < input.length(); j++)
            {
                if (i == input.charAt(j)) count++;
            }
            System.out.println(i + "  \t    " + count);
        }
    }
    // Q 12 Sum of all numbers in a given range which are divisible by 9

    public void sumDiv() {
        int a;
        int b;
        int d = 9; // is the dividend
        int sum = 0; // will store the value of sum of numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        a = scanner.nextInt();
        System.out.println("Please enter the second number");
        b = scanner.nextInt();
        System.out.println("Numbers divisible by 9");
        for (int i = a; i <= b; i++) // Running a loop from a to b and check if a number is divisible by 9
        {
            if (i % d == 0)  // If number is divisible, then add it to sum
            {
            System.out.println(i + " ");
            sum = sum + i;
            }
        }
        System.out.println("Total of above numbers is-");
        System.out.println(sum);
    }

    // Q 13 Find maximum and minimum number
    public void smallLargeNum() {
        int a;
        int b;
        int c;
        int minimum = 0;
        int maximum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        a = scanner.nextInt();
        System.out.println("Please enter 2nd number");
        b = scanner.nextInt();
        System.out.println("Please enter 3rd number");
        c = scanner.nextInt();

        // applying condition for find maximum number
        if(a>=b && a>=c){
            System.out.println(a + "  is the maximum number");
        }
        else if (b>=a && b>=c){
            System.out.println(b + "  is the maximum number");
        }
        else{
            System.out.println(c + "  is the maximum number");
        }

        // applying condition to find minimum number

        if(a<=b && a<=c){
            System.out.println(a + "  is the maximum number");
        }
        else if (b<=a && b<=c){
            System.out.println(b + "  is the minimum number");
        }
        else {
            System.out.println(c + "is the minimum number");
        }
    }

    // Q 14 Sum and average of numbers between two numbers

    public void sumAverage(){

        int x;
        int y;
        double sum = 0; // will store total of given numbers
        double average = 0; // will store average of given numbers
        double nofValues = 0; // will store no of values for given range of numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        x = scanner.nextInt();
        System.out.println("Please enter second number");
        y = scanner.nextInt();

        for (int i = x; i <=y; i++) // for loop will initialize from 1st given value and run until condition <=2nd value is met
        {
            {
                sum = sum + i; // will change and restore new value after each iteration
                nofValues = y - x; // will calculate no of values
            }
        }
        System.out.println("Sum of " + x + " & " + y + " is " + sum);
            average = sum / nofValues; // condition to print average of numbers
        System.out.println("The average of numbers between  " + x + " & " + y + " is " + average);

    }
    // Q 15 Print the triangular pattern for a given number

    public void trianglePattern ()

    {
        int size; // will store size or length of the pattern

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size for the pattern");
        size = scanner.nextInt();

        for (int i = 1; i <= size; i++)// for loop will initialize with 1 and run until <=size is met
        {
            for (int j = 0; j < i ; j++) // loop will print one less * in each row
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        ForLoop forLoop = new ForLoop();

        // Ans 1;-
        System.out.println("Ans 1 - To print 10 numbers between given input range");
        forLoop.numbers();
        System.out.println("10 numbers of given range - ");
        System.out.println();

        // Ans 2:-
        System.out.println("Ans 2 - Fibonacci Numbers");
        forLoop.fibonacci();
        System.out.println("Fibonacci Numbers for given limitation");
        System.out.println();


        // Ans 3:-
        System.out.println();
        System.out.println("Ans - 3 Prime or Non Prime Number");
        forLoop.prime();
        System.out.println();

        // Ans 4:-
        System.out.println("Ans 4 - Print the Reverse number");
        forLoop.reverse();
        System.out.println();

        // Ans 5:-
        System.out.println("Ans 5 Factorial number");
        forLoop.factorial();

        // Ans 6:-
        System.out.println();
        System.out.println("Ans 6 - Sum of given natural number");
        forLoop.naturalNum();
        System.out.println();

        // Ans 7:-
        System.out.println("Ans 7 - Calculation of given 2 numbers and mathematical operator");
        forLoop.calculator();
        System.out.println();

        // Ans 8:-
        System.out.println("Ans 8 - To find sum of the numbers up to any given number ranging from 1 to 20");
        forLoop.range();
        System.out.println();

        // Ans 9 :-
        System.out.println("Ans 9 - Numbers from 1 to 100 that are  divisible by 3 and 5");
        forLoop.divisible();
        System.out.println();

         //Ans 10:-
        System.out.println();
        System.out.println("Ans 10 - Multiplication table of");
        forLoop.timeTable();
        System.out.println();

        // Ans 11:-
        System.out.println("Ans 11 - Count of 'a' in a string");
        forLoop.string();
        System.out.println();

        // Ans 12:-
        System.out.println("Ans 12 - Sum of numbers divisible by 9 in the given range");
        forLoop.sumDiv();
        System.out.println();

        // Ans 13:-
        System.out.println("Ans 13 - Maximum and minimum numbers");
        forLoop.smallLargeNum();
        System.out.println();

        // Ans 14:-
        System.out.println("Ans 14 - Sum and average of numbers between 2 given numbers");
        forLoop.sumAverage();
        System.out.println();

        // Ans 15:-
        System.out.println("Ans 15 - Triangular Pattern");
        forLoop.trianglePattern();
    }


}
