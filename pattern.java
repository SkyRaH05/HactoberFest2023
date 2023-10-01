/*  Printing pattern : 
1 
2 3 2 
3 4 5 4 3 
4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5 
*/

public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            int temp = i;
            for(int j=1; j<=i; j++){
                System.out.print(temp++ +" ");
            }
            temp-=2;
            for(int j=1; j<i; j++){
                System.out.print(temp-- +" ");
            }
            System.out.println();
        }
    }
}
