package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class KnottedRing
{
  public static void main(String[] args)
  {
    //      Make the tortoise move as fast as possible --#4
    Tortoise.setSpeed(10);
    //      createColorPalette (recipe below) --#6
    //      ------------- Recipe for createColorPalette --#6
    createColorPalette();
    //      ------------- End of createColorPalette recipe --#6
    //      Do the following 30 times --#10
    for (int i = 1; i <= 30; i++)
    {
      Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
      drawOctagonWithOverlap();
      Tortoise.turn(360.0 / 30);
      //       Turn the tortoise 5 more degrees to the right --#11
      Tortoise.turn(5);
    }
    //       Repeat 
  }
  private static void drawOctagonWithOverlap()
  {
    for (int i = 1; i <= 8 + 1; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(360.0 / 8);
    }
  }
  private static void createColorPalette()
  {
    //      Add hot pink to the color wheel --#6
    ColorWheel.addColor(Colors.Pinks.HotPink);
    //      Add red to the color wheel --#12
    ColorWheel.addColor(Colors.Reds.Red);
    //      Add fuchsia to the color wheel --#13
    ColorWheel.addColor(Colors.Reds.FireBrick);
    //      Add orange red to the color wheel --#14
    ColorWheel.addColor(Colors.Reds.OrangeRed);
    //      Add deep pink to the color wheel --#15
    ColorWheel.addColor(Colors.Pinks.DeepPink);
    //      Add medium violet red to the color wheel --#16
    ColorWheel.addColor(Colors.Reds.MediumVioletRed);
    //      Add crimson to the color wheel --#17
    ColorWheel.addColor(Colors.Reds.Crimson);
    //      Add tomato to the color wheel --#18
    ColorWheel.addColor(Colors.Reds.Tomato);
  }
}
