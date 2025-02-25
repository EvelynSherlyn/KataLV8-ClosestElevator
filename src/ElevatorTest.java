import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestElevator {
    TestElevator() {
    }

    @Test
    void exampleTests() {
        Assertions.assertEquals("right", Elevator.call(0, 0, 0), "call(0, 0, 0)");
        Assertions.assertEquals("left", Elevator.call(0, 1, 0), "call(0, 1, 0)");
        Assertions.assertEquals("left", Elevator.call(0, 2, 0), "call(0, 2, 0)");
    }

    @Test
    void masTests() {
        Assertions.assertEquals("right", Elevator.call(2, 0, 1), "call(2, 0, 1)");
    }
}
