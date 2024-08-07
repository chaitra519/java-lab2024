class Binary{
public static void main(String[]args)
{
int n=9,count=0;
while(n>0)
{
count=count+1;
n>>=1;
System.out.println("number of set bits in binary representation 9 is" +count);
}
}
}