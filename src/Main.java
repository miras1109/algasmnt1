import java.util.Scanner;


public class Main {
    public static Scanner scan = new Scanner(System.in);


    public static void task1(){
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(findMin(n, arr));
    }
    public static int findMin(int n, int arr[]) {

        if(n == 1){
            return arr[0];
        }
        int answer = findMin(n-1,arr);
        return answer;
    }

    public static void task2(){
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(findAvg(n, arr, 0, 0));
    }
    public static double findAvg(int n, int arr[], double sum, int ind) {
        if (ind == n) {
            return sum / n;
        }

        sum += arr[ind];
        return findAvg(n, arr, sum, ind+1);
    }
    public static void task3(){
        int n = scan.nextInt();
        System.out.println(findPrime(n, 2));
    }
    public static boolean findPrime(int n, int m) {
        if (n <=1) {
            return false;
        }
        if (m == n) {
            return true;
        }
        if (n % m == 0) {
            return false;
        }
        return findPrime(n, m + 1);
    }

    public static void task4(){
        int n = scan.nextInt();
        System.out.println(findFactorial(n));
    }
    public static int findFactorial(int n) {
        if(n == 1){
            return 1;
        }
        return n * findFactorial(n-1);
    }
    public static void task5(){
        int n = scan.nextInt();
        System.out.println(findFibonacci(n));
    }
    public static int findFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return findFibonacci(n - 2) + findFibonacci(n - 1);
    }

    public static void task6() {
        int a = scan.nextInt();
        int n = scan.nextInt();

        System.out.println(findPower(a, n));
    }
    public static long findPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * findPower(a, n - 1);
    }

    public static void task7() {
        //couldn't solve
    }

    public static void task8(){
        String s =  scan.nextLine();
        System.out.println(findIsDigit(s));
    }
    public static boolean findIsDigit(String s) {
        if (s.isEmpty()) {
            return true;
        }
        return Character.isDigit(s.charAt(0)) && findIsDigit(s.substring(1));
    }
    public static int findBinom(int n, int k) {
        if(k == 0 || k == n){
            return 1;
        }

        return findBinom(n-1, k-1) + findBinom(n-1, k);
    }
    public static void task9() {
        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(findBinom(n,k));
    }
    public static int findGCD(int a, int b) {
        if(b == 0){
            return a;
        }

        return findGCD(b, a % b);
    }
    public static void task10() {
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(findGCD(a,b));
    }



 public static void main(String[] args) {
        task10();
  }



}
