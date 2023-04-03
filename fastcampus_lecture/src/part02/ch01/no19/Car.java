package part02.ch01.no19;

public class Car {

    private static int serialNum = 10000;
    private int carNum;

    public Car() {
        carNum = ++serialNum;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}
