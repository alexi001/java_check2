import java.util.Scanner;
class Reverse_Number{
public static void main(String args[])
{
int num,rev=0,rem;
Scanner n=new Scanner(System.in);
System.out.print("Enter a Number : ");
num=n.nextInt();
while(num != 0)
{
rem = num%10;
rev = rev*10 + rem;
num = num/10;
}
System.out.print("Reverse = " +rev);
}
}