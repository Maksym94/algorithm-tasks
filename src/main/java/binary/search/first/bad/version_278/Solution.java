package binary.search.first.bad.version_278;

public class Solution extends VersionControl {

    public Solution(int badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n) {
        int minBadVersion = 1;
        int maxBadVersion = n;

        if(isBadVersion(minBadVersion)) {
            return minBadVersion;
        }
        while(minBadVersion <= maxBadVersion) {
            int midBadVersion = (minBadVersion + maxBadVersion) >>> 1;
            boolean isMidBadVersion = isBadVersion(midBadVersion);
            if(!isMidBadVersion && isBadVersion(midBadVersion + 1)) {
                return midBadVersion + 1;
            }
            if(!isMidBadVersion) {
                minBadVersion = midBadVersion + 1;
            } else {
                maxBadVersion = midBadVersion - 1;
            }

        }
        return n;
    }
}
