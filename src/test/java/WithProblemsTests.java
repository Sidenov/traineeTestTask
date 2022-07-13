import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WithProblemsTests {

    private final String CONST = "newValue";
    private final static String bd = "pui";

    @Test
    public void equalsOneToOne() {
        assertEquals("1", "1");
    }


    @Test
    public void assignValueToConstVar() {
        assertEquals("newValue", CONST);
    }

    @Test
    public void equalsOneToOneSecondTest() {
        assertEquals(1, 1);
    }


    @Test
    public void stringsMustBeEquals() {
        String res = "a";

//        if (bd == "pui") {
//            res = "asd";
//        }

//        if (bd.equals(new String("pui"))) {
//            res = "asd";
//        }

        if (bd.equalsIgnoreCase(new String("Pui"))) {
            res = "asd";
        }
        assertEquals("asd", res);

    }

    @Test
    public void successfullyRemovingFirstElementFromList() {

//        List<String> sourceData = new ArrayList<>();
//        sourceData.add("1");
//        sourceData.add("viskas");
//        sourceData.add("chupocabra");
//
//        sourceData.remove(0);

        List<String> sourceData = new ArrayList<>(List.of("1", "viskas", "chupocabra"));
        sourceData.remove(0);
        System.out.println(sourceData);
        assertFalse(sourceData.contains("1"));
    }

}
