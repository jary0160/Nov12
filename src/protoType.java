import static java.lang.System.in;
import org.newdawn.slick.*;
//USE THIS TO TEST  
public class protoType extends BasicGame {
int rx,ry;
public protoType (String title) {
super(title);
}

public void init(GameContainer gc) throws SlickException {

}

public void update(GameContainer gc, int i) throws SlickException {
    if(in.isKeyDown(Input.KEY_RIGHT)) rx++;
    if(in.isKeyDown(Input.KEY_LEFT)) rx--;
    if(in.isKeyDown(Input.KEY_DOWN)) ry++;
    if(in.isKeyDown(Input.KEY_UP)) rt++;
}
public void movebox(){
    rx = (int) (Math. random() * 780 + 1);
    ry = (int) (Math. random() * 580 + 1);    
}

public void render(GameContainer gc, Graphics g) throws SlickException {
    g.setColor(Color.red);
    g.drawString("This is the main game", 100,200);
}

public static void main(String args[]) throws SlickException {
  protoType game = new protoType("Testing Game");
  AppGameContainer app = new AppGameContainer(game);
  app.setDisplayMode(800, 600, false);
  app.setShowFPS(false);
  app.setTargetFrameRate(100);
  app.start();
}

}