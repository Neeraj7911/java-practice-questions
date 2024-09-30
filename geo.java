import java.util.*;

class geo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int x=0,y=0, distance=10;
        char c='R';
        while(n>0){
            switch(c){
                case 'R':
                    x = x+distance;
                    distance+=10;
                    c='U';
                    break;
                case 'U':
                    y=y+distance;
                    distance+=10;
                    c='L';
                    break;
                case 'L':
                    x=x-distance;
                    distance+=10;
                    c='D';
                    break;
                case 'D':
                    y=y-distance;
                    distance+=10;
                    c='A';
                    break;
                case 'A':
                    x=x+distance;
                    distance+=10;
                    c='R';
                    break;
            }
            n--;
        }
        System.out.print(x+" "+y);
    }
}