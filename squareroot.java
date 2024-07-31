class squareroot
{
 static int squareroot(int n)
{
 int i=1;
 while(i*i<=n)
{
 i++;
}
 return i-1;
}
public static void main(String args[])
{
 int x,y;
 x=5;
 y=19;
 System.out.println(squareroot(x));
 System.out.println(squareroot(y));
}
}
