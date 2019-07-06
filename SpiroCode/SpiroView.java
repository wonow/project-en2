import java.awt.Graphics;

public class SpiroView extends mvc.View {

	public SpiroView(SpiroModel aModel, SpiroController aController) {
		super(aModel,aController);
	}

	public void displayPinionGear(Graphics aGraphics, int aX, int aY) { //ピニオンギアを描画する
	}

	public void displayPinionPen(Graphics aGraphics, int aX, int aY) { //ピニオンギアの中にあるペンを描画する
		aGraphics.drawRect(aX-1,aY-1,1,1);
	}

	public void displayDesignLoci(Graphics aGraphics, int aX, int aY) { //軌跡(複数)を描画する

	}

	public void displayDesignLocus(Graphics aGraphics, int aX, int aY) { //軌跡単体(現在描画されているやつ?)を描画する

	}

	public void displayDesignLocus(Graphics aGraphics, int aX, int aY, DesignLocus disegnLocus) { //軌跡単体(変数によって選択された)を描画する

	}

	public void displaySpurGear(Graphics aGraphics, int aX, int aY) { //スパーギアを描画する
		int radius = (int)SpiroGear.radius();
		aGraphics.drawOval(aX-radius,aY-radius,radius,radius);
	}

	public void paintComponent(Graphics aGraphics) { //部品を描画する(円の周りの四角...?)

		aGraphics.drawRect(); //上四角
		aGraphics.drawRect(); //左四角
		aGraphics.drawRect(); //右四角
		aGraphics.drawRect(); //下四角
		aGraphics.drawRect(); //中四角
	}

	public String toString() {
		return mvc.View.toString();
	}

}
