package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        while (true) {
            List<Integer> computer = initializeGame();

        }
    }

    private static List<Integer> initializeGame() {
        System.out.println("숫자 야구 게임을 시작합니다.\n");

        return selectRandomNumbers();
    }
    private static List<Integer> selectRandomNumbers() {
        List<Integer> computer = new ArrayList<>();

        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);

            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        return computer;
    }
}