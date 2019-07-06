public class Example{


	public static void main(String[] arguments)
	{
		// ウィンドウのサイズを決め、モデルを作る。
		Dimension aDimension = new Dimension(800, 600);
		Model aModel = new Model();

		// MVCの出現数から、最初のウィンドウの出現位置を計算する。
		Integer width = aDimension.width;
		Integer height = aDimension.height;
		Integer x = (screenSize.width / 2) - (width / 2);
		Integer y = (screenSize.height / 2) - (height / 2);
		Point displayPoint = new Point(x, y);

		// 上記のモデルのビューとコンピュローラのペアを作り、ウィンドウに乗せる。
		View aView = new View(aModel);
		JFrame aWindow = new JFrame("スピログラフ");
		aWindow.getContentPane().add(aView);

		// 高さはタイトルバーの高さを考慮してウィンドウの大きさを決定する。
		aWindow.addNotify();
		Integer titleBarHeight = aWindow.getInsets().top;
		width = aDimension.width;
		height = aDimension.height + titleBarHeight;
		Dimension windowSize = new Dimension(width, height);
		aWindow.setSize(windowSize.width, windowSize.height);

		// ウィンドウに各種の設定を行って出現させる。
		aWindow.setMinimumSize(new Dimension(400, 300 + titleBarHeight));
		aWindow.setResizable(true);
		aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = displayPoint.x;
		y = displayPoint.y;
		aWindow.setLocation(x, y);
		aWindow.setVisible(true);
		aWindow.toFront();

		SpiroModel spiroModel = new SpiroModel();

		spiroModel.run();

		return;
	}
}
