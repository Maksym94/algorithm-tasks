#include <iostream>
#include <vector>
using namespace std;

class Solution {

public:
    void rotate(vector<int>& nums, int k) {
         int shift = std::min(k, k % (int) nums.size());
            for(int i = 0; i < shift; i++) {
                int curr = nums.at(nums.size() - 1);
                for(int j = nums.size() - 1; j > 0; j--) {
                    nums[j] = nums.at(j-1);
                }
                nums[0] = curr;
            }
    }
};

int main()
{
    vector<int> nums {1,2,3,4,5,6,7};
    Solution sol;
    sol.rotate(nums, 3);
    for (auto i: nums) {
       cout << i << ' ';
    }
    return 0;
}
