vector<int> pf(int N)  
{
    int i=0,c=0;
    vector<int> v;
    for(i=2;i*i<=N;i++)
    {
        if(N%i==0)
          {
              c=0;
              while(N%i==0)
                {
                    c++,N/=i;
                    v.push_back(i);
                }
          }
    }
    if(N>1)
    {
        v.push_back(N);
    }
    return v;
}
