import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static int countGameLevel = 1;

    public static char player = '@';
    public static int playerPosX;
    public static int playerPosY;
    public static int playerHealth = 100;
    public static int playerDamage;
    public static int playerMoveCount = 0;

    public static char enemy = '#';
    public static int enemyDamage;

    public static int damageMin = 25;
    public static int damageMax =40;

    public static char[][] map;
    public static char[][] invisibleMap;
    public static int mapWidth;
    public static int mapHeight;
    public static int mapSizeMin = 2;
    public static int mapSizeMax = 5;

    public static final int moveUp = 1;
    public static final int moveDown = 2;
    public static final int moveLeft = 3;
    public static final int moveRight = 4;

    public static char emptyCell = '_';
    public static char readyCell = '*';

    public static void main(String[] args) {
        while(isAlivePlayer()){
            System.out.println(">>>Console Game === Start! Level " + countGameLevel + " <<<");
            gameCycle();
            countGameLevel++;
        }
        scanner.close();
        System.out.println(">>>Console Game === Game Over! Count Level: " + countGameLevel +
                ". Count Steps: " + playerMoveCount + "<<<");


    }
    public static void gameCycle(){
        initMap();
        createPlayer();
        createEnemies();
        while(true) {
            printMap();
            System.out.println("Player info>> Steps: " + playerMoveCount + ". Health: " + playerHealth
                    + ". Player damage: " + playerDamage);
            movePlayer();
            if(mapIsFull()){
                System.out.println("Level complete. Welcome to next Level");
                break;
            }
            if(!isAlivePlayer()){
                System.out.println("Player is dead");
                printMap();
                break;
            }
        }
    }

    public static void initMap(){
        mapWidth = randomRange(mapSizeMin, mapSizeMax);
        mapHeight = randomRange(mapSizeMin, mapSizeMax);
        map = new char[mapHeight][mapWidth];
        invisibleMap = new char[mapHeight][mapWidth];
        for (int y = 0; y < mapHeight; y++){
            for (int x = 0; x < mapWidth; x++){
                map[y][x] = emptyCell;
            }
        }
        System.out.println("New map: Size[" + mapWidth + "x" + mapHeight + "]");
    }
    public static void printMap(){
        System.out.println("=====================");
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("=====================");
    }
    public static void createPlayer (){
        playerPosX = mapHeight / 2;
        playerPosY = mapWidth / 2;
        map[playerPosY][playerPosX] = player;
        playerDamage = randomRange(damageMin, damageMax);
        System.out.println("Player damage: " + playerDamage);
    }
    public static void createEnemies(){
        enemyDamage = randomRange(damageMin, damageMax);
        int countEnemies = (mapHeight + mapWidth) / 3;
        int x;
        int y;
        for (int i=0; i < countEnemies; i++){
            do {
                x = random.nextInt(mapWidth);
                y = random.nextInt(mapHeight);
            }
            while (x == playerPosX && y == playerPosY);
            invisibleMap[y][x] = enemy;
        }
        System.out.println("Enemy count: "+ countEnemies + ". Enemy damage: " + enemyDamage);
    }
    public static void movePlayer(){
        int currentX = playerPosX;
        int currentY = playerPosY;
        int playerDestination;
        do {
            System.out.print("Enter your move (UP = " + moveUp + ", DOWN = " + moveDown +
                    ", LEFT = " + moveLeft + ", RIGHT = " + moveRight + ") >>> ");
            playerDestination = scanner.nextInt();
            switch (playerDestination){
                case moveUp:
                    playerPosY -= 1;
                    break;
                case moveDown:
                    playerPosY += 1;
                    break;
                case moveLeft:
                    playerPosX -=1;
                    break;
                case moveRight:
                    playerPosX +=1;
                    break;
            }
        }
        while (!isValidNextMove(currentY, currentX, playerPosY, playerPosX));

        nextMoveAction(currentY, currentX, playerPosY, playerPosX);
        ++playerMoveCount;
    }
    public static boolean isValidNextMove( int currentY, int currentX, int nextY, int nextX){
        if (nextY >= 0 && nextY < mapHeight && nextX >= 0 && nextX < mapWidth){
            return true;
        }
        else {
            playerPosX = currentX;
            playerPosY = currentY;
            System.out.println("Invalid move. Please Try again.");
            printMap();
            return false;
        }
    }
    public static void nextMoveAction( int currentY, int currentX, int nextY, int nextX){
        if (invisibleMap[nextY][nextX]==enemy) {
            if (playerDamage > enemyDamage) {
                playerHealth -= randomRange(5, damageMin - 5);
                System.out.println("Player killed enemy! Got damage: " + randomRange(5, damageMin - 5)
                        + ". Player Health: " + playerHealth);
            } else {
                playerHealth -= enemyDamage;
                System.out.println("Player met enemy. Got damage: " + enemyDamage + ". Player health: " + playerHealth);
            }

        }
        map[currentY][currentX] = readyCell;
        map[playerPosY][playerPosX] = player;
        invisibleMap[playerPosY][playerPosX] =readyCell;
        if (randomDamageBuff()){
            playerDamageIncrease(5);
        }
        if (randomHealBuff()){
            healPlayer(randomRange(10, 20));
        }

    }

    public  static boolean mapIsFull(){
        for ( int y =0; y <mapHeight; y++){
            for (int x =0; x< mapWidth; x++){
                if (map[y][x] == emptyCell) return false;
            }
        }
        return true;
    }
    public static boolean randomDamageBuff() {
        return random.nextInt(100) < 10;
    }
    public static boolean randomHealBuff() {
        return random.nextInt(100) < 20;
    }
    public static void playerDamageIncrease( int extraDamage){
        playerDamage += extraDamage;
        System.out.println("Player increased his damage by: " + extraDamage + ". Player's damage: " + playerDamage);
    }
    public static void healPlayer(int extraHealth){
        playerHealth += extraHealth;
        System.out.println("Player got healed by: " +extraHealth + ". Player's health: " + playerHealth);
    }
    public static boolean isAlivePlayer() {
        return playerHealth > 0;
    }

    public static int randomRange(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
