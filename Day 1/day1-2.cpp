#include<iostream>
using namespace std;

int main()
{
    int n=2000,arr[n],sum[n],count=0;
    for(int i=0;i<n;i++)
    cin>>arr[i];

    for(int i=0;(n-i)>=3;i++)
    {
        sum[i]=arr[i]+arr[i+1]+arr[i+2];
        if(i==0)continue;
        else if(sum[i]>sum[i-1])++count;
    }

    cout<<count;
    return 0;
}