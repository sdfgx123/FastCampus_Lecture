package part02.ch01.no18;

/**
 * singleton 객체를 테스트 하기 위한 클래스
 * 목적 : 두 개의 Company 타입의 두 변수가 하나의 인스턴스를 공유하는지 > 즉, 싱글톤 패턴 만족 여부 확인
 */
public class CompanyTest {

    /**
     * print로 찍어보면, 두 개의 변수가 하나의 주소값을 바라봄
     * 즉 두 변수는 하나의 인스턴스를 공유한다.
     */
    public static void main(String[] args) {
        Company company01 = Company.getInstance();
        Company company02 = Company.getInstance();
        System.out.println(company01);
        System.out.println(company02);
    }
}
