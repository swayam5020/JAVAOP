import java.applet.*;

import java.awt.*;

import java.awt.event.*;

public  class Snake extends Applet implements KeyListener, Runnable

{

    Color colors[]={Color.BLACK, Color.RED, Color.BLUE, Color.YELLOW, Color.WHITE};

    int screenWidth;

    int screenHeight;

    int nc,maxc=20;

    int cwidth=20;

    int cheight=20;

    int dx=cwidth,dy=0;

    int fx,fy,fc;

    int initx[]={200,190,180,170,160};

    int inity[]={100,100,100,100,100};

    int x[],y[],c[];

    int score;

    enum GameStatus {IDLE, RUNNING, PAUSED, FINISHED, GAMEOVER};

    GameStatus gameStatus;

    void generateFood()

    {

        boolean collision=false;

        fc = ((int)(Math.random()*10))%5;

        do

        {

            fx = (int)(Math.random()*100)%(screenWidth/cwidth)*cwidth;

            fy = (int)(Math.random()*100)%(screenHeight/cheight)*cheight;

            for(int j=0;j<nc;j++)

            {

                if(fx == x[j] && fy == y[j])

                {

                    collision= true;

                    break;

                }

            }

        }while(collision);

       

    }

    public void resetGame()

    {

        x = new int[maxc];

        y = new int[maxc];

        c = new int[maxc];

        nc=5;

        for(int i=0;i<nc;i++)

        {

            x[i] = initx[i];

            c[i]=((int)(Math.random()*10))%5;

            y[i] = inity[i];

        }   

        score = 0;

        generateFood();

    }

    public void init()

    {

        setBackground(Color.GREEN);

        addKeyListener(this);

        screenWidth = getWidth()-cwidth;

        screenHeight = getHeight()-cheight;

        gameStatus = GameStatus.IDLE;

        resetGame();

    }

    public void paint(Graphics g)

    {

        if(gameStatus == GameStatus.IDLE)

        {

            g.setColor(Color.RED);

            g.setFont(new Font("algerian",Font.BOLD,25));

            g.drawString("Colorful Snake",100,100);

            g.setColor(Color.BLACK);

            g.setFont(new Font("Arial",Font.BOLD,10));

            g.drawString("By Himanshu Raj",100,120);

            g.setColor(Color.ORANGE);

            g.setFont(new Font("Arial",Font.BOLD,10));

            g.drawString("STD 9, RKMS Sidhgora, Jamshedpur",100,140);

            g.setColor(Color.GRAY);

            g.setFont(new Font("Arial",Font.BOLD,10));

            g.drawString("Guidance By: ApkaGuruji ( YouTube/ApkaGuruji )",100,160);

           

            showStatus("Press Any Key to start the game.");

        }

        else if(gameStatus == GameStatus.RUNNING)

        {

           

            for(int i=0;i<nc;i++)

            {

                g.setColor(colors[c[nc-1-i]]);

                g.fillRect(x[i]+2,y[i]+2,cwidth-2,cheight-2);

            }

           

            g.setColor(colors[fc]);

            g.fillOval(fx,fy,cwidth,cheight);

        }

        else if(gameStatus == GameStatus.PAUSED)

        {

            g.setColor(Color.RED);

            g.setFont(new Font("algerian",Font.BOLD,50));

            g.drawString("Press A Key",100,100);

            g.drawString("To Resume",100,300);

        }

        else if(gameStatus == GameStatus.GAMEOVER)

        {

            g.setColor(Color.RED);

            g.setFont(new Font("algerian",Font.BOLD,60));

            g.drawString("Game",100,100);

            g.drawString("Over",90,300);

            g.drawString("Score: " + score ,20, 400);

        }

           

       

    }

   

    public void keyPressed(KeyEvent ke)

    {

        showStatus(gameStatus.toString());

        if(gameStatus == GameStatus.IDLE)

        {

            resetGame();

            new Thread(this).start();

            return;

        }

        else if(gameStatus == GameStatus.PAUSED)

        {

            new Thread(this).start();

            return;

        }

       

        int code = ke.getKeyCode();

        switch(code)

        {

            case 37://left

                if(dx==0)

                {

                    dx=-cwidth;

                    dy=0;

                }

            break;

            case 38://up

                if(dy==0)

                {

                    dy=-cheight;

                    dx=0;

                }

            break;

            case 39://right

                if(dx==0)

                {

                    dx=cwidth;

                    dy=0;

                }

            break;

            case 40://down

                if(dy==0)

                {

                    dx=0;

                    dy=cheight;

                }

            break;

            case 27:

                gameStatus=GameStatus.PAUSED;

           

                break;

            default:

                    showStatus("Invalid Key (" + ke.getKeyCode()+"). Use Arrow Keys to play. Press ESC to exit.");

        }

       

     

       

   }

    public void keyTyped(KeyEvent ke){}

    public void keyDown(KeyEvent ke){}

    public void keyReleased(KeyEvent ke){}

    public void run()

    {

        int i,j;

        gameStatus = GameStatus.RUNNING;

        showStatus("Use Arrow Keys to play. Press ESC to exit.");

        try

        {

            gameloop:while(gameStatus == GameStatus.RUNNING)

            {

               

               

                for(i=1;i<nc;i++)

                {

                   if(x[0]==x[i] && y[0] == y[i])

                   {

                       gameStatus = GameStatus.GAMEOVER;

                       repaint();

                       Thread.sleep(2000);

                       gameStatus = GameStatus.IDLE;

                       break gameloop;

                   }

                }

               

                for(j=nc-1;j>0;j--)

                {

                    x[j]=x[j-1];

                    y[j]=y[j-1];

                }

                x[0]+=dx;

                y[0]+=dy;

               

               

                if(x[0]<0)

                    x[0]=screenWidth-cwidth;

                if(x[0]>screenWidth)

                    x[0]=0;

                if(y[0]<0)

                    y[0]=screenHeight-cheight;

                if(y[0]>screenHeight)

                    y[0]=0;

               

                if(x[0]==fx&&y[0]==fy)

                {

                    score++;

                    c[nc]=fc;

                    nc++;

                    generateFood();

                }

             

                screenWidth = getWidth()-cwidth;

                screenHeight = getHeight()-cheight;

                repaint();

                Thread.sleep(100);

            }

        }catch(Exception e)

        {

            showStatus(e.toString());

        }

       

        repaint();

    }

    public void destroy()

    {

        gameStatus = GameStatus.IDLE;

    }

}



