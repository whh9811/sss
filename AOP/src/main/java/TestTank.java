/**
 * Created by MAIBENBEN on 2019/3/7.
 */
public class TestTank {

    public static void main(String[] args){
        Tank tank = new Tank();
        Move move = new TankProxy(tank);
        move.move();
    }
}
