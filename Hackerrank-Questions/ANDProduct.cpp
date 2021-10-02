#include <bits/stdc++.h>
using namespace std;
#define FAST ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr)
#define ll long long
ll findXOR(ll n){
    switch(n&3){
        case 0 :
        return n;
        case 1 :
        return 1;
        case 2 :
        return n+1;
        case 3 :
        return 0;
    }
    return 0;
}
int main()
{
    FAST;
    int t;
    cin>>t;
    while(t--){
        ll a,b;
        cin>>a>>b;
        ll q=findXOR(a-1)^findXOR(b);
        cout<<q<<"\n";        
    }   
    return 0;
}