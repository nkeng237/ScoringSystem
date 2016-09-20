/****************************
 * Score class.
 * 
 * @author Nkeng Atabong
 * @version 09/01/16
 * 
 */
public final class Score implements Comparable<Score>
{
  private String key;
  private Double value;

  /***********
   * Create a Score object with the given key
   * 
   * @param key
   *          the String key
   * @throws IllegalArgumentException
   *           if key is in an illegal state
   */
  public Score(String key) throws IllegalArgumentException
  {
    this(key, new Double(0.0));
  }

  /*************
   * Create a Score object with the given key and value
   * 
   * @param key
   *          the String key
   * @param value
   *          the Double value
   * @throws IllegalArgumentException
   *           if key has illegal state
   */
  public Score(String key, double value) throws IllegalArgumentException
  {
    this(key,new Double(value));
  }

  /***********
   * Create a Score object with the given key and value
   * 
   * @param key
   *          the String key
   * @param value
   *          the Double key value
   * @throws IllegalArgumentException
   *           if key has illegal state
   */
  public Score(String key, Double value) throws IllegalArgumentException
  {
    if (key == null || key.length() == 0) throw new IllegalArgumentException();
    
    this.value = value;
    this.key = key;
  }

  /**********
   * Get the key attribute.
   * 
   * @return the key attribute
   */
  public String getKey()
  {
    return this.key;
  }

  /*********
   * Get the value attribute.
   * 
   * @return the value attribute
   */
  public java.lang.Double getValue()
  {
    return this.value;
  }

  /********
   * Create a String representation of this Score.
   * 
   * @return string representation of Score object
   */
  public java.lang.String toString()
  {
    String result = "";
    String colon = ": ";
    
    if (this.value != null) result = key + colon + String.format("%5.1f", value);
    else
    {
      String string = "NA";
      result = String.format(key + colon + "%5s", string);
    }

    return result;
  }

  /*********
   * Compare this value to the value of the Score object other.
   * 
   * @param other
   *          the Score object to compare to
   * @return 1,0 or -1 depending on the comparison result
   */
  public int compareTo(Score other)
  {
    return this.getValue().compareTo(other.getValue());
   
  }

}
