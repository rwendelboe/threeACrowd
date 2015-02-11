import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by romanwendelboe on 9/15/14.
 */

public class ThreeACrowd extends JFrame{
    private final int WIDTH = 600, LENGTH = 500;

    private JButton ironManButton, ironMan2Button, ironMan3Button, exitButton;
    private JLabel statisticsLabel, budgetLabel, weekendLabel, boxOfficeLabel, worldOfficeLabel, highestPaidLabel;
    private JLabel ironManLabel, newBudgetLabel, newWeekendLabel, newBoxOfficeLabel, newWorldLabel, newHighestLabel;
    private ExitButtonHandler exitHandler;
    private IronManButtonHandler ironManHandler;
    private IronMan2ButtonHandler ironMan2Handler;
    private IronMan3ButtonHandler ironMan3Handler;

    public ThreeACrowd(){
       exitButton = new JButton("Exit: ");
       ironManButton = new JButton("Iron Man: ");
       ironMan2Button = new JButton("Iron Man 2: ");
       ironMan3Button = new JButton("Iron Man 3: ");
       statisticsLabel = new JLabel("Statistics for");
       weekendLabel = new JLabel("Opening Weekend:");
       budgetLabel = new JLabel("Budget:");
       boxOfficeLabel = new JLabel("US Box Office:");
       worldOfficeLabel = new JLabel("World Wide Box Office:");
       highestPaidLabel = new JLabel("Highest Paid Actor:");
       ironManLabel = new JLabel("");
       newWeekendLabel = new JLabel("");
       newBudgetLabel = new JLabel("");
       newBoxOfficeLabel = new JLabel("");
       newWorldLabel = new JLabel("");
       newHighestLabel = new JLabel("");

       ironManHandler = new IronManButtonHandler();
       ironMan2Handler = new IronMan2ButtonHandler();
       ironMan3Handler = new IronMan3ButtonHandler();
       exitHandler = new ExitButtonHandler();

       exitButton.addActionListener(exitHandler);
       ironManButton.addActionListener(ironManHandler);
       ironMan2Button.addActionListener(ironMan2Handler);
       ironMan3Button.addActionListener(ironMan3Handler);

       Container pane = getContentPane();
       pane.setLayout(new GridLayout(7,4));

       pane.add(new JPanel());
       pane.add(statisticsLabel);
       pane.add(ironManLabel);
       pane.add(new JPanel());
       pane.add(budgetLabel);
       pane.add(newBudgetLabel);
       pane.add(new JPanel());
       pane.add(new JPanel());
       pane.add(weekendLabel);
       pane.add(newBoxOfficeLabel);
       pane.add(new JPanel());
       pane.add(new JPanel());
       pane.add(boxOfficeLabel);
       pane.add(newWeekendLabel);
       pane.add(new JPanel());
       pane.add(new JPanel());
       pane.add(worldOfficeLabel);
       pane.add(newWorldLabel);
       pane.add(new JPanel());
       pane.add(new JPanel());
       pane.add(highestPaidLabel);
       pane.add(newHighestLabel);
       pane.add(new JPanel());
       pane.add(new JPanel());
       pane.add(ironManButton);
       pane.add(ironMan2Button);
       pane.add(ironMan3Button);
       pane.add(exitButton);

       setSize(WIDTH, LENGTH);
       setVisible(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private class ExitButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private  class IronManButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          ironManLabel.setText("Iron Man");
          newBudgetLabel.setText("$230,000,000");
          newWeekendLabel.setText("$98,619,778");
          newBoxOfficeLabel.setText("$318,412,855");
          newWorldLabel.setText("$585,134,041");
          newHighestLabel.setText("Terrence Howard");
        }
    }
    private  class IronMan2ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ironManLabel.setText("Iron Man 2");
            newBudgetLabel.setText("$255,000,000");
            newWeekendLabel.setText("$128,122,480");
            newBoxOfficeLabel.setText("$312,128,345");
            newWorldLabel.setText("$622,128,345");
            newHighestLabel.setText("Robert Downey Jr.");
        }
    }
    private  class IronMan3ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ironManLabel.setText("Iron Man 3");
            newBudgetLabel.setText("$275,000,000");
            newWeekendLabel.setText("$174,144,585");
            newBoxOfficeLabel.setText("$409,013,994");
            newWorldLabel.setText("$1,214,713,994");
            newHighestLabel.setText("Robert Downey Jr.");
        }
    }
}
