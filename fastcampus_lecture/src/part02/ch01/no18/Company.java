package part02.ch01.no18;

/**
 * 18강 static 응용 : singleton pattern
 * 프로그램이 실행될 때 인스턴스는 하나만 생성돼야 한다는 디자인 패턴
 */
public class Company {

    private static Company instance = new Company();

    // 생성자를 private으로 접근 제어 > 객체는 하나만 있어야 한다는 패턴을 지키기 위해서
    private Company() {

    }

    /**
     * 생성자를 외부에서 호출하지 못하게 하고, 그 대신 getInstance 메서드를 통해 접근하게 함.
     * 이런 방식으로 인스턴스에 접근하려면, 메서드를 static에 올려놔야 직접 호출할 수 있음.
     */
    public static Company getInstance() {
        if (instance==null) instance = new Company();
        return instance;
    }
}
