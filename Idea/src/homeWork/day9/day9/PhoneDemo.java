package homeWork.day9.day9;

/**
 * Created by Johnny on 2018/3/21.
 */
public class PhoneDemo {
    public static void main(String[] args) {
        new NewPhone(){
            public void playGame(){
                System.out.println("重写内部类玩游戏。");
            }
        }.playGame();
    }
}
