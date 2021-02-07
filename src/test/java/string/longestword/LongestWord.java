package string.longestword;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestWord {

    public String longestWord(String str) {
        //todo : implement it ....
        return null;
    }

}

class LongestWordTest {

    private LongestWord longestWord = new LongestWord();

    @Test
    @DisplayName("`flower` return flower")
    void shouldReturnLongestWord1() {
        assertThat(longestWord.longestWord("flower")).isEqualTo("flower");
    }

    @Test
    @DisplayName("flower is growing fast")
    void shouldReturnLongestWord2() {
        assertThat(longestWord.longestWord("flower is growing fast")).isEqualTo("growing");
    }

    @Test
    @DisplayName("`this is may jeep` return jeep")
    void shouldReturnLongestWord3() {
        assertThat(longestWord.longestWord("This is my jeep")).isEqualTo("This");
    }

    @Test
    @DisplayName("Home!@&sweet home")
    void shouldReturnLongestWord4() {
        assertThat(longestWord.longestWord("Home!@&sweet home")).isEqualTo("sweet");
    }

}
