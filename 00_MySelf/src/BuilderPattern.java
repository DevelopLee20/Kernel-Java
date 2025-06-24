class F1Car {
    private final String wheel;     // 변수1
    private final String team;      // 변수2
    private final String engine;    // 변수3

    // Builder 만 호출 가능
    private F1Car(Builder builder) {    // 생성자, Private로 내부(Builder) 에서만 호출 가능
        this.wheel = builder.wheel;     // 변수1 생성
        this.team = builder.team;       // 변수2 생성
        this.engine = builder.engine;   // 변수3 생성
    }

    public String getWheel() {  // 변수1 게터
        return wheel;
    }
    public String getTeam() {   // 변수2 게터
        return team;
    }
    public String getEngine() { // 변수3 게터
        return engine;
    }

    @Override                   // 오버라이딩
    public String toString() {  // 출력 확인을 위해 toString(): 객체를 Print하면 반환되는 내용
        return "wheel=" + wheel + ", team=" + team + ", engine=" + engine;
    }

    static class Builder {      // static: F1Car 클래스에 종속되지 않도록 빌더 생성
        private static String wheel;   // 임시변수1 생성
        private static String team;    // 임시변수2 생성
        private static String engine;  // 임시변수3 생성

        public Builder buildWheel(String wheel) {   // 변수1 빌드 메서드
            Builder.wheel = wheel;
            return this;
        }

        public Builder buildTeam(String team) {     // 변수2 빌드 메서드
            Builder.team = team;
            return this;
        }

        public Builder buildEngine(String engine) { // 변수3 빌드 메서드
            Builder.engine = engine;
            return this;
        }

        public F1Car build() {                      // 최종빌드: 임시 변수를 F1Car 변수로 사용
            return new F1Car(this);

        }
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        // 체이닝 형태
        F1Car hyundia = new F1Car.Builder().buildEngine("f1").buildTeam("redbull").buildWheel("shoes").build();
        System.out.println(hyundia);        // 오버라이딩한 toString() 호출

        F1Car CarBuilder = new F1Car.Builder().buildEngine("f2").build();
        System.out.println(CarBuilder);     // 오버라이딩한 toString() 호출
    }
}
