
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class startGame extends JFrame implements KeyListener{
	
	private int X = 200; 
	private int Y = 0; 
	private int sceneCode = 0; 
	private int face = 1;
	private final int down = 1; 
	private final int up = 2; 
	private final int left = 3; 
	private final int right = 4;
	private int movement = 0; 
	Panel panel; 
	
startGame(){
	
	panel = new Panel(); 
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.add(panel); 
	this.pack(); 
	this.setLocationRelativeTo(null);
	this.addKeyListener(this);
	this.setVisible(true);
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	switch (e.getKeyCode()) {
	case 37: X = X-3; //left
	face = left; 
	movement =1;
	break;
	case 38: Y = Y-3; //up
	face = up;
	movement =1;
	break;
	case 39: X = X+3; //right 
	face = right;
	movement =1;
	break;
	case 40: Y = Y+3; //down
	face = down; 
	movement =1;
	break;
	case 32: System.out.println("Current position: X: "+X+" and this is Y: "+Y); //print out current position
	break;
	}
	
}

@Override
public void keyReleased(KeyEvent e) {
	
	switch (e.getKeyCode()) {
	case 37: X = X-3; //left
	face = left; 
	movement =0;
	break;
	
	case 38: Y = Y-3; //up
	face = up;
	movement =0;
	break;
	
	case 39: X = X+3; //right 
	face = right;
	movement =0;
	break;
	
	case 40: Y = Y+3; //down
	face = down; 
	movement =0;
	break;
	
}
}
public class Panel extends JPanel implements ActionListener{
	
	final int PANELWIDTH = 500;                                   
	final int PANELHEIGHT = 500;                                 //LEAVE AT 500, DO NOT CHANGE OR WINDOW WILL NOT MATCH BACKGROUND 500x500px // 

	Image characterDown; 
	Image characterDownWalk1;
	Image characterDownWalk2;
	
	Image characterUp; 
	Image characterUpWalk1; 
	Image characterUpWalk2;
	
	Image characterLeft; 
	Image characterLeftWalk1; 
	Image characterLeftWalk2;
	
	Image characterRight; 
	Image characterRightWalk1; 
	Image characterRightWalk2; 
	
	Image loading1; 
	Image loading2;
	Image loading3; 
	Image loading4; 
	
	Image backgroundScene1;  
	Image backgroundScene2; 
	
	Image backgroundMiddle1;  
	Image backgroundMiddle2;
	
	Image backgroundGhandi1;
	Image backgroundGhandi2; 
	
	Image backgroundDream1; 
	Image backgroundDream2; 
	
	Image backgroundClass1; 
	Image backgroundClass2; 
	
	Image Fast1; 
	Image Fast2; 
	Image Fast3;
	Image Fast4; 
	Image Fast5; 
	Image Fast6;
	Image Fast7; 
	Image Fast8; 
	Image Fast9; 
	Image Fast10; 
	Image Fast11; 
	Image Fast12; 
	
	Image End1;
	Image End2;
	Image End3; 
	Image End4; 
	Image End5; 
	
	Timer timer; 
	
	int walk = 0;
	int fastTravel; 
	int loadingSet = 0; 
	int start; 
	int backgroundSet = 1; 
	Panel() {
		
		this.setPreferredSize(new Dimension(PANELWIDTH,PANELHEIGHT));     
		this.setBackground(Color.black);
		
								//LOADING SCREEN//		
		loading1 = new ImageIcon(getClass().getResource("J2J1.png")).getImage();
		loading2 = new ImageIcon(getClass().getResource("J2J2.png")).getImage();
		loading3 = new ImageIcon(getClass().getResource("J2J3.png")).getImage();
		loading4 = new ImageIcon(getClass().getResource("J2J4.png")).getImage();
		
								//CHARACTER DIRECTIONS & MOVEMENT//
		characterDown = new ImageIcon(getClass().getResource("FRONT_STILL.png")).getImage();
		characterDownWalk1 = new ImageIcon(getClass().getResource("FRONT_WALKING1.png")).getImage();
		characterDownWalk2 = new ImageIcon(getClass().getResource("FRONT_WALKING2.png")).getImage();
		
		characterUp = new ImageIcon(getClass().getResource("BACK_STILL.png")).getImage();
		characterUpWalk1 = new ImageIcon(getClass().getResource("BACK_WALKING1.png")).getImage();
		characterUpWalk2 = new ImageIcon(getClass().getResource("BACK_WALKING2.png")).getImage();
	
		characterLeft = new ImageIcon(getClass().getResource("LEFT_STILL.png")).getImage();
		characterLeftWalk1 = new ImageIcon(getClass().getResource("LEFT_WALKING1.png")).getImage();
		characterLeftWalk2 = new ImageIcon(getClass().getResource("LEFT_WALKING2.png")).getImage();
		
	 	characterRight = new ImageIcon(getClass().getResource("RIGHT_STILL.png")).getImage();
	 	characterRightWalk1 = new ImageIcon(getClass().getResource("RIGHT_WALKING1.png")).getImage();
		characterRightWalk2 = new ImageIcon(getClass().getResource("RIGHT_WALKING2.png")).getImage();
		
		
		                           //BACKGROUND STUFF //
		backgroundScene1 = new ImageIcon(getClass().getResource("STUDENTHALL1_RESIZED.png")).getImage();
		backgroundScene2 = new ImageIcon(getClass().getResource("STUDENTHALL2_RESIZED.png")).getImage();
		
		backgroundMiddle1 = new ImageIcon(getClass().getResource("MIDDLE1.png")).getImage();
		backgroundMiddle2 = new ImageIcon(getClass().getResource("MIDDLE2.png")).getImage();
		
		backgroundGhandi1 = new ImageIcon(getClass().getResource("GHANDI1.png")).getImage();
		backgroundGhandi2 = new ImageIcon(getClass().getResource("GHANDI2.png")).getImage();
		
		backgroundDream1 = new ImageIcon(getClass().getResource("DREAM1.png")).getImage();
		backgroundDream2 = new ImageIcon(getClass().getResource("DREAM2.png")).getImage();
		
		backgroundClass1 = new ImageIcon(getClass().getResource("CLASS1.png")).getImage();
		backgroundClass2 = new ImageIcon(getClass().getResource("CLASS2.png")).getImage();
		
								//FAST TRAVEL LOADING SCREEN// 
		Fast1 = new ImageIcon(getClass().getResource("LOADINGEMPTY.png")).getImage();
		Fast2 = new ImageIcon(getClass().getResource("LOADING1COIN.png")).getImage();
		Fast3 = new ImageIcon(getClass().getResource("LOADING2COIN.png")).getImage();
		Fast4 = new ImageIcon(getClass().getResource("LOADING3COIN.png")).getImage();
		Fast5 = new ImageIcon(getClass().getResource("LOADINGPAC1.png")).getImage();
		Fast6 = new ImageIcon(getClass().getResource("LOADINGPAC2.png")).getImage();
		Fast7 = new ImageIcon(getClass().getResource("LOADINGPAC3.png")).getImage();
		Fast8 = new ImageIcon(getClass().getResource("LOADINGPAC4.png")).getImage();
		Fast9 = new ImageIcon(getClass().getResource("LOADINGFRAME.png")).getImage();
		Fast10 = new ImageIcon(getClass().getResource("LOADINGFRAME1.png")).getImage();
		Fast11 = new ImageIcon(getClass().getResource("LOADINGFRAME2.png")).getImage();
		Fast12 = new ImageIcon(getClass().getResource("LOADINGFRAME3.png")).getImage();
		
								//ENDING SCREEN// 
		End1 = new ImageIcon(getClass().getResource("END1.png")).getImage();
		End2 = new ImageIcon(getClass().getResource("END2.png")).getImage();
		End3 = new ImageIcon(getClass().getResource("END3.png")).getImage();
		End4 = new ImageIcon(getClass().getResource("END4.png")).getImage();
		End5 = new ImageIcon(getClass().getResource("END5.png")).getImage();
		
		timer = new Timer(100, this);   //<-----------------BACKGROUND WILL MOVE EVERY 100 MILLI SECONDS//
		timer.start(); 
		
		
	}

	public void paint(Graphics g) { 
		
		super.paint(g);
		                               //BACKGROUND LIVELY SWITCH// 
		Graphics2D g2d = (Graphics2D) g; 
		
		if (sceneCode == 0) {                                 
			if (loadingSet <= 5) {
				g2d.drawImage(loading1, 0, 0, null); }
			if (loadingSet > 5 && loadingSet <= 10) {
				g2d.drawImage(loading2, 0, 0, null); }
			if (loadingSet > 10 && loadingSet<= 15) {
				g2d.drawImage(loading3, 0, 0, null); }
			if (loadingSet > 15 && loadingSet <= 20) {
				g2d.drawImage(loading4, 0, 0, null); }
		}
		
		
		
		
		
		if (sceneCode == 1) {                                  //MAP STARTS HERE // 
		if (backgroundSet <= 5) {
			g2d.drawImage(backgroundScene1, 0, 0, null); }
		if (backgroundSet > 5) {
			g2d.drawImage(backgroundScene2, 0, 0, null); }
		}
		if (sceneCode == 2) {
			if (backgroundSet <= 5) {
				g2d.drawImage(backgroundMiddle1, 0, 0, null); }
			if (backgroundSet > 5) {
				g2d.drawImage(backgroundMiddle2, 0, 0, null); }
			}
		if (sceneCode == 3) {
			if (backgroundSet <= 5) {
				g2d.drawImage(backgroundGhandi1, 0, 0, null); }
			if (backgroundSet > 5) {
				g2d.drawImage(backgroundGhandi2, 0, 0, null); }
			}
		if (sceneCode == 4) {
			if (backgroundSet <= 5) {
				g2d.drawImage(backgroundDream1, 0, 0, null); }
			if (backgroundSet > 5) {
				g2d.drawImage(backgroundDream2, 0, 0, null); }
			}
		                                  
		 									//FAST TRAVEL LOADING SCREEN/ 
		if (sceneCode == 5) {
			if(loadingSet <= 10) {
				g2d.drawImage(Fast1, 0, 0, null); }
			if(loadingSet > 10 && loadingSet <= 20) {
				g2d.drawImage(Fast2, 0, 0, null); }
			if(loadingSet > 20 && loadingSet <= 30) {
				g2d.drawImage(Fast3, 0, 0, null); }
			if(loadingSet > 30 && loadingSet <= 40) {
				g2d.drawImage(Fast4, 0, 0, null); }
			if(loadingSet > 40 && loadingSet <= 50) {
				g2d.drawImage(Fast5, 0, 0, null); }
			if(loadingSet > 50 && loadingSet <= 60) {
				g2d.drawImage(Fast6, 0, 0, null); }
			if(loadingSet > 60 && loadingSet <= 70) {
				g2d.drawImage(Fast7, 0, 0, null); }
			if(loadingSet > 70 && loadingSet <= 80) {
				g2d.drawImage(Fast8, 0, 0, null); }
			if(loadingSet > 80 && loadingSet <= 85) {
				g2d.drawImage(Fast9, 0, 0, null); }
			if(loadingSet > 85 && loadingSet <= 90) {
				g2d.drawImage(Fast10, 0, 0, null); }
			if(loadingSet > 90 && loadingSet <= 95) {
				g2d.drawImage(Fast11, 0, 0, null); }
			if(loadingSet > 95 && loadingSet <= 100) {
				g2d.drawImage(Fast12, 0, 0, null); }
			}
		
		if (sceneCode == 6) {
			if (backgroundSet <= 5) {
				g2d.drawImage(backgroundClass1, 0, 0, null); }
			if (backgroundSet > 5) {
				g2d.drawImage(backgroundClass2, 0, 0, null); }
			}
		
		if (sceneCode == 7) { 
			if(loadingSet <= 50) {
				g2d.drawImage(End1, 0, 0, null); }
			if(loadingSet > 50 && loadingSet <= 55) {
				g2d.drawImage(End2, 0, 0, null); }
			if(loadingSet > 55 && loadingSet <= 60) {
				g2d.drawImage(End3, 0, 0, null); }
			if(loadingSet > 60 && loadingSet <= 65) {
				g2d.drawImage(End4, 0, 0, null); }
			if(loadingSet > 65 && loadingSet <= 100) {
				g2d.drawImage(End5, 0, 0, null); }
		}
			
		
		//CHARACTER MOVEMENT REPAINTER//
		
		if (face == down && movement == 0) {                                 //DOWN// 
			g2d.drawImage(characterDown, X, Y, null); }
		if (face == down && movement == 1){
			if (walk < 5) {
				g2d.drawImage(characterDownWalk1, X, Y, null);}
			if (walk >= 5) {
				g2d.drawImage(characterDownWalk2, X, Y, null);}	
			}
		
			if (face == right && movement == 0) {                                 //RIGHT// 
				g2d.drawImage(characterRight, X, Y, null); }
			if (face == right && movement == 1){
				if (walk < 5) {
					g2d.drawImage(characterRightWalk1, X, Y, null);}
				if (walk >= 5) {
					g2d.drawImage(characterRightWalk2, X, Y, null);}
			}
			
			if (face == left && movement == 0) {                                 //LEFT// 
				g2d.drawImage(characterLeft, X, Y, null); }
			if (face == left && movement == 1){
				if (walk < 5) {
					g2d.drawImage(characterLeftWalk1, X, Y, null);}
				if (walk >= 5) {
					g2d.drawImage(characterLeftWalk2, X, Y, null);}
			}
			
			if (face == up && movement == 0) {                                 //UP// 
				g2d.drawImage(characterUp, X, Y, null); }
			if (face == up && movement == 1){
				if (walk < 5) {
					g2d.drawImage(characterUpWalk1, X, Y, null);}
				if (walk >= 5) {
					g2d.drawImage(characterUpWalk2, X, Y, null);}
			}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(sceneCode == 0)	{	
		if(loadingSet <= 19) { 
			loadingSet++; ;
		}
		
		if(loadingSet == 20) { 
			loadingSet = 0;
			start++;
		}
		if (start == 3) {
			sceneCode = 1; 
		}
		
	}
		
		
		if(backgroundSet <= 9) { 
			backgroundSet++; 
		}
		
		if(backgroundSet == 10) { 
			backgroundSet = 0;
		}
		if(walk <= 5) { 
			walk++; 
		}
		
		if(backgroundSet == 6) { 
			walk = 0;
		}
		
		if (sceneCode == 1) {                        // MAP OBSTACLES & STRUCTURES // 
			if (X >= 250) {
				X = 249;}
			if (X <= 120) {
				X = 121;}
			if (Y <= -10) {
				Y = 10;
				face = down; 
				JOptionPane.showMessageDialog(null, "I can't go home yet, I need to get to class", "Go home?", JOptionPane.WARNING_MESSAGE); }
			if (Y >= 490) { 
				Y = 0; 
				sceneCode = 2; 
			}
		}
		if (sceneCode == 2) {
			if (Y <= -40) { //go back up to scene 1
				Y = 430; 
				sceneCode = 1;}
			
			if((X <= 120 && X >= 100)&& (Y >= -39 && Y <= 45)){
				X = 121;
			}
			if((X <= 120 && X >= 70)&& (Y >= -39 && Y <= 46)){
				Y = 47; 
			}
			if((X <= 80 && X >= 69)&& (Y >= -39 && Y <= 46)){
				X = 68;
			}
			if((X <= 120 && X >= -35)&& (Y >= -39 && Y <= 0)){
				Y = 1; }
			if (X <= -35) {
				X = -25;
				face = right; 
				movement = 0; 
				JOptionPane.showMessageDialog(null, "That's JJ Daniel Hall, no need to go there. ", "Wrong Way", JOptionPane.PLAIN_MESSAGE); 
			}
			if((X <=100 && X >= -35) && Y >= 170 ) {
				Y = 165; 
			}
			if (X <= 120 && (Y >= 170 && Y <= 490)) {
				X = 121; 
			}
			if (X >= 250) {
				X = 249;}
			
			if (Y >= 490) { 
				Y = 0; 
				sceneCode = 3; }
		}
		
		if (sceneCode ==3) {
			if (Y <= -40) { //go back up to scene 2
				Y = 430; 
				sceneCode = 2;}
			if (X >= 250) {
				X = 249;}
			if (X <= 120) {
				X = 121;}
			if (Y >= 490) { 
				Y = 0; 
				sceneCode = 4; }
		}
		
		if(sceneCode ==4) {
			if (Y <= -40) { //go back up to scene 3
				sceneCode = 3;
				Y = 430; 
				}
			if (X >= 250) {
				X = 249;}
			if (X <= 120) {
				X = 121;}
			if (Y >= 300 && sceneCode == 4) { 
				//fastTravel; 
				int reply = JOptionPane.showConfirmDialog(null, "Fast Travel to Mr.Piersall's class?", "Fast Travel", JOptionPane.YES_NO_OPTION);	
				if (reply == 0) {
				Y = -1000; 
				loadingSet =0;
				start =0; 
				sceneCode = 5; }
				if (reply ==1) {
					face = up;
					movement = 0; 
					Y= 280; 
				}}
				
		}
		
		if(sceneCode ==5) {
			if(loadingSet <= 100) { 
				loadingSet++;}	
			
			if(loadingSet == 100) { 
				loadingSet = 0;
				start++;}
			
			if (start == 1) {
				Y = 250; 
				X = 170; 
				movement = 0; 
				face = up; 
				sceneCode = 6; }	
		}
	
		if(sceneCode == 6) {
			if (X <= 50) {
				X = 51;
			}
			if (X >= 240) {
				X=239; 
			}
			if (Y <= 76) {
				Y = 77; 
			}
			if (X<= 180) {
				Y = Y+5; 
			}
			if (X <= 140 && Y <= 85) {
				sceneCode =7; 
				Y = -1000;
				loadingSet =0; 
				start =0; 
			}
			if (Y >= 260) {
				Y = 259; 
			}
		}
		if (sceneCode == 7) {
			if(loadingSet <= 100) { 
				loadingSet++; ;
			}
			
			if(loadingSet == 100) { 
				loadingSet = 0;
				start++;
			}
			if (start == 1) {
				System.exit(0);}
		}
		
		repaint();
			
	}	
}
}
