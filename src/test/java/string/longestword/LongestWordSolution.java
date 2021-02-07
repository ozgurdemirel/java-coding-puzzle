package string.longestword;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestWordSolution {

    public String longestWord(String str) {
        String[] strings = str.split("\\s+");
        String longest = "";
        int max = 0;
        for (String string : strings) {
            int i = 0;
            String temp = "";
            for (char c : string.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    temp += String.valueOf(c);
                    i++;
                } else {
                    i = 0;
                    temp = "";
                }
            }
            if (i > max) {
                max = i;
                longest = temp;
            }
        }
        return longest;
    }

}

class LongestWordSolutionTest {

    private LongestWordSolution longestWord = new LongestWordSolution();

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
