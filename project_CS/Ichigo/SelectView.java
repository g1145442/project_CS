package Ichigo;

import java.awt.Graphics;

/**
*
*
*/
public class SelectView extends mvc.View
{
	/**
	*
	*/
	private IchigoModel model;

	/**
	*
	*/
	private EditorController controller;

	/**
	*
	*/
	public SelectView(IchigoModel aIchigoModel)
	{
		super(aIchigoModel);
	}
	
	/**
	*
	*/
	public SelectView(IchigoModel aIchigoModel,IchigoController aIchigoController)
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
	public void setController(EditorController aController)
	{
	}

	/**
	*
	*/
	public EditorController getController()
	{
		return null;
	}
	
	/**
	*
	*/
	public void SelectView()
	{
	}

	/**
	*
	*/
	public void paintConponent(Graphics g)
	{

	}

}
