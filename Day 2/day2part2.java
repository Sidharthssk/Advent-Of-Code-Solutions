import java.util.*;

public class day2part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=1000,i=1,horiz=0,ver=0,num=0,aim=0;
        char c;
        
        while(i<=n)
        {
            String s = sc.nextLine();
            char ch = s.charAt(0);
            if(ch == 'f')
            {
                c=s.charAt(8);
                num = Character.getNumericValue(c);
                horiz+=num;
                ver+=(aim*num);
            }

            else if(ch == 'd')
            {
                c=s.charAt(5);
                num = Character.getNumericValue(c);
                aim+=num;
            }

            else if(ch == 'u')
            {
                c=s.charAt(3);
                num = Character.getNumericValue(c);
                aim-=num;
            }

            i++;
        }
        System.out.println(horiz*ver);
        sc.close();  
    }
}
