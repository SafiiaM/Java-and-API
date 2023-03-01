import java.util.LinkedList;
import java.util.Queue;

/*метод закрашивания карты */
public class ColorizeMap {
    private int [][] weights;
    int height;
    int width;

    public ColorizeMap(){
    }

    public ColorizeMap(int[][] map){
        set(map);
    }

    public void set(int[][] map){
        height = map.length;
        width = map[0].length;
        weights = new int[height][width];
        // копируем массив
        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                weights[i][j] = map[i][j];
            }
        }
}

    /**
     * Присваивание цветов в клетках лабиринта, не занятых стенками и имеющих путь от точки начала - startPoint
     * цвет увеличивается на 1 при каждом шаге от точки startPiont
     * @param map лабиринт в виде массива int[][], границы равны -1
     * @param startPoint точка старта, граница  = 1
     * @param return возвращает массисв int[][] того же размера, что и первоначальный
     */
    public int[][] colorize(Point2D startPoint){
            Queue<Point2D> fifo = new LinkedList<>();
            fifo.add(startPoint);

            // вес startPoint = 1    
            int weight = 1;

            weights[startPoint.x][startPoint.y] = weight;
    
            while (fifo.size() != 0) {
                Point2D tmp = fifo.poll();
                weight = weights[tmp.x][tmp.y] + 1;
                if ((tmp.x+1 < height) && (weights[tmp.x+1][tmp.y] == 0)) {
                    weights[tmp.x+1][tmp.y] = weight;
                    fifo.add(new Point2D(tmp.x+1, tmp.y));
                }
                if ((tmp.y+1 < width) && (weights[tmp.x][tmp.y+1] == 0)) {
                    weights[tmp.x][tmp.y+1] = weight;
                    fifo.add(new Point2D(tmp.x, tmp.y+1));
                }
                if ((tmp.x-1 >= 0) && (weights[tmp.x-1][tmp.y] == 0)) {
                    weights[tmp.x-1][tmp.y] = weight;
                    fifo.add(new Point2D(tmp.x-1, tmp.y));
                }
                if ((tmp.y-1 >= 0) && (weights[tmp.x][tmp.y-1] == 0)) {
                    weights[tmp.x][tmp.y-1] = weight;
                    fifo.add(new Point2D(tmp.x, tmp.y-1));
                }
            }
            return weights;
    }



    public static void printMap(int[][] map){
        System.out.println("Labirint:");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j] == -1 ? "\033[31m\u2593\u2593":"  ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static Point2D[] findPath(int[][]weights, Point2D start, Point2D stop){
        Integer pathLength = weights[stop.x][stop.y];
        // если до точки нельзя дойти (граница = 0) или это стена (граница = -1), то возвращается массив с нулевой длиной
        if (pathLength < 1) return new Point2D[]{};
        
        Point2D[] path = new Point2D[pathLength+1];
        Integer n = pathLength;
        Point2D now = stop;
        path[n] = now;
        for (int k = 0; k < pathLength; k++){
            if (weights[now.x+1][now.y] < n && weights[now.x+1][now.y] != -1) {
                n = weights[now.x+1][now.y];
                now = new Point2D(now.x+1, now.y);
                path[n] = now;
                continue;
            }
            if (weights[now.x-1][now.y] < n && weights[now.x-1][now.y] != -1) {
                n = weights[now.x-1][now.y];
                now = new Point2D(now.x-1, now.y);
                path[n] = now;
                continue;
            }
            if (weights[now.x][now.y+1] < n && weights[now.x][now.y+1] != -1) {
                n = weights[now.x][now.y+1];
                now = new Point2D(now.x, now.y+1);
                path[n] = now;
                continue;
            }
            if (weights[now.x][now.y-1] < n && weights[now.x][now.y-1] != -1) {
                n = weights[now.x][now.y-1];
                now = new Point2D(now.x, now.y-1);
                path[n] = now;
                continue;
            }
        }
        return path;
    }


    public static void printPath(int[][] map, Point2D[] path){
        System.out.println("Path:");
        map[path[1].x][path[1].y] = 2;
        map[path[path.length-1].x][path[path.length-1].y] = 3;
        for (int i = 2; i < path.length-1; i++) {
            map[path[i].x][path[i].y] = 1;//i;
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++){
                if (map[i][j] == -1) System.out.print("\033[31m\u2593\u2593");
                if (map[i][j] == 0) System.out.print("  ");
                if (map[i][j] == 1) System.out.print("\033[32m\u2591\u2591");
                if (map[i][j] == 2) System.out.print("\033[32m\uC6C3");
                if (map[i][j] == 3) System.out.print("\033[32m\u2705");

            }
            System.out.println();
        }
    }


    


}

