class FahrenheitToCentigrade
{
  public static void main(String argv[])
  {
    double tempFahrenheit = 98.6;
    double tempCelcius = (5 * (tempFahrenheit - 32)) / 9;
    System.out.println("tempFahrenheit = " + tempFahrenheit);
    System.out.println("tempCelsius = " + tempCelcius);
  }
}
