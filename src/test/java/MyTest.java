import com.guoyasoft.tools.JDBCTools;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void testMethod(){
    JDBCTools.getConnection();
  }
}
