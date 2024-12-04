import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.*;

class CommonElementsTest {
    private Set<String> findCommonElements(List<String> list, Set<String> set) {
        Set<String> answer = new HashSet<>();
        for (String item : list) {
            if (set.contains(item)) {
                answer.add(item);
            }
        }
        return answer;
    }

    @Test
    void testCommonElements_OneCommon() {
        List<String> list = Arrays.asList("A", "B", "A");
        Set<String> set = new HashSet<>(Arrays.asList("B", "C"));
        Set<String> expected = new HashSet<>(List.of("B"));

        assertEquals(expected, findCommonElements(list, set));
    }

    @Test
    void testCommonElements_MultipleCommon() {
        List<String> list = Arrays.asList("A", "B", "C", "A");
        Set<String> set = new HashSet<>(Arrays.asList("B", "C", "D"));
        Set<String> expected = new HashSet<>(Arrays.asList("B", "C"));

        assertEquals(expected, findCommonElements(list, set));
    }

    @Test
    void testCommonElements_NoCommon() {
        List<String> list = Arrays.asList("A", "B", "A");
        Set<String> set = new HashSet<>(Arrays.asList("C", "D"));
        Set<String> expected = new HashSet<>();

        assertEquals(expected, findCommonElements(list, set));
    }

    @Test
    void testCommonElements_EmptyList() {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>(Arrays.asList("B", "C"));
        Set<String> expected = new HashSet<>();

        assertEquals(expected, findCommonElements(list, set));
    }

    @Test
    void testCommonElements_EmptySet() {
        List<String> list = Arrays.asList("A", "B", "A");
        Set<String> set = new HashSet<>();
        Set<String> expected = new HashSet<>();

        assertEquals(expected, findCommonElements(list, set));
    }

    @Test
    void testCommonElements_BothEmpty() {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Set<String> expected = new HashSet<>();

        assertEquals(expected, findCommonElements(list, set));
    }
}
