#include<bits/stdc++.h>

using namespace std;
#define int long long
#define pb push_back

bool detectcycle(int cur, int par, vector<int> &vis, vector<pair<int, int>> adj[]){
     vis[cur]=1;
     for(auto val:adj[cur]){
        if(vis[val.first]==0)
            if(detectcycle(val.first, cur, vis, adj)) return true;
                else return false;
            else if(val.first != par) return true;
                else return false;
     }
     return false;
}

bool isCycle(int n, vector<pair<int, int>> adj[]){
    vector<int> vis(n+1, 0);
    for(int i=1; i<=n; i++){
        if(!vis[i])
            if(detectcycle(i, -1, vis, adj))
                return true;
            return false;
    }
    return false;
}

void solve() {
    int n,m;
    bool bidir;
    cin>>n>>m>>bidir;

    vector<pair<int, int>> adj[n+1];
    for(int i=0; i<m; i++){
        int u,v,wt;
        cin>>u>>v>>wt;
        adj[u].pb({v, wt});
        if(bidir)
            adj[v].pb({u, wt});
    }
    //call bfs here
    if(isCycle(n, adj))
        cout<<"yes";
    else    
        cout<<"no";
}

signed main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  #ifndef ONLINE_JUDGE
  freopen("input.txt", "r", stdin);
  freopen("output.txt", "w", stdout);
  #endif
  int t = 1;
  cin >> t;
  while (t--) {
    solve();
  }

  cerr << "time taken : " << (float) clock() / CLOCKS_PER_SEC << " secs" << endl;
  return 0;
}
