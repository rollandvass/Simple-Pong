import java.awt.*;
import java.util.*;

public class Ball extends Rectangle {

    Random random;
    int velocityX, velocityY;
    int initialSpeed = 2;

    public Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0) {
            randomXDirection--;
        }
        setXDirection(randomXDirection * initialSpeed);

        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0) {
            randomYDirection--;
        }
        setYDirection(randomYDirection * initialSpeed);
    }

    public void setXDirection(int randomXDirection) {
        velocityX = randomXDirection;
    }

    public void setYDirection(int randomYDirection) {
        velocityY = randomYDirection;
    }

    public void move() {
        x += velocityX;
        y += velocityY;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);
    }

}