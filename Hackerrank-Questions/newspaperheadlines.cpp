#include <bits/stdc++.h>
using namespace std;
#define FAST ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr)
#define ll long long
int main()
{
    FAST;
    string s;
    string s1;
    cin>>s>>s1;
        map<char,int> mp;
        for(int i=s.length();i>0;i--){
            mp[s[i-1]]=i;
        }
        int count=0;
    for(int i=0;i<s1.length()-1;i++){
        if((mp.find(s1[i]) != mp.end()) && (mp.find(s1[i+1]) != mp.end())){
            if(mp[s1[i]]>=mp[s1[i+1]])
            count++;
        }
        else {
        cout<<"-1";
        return 0;
        }
    }
    cout<<count+1<<"\n";
    return 0;
}