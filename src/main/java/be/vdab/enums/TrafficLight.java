package be.vdab.enums;

public enum TrafficLight {
    RED ("Please stop"), GREEN ("Please go"), YELLOW ("Please caution");

    private String description;

    TrafficLight(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
