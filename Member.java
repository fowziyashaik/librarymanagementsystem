
package model;

public abstract class Member {
    protected String memberId;
    protected String name;

    public Member(String id, String name) {
        this.memberId = id;
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public abstract int getMaxBooksAllowed();

    public String getName() {
        return name;
    }

    public String toString() {
        return memberId + " - " + name + " (" + this.getClass().getSimpleName() + ")";
    }
}
