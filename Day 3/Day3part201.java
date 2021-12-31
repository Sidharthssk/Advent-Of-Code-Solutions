import java.util.*;

public class Day3part201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] s = new String[1000];
        String O2[] = new String[1000];
        
        int countO2[] = new int[1000];
        
        int count0=0,count1=0,v=0;

        
        for(int i=0;i<1000;i++)
        {
            s[i] = sc.nextLine();
        }
   
        for(int i=0;i<1000;i++)
        {
            if(s[i].charAt(0)=='0')++count0;
            else if(s[i].charAt(0)=='1')++count1;
        }

        if(count1>=count0)
        {
            for(int i=0;i<1000;i++)
            {
                if(s[i].charAt(0)=='1')
                {
                    countO2[v]=i;
                    v++;
                }
            }
            for(int i=0;i<v;i++)
            {
                O2[i]=s[countO2[i]];
            }
        }
        




        else if(count0>count1)
        {
            for(int i=0;i<1000;i++)
            {
                if(s[i].charAt(0)=='0')
                {
                    countO2[v]=i;
                    v++;
                }
            }
            for(int i=0;i<v;i++)
            {
                O2[i]=s[countO2[i]];
            }
        }
  
        

        

        int size=v;
        

        

        for(int i=1;i<12;i++)
        {
           
            count0=count1=0;
            for(int j=0;j<size;j++)
            {
                if(O2[j].charAt(i)=='0')++count0;
                else if(O2[j].charAt(i)=='1')++count1;
            }

            if(count1>=count0 &&size>0)
            {
                for(int j=0;j<size;)
                {
                    if(O2[j].charAt(i)!='1' && j!=(size-1))
                    {
                        for(int k=j;k<size;k++)
                        {
                            if(k!=(size-1))
                            O2[k]=O2[k+1];
                            
                        }
                        --size;
                    }
                    else if(j==(size-1) && O2[j].charAt(i)!='1')
                    {
                        --size;
                    }
                    else if(O2[j].charAt(i)=='1')j++;
                }
            }
            else if(count0>count1 && size>0)
            {
                for(int j=0;j<size;)
                {
                    if(O2[j].charAt(i)!='0' && j!=(size-1))
                    {
                        for(int k=j;k<size;k++)
                        {
                            O2[k]=O2[k+1];
                        }
                        --size;
                    }
                    else if(j==(size-1) && O2[j].charAt(i)!='0')
                    {
                        --size;
                    }
                    else if(O2[j].charAt(i)=='0')j++;
                }
            }
        }
        int deci=0;
        for(int i=0,j=11;i<12;i++,j--)
        {
            char ch=O2[0].charAt(i);
            int n=Character.getNumericValue(ch);
            deci+=(n*Math.pow(2, j));
        }
        System.out.println(deci);
        
    }
}
