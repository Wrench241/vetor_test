import java.sql.NClob;
import java.util.Locale;
import java.util.Scanner;
public class vetor256 {
    public static void main(String[] args){
        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);
        System.out.print("how many people will be digited? ");
        int N = sc.nextInt();
        String[] gender = new String[N+1];
        double[] height = new double[N+1];
        double avarage = 0;
        String genderSub = null;
        int[] man = new int[N+1];
        int sum2 = 0;
        for (int i = 1; i < N+1; i++){
            System.out.printf("Height's people %d: ",i);
            height[i] = sc.nextDouble(); 
            System.out.printf("gender's person %d: ",i);
            genderSub = sc.next().toUpperCase().substring(0, 1); 
            gender[i] = genderSub;
            avarage += height[i];
            if (genderSub.equals("M")){
                man[i] = 1;
                sum2 += 1;
            }
        }    
        double init = height[1];
        int continud = 0;

        for(int i = 1; i < N+1; i++){
            if (height[i] < init){
                init = height[i];
                continud = i;
            }
        }
        double init2 = height[0];
        int continud2 = 0;
        for(int i = 1; i < N+1; i++){
            if (height[i] > init2){
                init2 = height[i];
                continud2 = i;
            }
        }
        double sum = avarage/N+1;
        System.out.printf("less height = %.2f\n",height[continud]);
        System.out.printf("greater height = %.2f\n",height[continud2]);
        System.out.printf("woman height's avarage = %.2f\n",sum-1);
        System.out.println("number's man = "+sum2);
       
    } 
}
