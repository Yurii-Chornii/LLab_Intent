package hometask_2_1;

public enum SalaryTypes {
    HOURLY("hourly"), MONTHLY("monthly");

    private String alias;

    SalaryTypes(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "SalaryTypes{" +
                "alias='" + alias + '\'' +
                "} " + super.toString();
    }
}
