package Les48_ENUM;

public enum Season {
    WINTER(-20), SUMMER(35), AUTUMN(10), SPRING(5);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }
}
