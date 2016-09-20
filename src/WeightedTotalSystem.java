import java.util.List;
import java.util.Map;

/**************
 * A ScoringSystem that calculates the weighted total of a List of Score
 * objects.
 * 
 * @author Nkeng Atabong
 * @version 09/01/2016
 *
 */
public class WeightedTotalSystem implements ScoringSystem
{
  private Map<String, Double> weights;

  /*********
   * Default Constructor of program.
   */
  public WeightedTotalSystem()
  {
    this(null);
  }

  /*********
   * Explicit Constructor with specific weight.
   * 
   * @param weights
   *          The Map of weights to use (or null for equal weights)
   */
  public WeightedTotalSystem(Map<String, Double> weights)
  {
    this.weights = weights;
  }

  /**
   * Calculate a (in this case, weighted total) Score from a List of Score objects
   * (required by ScoringSystem).
   *
   * Notes: (1) If there is no weight for a particular Score (i.e.,
   * associated with the key for that Score) then a weight of 1.0 is used. This is true even
   * if the Map of weights is null (i.e., there are no weights).
   * (2) Weights that are less than 1.0 are treated as 1.0. (3) Missing
   * Score values are treated as 0.0. (4) If the List is null or there are no
   * Score objects then this method throws a SizeException.
   * 
   * @param key     The key to use for the resulting Score
   * @param scores  The List of Score objects to use in the calculation
   * @return The resulting Score
   * @throws SizeException if the List is null or empty
   */
  public Score calculate(String keys, List<Score> scores) throws SizeException
  {
    Double totalWeights = 0.0;

    if (scores == null || scores.isEmpty()) throw new SizeException();
    
    for (int ii = 0; ii < scores.size(); ii++)
    {
      if (weights == null) totalWeights += 1.0;
      else
      {
        String scoreKey = scores.get(ii).getKey();
        Double weightsValue = weights.get(scoreKey);
        
        Double scoreValue = Missing.doubleValue(scores.get(ii).getValue(), 0);
        totalWeights += Missing.doubleValue(weightsValue, 1.0, 1.0) * scoreValue;
      }
    }
    
    return new Score(keys, new Double (totalWeights));
  }
}
