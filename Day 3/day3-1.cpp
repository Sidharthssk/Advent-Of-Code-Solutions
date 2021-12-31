#include<iostream>
#include<math.h>
using namespace std;

int main()
{
    int gamma[12],epsilon[12],count0=0,count1=0;
    int gammadeci=0,epsilondeci=0,num,lastdig;
    char input[1000][12];
   
    for(int i=0;i<10000;i++)
    {
        for(int j=0;j<12;j++)
        cin>>input[i][j];
    }

    for(int j=0;j<12;j++)
    {
        count0 = count1=0;
        for(int i=0;i<1000;i++)
        {
        if(input[i][j]=='0')++count0;
        else if(input[i][j]=='1') ++count1;
        }
        if(count0>count1)
        {
          gamma[j]=0;
          epsilon[j]=1;
        }  
        else if(count1>count0)
        {
           gamma[j]=1;
           epsilon[j]=0;
        }   

    }

     for(int i=0,j=11;i<12;i++,j--)
     {
         gammadeci+=(gamma[i]*pow(2,j));
         epsilondeci+=(epsilon[i]*pow(2,j));
     }

     
     cout<<epsilondeci*gammadeci;
    

    return 0;
}