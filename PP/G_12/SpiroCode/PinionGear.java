public class PinionGear extends SpiroGear {

	private Double penPosition;

	private Color penColor;

	private int penNib;

	private Double degrees;

	//コンストラクタ初期化
	public PinionGear() {
		this.penPosition = 0.0d;
		this.penColor = ;//初期カラーは青色
	}

	public PinionGear(Cons aList) {
		this.penPosition = aList.;
		this.penColor = aList.;
		this.penNib = aList.;
		this.degrees = aList.;
	}

	public PinionGear(Double p, Double r, Double uv) {//p:point,r:raduisからpenPositionを求める?, uvってなに

	}

	public PinionGear(Double p, Double r, Double uv, Color c, int n) {//color int=penNib

	}

	public PinionGear(Double p, Double r, Double uv, Color c, int n, Double d) {//degrees追加

	}

	public Double degrees() {//getDegrees
		return this.degrees;
	}

	public Hashtable<Symbol,Object> fromList(Cons aList) {
		return null;//
	}

	public Double bottom() {
		return null;
	}

	public Double left() {
		return null;
	}

	public Double right() {
		return null;
	}

	public Double top() {
		return null;
	}

	public Color penColor() {//getPenColor
		return this.penColor;
	}

	public void penColor(Color aColor) {//setPenColor
		return;
	}

	public int penNib() {//getPenNib
		return this.penNib;
	}

	public void penNib(int anInteger) {//setPenNib

	}

	public Double penPosition() {//getPenPosotion
		return this.penPosition;
	}

	public void penPosition(Double x, Double y) {//setPenPosition
		return;
	}

	public Rectangle penRectangle() {//Penのpointerをつくる penPositionとか
		return null;
	}

	public Cons toList() {//save機能
		return null;
	}

}
