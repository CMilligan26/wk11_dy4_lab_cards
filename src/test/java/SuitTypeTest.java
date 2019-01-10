import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuitTypeTest {

    @Test
    public void canGetAllSuits(){
        assertEquals(4, SuitType.getAllValues().length);
    }
}
