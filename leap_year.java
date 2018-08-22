import java.util.Scanner;
class leap_year{
public static void main(String args[])
{
 int yr;
 Scanner s = new Scanner(System.in);   
 System.out.println("Enter Year : ");
 yr = s.nextInt();	   
 if((yr%4 == 0)&&(yr%100!=0)){
 System.out.printf("This is a Leap Year");
 }
else if((yr%100 == 0) && (yr%400 == 0)){
System.out.printf("This is a Leap Year");
}
else if(yr%400 == 0){
System.out.printf("This is a Leap Year");
}
else{
System.out.printf("This is not a Leap Year");
}
}
}