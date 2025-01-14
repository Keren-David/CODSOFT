import java.util.Scanner;

class gradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int n = sc.nextInt();

        String sub[] = new String[n+1];
        System.out.println("Enter the subjects");
        for(int i = 0; i<n+1; i++){
            sub[i] = sc.nextLine();

        }
        int marks[] = new int[n+1];
        System.out.println("Enter the marks in each subject (in order)");
        for(int i = 0; i<n; i++){
            marks[i] = sc.nextInt();

        }
        int sum =0;
        int avg =0;
        for(int num: marks) {
            sum += num;
            avg = sum / n;
        }
            System.out.println("Your total mark:" + sum);
            System.out.println("Your average:" + avg);

            if(avg <= 40){
                System.out.println("Your letter grade is: 'F'");
            }else if(avg > 40 && avg <50){
                System.out.println("Your letter grade is: 'E'");
            }else if(avg > 50 && avg < 60){
                System.out.println("Your letter grade is: 'D'");
            }else if(avg > 60 && avg < 70){
                System.out.println("Your letter grade is: 'C'");
            }else if(avg > 70 && avg < 80){
                System.out.println("Your letter grade is: 'B'");
            }else{
                System.out.println("Your letter grade is: 'A'");
            }






    }
}