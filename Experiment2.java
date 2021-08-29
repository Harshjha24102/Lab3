public class Experiment7 
{
    public static void main(String args[]) {
        int a[];
        int sum=0;
        a=new int[11];
        for(int i=0;i<=10;i++)
        {
            a[i]=i;
            a[i]=a[i]*a[i];
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
