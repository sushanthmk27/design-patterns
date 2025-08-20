import java.util.List;

public class SmartStudent extends Student {
    private int iq;

    public SmartStudent(int iq, String name, String id, String email, int age,
                        String batch, List<String> subjects) {
        super(name, id, email, age, batch, subjects);
        this.iq = iq;
    }

    private SmartStudent(SmartStudent smartStudent) {
        super(smartStudent);
        this.iq = smartStudent.iq;
    }

    @Override
    public SmartStudent copy() {
        return new SmartStudent(this);
    }
}
