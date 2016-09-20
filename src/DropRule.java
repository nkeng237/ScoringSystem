import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***************
 * A DropRule can be used to drop the lowest and/or highest
 * Score from a List.
 * 
 * @author Nkeng Atabong
 * @version 1 09/01/2016
 * @version 2 09/08/2016
 */
public class DropRule implements Rule
{
  private boolean shouldDropLowest;
  private boolean shouldDropHighest;
  private int amountDropped;

  /*********
   * Constructor default.
   */
  public DropRule()
  {
    this(true, true);
  }

  /*************
   * Constructor.
   * 
   * @param shouldDropLowest
   *          attribute
   * @param shouldDropHighest
   *          attribute
   */
  public DropRule(boolean shouldDropLowest, boolean shouldDropHighest)
  {
    this.shouldDropHighest = shouldDropHighest;
    this.shouldDropLowest = shouldDropLowest;
  }

  /*************
   * Apply method.
   * 
   * @param scores
   *          the list of score
   * @return the new list
   * @throws SizeException
   *           if size is not correct
   */
  public List<Score> apply(List<Score> scores) throws SizeException
  {
    List<Score> result = new ArrayList<Score>();

    if (shouldDropHighest) ++amountDropped;
    if (shouldDropLowest)  ++amountDropped;

    if (scores == null || scores.size() <= amountDropped)
      throw new SizeException();

    for (int ii = 0; ii < scores.size(); ii++)
    {
      result.add(scores.get(ii));
    }
    
    Collections.sort(result);
    
    
    if (shouldDropLowest)  result.remove(0);
    if (shouldDropHighest) result.remove(scores.size() -1);

    return result;
  }
}
