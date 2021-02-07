package string.capitalizesentence;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CapitalizeSentence {
    public String capitalizeSentence(String str) {
        return "";
    }
}

class CapitalizeSentenceTest {

    private CapitalizeSentence capitalizeSentence = new CapitalizeSentence();

    @Test
    @DisplayName("flower is capitalised to Flower")
    void shouldCapitalizedToFlower() {
        String str = capitalizeSentence.capitalizeSentence("flower");

        assertThat(str).isEqualTo("Flower");
    }

    @Test
    @DisplayName("`this is house` capitalised to This Is A House")
    void shouldCapitalizeThiIsAHouse(){
        String str = capitalizeSentence.capitalizeSentence("this is a house");

        assertThat(str).isEqualTo("This Is A House");
    }

}



