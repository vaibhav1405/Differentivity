/*

        Hey Everyone,
            I'm Om just started Algorithms topic in java wanted to share that i have found a great way to find total prime no. between given two no.
            It saves much time from bruteforce Solution Hope this helps!
        Thanks!
        Om Duragkar
        GITHUB Account : https://github.com/omduragkar
 */



// The Most efficient way to find optimized solution of total primes between two given no. it reduces time complexity from O(n^2) to O(logn)
#include <iostream>
using namespace std;

int main()
{
        int l;
        cin>>l;
        int h ;
        cin>>h;
        for(int i=l;i<=h;i++)
        {
            int j=2;
            bool isprime=true;
            while(j*j<=i)
            {
                if(i%j==0)
                {
                    isprime= false;
                    break;
                }
                j++;
            }
            if(isprime)
            {
                cout<<i<<endl;
            }
        }
}