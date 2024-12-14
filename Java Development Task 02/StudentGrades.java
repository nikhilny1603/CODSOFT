import java.util.*;
import java.util.Scanner;

class StudentGrades{
    public static void Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Number of Subjects : ");
        int n = sc.nextInt();
        String []subjects = new String[n];
        int []marks = new int[n];
        System.out.println("Enter the Subjects : ");
        for(int i = 0 ;i < n ; i++){
            subjects[i] = sc.next();
        }
        System.out.println("Enter the Marks of the Subjects : ");
        for(int i = 0 ; i < n ; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("\n*** Student Information ***\n");
        System.out.println(" Subjects \tMarks\n" );
        for(int i = 0 ; i < n ; i++){
        System.out.println(" "+subjects[i]+ "\t" + marks[i]);
        }
        int total = 0;
        for(int i = 0 ;i < n;i++){
            total = total + marks[i];
        }
        System.out.println("\n** Total Marks  "+ total);
        int average = total/n;
        System.out.println("** Average     "+ average);

        if(average < 100 && average >= 90){
            System.out.println("Student has got A+ Grade.");
        }
        else if(average < 90 && average >= 80){
            System.out.println("Student has got A Grade.");
        }
        else if(average < 80 && average >=70){
            System.out.println("Student has got B+ Grade.");
        }
        else if(average < 70 && average >= 60 ){
            System.out.println("Student has got B Grade.");
        }
        else if(average < 60 && average >= 50 ){
            System.out.println("Student has got C+ Grade.");
        }
        else if(average < 50 && average >= 35){
            System.out.println("Student has got C Grade.");
        }
        else{
            System.out.println("Student has Failed.");
        }
        
    }
    public static void main(String []args){
        Student();
    }
}