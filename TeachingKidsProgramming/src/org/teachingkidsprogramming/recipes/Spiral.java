package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Spiral
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    ColorWheel.addColor(Colors.Purples.BlueViolet);
    ColorWheel.addColor(Colors.Purples.Violet);
    ColorWheel.addColor(Colors.Purples.Purple);
    for (int i = 1; i <= 75; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(i * 5);
      Tortoise.turn(360 / 3);
    }
  }
}
