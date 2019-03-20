import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuestionTest {
    @Test
    void testCreate() {
        Question q = new Question(3, 4, "+");
        assertFalse(q.checkAnswer(0));
    }

    @Test
    void testSubtraction() {
        Question q = new Question(3, 4, "-");
        assertTrue(q.checkAnswer(-1));
    }

    @Test
    void testMultiplication() {
        Question q = new Question(3, 4, "*");
        assertTrue(q.checkAnswer(12));
    }

    @Test
    void testDivision() {
        Question q = new Question(10, 2, "/");
        assertTrue(q.checkAnswer(10));
    }

}
