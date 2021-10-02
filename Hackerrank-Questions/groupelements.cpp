#include <bits/stdc++.h>
using namespace std;
//#define FAST ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr)
#define ll long long
void order(int arr[], int n){
    int xrr[n];
    int qrr[n];
    int k=0;
    for(int i=0;i<n;i++){
    xrr[i]=0;
    qrr[i]=0;
    }
    for(int i=0;i<n;i++){
        
        if(!xrr[i]){
            qrr[k++]=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    qrr[k++]=arr[i];
                    xrr[j]=1;
                }
            }
        }
    }
    for(int i=0;i<n;i++)
    arr[i]=qrr[i];

}
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
    order(arr,n);
    for(int i=0;i<n;i++)
    cout<<arr[i]<<" ";
    cout<<"\n";
    int count=1;
    for(int i=0;i<n;i++){
        if(arr[i]==arr[i+1]){
            count++;
        }
        else{
            cout<<"Frequency of " <<arr[i]<<"is  "<<count<<"\n";
            count=1;
            }
    }
    return 0;
}