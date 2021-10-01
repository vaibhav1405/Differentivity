#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;

    int l=0,e=n;

    int arr[n];

    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    while(l<e){
        int mid=(l+e)/2;
        
        if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
            cout<<arr[mid];
            return 0;
        } else if(arr[mid]>arr[mid-1]){
            l=mid;
        } else if(arr[mid]<arr[mid-1]){
            e=mid;
        }


        
    
    }

}
