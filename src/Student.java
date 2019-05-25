import java.util.Map;

public class Student {
    private String stuId;
    private String name;
    private float totalScore;
    private float avgScore;
    private Map<String, Float> subjects;

    public Student(String stuId, String studentName, Map<String, Float> subjects, float totalScore) {
        this.stuId = stuId;
        this.name = studentName;
        this.subjects = subjects;
        this.totalScore = totalScore;
        this.avgScore = this.totalScore / this.subjects.size();
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(float totalScore) {
        this.totalScore = totalScore;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    public Map<String, Float> getSubjects() {
        return subjects;
    }

    public void setSubjects(Map<String, Float> subjects) {
        this.subjects = subjects;
    }
}
