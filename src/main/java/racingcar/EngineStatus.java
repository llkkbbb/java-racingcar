package racingcar;

public enum EngineStatus {
    ON, OFF;

    public boolean isOff() {
        return EngineStatus.OFF.equals(this);
    }
}
