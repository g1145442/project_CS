package Ichigo;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.HashMap;
/**
*  いちご番のモデル。
*  g1145082 Hashimoto Risa スタブ作成 6/28
*/

enum Ichigo{TITLE,SELECT,EDITOR,GAME};

public class IchigoModel extends mvc.Model
{
	//フィールド

	private GameModel gameModel;
	private EditorModel editorModel;
	private Ichigo GameState;
	private Dimension mapSize;
	private HashMap<Integer,BufferedImage> mapImage;
	private TitleView tView;
	private GameView gView;
	private EditorView eView;
	private SelectView sView;
	private MapReader mapReader;

	//コンストラクタ
	public IchigoModel()
	{
	
	}

	//アクセッサーメソッド

	public void setGameModel(GameModel aGameModel)
	{

	}

	public GameModel getGameModel()
	{
		return null;
	}

	public void setEditorModel(EditorModel aEditorModel)
	{
	
	}

	public EditorModel getEditorModel()
	{
		return null;
	}

	public void setGameState(Ichigo aGameState)
	{
	
	}

	public Ichigo getGameState()
	{
		return null;
	}

	public void setMapSize(Dimension aIchigoMapSize)
	{
		
	}

	public Dimension getMapSize()
	{
		return null;
	}

	public void setMapImage(HashMap<Integer,BufferedImage> aMap){
			
	}

	public HashMap<Integer,BufferedImage> getMapImage()
	{
		return null;	
	}

	public void setTitleView(TitleView aView)
	{

	}

	public TitleView getTitleView()
	{
		return null;
	}

	public void setSelectView(SelectView aView)
	{
	
	}

	public SelectView getSelectView()
	{
		return null;
	}

	public void setGameView(GameView aView)
	{
		
	}
	
	public GameView getGameView()
	{
		return null;
	}

	public void setEditorView(EditorView aView)
	{
		
	}

	public EditorView getEditorView()
	{
		return null;
	}

	public void setMapReader()
	{
	
	}
	
	public MapReader getMapReader()
	{
		return null;
	}

	//メソッド:

	public void inithalize()
	{
	
	}
}


