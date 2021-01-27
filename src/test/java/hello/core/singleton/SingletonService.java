package hello.core.singleton;

public class SingletonService {
    //스태틱 영역 공부하기 ~~~~_~~~~
    //자바가 뜨면서 static 영역에 싱글톤서비스 객체 생성해서 가지고 있음
    private static final SingletonService instance = new SingletonService();

    //이 객체 인스턴스가 필요하면 getInstance() 메서드를 통해서만 조회 할 수 있다. 이 메서드를 호출하면
    //항상 같은 인스턴스를 반환 한다.
    public static SingletonService getInstance() {
        return instance;
    }

    // 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService() {

    }




}
