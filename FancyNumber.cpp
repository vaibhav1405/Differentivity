#include <bits/stdc++.h>
using namespace std;

bool isFancy(string num)
{
    map <int, int> f;
    f['0']='0';
    f['1']='1';
    f['6']='9';
    f['8']='8';
    f['9']='6';
    
    int n=num.length();
    int l=0, r=n-1;
    while(l<=r)
    {
        if(f.find(num[l])==f.end() || f[num[l]]!=num[r])
        return false;
        l++;
        r--;
    }
    return true;
}

int main() {
	string num;
	cin>>num;
	isFancy(num)?cout<<"Yes":cout<<"No";
	return 0;
}
