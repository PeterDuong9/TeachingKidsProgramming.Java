package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    for (int i = 1; i <= 200; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.setPenWidth(Tortoise.getPenWidth() + 1);
      if (4 < Tortoise.getPenWidth())
      {
        Tortoise.setPenWidth(1);
      }
      Tortoise.move(i);
      Tortoise.turn(360.0 / 5);
      Tortoise.turn(1);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Colors.Blues.SteelBlue);
    ColorWheel.addColor(Colors.Purples.DarkOrchid);
    ColorWheel.addColor(Colors.Blues.DarkSlateBlue);
    ColorWheel.addColor(Colors.Blues.Teal);
    ColorWheel.addColor(Colors.Purples.Indigo);
  }
}
