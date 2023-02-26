#include <iostream>
#include <vector>
using namespace std;

class Solution {

public:
    void moveZeros(vector<int>& nums) {
        int rightIdx = nums.size() - 1;
        for(int i = 0; i <nums.size(); i++) {
        int leftIdx = 0;
        while(leftIdx < rightIdx) {
            if(nums[leftIdx] != 0) {
                leftIdx++;
                continue;
            }
            nums[leftIdx] = nums.at(leftIdx+1);
            nums[leftIdx+1] = 0;
            leftIdx++;
        }
        rightIdx--;
        }
    }

};

int main() {
    vector<int> nums {0,0,0,1};
    Solution sol;
    sol.moveZeros(nums);
    for (auto i: nums) {
    cout << i << ' ';
    }
    return 0;
}
