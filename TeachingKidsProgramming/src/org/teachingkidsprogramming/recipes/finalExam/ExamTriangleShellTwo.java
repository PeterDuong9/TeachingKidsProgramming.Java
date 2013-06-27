package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellTwo
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shell = MessageBox.askForNumericalInput("Size of the shell ");
    if (shell < 300)
    {
      MessageBox.showMessage("" + shell + " is too small to be seen. Please change the size. ");
    }
    //    Otherwise, Do the following the "shell size" number of times
    else
    {
      for (int i = 1; i <= shell; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        //          Set the value of the large length to the size of the shell divided by 150
        int largelength = shell / 150;
        //          Subtract the value of the large length from the current length
        length = length - largelength;
        //      If the value of the large length is less than zero
        if (largelength < 0)
        {
          //      Set the value of the length to the length plus 3
          length = length + 3;
        }
        //         Otherwise, Call the drawTriangle method (recipe below)      
        else
        {
          drawTriangle();
        }
        //          Set the value of the number of rotations to 6
        int rotations = 6;
        //          Turn the tortoise 360 times the number of rotations, then divide that by the size of the shell
        Tortoise.turn(360.0 * rotations / shell);
        //    Repeat 
      }
    }
  }
  private static void drawTriangle()
  {
    for (int j = 1; j <= 2.75; j++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3.25);
    }
  }
}
