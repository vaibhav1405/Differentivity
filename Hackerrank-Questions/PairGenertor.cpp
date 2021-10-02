#include <bits/stdc++.h>
using namespace std;
//#define FAST ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr)
#define ll long long
int main()
{
    //FAST;
    int n;
    cout<<"Enter the Size of Array\n";
    cin>>n;
    int arr[n];
    cout<<"Enter the Array Element\n";
    for(int i=0;i<n;i++)
    cin>>arr[i];
    int max=INT_MIN;
    for(int i=0;i<n;i++)
    if(arr[i]>max)
    max=arr[i];
    cout<<"All Possible Elements are\n";
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++)
        if(arr[i]+arr[j]<max)
        cout<<"("<<arr[i]<<","<<arr[j]<<")\n";
    }
    return 0;
}