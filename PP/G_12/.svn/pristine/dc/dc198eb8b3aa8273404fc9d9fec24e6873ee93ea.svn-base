import java.awt.Rectangle;

public class SpiroGear extends ごんごん {

	private Point center;
	//センターなのにDouble型？x,y,で座標わけるんじゃないの？曲座標表示？　←媒介変数表示？？

	private Double radius;//半径

	//コンストラクタ初期化
	//半径の初期値が0,0dだと描画されないので適当な値を考える必要がある
	public SpiroGear() {
		super();
		this.center = 0.0d;
		this.radius = 5.0d;
	}
	//コンストラクタ初期化 x y あり
	public SpiroGear(Double x, Double y) {
		super();
		this.center = ;
		this.radius = 5.0d;
	}

	public SpiroGear(Double x, Double y, Double r) {
		super();
		this.center = 0.0d;
		this.radius = r;
	}

	public SpiroGear(Double p, Double r) {
		super();
		this.center = p;
		this.radius = r;
	}

	public SpiroGear(Double r) {
		super();
		this.center = 0.0d;
		this.radius = r;
	}

	public Double circumference() {//getCircumference //円周を取得するめソッド
		Constants aConstants = new Constants();
		return 2*r * aConstants.PI;
	}

	public Hashtable<Symbol,Object> fromList(Cons aList) {//不明
		return null;
	}




	public void center(Double x, Double y) {//setCenter //x,y座標をcenterに変換するmethod
		this.center = new Point((int)x,(int)y);
		return;
	}

	public Double center() {//getCetner
		return this.center;
	}

	public Rectangle centerRectangle() {//Gearの中心部の四角の描画 これは操作するためのpointerになる
		Rectangle centerRectangle = new Rectangle( , ,6,6);
		return centerRectangle;
	}

	public Double left() {//おそらく円の左部分の座標の取得するためのメソッド
		　
		return null;//centerのx - r ?
	}

	public Rectangle leftRectangle(){//以下略
		Rectangle leftRectangle = new Rectangle( , ,6,6);
		return leftRectangle;
	}

	public Double right() { //略
		return null;
	}

	public Rectangle rightRectangle() { //
		Rectangle rightRectangle = new Rectangle( , ,6,6);
		return rightRectangle;
	}

	public Double top() {//
		return null;
	}

	public Rectangle topRectangle() {//
		Rectangle topRectangle = new Rectangle( , ,6,6);
		return topRectangle;
	}

	public Double bottom() {//おそらく円の下部分の座標の取得するためのメソッド
		return null;//center から下に radius だけ進む center Y - r
	}

	public Rectangle bottomRectangle() {//Gearの下部の四角の描画 これは操作するためのpointerになる
		Rectangle bottomRectangle = new Rectangle( , ,6,6);
		return bottomRectangle;
	}



	public Double radius() {//setRadius
		return r;
	}

	public void radius(Double r) {//getRadius
		this.r = r;
		return;
	}

	public Double rotate(Double point, Double degrees) {//回転角を取得するメドッソ?
		return null;
	}

	public Double rotate(Double point, Double degrees, Double around) {//around→円周？？

	}

	public Rectangle toRectangle(Double aPoint, Double expandedAmount) {
		return null;
	}

	public Cons toList() {
		return null;
	}

	public String toString() {
		return null;
	}

}
