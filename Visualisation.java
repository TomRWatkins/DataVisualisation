
public class Visualisation {
		private	static GameArena gui = new GameArena(1800, 800, true);	//The GameArena window
		private static Ball[] topNodes = new Ball[5];					//The array of Nodes
		private static Text[] topLabel = new Text[5];					//The array of Labels for Nodes
		private static Ball[] particles = new Ball[5];	
		
		public static void main(String[] args)
		{
			setUpKey();
			setUpNodes();
			setUpParticles();
			
			while(true)
			{			
				particles[0].setYPosition(particles[0].getYPosition()-(39/15));	
				particles[1].setYPosition(particles[1].getYPosition()-(68/15));
				particles[2].setYPosition(particles[2].getYPosition()-(81/15));
				particles[3].setYPosition(particles[3].getYPosition()-(33/15));
				particles[4].setYPosition(particles[4].getYPosition()-(75/15));
				gui.update();
				//Perform checks that particle has crossed node
				if(particles[0].getYPosition() < topNodes[0].getYPosition())	
				{
					topNodes[0].setSize(topNodes[0].getSize()+2.5);
					particles[0].setYPosition(800);
				}
				if(particles[1].getYPosition() < topNodes[1].getYPosition())	
				{
					topNodes[1].setSize(topNodes[1].getSize()+2.5);
					particles[1].setYPosition(800);
				}
				if(particles[2].getYPosition() < topNodes[2].getYPosition())	
				{
					topNodes[2].setSize(topNodes[2].getSize()+2.5);
					particles[2].setYPosition(800);
				}
				if(particles[3].getYPosition() < topNodes[3].getYPosition())	
				{
					topNodes[3].setSize(topNodes[3].getSize()+2.5);
					particles[3].setYPosition(800);
				}
				if(particles[4].getYPosition() < topNodes[4].getYPosition())	
				{
					topNodes[4].setSize(topNodes[4].getSize()+2.5);
					particles[4].setYPosition(800);
				}		
				
				gui.update();
				
			}			
		}
		public static void setUpNodes() 
		{
			int x = 150;
			int y = 200;
			for(int i = 0; i < topNodes.length; i++)
			{			
				topNodes[i] = new Ball(x,y,60,"PURPLE");
				switch(i)
				{
					case 0: topLabel[i] = new Text("130",x-23,y+10,30,"WHITE"); break;
					case 1: topLabel[i] = new Text("150",x-23,y+10,30,"WHITE"); break;
					case 2: topLabel[i] = new Text("110",x-23,y+10,30,"YELLOW"); break;
					case 3: topLabel[i] = new Text("160",x-23,y+10,30,"GREEN"); break;
					case 4: topLabel[i] = new Text("120",x-23,y+10,30,"WHITE"); break;
				}			
				x+=300;
				gui.addBall(topNodes[i]);
				gui.addText(topLabel[i]);			
			}		
		}
		
		public static void setUpParticles() 
		{
			particles[0] = new Ball(150,800,15,"WHITE");
			particles[1] = new Ball(450,800,15,"WHITE");
			particles[2] = new Ball(750,800,15,"YELLOW");
			particles[3] = new Ball(1050,800,15,"GREEN");
			particles[4] = new Ball(1350,800,15,"WHITE");
			for(int i = 0; i < 5; i++)
			{
				gui.addBall(particles[i]);
			}
			gui.update();
		}
		
		public static void setUpKey() 
		{			
			Ball[] kBall = new Ball[3];
			kBall[0] = new Ball(1550,350,15,"WHITE");
			kBall[1] = new Ball(1550,450,15,"YELLOW");
			kBall[2] = new Ball(1550,550,15,"GREEN");
			gui.addBall(kBall[0]);
			gui.addBall(kBall[1]);
			gui.addBall(kBall[2]);
			Text[] kText = new Text[3];
			kText[0] = new Text("LECTURE",1580,360,30,"WHITE");
			kText[1] = new Text("LAB",1580,460,30,"YELLOW");
			kText[2] = new Text("WORKSHOP",1580,560,30,"GREEN");
			gui.addText(kText[0]);
			gui.addText(kText[1]);
			gui.addText(kText[2]);
			gui.update();
			
		}
}
