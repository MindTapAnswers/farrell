public class Team {
    private String name = "Roosevelt High";
    private String sport = "Girls' Basketball";
    private String mascot = "Dolphins";
    public final static String MOTTO = "Sportsmanship!";
    public Team(String name, String sport, String mascot) {
        this.name = name;
        this.sport = sport;
        this.mascot = mascot;
    }
    public String getName() {
        return name;
    }
    public String getSport() {
        return sport;
    }
    public String getMascot() {
        return mascot;
    }
}
