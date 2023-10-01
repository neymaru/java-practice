package com.example;

public class LottoMachinMain {
    public static void main(String[] args) {
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT];
        for (int i = 0 ; i < LottoMachine.MAX_BALL_COUNT; i += 1) {
            balls[i] = new Ball(i + 1);
        }
        // LottoMachine 인스턴스가 생성된다.
        LottoMachine lottoMachine = new LottoMachineImpl(); // 인터페이스는 인스턴스가 될 수 없지만, 참조하는 레퍼런스 타입은 될 수 있다.
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball[] result = lottoMachine.getBalls();

        for(int i = 0; i < result.length; i += 1) {
            System.out.println(result[i].getNumber());
        }
    }
}
