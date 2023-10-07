import java.util.Objects;

public class Staff {
    private String name;
    private int staffId;

    public Staff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public int getStaffId() {
        return staffId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return staffId == staff.staffId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId);
    }
}
