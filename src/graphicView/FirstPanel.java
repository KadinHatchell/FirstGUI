package graphicView;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import graphicController.FirstGUIController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPanel extends JPanel
{

	private FirstGUIController baseController;
	private JButton colorButton;
	private JButton randomButton;

	public FirstPanel(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;

		colorButton = new JButton("Color");
		randomButton = new JButton("random");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		this.add(colorButton);
		this.add(randomButton);

	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				setBackground(Color.BLUE);

			}
		});

	}

}
