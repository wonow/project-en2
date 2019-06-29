import java.awt.Point;


public class SpiroController extends mvc.Controller implements ActionListener {

	private boolean isMenuPopuping; //メニューが出現しているかどうか判別するフィールド変数

	private int pickingArea; //どこのエリアかを判別する変数(中には定数が入る)

	public SpiroController() { //インスタンスを全てnull化する
		super();
		this.isMenuPopuping = false;
		this.pickingAria = null;
	}

	public void actionPerformed(ActionEvent anActionEvent) {
		//これもよくわからん
	}
	//ビュー座標をモデル座標に変換して応答する
	public Point convertViewPintToModelPoint(Point aPoint) {
		Point scrollAmount = SpiroView.scrollAmount();
		//座標空間内の指定された(x,y)の位置に点を構築して初期化
		Point aPoint = new Point(aPoint.x + scrollAmount.x, aPoint.y + scrollAmount.y);
		return aPoint;
	}

	public void mouseClicked(MouseEvent aMouseEvent) {
		Point aPoint = aMouseEvent.getPoint();
		aPoint = this.convertViewPintToModelPoint(aPoint);
		// これをどうすればいいかわからん
		return;
	}

	public void mouseDragged(MouseEvent aMouseEvent) {
		mvc.Controller.mouseDragged(aMouseEvent);
	}

	//マウスを動かした時
	public void mouseMoved(MouseEvent aMouseEvent) {
		mvc.Controller.mouseMoved(aMouseEvent);
	}

	//マウスを押し続けている場合...?
	public void mousePressed(MouseEvent aMouseEvent) {
		mvc.Controller.mousePressed(aMouseEvent);
	}

	//マウスを離した時
	public void mouseReleased(MouseEvent aMouseEvent) {
		mvc.Controller.mouseReleased(aMouseEvent);
	}

	//メニュー
	public void showPopupMenu(MouseEvent aMouseEvent) {

	}

	public String toString() { //文字として出力する
		return null;
	}

	private void whichPickingArea(Point aPoint) {

	}

}
