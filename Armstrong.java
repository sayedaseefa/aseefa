class Armstrong
{
  public static void main(String a[])
{
  int n=Integer.parseInt(a[0]);
  System.out.println("Enter the n number");
  int temp=n;
  int r,sum=0;
   while(n!=0){
   r=n%10;
   sum=sum*10+r*r*r;
   n=n/10;
}
if(temp==sum)
{
System.out.println("Given number is a Armstrong number");
}
else
System.out.println("Given number is not a Armstrong number");
}
}


 