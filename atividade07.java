import java.util.Scanner;
    class atividade07{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("diga um valor para x:");
            int x=sc.nextInt();
            int y;
            while(x!=1){
                y=x;
                if(x%2==0){
                    y=x/2;
                }
                else{
                    y=3*x+1;
                }
                System.out.println(y);
                x=y;
            }
        }
    }
