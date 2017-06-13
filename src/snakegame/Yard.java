package snakegame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * ��ͼ��
 * @author gg
 *
 */
public class Yard extends Frame {
	
	PaintThread paintThread = new PaintThread();
	private boolean gameOver = false;

	public final static int ROWS = 30;
	public final static int COLS = 30;
	public final static int BLOCK_SIZE = 15;
	
	private int score = 0;
	
	Snake s = new Snake(this);
	Egg e = new Egg();
	//
	Image offScreenImage = null;
	private Font fontGameOver = new Font("���Ĳ���",Font.BOLD, 50);
	
	public Yard() {
		// TODO �Զ����ɵĹ��캯�����
		init();
	}
	
	//̰���ߵ�ͼ��ʼ��
	public void init() {
		this.setTitle("My Snake Game!");
		//this.setBounds(300, 300, ROWS * BLOCK_SIZE, COLS * BLOCK_SIZE);
		this.setLocation(200, 200);
		this.setSize(COLS * BLOCK_SIZE, ROWS * BLOCK_SIZE);
		myEvent();
		
		this.setVisible(true);
		this.addKeyListener(new KeyMonitor());
		//new Thread(new PaintThread()).start();
		new Thread(paintThread).start();
	}
	
	//�¼�
	private void myEvent() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Yard();
	}
	
	public void stop() {
		gameOver = true;
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO �Զ����ɵķ������
		Color c = g.getColor();//
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, COLS * BLOCK_SIZE, ROWS * BLOCK_SIZE);
		g.setColor(c);//
		//��������
		for (int i = 1; i < ROWS; i++) {
			g.drawLine(0, i * BLOCK_SIZE, COLS * BLOCK_SIZE, i * BLOCK_SIZE);
		}
		//��������
		for (int i = 1; i < COLS; i++) {
			g.drawLine(i * BLOCK_SIZE, 0,i * BLOCK_SIZE, ROWS * BLOCK_SIZE);
		}
		
		g.setColor(Color.YELLOW);
		g.drawString("score" + score, 10, 60);
		
		if (gameOver == true) {
			g.setFont(fontGameOver);
			g.drawString("game over", 120, 180);
			paintThread.gameOver();
		}
		g.setColor(c);
		
		//��ʼ��С��
		s.eat(e);
		e.draw(g);
		s.draw(g);
		
		
	}
	
	//
	@Override
	public void update(Graphics g) {
		// TODO �Զ����ɵķ������
		if (offScreenImage == null) {
			offScreenImage = this.createImage(COLS * BLOCK_SIZE, ROWS * BLOCK_SIZE);
		}
		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}
	
	private class PaintThread implements Runnable {
		private boolean running = true;
		@Override
		public void run() {
			// TODO �Զ����ɵķ������
			while (running) {
				repaint();
				try {
					Thread.sleep(140);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		public void gameOver() {
			running = false;
		}
		
	}
	
	private class KeyMonitor extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO �Զ����ɵķ������
			s.keyPressed(e);
		}
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
