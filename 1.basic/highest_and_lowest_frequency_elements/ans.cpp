#include <map>
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
void find(vector<int> input){
    map<int, int> mpp;
    for (int i = 0; i < input.size(); i++) {
        mpp[input[i]]++;
    }
    vector<pair<int, int>> fre;
    int c=0;
    for(auto& i: mpp){
        fre.push_back({i.second,i.first});
    }

    sort(fre.begin(),fre.end(),greater<pair<int, int>>());
    cout<<"Greatest is "<<fre[0].second<<" and frequency is"<<fre[0].first<<endl;
    cout<<"Lowest is "<<fre[fre.size()-1].second<<" and frequency is"<<fre[fre.size()-1].first;
}

int main()
{
    int n;
    cout << "Enter the value of n: ";
    cin >> n;
    vector<int> input;
    for (int i = 0; i < n; i++)
    {
        int data;cin>>data;
        input.push_back(data);
    }
    find(input);
    return 0;
}