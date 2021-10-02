#include <bits/stdc++.h>
using namespace std;
#define FAST ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr)
#define ll long long
int mo=1e9 +7;
int main()
{
    FAST;
    ll t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        ll arr[n];
        ll x=0;
        for(int i=0;i<n;i++){
        cin>>arr[i];
        x|=arr[i];
        }
        int qqq=n-1;
        ll q=x<<qqq;
        q%=mo;
        cout<<q<<"\n";
        
    }
    return 0;
}