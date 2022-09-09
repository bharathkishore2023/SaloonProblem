public enum ServiceType {
    NORMAL(0.05),
    PREMIUM(0.02);

    private final double type;

    ServiceType(double type) {
        this.type=type;
    }

    public double getType() {
        return type;
    }
}
