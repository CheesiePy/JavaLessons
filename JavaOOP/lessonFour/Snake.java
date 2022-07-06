/*imports*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//class declation 
public class Snake extends JFrame {
    // atributs

    /* Some properties. */
    private final int BOARD_WIDTH = 20 * 30; // Tilesize * number of columns

    private final int BOARD_HEIGHT = 20 * 30;

    private final int TILE_SIZE = 20;

    private final int ALL_TILES = 900; // Total numer of tiles

    private final int DELAY = 70;

    /* The coordinates of the snake. */
    private int[] xCoor = new int[ALL_TILES];

    private int[] yCoor = new int[ALL_TILES];


    /* Coordinates for apple. */
    private int apple_x, apple_y;

    /* Pressed Key. */
    int pressedKey = KeyEvent.VK_DOWN; // check for more details

    int oldPressedKey;

    private int snakeSize = 3;

    private boolean inGame = true;

    // METHODS

    // nested class 
    public class Board extends JPanel implements KeyListener, ActionListener {
    
      Board(){ // board constractur 
        setBackground(Color.BLACK);

        // Set snake starting coordinates. 
        for(int i = 0; i < snakeSize; i++){
          yCoor[i] = 120 - (i * 30);
          xCoor[i] = 120;
        }

        spawnAppleCoor();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (inGame) {

        /* Draw apple. */
          g.setColor(Color.red);
        //g.fillRect(apple_x, apple_y, TILE_SIZE, TILE_SIZE);
          g.fillOval(apple_x, apple_y, TILE_SIZE, TILE_SIZE);
        /* Draw snake. */
        for (int i = 0; i < snakeSize; i++) {

            if (i == 0) { 
              g.setColor(Color.red); // Snakes head yellow
            } else {
              g.setColor(Color.green);}

            g.fillOval(xCoor[i], yCoor[i], TILE_SIZE, TILE_SIZE);
        }

        /* Draw score */
        g.setFont(new Font("Sans serif", Font.BOLD, 20));
        g.drawString(getScore(), 550, 30);

        } else {
          gameOver(g);
        }
    }

    public void actionPerformed(ActionEvent e) {

        checkTile();
        moveSnakeCoor();
        repaint();

    }

    /* Saves pressedKeyCode to pressedKey. */
    public void keyPressed(KeyEvent e) {
        oldPressedKey = pressedKey;
        pressedKey = e.getKeyCode();
    }

    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}

    private void checkTile(){
        /* Check if outside of wall. */
        if(xCoor[0] > BOARD_WIDTH){
          for(int i = 0; i < snakeSize; i++){
            xCoor[i] = 0 - (i * 30);
          }
        }
        /*
         * TODO: do the same for all board sides !/
         */


        if ( xCoor[0] < 0 || yCoor[0] > BOARD_HEIGHT || yCoor[0] < 0 ) {
             inGame = false;
           }

        /* Check for collisions. */
        for(int i = 1; i < xCoor.length; i++){
          if (xCoor[0] == xCoor[i] && yCoor[0] == yCoor[i]){
              inGame = false;
          }
        }

        /* Check for apples. */
        if ((xCoor[0] == apple_x) && (yCoor[0] == apple_y)) {
          snakeSize++;
          spawnAppleCoor();
        }
    }

    /** Generates random coordinates for apple. */
    private void spawnAppleCoor() {
        int r = (int) (Math.random() * Math.sqrt(ALL_TILES) - 1);
        apple_x = ((r * TILE_SIZE));

        r = (int) (Math.random() * Math.sqrt(ALL_TILES) - 1);
        apple_y = ((r * TILE_SIZE));
    }

    /** Simply prints a gameOver-message to screen when called. */
    private void gameOver(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Sans serif", Font.BOLD, 20));
        g.drawString(("Game Over! You ate " + (getScore()) + " apples!"),
             BOARD_WIDTH / 4, BOARD_HEIGHT / 2);
        g.drawString("Press space to restart",
             BOARD_WIDTH / 4 + 20, BOARD_HEIGHT / 2 + 30);

        /* Restart game if space is pressed. */
        if (pressedKey == KeyEvent.VK_SPACE){
          inGame = true;
          pressedKey = KeyEvent.VK_DOWN;
          setVisible(false); 
          dispose(); 
          Snake s = new Snake();
        }
    }

    private void moveSnakeCoor(){

        /* Move coordinates up one in the matrix.*/
        for (int i = snakeSize; i > 0; i--) {
          xCoor[i] = xCoor[(i - 1)];
          yCoor[i] = yCoor[(i - 1)];
        }

        /* Depending on what key was pressed, change coordinates
         * accordingly. */
        switch (pressedKey) {
        case KeyEvent.VK_DOWN:
          yCoor[0] += TILE_SIZE;
          break;
        case KeyEvent.VK_UP:
          yCoor[0] -= TILE_SIZE;
          break;
        case KeyEvent.VK_LEFT:
          xCoor[0] -= TILE_SIZE;
          break;
        case KeyEvent.VK_RIGHT:
          xCoor[0] += TILE_SIZE;
          break;
        }
    }

    private String getScore(){
        return "" + (snakeSize - 3);
    }
  }

  public Snake(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(BOARD_WIDTH, BOARD_HEIGHT);
    setResizable(false);
    setLocation(50, 50);

    Board b = new Board();
  
    addKeyListener(b);
    add(b);
    setVisible(true);

    Timer t = new Timer(DELAY, b);
    t.start();
  }

  public static void main (String[] args) {
    Snake s = new Snake();
  }      
}