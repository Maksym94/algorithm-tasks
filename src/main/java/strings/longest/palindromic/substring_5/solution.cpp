#include <iostream>

using namespace std;

class Solution {

public:
    string longestPalindrome(string s) {
            if(s.length() <2) {
                return s;
            }
            int idxLeft = 0;
            int idxRight = 0;
            for(int i = 0; i < s.length(); i++) {
                int maxLeft = getMaxPolar(s, i, i);
                int maxRight = getMaxPolar(s, i, i +1);
                int max = std::max(maxLeft, maxRight);
                if(max > idxRight - idxLeft) {
                    idxLeft = i - (max -1) /2;
                    idxRight = i + max /2;
                }
            }
            return std::string(&s[idxLeft], &s[idxRight+1]);
        }

int getMaxPolar(string s, int left, int right) {
    int leftCurr = left;
    int rightCurr = right;
    while(leftCurr >= 0 && rightCurr < s.length()) {
        if(s.at(leftCurr) == s.at(rightCurr)) {
            leftCurr--;
            rightCurr++;
        } else {
            break;
        }
    }
    return rightCurr - leftCurr - 1;
}

};

int main()
{
    Solution sol;
    cout << sol.longestPalindrome("aba");
    return 0;
}
