import java.awt.Component;
import java.awt.Point;
import java.awt.Color;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import javax.swing.event.MouseInputAdapter;
import javax.swing.KeyStroke;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;


public class SpiroController extends mvc.Controller implements ActionListener {

	private boolean isMenuPopuping; //メニューが出現しているかどうか判別するフィールド変数

	private int pickingArea; //どこのエリアか(上、右、左、下、中央)を判別する変数(中には定数が入る)

	public SpiroController() {
		super();
		this.isMenuPopuping = false;
		this.pickingAria = null;
	}

	public void actionPerformed(ActionEvent anActionEvent) { //イベント発生時に勝手に呼び出される
		SpiroModel spiroModel = new SpiroModel();
		if (anActionEvent.getSource() instanceof Component) {
			Component c = (Component) anActionEvent.getSource();
			String name = c.getName();
			try
			{
				if (name.equals("スピードを上げる(U)"))
				{
					spiroModel.SpiroSpeedUp();
				}
				if (name.equals("スピードを下げる(D)"))
				{
					spiroModel.SpiroSpeedDown();
				}
				if (name.equals("描画の再開(R)"))
				{
					spiroModel.SpiroStart();
				}
				if (name.equals("描画の停止(S)"))
				{
					spiroModel.SpiroStop();
				}
			}
			catch (ConcurrentModificationException anException) { ; }
			this.isMenuPopuping = false;
			return;
		}
	}

	//ビュー座標をモデル座標に変換して応答する ←必要かな？？ ←よくわからん
	public Point convertViewPintToModelPoint(Point aPoint) {
		//
		Point scrollAmount = SpiroView.scrollAmount();
		//座標空間内の指定された(x,y)の位置に点を構築して初期化
		Point aPoint = new Point(aPoint.x + scrollAmount.x, aPoint.y + scrollAmount.y);
		//
		return aPoint;
	}

	/* ActionListenerをインプリメントする場合、下5つのメソッドを再定義しなければならない */

	@Override
	public void mouseClicked(MouseEvent aMouseEvent) {
		mvc.Controller.mouseClicked(aMouseEvent);
		if (SwingUtilities.isRightMouseButton(aMouseEvent)) { SpiroController.showPopupMenu(aMouseEvent); }
	}

	@Override
	public void mouseDragged(MouseEvent aMouseEvent) {
		mvc.Controller.mouseDragged(aMouseEvent);
	}

	//マウスを動かした時
	@Override
	public void mouseMoved(MouseEvent aMouseEvent) {
		mvc.Controller.mouseMoved(aMouseEvent);
	}

	//マウスを押し続けている場合...?
	@Override
	public void mousePressed(MouseEvent aMouseEvent) {
		mvc.Controller.mousePressed(aMouseEvent);
	}

	//マウスを離した時
	@Override
	public void mouseReleased(MouseEvent aMouseEvent) {
		mvc.Controller.mouseReleased(aMouseEvent);
	}

	//メニュー
	public void showPopupMenu(MouseEvent aMouseEvent) {
		JPopupMenu popupMenu = new JPopupMenu();

		ActionListener aListener = null;
		aListener = new ActionListener();

		JMenuItem menuSpeedUp = new JMenuItem("速度を上げる(U)");
		menuSpeedUp.setName("menuSpeedUp");
		menuSpeedUp.setBackGround(Color.WHITE);
		menuSpeedUp.setMnemonic(KeyEvent.VK_U);
		menuSpeedUp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.META_DOWN_MASK));
		menuSpeedUp.addActionListener(aListener);


		JMenuItem menuSpeedDown = new JMenuItem("速度を下げる(D)");
		menuSpeedDown.setName("menuSpeedDown");
		menuSpeedDown.setBackGround(Color.WHITE);
		menuSpeedDown.setMnemonic(KeyEvent.VK_D);
		menuSpeedDown.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.META_DOWN_MASK));
		menuSpeedDown.addActionListener(aListener);

		JMenuItem menuRestart = new JMenuItem("描画の再開(R)");
		menuRestart.setName("menuRestart");
		menuRestart.setBackGround(Color.WHITE);
		menuRestart.setMnemonic(KeyEvent.VK_U);
		menuRestart.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_DOWN_MASK));
		menuRestart.addActionListener(aListener);

		JMenuItem menuStop = new JMenuItem("描画の停止(S)");
		menuStop.setName("menuStop");
		menuStop.setBackGround(Color.WHITE);
		menuStop.setMnemonic(KeyEvent.VK_S);
		menuStop.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.META_DOWN_MASK));
		menuStop.addActionListener(aListener);

		//メニューを有効/無効にする(押せるか押せないか)
		if(/*速度が最大の場合*/ ){ menuSpeedUp.Enabled(false); }
		else { menuSpeedUp.Enabled(true); }
		if(/*速度が最低の場合*/ ){ menuSpeedDown.Enabled(false); }
		else { menuSpeedDown.Enabled(true); }
		if(/*描画中の場合*/ ){ menuRestart.Enabled(false); }
		else { menuRestart.Enabled(true); }
		if(/*描画が停止している場合*/){ menuStop.Enabled(false); }
		else { menuStop.Enabled(true); }

		popupMenu.add(menuSpeedUp);
		popupMenu.add(menuSpeedDown);
		popupMenu.add(menuRestart);
		popupMenu.add(menuStop);

		this.isMenuPopuping = true;
		popupMenu.show(aMouseEvent.getComponent(), aMouseEvent.getX(), aMouseEvent.getY()); //ポップアップメニューを開く
	}

	public String toString() { //文字として出力する
		return mvc.Controller.toString();
	}

	private void whichPickingArea(Point aPoint) {

	}

}
