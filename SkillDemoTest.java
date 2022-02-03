import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiplication() {
        assertEquals(11, SkillDemo.multi(5, 2)); //fail at first
    }
}
