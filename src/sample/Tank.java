package sample;

import javafx.scene.shape.Rectangle;

/**
 * @author guolinyuan
 */
public class Tank extends Rectangle
{


    private static final double SPEED = 10;

    /**
     * 控制飞机方向的变量
     * 玩家飞机移动方法,控制不飞出游戏界面（计算图片边框）
     */
    private boolean left , right , up , down ;


    @SuppressWarnings("all")
    void move()
    {
        new Thread(() ->
        {
            while (true)
            {
                if (left  && getX() > 0 ) setX(getX() -SPEED);
                if (up    && getY() > 0)  setY(getY() -SPEED);
                if (right && getX() < 600.0 - this.getWidth()) setX(getX() +SPEED);
                if (down  && getY() < 400.0 - this.getHeight()) setY(getY() +SPEED);
                try
                {
                    Thread.sleep(50);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void setLeft(boolean left)
    {
        this.left = left;
    }

    public void setRight(boolean right)
    {
        this.right = right;
    }

    public void setUp(boolean up)
    {
        this.up = up;
    }

    public void setDown(boolean down)
    {
        this.down = down;
    }

}
