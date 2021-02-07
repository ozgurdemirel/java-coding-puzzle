package string.capitalizesentence;

import static org.assertj.core.api.Java6Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CapitalizeSentenceSolution {
    //opinionated solution 2
    public String capitalizeSentenceSolution2(String str) {
        return Arrays.stream(str.split(" "))
                .map(n -> n.toUpperCase().toCharArray()[0] + n.substring(1))
                .collect(Collectors.joining(" "));
    }

    public String capitalizeSentence(String str) {
        List<String> words = new ArrayList<>();

        String[] strs = str.split(" ");

        for (String item : strs) {
            words.add(item.toUpperCase().toCharArray()[0] + item.substring(1));
        }

        return words.stream().collect(Collectors.joining(" "));
    }
}

class CapitalizeSentenceSolutionTest {

    private CapitalizeSentenceSolution capitalizeSentence = new CapitalizeSentenceSolution();

    @Test
    @DisplayName("flower is capitalised to Flower")
    public void shouldCapitalizedToFlower() {
        String str = capitalizeSentence.capitalizeSentence("flower");

        assertThat(str).isEqualTo("Flower");
    }

    @Test
    @DisplayName("`this is house` capitalised to This Is A House")
    public void shouldCapitalizeThiIsAHouse() {
        String str = capitalizeSentence.capitalizeSentence("this is a house");

        assertThat(str).isEqualTo("This Is A House");
    }

}