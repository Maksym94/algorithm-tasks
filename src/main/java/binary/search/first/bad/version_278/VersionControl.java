package binary.search.first.bad.version_278;

public class VersionControl {

    private final int badVersion;

    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int version) {
        return badVersion <= version;
    }

    public int getBadVersion() {
        return this.badVersion;
    }
}
