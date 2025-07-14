
package model;

public class FacultyMember extends Member {
    public FacultyMember(String id, String name) {
        super(id, name);
    }

    @Override
    public int getMaxBooksAllowed() {
        return 5;
    }
}
