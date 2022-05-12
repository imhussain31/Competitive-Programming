import java.util.Scanner;

public class WorldChessChampionship {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();

            while (t--!=0){
                int n = sc.nextInt();

                String str = sc.next();
                char[] ch = str.toCharArray();
                int carlsen = 0 , chef = 0 , tied = 0;
                for (int i = 0; i<ch.length; i++){
                    if (ch[i] == 'C'){
                        carlsen++;
                    }
                    else if (ch[i] == 'N'){
                        chef++;
                    }
                    else if(ch[i] == 'D'){
                        tied++;
                    }
                }
                if (carlsen > chef || chef > carlsen ){
                    System.out.println(60*n);
                }
               else if(carlsen == chef){
                    System.out.println(55*n);
                }
               else if (tied < chef || tied < carlsen){
                    System.out.println(0*n);
                }


            }

        }
    }
}
