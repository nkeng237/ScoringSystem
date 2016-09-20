import java.io.IOException;

/*********
 * Exception for size.
 * @author Nkeng Atabong
 * @version 009/02/16
 *
 */
public class SizeException extends IOException
{
  
  private static final long serialVersionUID = 1;
  
  /*********
   * Default constructor.
   */
  public SizeException()
  {
    super();
  }
  
  /******
   * Explicit Constructor with specific message
   * @param message the string to be printed to tell the user there was an exception
   */
  public SizeException(String message)
  {
    super(message);
  }

}
