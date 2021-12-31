import java.util.*;

public class day3part202{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s[] = new String[1000];
        
        String CO2[] = new String[1000];
       
        int countCO2[] = new int[1000];
        int count0=0,count1=0,h=0;

       
        for(int i=0;i<1000;i++)
        {
           s[i] = sc.nextLine();
        }

        for(int i=0;i<1000;i++)
        {
            if(s[i].charAt(0)=='0')++count0;
            else if(s[i].charAt(0)=='1')++count1;
        }

        if(count0<=count1)
        {
            for(int i=0;i<1000;i++)
            {
                if(s[i].charAt(0)=='0')
                {
                    countCO2[h]=i;
                    h++;
                }
            }
            for(int i=0;i<h;i++)
            {
                CO2[i]=s[countCO2[i]];
            }
        }
         
        else if(count1<count0)
        {
            for(int i=0;i<1000;i++)
            {
                if(s[i].charAt(0)=='1')
                {
                    countCO2[h]=i;
                    h++;
                }
            }
            for(int i=0;i<h;i++)
            {
                CO2[i]=s[countCO2[i]];
            }
        }

        int sizeco2=h;

        for(int i=1;i<12;i++)
        {
            count0=count1=0;
            for(int j=0;j<sizeco2;j++)
            {
                if(CO2[j].charAt(i)=='0')++count0;
                else if(CO2[j].charAt(i)=='1')++count1;
            }
  
            if(count1<count0 &&sizeco2>0)
            {
                for(int j=0;j<sizeco2;)
                {
                    if(CO2[j].charAt(i)!='1' && j!=(sizeco2-1))
                    {
                        for(int k=j;k<sizeco2;k++)
                        {
                            if(k!=(sizeco2-1))
                            CO2[k]=CO2[k+1];
                            
                        }
                        --sizeco2;
                    }
                    else if(j==(sizeco2-1) && CO2[j].charAt(i)!='1')
                    {
                        --sizeco2;
                    }
                    else if(CO2[j].charAt(i)=='1')j++;
                }
            }
            else if(count0<=count1 && sizeco2>0)
            {
                for(int j=0;j<sizeco2;)
                {
                    if(CO2[j].charAt(i)!='0' && j!=(sizeco2-1))
                    {
                        for(int k=j;k<sizeco2;k++)
                        {
                            if(k!=(sizeco2-1))
                            CO2[k]=CO2[k+1];
                        }
                        --sizeco2;
                    }
                    else if(j==(sizeco2-1) && CO2[j].charAt(i)!='0')
                    {
                        --sizeco2;
                    }
                    else if(CO2[j].charAt(i)=='0')j++;
                }
            }

        }
        
        int deci=0;

        for(int i=0,j=11;i<12;i++,j--)
        {
            char ch=CO2[0].charAt(i);
            int n=Character.getNumericValue(ch);
            deci+=(n*Math.pow(2, j));
        }
        System.out.println(deci);
    }
}