package Assesement_day6;
enum PriorityLevel {
    LOW(0),MEDIUM(3),HIGH(7),CRITICAL(8);

    private final int severityCode;
    private static final int URGENCY_THRESHOLD = 5;

    PriorityLevel(int severityCode) {
        this.severityCode = severityCode;
    }

    public boolean isUrgent() {
        return severityCode >= URGENCY_THRESHOLD;
    }

    public int getSeverityCode() {
        return severityCode;
    }

    public String getDescription() {
        return name() + " (Severity Code: " + severityCode + ")";
    }
}


public class Security {

	public static void main(String[] args) {
		 for (PriorityLevel level : PriorityLevel.values()) {
	            System.out.println(level.getDescription() + ", Urgent: " + level.isUrgent());
		 }

	}

}
