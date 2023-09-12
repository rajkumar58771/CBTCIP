import java.util.Scanner;

class student_grade_calculator{
    public static void main(String args[]){       
        Scanner sc = new Scanner(System.in);
        System.out.println("Grade Calculator:");
        System.out.println("Enter the number of subjects");
        int a = sc.nextInt();
        int[] marks = new int[a];
        int total = 0;
        float average = 0;
        System.out.println("Enter the marks:");
        for(int i=0;i<a;i++){
            marks[i] = sc.nextInt();
            total+= marks[i];
        }
        average = total/a;
        char grade = ' ';
        if(average>=90&&average<=100){
            grade = 'O';
        }else if(average>=80&&average<90){
            grade = 'E';
        }else if(average>=70&&average<80){
            grade = 'A';
        }else if(average>=60&&average<70){
            grade = 'B';
        }else if(average>=50&&average<60){
            grade = 'C';
        }else if(average>=40&&average<50){
            grade = 'D';
        }else if(average<40){
            grade = 'F';
        }
        System.out.println("Total marks:- \t\t" + total);
        System.out.println("Average percentage:- \t" + average + "%");
        System.out.println("Grade:- \t\t" + grade);
        // System.out.println(grade);
    }
}