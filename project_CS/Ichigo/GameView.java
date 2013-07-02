package Ichigo;

import java.awt.Graphics;

/**
*
*
*/
public class GameView extends mvc.View
{
	/**
	*
	*/
	private IchigoModel model;

	/**
	*
	*/
	private IchigoController controller;

	/**
	*
	*/
	public GameView(IchigoModel aIchigoModel)
	{
		super(aIchigoModel);
	}
	
	/**
	*
	*/
	public GameView(IchigoModel aIchigoModel,IchigoController aIchigoController)
	{
		super(aIchigoModel,aIchigoController);
	}


	/**
	*
	*/
	public void setModel(IchigoModel aModel)
	{
	}

	/**
	*
	*/
	public IchigoModel getModel()
	{
		return null;
	}

	/**
	*
	*/
	public void setController(IchigoController aController)
	{
	}

	/**
	*
	*/
	public IchigoController getController()
	{
		return null;
	}

	/**
	*
	*/
	public void GameView()
	{
	}

	/**
	*
	*/
	public void printConponent(Graphics g)
	{
		return ;
	}

	
}
