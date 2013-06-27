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
    else
    {
      for (int i = 1; i <= shell; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        int largelength = shell / 150;
        length = length - largelength;
        if (largelength < 0)
        {
          length = length + 3;
        }
        else
        {
          drawTriangle();
        }
        int rotations = 6;
        Tortoise.turn(360.0 * rotations / shell);
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
