#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;

    for(int i=1;i<2*n;i++){
        int r=i>n?2*n-i:i;
        int spaces=n-r;
    for(int j=0;j<spaces;j++){
        cout<<" ";
    }
    for(int k=0;k<r;k++){
        cout<<"* ";
    }
    cout<<"\n";

    }
}