/********
 * Utility Class for working with Number objects that can be Missing.
 * 
 * @author Nkeng Atabong
 * @version 09/01/16
 *
 */
public final class Missing
{
  private static final double DEFAULT_MISSING_VALUE = 0.0;
  
  /******************
   * Replaces number with default value if number is null.
   * 
   * @param number the number to be checked
   * @return the appropriate value
   */
  public static double doubleValue(Double number)
  {
    return doubleValue(number, DEFAULT_MISSING_VALUE);
  }
  
  /*****************.
   * Replaces number with missing value if number is null.
   * 
   * @param number the number to be checked
   * @param missingValue the value to replace other
   * @return the appropriate value
   */
  public static double doubleValue(Double number, double missingValue)
  {
    if(number == null) return missingValue;
    else               return number.doubleValue();
  }
  
  /*****************
   * Replace number if it is null or lower than the given lower bound.
   * @param number the number to be checked
   * @param missingValue the number to replace the other 
   * @param lowerBound the lower bound
   * @return the appropriate value
   */
  public static double doubleValue(Double number, double missingValue, double lowerBound)
  {
    if(number == null || number.doubleValue() <lowerBound)  return missingValue;
    else return number.doubleValue();
  }
  
  
}
