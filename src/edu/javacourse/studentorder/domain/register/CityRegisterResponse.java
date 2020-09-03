package edu.javacourse.studentorder.domain.register;

public class CityRegisterResponse
{
    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public boolean isTemporal() {
        return temporal;
    }

    public void setTemporal(boolean temporal) {
        this.temporal = temporal;
    }

    private boolean existing;
    private boolean temporal;

    @Override
    public String toString() {
        return "CityRegisterResponse{" +
                "registered=" + existing +
                ", temporal=" + temporal +
                '}';
    }
}