package IntroToAlgorithms;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class InsertSortTest {
    @Test public void sortNullListReturnsEmptyList() {
        final var out = InsertSort.sort(null);
        assertNotNull(out);
        assertEquals(0, out.size());
    }

    @Test public void sortEmptyListReturnsEmptyList() {
        final var out = InsertSort.sort(List.of());
        assertNotNull(out);
        assertEquals(0, out.size());
    }
}
