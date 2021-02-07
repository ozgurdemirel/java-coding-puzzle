package string.ispalindrome.basic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsPalindrome {

    public Boolean isPalindrome(String str) {
        return null;
    }

}

class IsPalindromeTest {

    private IsPalindrome isPalindrome = new IsPalindrome();

    @Test
    @DisplayName("aba is a palindrome")
    void shouldPalindrome1() {
        assertThat(isPalindrome.isPalindrome("aba")).isTrue();
    }

    @Test
    @DisplayName("` aba` is not a palindrome")
    void shouldPalindrome2() {
        assertThat(isPalindrome.isPalindrome(" aba")).isTrue();
    }

    @Test
    @DisplayName("`aba ` is not a palindrome")
    void shouldPalindrome3() {
        assertThat(isPalindrome.isPalindrome("aba ")).isTrue();
    }

    @Test
    @DisplayName("`greeting` is not a palindrome")
    void shouldPalindrome4() {
        assertThat(isPalindrome.isPalindrome("greeting")).isFalse();
    }

    @Test
    @DisplayName("`1000000001` a palindrome")
    void shouldPalindrome5() {
        assertThat(isPalindrome.isPalindrome("1000000001")).isFalse();
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
