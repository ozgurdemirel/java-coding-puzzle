package string.capitalizesentence;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CapitalizeSentence {
    public String capitalizeSentence(String str) {
        return "";
    }
}

class CapitalizeSentenceTest {

    private CapitalizeSentence capitalizeSentence = new CapitalizeSentence();

    @Test
    void shouldCapitalizedToFlower() {
        String str = capitalizeSentence.capitalizeSentence("flower");

        assertThat(str).isEqualTo("Flower");
    }

    @Test
    void shouldCapitalizeThiIsAHouse(){
        String str = capitalizeSentence.capitalizeSentence("this is a house");

        assertThat(str).isEqualTo("This Is A House");
    }

}



