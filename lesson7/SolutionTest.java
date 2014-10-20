import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
  @Test
  public void Task5() {
    int[] MONTHS_LENGTH = {31,28,31,30,31,30,31,31,30,31,30,31};
    int sumOfDaysBeforeMonth = 0;
    for (int i = 0; i < month -1; i++) {
      sumOfDaysBeforeMonth += MONTHS_LENGTH[i];
    }
    int dayOfYear = sumOfDaysBeforeMonth + day;

    assertEquals(365, dayOfYear);
  }
}