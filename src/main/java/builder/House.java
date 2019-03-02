package builder;

public class House {
    private int doors = 4;
    private int windows = 4;
    private int stages = 1;
    private String address = "Test street";

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public int getStages() {
        return stages;
    }

    public String getAddress() {
        return address;
    }

    public House(Builder houseBuilder) {
        this.address = houseBuilder.address;
        this.doors = houseBuilder.doors;
        this.stages = houseBuilder.stages;
        this.windows = houseBuilder.windows;
    }
    public static class Builder {

        private int doors;

        public Builder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder setStages(int stages) {
            this.stages = stages;
            return this;
        }

        private int windows;
        private int stages;
        private String address;

        public Builder(String address) {
            this.address = address;
        }

        public House build() {
            return new House(this);
        }

    }

}
