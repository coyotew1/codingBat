import javax.swing.JOptionPane;

public class ScoresIncreasing
{

    //this is the method that coding bat wants
    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i<scores.length; i++)
        {
            if (scores[i]<scores[i+1])
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    
    //don't touch this method
    public static void ScoresIncreasing()
    {
        //add any tests you want here
        //I just used some simple JOptionPane input handlers to create custom tests

        int numNums = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of scores you have"));

        int[] scores = new int[numNums];
        for (int i = 0; i< numNums; i++)
        {
            scores[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a score"));
        }
        /*
        for (int i = 0; i<scores.length; i++)
        {
            System.out.println("Score" + i + ": " + scores[i]);
        }
        */
        String yes = "yes";
        String no = "No";
        if (scoresIncreasing(scores))
        {
            JOptionPane.showMessageDialog(null, "Are the scores increasing?\n" + yes); 
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Are the scores increasing?\n" + no);
        }

        
    }


    
}