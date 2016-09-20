/**********
 * The requirements of a system that is used to perform calculations on 
 * a List of Score objects.
 * 
 * @author Nkeng Atabong
 * @version 09/02/16
 *
 */
public interface ScoringSystem
{
  /****************
   *  Calculate a Score from a List of Score objects.
   *  
   * @param keys the String values
   * @param scores a list of score objects
   * @return the complete score
   * @throws SizeException if size is in an illegal state
   */
  public Score calculate(String keys, java.util.List<Score> scores) throws SizeException;
  
}
