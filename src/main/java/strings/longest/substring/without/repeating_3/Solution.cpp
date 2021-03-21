#include <iostream>
#include <cstring>
#include <unordered_map>
using namespace std;

class Solution {

public:
   int lengthOfLongestSubstring(string s) {
    int n = s.length();
    char char_array[n + 1];
    strcpy(char_array, s.c_str());
    int startIdx = 0;
    int endIdx = 0;
    int max = 0;
    unordered_map<char, int> m;
    for (int i = 0; i < n; i++) {
        char curr = char_array[i];
        if(m.find(curr) != m.end()) {
            int idx = m[curr] + 1;
            if(startIdx< idx){
                startIdx = idx;
            }
        }
        endIdx++;
        int result = endIdx - startIdx;
        if(result> max){
            max = result;
        }
        m[curr]=i;
    }
      return max;
   }
};


int main()
{
    Solution sol;
    cout << sol.lengthOfLongestSubstring("wobgrovw");
    return 0;
}