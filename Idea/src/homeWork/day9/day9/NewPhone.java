package homeWork.day9.day9;

/**
 * Created by Johnny on 2018/3/21.
 */
public class NewPhone implements Phone {
    @Override
    public void call() {
        System.out.println("新手机打电话。");
    }

    @Override
    public void sendMessage() {
        System.out.println("新手机发信息。");
    }

    public void playGame() {
        System.out.println("新手机玩游戏。");
    }
}
