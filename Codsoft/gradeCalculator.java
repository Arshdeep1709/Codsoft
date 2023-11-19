import java.util.Scanner;

class gradeCalculator
{
public static void main(String args[]){

// firstly to store data we need variables, so...

int marks = 0; // to store total marks
int subject = 0; // to store total subjects
double percentage = 0; // to store total percentage
String grade = ""; // to store grade

// Step 2 : we need user to prompt values , so for that we will import scanner class and will make it's instance

Scanner scan = new Scanner(System.in); // We made instance of scanner class

// now we will prompt user to enter data

System.out.println("Enter Marks out of 100 in each subject, Enter -1 to finish :");

int subMarks = 0;
while(true) {
System.out.println("Enter Marks for Subject " + (subject + 1) + ":");
subMarks = scan.nextInt();

if(subMarks == -1) {
break;	
}

if(subMarks >=0 && subMarks <=100){
marks += subMarks;
subject++;
}
else {
System.out.println("Invalid Data !");
}

if(subject > 0){
percentage = (double) marks/ (subject * 100)*100;
}
else {
System.out.println("No Subjects entered !");
}

if (percentage >= 90) {
    grade = "A+";
} else if (percentage >= 80) {
    grade = "A";
} else if (percentage >= 70) {
    grade = "B+";
} else if (percentage >= 60) {
    grade = "B";
} else if (percentage >= 50) {
    grade = "C";
} else {
    grade = "F";
}
System.out.println("Total Marks: " + marks);
System.out.println("Total Subjects: " + subject);
System.out.println("Average Percentage: " + percentage + "%");
System.out.println("Grade: " + grade);
}
}
//scan.close();
}
