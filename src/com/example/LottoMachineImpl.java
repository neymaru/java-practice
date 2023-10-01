package com.example;

// 인터페이스를 구현하게 되면 반드시 인터페이스가 가지고 있는 메소드를 오버라이딩할 필요가 있다.
public class LottoMachineImpl implements LottoMachine {
    private Ball[] balls;

    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    // Math.random() -->  0.0 <= x < 1.0
    @Override
    public void mix() {
        for (int i = 0; i < 10000; i += 1) {
            int x1 = (int) (Math.random() * LottoMachine.MAX_BALL_COUNT);  // 0~44
            int x2 = (int) (Math.random() * LottoMachine.MAX_BALL_COUNT);  // 0~44
            if (x1 != x2) {
                Ball tmp = balls[x1]; // 값을 치환할 때는 같은 type읠 임시변수가 필요하다.
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }
        }

    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[LottoMachine.RETURN_BALL_COUNT];    // Ball 6개를 참조할 수 있는 배열
        for (int i = 0; i < LottoMachine.RETURN_BALL_COUNT; i += 1) {
            result[i] = balls[i];
        }
        return result;
    }
}
