package homeWork.day9.day9;

/**
 * Created by Johnny on 2018/3/21.
 */
public class OldPhone implements Phone{
    @Override
    public void call() {
        System.out.println("旧手机打电话。");
    }

    @Override
    public void sendMessage() {
        System.out.println("旧手机发信息。");
    }
}
