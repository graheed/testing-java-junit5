package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class PersonTest implements ModelTests{

    @RepeatedTest(value = 5, name = "{displayName}")
    @DisplayName("Simple Repeated Person Test")
    void testRepeatedTest() {
        //JustATest
    }

}