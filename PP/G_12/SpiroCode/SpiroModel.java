public class SpiroModel extends mvc.Model implements Runnable {

	private SpurGear spurGear;

	private PinionGear pinionGear;

	private boolean isInscibe;

	private boolean isRainbow;

	private DesignLocus designLocus;

	private boolean isAnimated;

	private int tickTime;

	private Double pinionFegrees;

	private ArrayList<DesignLocus> designLoci;

	public void SpiroModel() {
		this.spurGear = null;
		this.PinionGear = null;
		this.designLocus = null;
		this.tickTime = null;
		this.pinionFegrees = null;
	}

	public void SpiroModel(Cons a List) {

	}

	public DesignLocus designLocus() { //軌跡
		return null;
	}

	public ArrayList<DesignLocus> designLoci() { //軌跡(複数形)
		return null;
	}

	public PinionGear firstPinionGear() {
		return null;
	}

	public void flush() {

	}

	public Hashtable<Symbol,Object> fromList(Cons a List) {
		return null;
	}

	public boolean isAnimeated() {
		return this.isAnimated;
	}

	public boolean isCircumscribe() {
		return false;
	}

	public boolean isEditable() { //編集中かどうかを返す
		return false;
	}

	public boolean isInscribe() {
		return false;
	}

	public boolean isRainbow() {
		return this.isRainbow;
	}

	public boolean isStopped() {
		return false;
	}

	public PinionGear lastPinionGear() {
		return null;
	}

	public SpiroModel open() {
		return null;
	}

	public SpiroModel open(SpiroModel aModel) {
		return null;
	}

	public void perform() {

	}

	public void pinionCenter(Point aPoint) {

	}

	public Double pinionDegrees(double spurDegrees) {
		return null;
	}

	public PinionGear pinionGear() {
		return null;
	}

	public void pinionPen(Point aPoint) {

	}

	public void pinionRadius(Point aPoint) {

	}

	public void run() {

	}

	public void spiroClear() {

	}

	public void spiroCircumscribe(View aView) {

	}

	public void spiroColor(View aView) {

	}

	public void spiroDive(View aView) {

	}

	public void spiroInscribe(View aView) {

	}

	public SpiroModel spiroNew() {
		return null;
	}

	public void spiroNib(View aView) {

	}

	public void spiroOpen(View aView) {

	}

	public void spiroRainbow(View aView) {

	}

	public void spiroSave(View aView) {

	}

	public void spiroSpeedDown() {

	}

	public void spiroSpeedUp() {

	}

	public void spiroStart() {

	}

	public void spiroStop() {

	}

	public void spurCenter(Point aPoint) {

	}

	public Double spurDegrees(double pinionDegrees) {
		return null;
	}

	public SpurGear spurGear() {
		return null;
	}

	public void spurRadius(Point aPoint) {

	}

	public Cons toList() {
		return null;
	}

	public String toString() {
		return null;
	}

	public void underConstruction() {

	}

	public void underConstruction(View aView) {

	}

	public void warn(View aView, String aString) {

	}

}
