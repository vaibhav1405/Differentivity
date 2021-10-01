#include<bits/stdc++.h>
using namespace std;


int main(){
    int n;
    cin>>n;
    for(int row=0;row<2*n;row++){
    int r= row>n?2*n-row:row;
    int spaces=n-r;
    for(int k=0;k<spaces;k++){
        cout<<" ";
    }
    for(int j=0;j<r;j++){
        cout<<"* ";
    }
    cout<<"\n";
    }
}