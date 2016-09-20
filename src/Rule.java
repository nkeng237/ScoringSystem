import java.util.List;

/**************
 * A Rule can be used to "remove or include" specific Score objects from a
 * List of Score objects.
 *
 * Note: A Ruler does not change the underlying List, it creates
 * a new List that satisfies the conditions of the Rule.
 * 
 * @author Nkeng Atabong
 * @version 09/01/2016
 */
public interface Rule
{
  /************
   * Apply method.
   * @param scores the list of scores
   * @return the list
   * @throws SizeException if the size is in an illegal state
   */
  public List<Score> apply(List<Score> scores) throws SizeException;

}
