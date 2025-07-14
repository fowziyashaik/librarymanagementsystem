
package model;

public class StudentMember extends Member {
    public StudentMember(String id, String name) {
        super(id, name);
    }

    @Override
    public int getMaxBooksAllowed() {
        return 3;
    }
}
