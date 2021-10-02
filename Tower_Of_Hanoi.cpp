#include<bits/stdc++.h>
#define ll long long
using namespace std;

void solve(int n, int s, int d, int h, int &count){
   count++;
   if (n==1){
        cout<<"Moving from"<<s<<"->"<<d<<"step-"<<count<<endl;
        return;
    }
    solve(n-1,s,h,d,count);
    cout<<"Moving from"<<s<<"->"<<d<<"step-"<<count<<endl;
    solve(n-1,h,d,s,count);
    return;
}

int main(){
    int n;
    cin>>n;
    int s=1;
    int h=2;
    int d=3;
    int count=0;
    solve(n,s,d,h,count);
}
