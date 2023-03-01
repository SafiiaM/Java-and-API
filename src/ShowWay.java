public class ShowWay {
    
    // метод, присваивающий всем ячейкам map по пути следования границу = -2 
    public static void showWay(int[][] map, Point2D[] point){
        // начало
        map[point[0].x][point[0].y] = -4;     
        for (int i = 1; i < point.length - 1; i++){
            map[point[i].x][point[i].y] = -2;
        }
        // конец
        map[point[point.length - 1].x][point[point.length - 1].y] = -3; 
    }
}
