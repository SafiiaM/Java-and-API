import java.util.Random;

public class Point2D {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEmpty(int[][] map){
        boolean answer = false;
        if (map[this.x][this.y] >= 0){
            answer = true;
        }
        return answer;
    }

    
    public boolean equals(Object point) {
        Point2D myPoint = (Point2D) point;
        return x == myPoint.x && y == myPoint.y;
    }

    public void notWallPoint(int height, int width, int[][]map){
        Random random = new Random();
        do {
            
            x = random.nextInt(1, height);
            y = random.nextInt(1, width);
            
        } while (!isEmpty(map));
    }
}