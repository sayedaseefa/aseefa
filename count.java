class count
{
public static void main(String a[])
{ 
int num=Integer.parseInt(a[0]);
int count=0;
for(int i=1;i<=num;i++)
{
if(i%3==0)
{
count=count+i;
}
}
System.out.println("count of all numbers divisible by 3 is="+count);
}
}

