#include<iostream>
using namespace std;

int main()
{
    int n=2000,arr[n],count=0;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }

    for(int i=1;i<n;i++)
    {
        if(arr[i]>arr[i-1])++count;
    }

    cout<<count;
    return 0;
}