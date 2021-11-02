public class Main {

    public static void main(String[] args) {
        int[][] map = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int randX;
        int randY;
        System.out.println("key:");
        System.out.println("H = home");
        System.out.println("C = cave");
        System.out.println("+ = hospital");
        System.out.println("S = shop");
        System.out.println("M = mountain");
        System.out.println("# = grass");

        map[2][2] = 1;

        for (int i = 2; i <= 5; ++i) {
            randX = (int) (Math.random() * 4);
            randY = (int) (Math.random() * 4);
            if (map[randX][randY] > 0) {
                while (map[randX][randY] > 0) {
                    randX = (int) (Math.random() * 4);
                    randY = (int) (Math.random() * 4);
                }
            }
            map[randX][randY] = map[randX][randY] + i;
        }
        for (int j = 0; j < map.length; j++) {
            for (int k = 0; k < map[j].length; k++) {
                if ((int)map[j][k] == 1) {
                    System.out.print("H ");
                } else if ((int) map[j][k] == 2) {
                    System.out.print("C ");
                } else if ((int)map[j][k] == 3) {
                    System.out.print("+ ");
                } else if ((int)map[j][k] == 4) {
                    System.out.print("S ");
                } else if((int)map[j][k] == 5){
                    System.out.print("M ");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println("");

        }
    }
}