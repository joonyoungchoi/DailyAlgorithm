package july.eleventh;
import static org.junit.Assert.*;

import july.eleventh.YourOrderPlease.YourOrderPlease;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class YourOrderPleasesTest {
    @Test
    public void test1() {
        assertThat(YourOrderPlease.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void test2() {
        assertThat(YourOrderPlease.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void test3() {
        assertThat("Empty input should return empty string", YourOrderPlease.order(""), equalTo(""));
    }
}
