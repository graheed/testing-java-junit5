package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.*;

@Tag("model")
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface ModelTests {

    @BeforeEach
    default void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("We're running " + testInfo.getDisplayName() + " At "
                +repetitionInfo.getCurrentRepetition() + " Of "
                +repetitionInfo.getTotalRepetitions());

    }
}
