package Ichigo;

import java.awt.Graphics;

/**
*
*
*/
public class EditorView extends mvc.View
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
	public EditorView(IchigoModel aIchigoModel)
	{
		super(aIchigoModel);	
	}


	/**
	*
	*/
	public EditorView(IchigoModel aIchigoModel,IchigoController aIchigoController)
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
	public void EditorView()
	{
	}

	/**
	*
	*/
	public void paintConponent(Graphics g)
	{
	
	}


}
