package string.ispalindrome.basic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsPalindromeSolution {

    public Boolean isPalindrome(String str) {
        //double pointer solution
        //aba i=0 a l=2 a
        //aba i=1 b l=1 b
        char[] strs = str.toCharArray();
        int length = strs.length;
        for (int i = 0; i < length; i++) {
            int lastPointer = length - 1 - i;
            if (strs[i] !=strs[lastPointer]){
                return false;
            }
            if (i > lastPointer) return true;
        }
        return true;
    }

}

class IsPalindromeSolutionTest {

    private IsPalindromeSolution isPalindrome = new IsPalindromeSolution();

    @Test
    @DisplayName("aba is a palindrome")
    void shouldPalindrome1() {
        assertThat(isPalindrome.isPalindrome("aba")).isTrue();
    }

    @Test
    @DisplayName("` aba` is not a palindrome")
    void shouldPalindrome2() {
        assertThat(isPalindrome.isPalindrome(" aba")).isFalse();
    }

    @Test
    @DisplayName("`aba ` is not a palindrome")
    void shouldPalindrome3() {
        assertThat(isPalindrome.isPalindrome("aba ")).isFalse();
    }

    @Test
    @DisplayName("`greeting` is not a palindrome")
    void shouldPalindrome4() {
        assertThat(isPalindrome.isPalindrome("greeting")).isFalse();
    }

    @Test
    @DisplayName("`1000000001` a palindrome")
    void shouldPalindrome5() {
        assertThat(isPalindrome.isPalindrome("1000000001")).isTrue();
    }

    @Test
    @DisplayName("`Fish hsif` is not a palindrome")
    void shouldPalindrome6() {
        assertThat(isPalindrome.isPalindrome("Fish hsif")).isFalse();
    }

    @Test
    @DisplayName("`pennep` a palindrome")
    void shouldPalindrome7() {
        assertThat(isPalindrome.isPalindrome("pennep")).isTrue();
    }

}
