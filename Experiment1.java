public class Experiment6 
{
    public static void main(String[] args) {
        int digit[];
        digit = new int[3];
        digit[0]=Integer.parseInt("1");
        digit[1]=Integer.parseInt("2");
        digit[2]=Integer.parseInt("3");
        for (int x=0; x<3; x++) {
            for (int y=0; y<3; y++){
                for (int z=0; z<3; z++){
                    if(x!=y && x!=z && y!=z){

                        System.out.println(digit[x]+""+digit[y]+""+digit[z]);
                    }
                }
            }
        }
    }
}
