import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RankTypeTest {

    @Test
    public void canGetAllRanks(){
        assertEquals(13, RankType.getAllValues().length);
    }
}
