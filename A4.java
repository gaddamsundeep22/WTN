import java.util.*;
class A4
{
public static void main(String[]args)
{
int i,n,count = 0;
Scanner sc = new Scanner(System.in);
n= sc.nextInt();
for (i = 2;i <=n/2;i++)
{
if(n%i == 0)
   {
                       count++;
       break;
   }
}
if(n<0)
{
System.out.println("Enter integer value only");
}
else if(count == 0)
{
System.out.println("Given number is a Prime Number");
}
else
{
  System.out.println("Given number is Not a Prime Number");
}
}
}