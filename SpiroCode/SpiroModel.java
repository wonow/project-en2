import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class SpiroModel extends mvc.Model implements Runnable {

	private SpurGear spurGear;

	private PinionGear pinionGear;

	private boolean isInscibe;

	private boolean isRainbow;

	private DesignLocus designLocus;

	private boolean isAnimated;

	private int tickTime ; // 100 <= tickTime <= 0

	private Double pinionDegrees;

	private ArrayList<DesignLocus> designLoci;

	//コンストラクタ
	//インスタンス生成時に自動で呼び出される性質からクラスのメンバを初期化するときに使われます。
	public SpiroModel() {
		super();
		this.spurGear = new SpurGear();
		this.pinionGear = new PinionGear();
		this.isInscribe = false;
		this.isRainbow = false;
		this.designLocus = new DesignLocus();
		this.isAnimated = false;
		this.tickTime = 50;
		this.pinionDegrees = 0.0d;
		this.designLoci = new ArrayList<DesignLocus>();
	}

	//SpiroModelにCons型aListの値をsetする
	public SpiroModel(Cons aList) {
		super();
		this.spurGear = aList.;
		this.pinionGear = aList.;
		this.isInscribe = aList.;
		this.isRainbow = aList.;
		this.designLocus = aList.;
		this.isAnimated = aList.;
		this.tickTime = aList.;
		this.pinionDegrees = aList.;
		this.designLoci = aList.;
	}

	public DesignLocus designLocus() {//軌跡(単数)
		return this.designLocus;

	public DesignLocus designLocus() {
		return null;
	}

	public ArrayList<DesignLocus> designLoci() {//軌跡(複数形)
		return this.designLoci;
	}

	public PinionGear firstPinionGear() {
		return pinionGear;
	}

	public void flush() { //くっついているか（スパーギアとピニオンギア)を判断する

	}

	public Hashtable<Symbol,Object> fromList(Cons a List) {
		return null;
	}

	public boolean isAnimeated() { //描いているかどうかを返す
		return this.isAnimated;
	}

	public boolean isCircumscribe() { //制限(?)しているかどうかを返す
		return false;
	}

	public boolean isEditable() { //編集中かどうかを返す
		return false;
	}

	public boolean isInscribe() { //刻む.....???????
		return false;
	}

	public boolean isRainbow() { //虹色状態になっているか
		return this.isRainbow;
	}

	public boolean isStopped() { //（描画が?)止まっているかどうか
		return false;
	}

	public PinionGear lastPinionGear() { //
		return null;
	}
	/*
	public SpiroModel open() {//総合的な処理
		return null;
	}
	*/
	public void open(){//総合的な処理
		perform();

	}

	public SpiroModel open(SpiroModel aModel) {
		return null;
	}

	public void perform() {//描画系 loop
		while(1){
			//thetaの管理
			//そのΘを元に各ギアの座標を求める
			//そのデータをviewに送り出力させる
			Graphics aGraphics = new Graphics();
			View.displayPinionGear(aGraphics,x,y,r);
		}
	}

	public void pinionCenter(Point aPoint) { //ピニオンギアの中心について

	}

	public Double pinionDegrees(double spurDegrees) { //ピニオンギアの角度
		Double pinionDegree = spurDegrees
		return ;
	}

	public PinionGear pinionGear() {
		return null;
	}

	public void pinionPen(Point aPoint) { //ピニオンギアのペン

	}

	public void pinionRadius(Point aPoint) { //ピニオンギアの半径

	}
	@Override
	public void run() {//Runnableのための

	}

	public void spiroClear() { //描画を削除する

	}

	public void spiroCircumscribe(View aView) { //制限する？

	}

	public void spiroColor(View aView) { //スピログラフの色

	}

	public void spiroDive(View aView) {

	}

	public void spiroInscribe(View aView) {

	}

	public SpiroModel spiroNew() { //新しくスピログラフを生成する
		return null;
	}

	public void spiroNib(View aView) { //スピログラフのペン先

	}

	public void spiroOpen(View aView) {

	}

	public void spiroRainbow(View aView) {

	}

	public void spiroSave(View aView) {

	}

	/* これ以降はメニューで設定するためのものだと考えられる */

	public void spiroSpeedDown() {
		this.tickTime = this.tickTime + 10;
	}

	public void spiroSpeedUp() {
		this.tickTime = this.tickTime - 10;
	}

	public void spiroStart() {
		this.isAnimated = true;
	}

	public void spiroStop() {
		this.isAnimated = false;
	}
	public void reinbow() {
		boolean b = (SpiroModel.isRainbow() == true) ? false : true;
		this.isRainbow = b;
	}

	/*                                              */

	public void spurCenter(Point aPoint) { //スパーギアの中心について

	}

	public Double spurDegrees(double pinionDegrees) { //スパーギアの角度について
		return null;
	}

	public SpurGear spurGear() { //すぅぅぅぅぱぁぁぁぁああぁぁぁぁ
		return null;
	}

	public void spurRadius(Point aPoint) { //スパーギアの半径

	}

	public Cons toList() {
		return null;
	}

	public String toString() {
		return mvc.Model.toString();
	}

	public void underConstruction() {

	}

	public void underConstruction(View aView) {

	}

	public void warn(View aView, String aString) {

	}

}
