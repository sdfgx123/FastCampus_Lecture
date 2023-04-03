package part02.ch01.no19;

/**
 * factory 인스턴스는 싱글톤 패턴으로 인해 1개로 제한
 * car 인스턴스는 여러 개 생성
 */
public class CarFactoryTest {

    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        //Car mySonata = factory.createCar();
        //Car yourSonata = factory.createCar();
        Car mySonata = new Car();
        Car yourSonata = new Car();
        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
    }
}
