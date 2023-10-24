package service;

import java.util.ArrayList;
import java.util.List;
import model.Computer;
import model.User;
import util.ValidationCheck;
import view.GameView;

public class GamePlayService {

    private static final int NUMBER_SIZE = 3;
    private static final int STRIKE_COUNT_INDEX = 0; //현재 스트라이크 개수 -> 인덱스로 저장
    private static final int STRIKE_COUNT_THREE = 3; //현재의 스트라이크 개수와 비교하기 위한 3스트라이크의 값 생성

    private Computer computer = new Computer();
    private User user = new User();

    private final GameView gameView = new GameView();
    private final ValidationCheck validationCheck = new ValidationCheck();

    private List<Integer> countStrikeBall = new ArrayList<>();
    private List<Integer> countStrikeBallList = new ArrayList<>();

    private int countStrike;
    private int countBall;

    public void playGame() {
        // 1. 게임 시작 메시지
        gameView.startGameView();

        // 2. 컴퓨터 숫자 입력
        computer.setComputerNumbers();

        // 3. 사용자 숫자 입력
        String userInput = gameView.userInput(); // 3. 사용자 숫자 입력
        validationCheck.checkUserInput(userInput); // 4. 사용자 숫자 유효성 체크

    }
}
