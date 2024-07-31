class leader{
public static void main(String args[]){
int[] a=new int[]{1,9,5,3,4,5,6,8};
int[] y=new int[10];
int x=0,i,j,k=0;
for(i=0;i<8;i++)
{
for(j=i+1;j<8;j++)
{
if(a[i]<a[j])
break;
if(j==7)
{
System.out.println(a[i]+" ");
}
}
}
System.out.println(a[7]);
}
}
