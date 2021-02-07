package string.ispalindrome.tolerant;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsTolerantPalindrome {
    public Boolean isTolerantPalindrome(String str, Boolean characterRemoved) {
        //todo : not implemented
        return false;
    }

    public Boolean isTolerantPalindrome(String str) {
        return isTolerantPalindrome(str, Boolean.FALSE);
    }
}

class IsTolerantPalindromeTest {

    IsTolerantPalindrome isTolerantPalindrome = new IsTolerantPalindrome();

    @Test
    @DisplayName("`aba` is a palindrome")
    void shouldPalindrome1() {
        assertThat(isTolerantPalindrome.isTolerantPalindrome("aba")).isTrue();
    }

    @Test
    @DisplayName("`ab!a is a palindrome`")
    void shouldPalindrome2() {
        assertThat(isTolerantPalindrome.isTolerantPalindrome("ab!a")).isTrue();
    }

    @Test
    @DisplayName("`a!ba` is palindrome")
    void shouldPalindrome3() {
        assertThat(isTolerantPalindrome.isTolerantPalindrome("a!ba!a")).isTrue();
    }

    @Test
    @DisplayName("` aba` is a palindrome")
    void shouldPalindrome4() {
        assertThat(isTolerantPalindrome.isTolerantPalindrome(" aba")).isTrue();
    }

    @Test
    @DisplayName("`aa#!aa` is not a palindrome")
    void shouldPalindrome5() {
        assertThat(isTolerantPalindrome.isTolerantPalindrome("aa#!aa")).isFalse();
    }

    @Test
    @DisplayName("`greeting` is not a palindrome")
    void shouldPalindrome6() {
        assertThat(isTolerantPalindrome.isTolerantPalindrome("greeting")).isFalse();
    }

    @Test
    @DisplayName("`100000001` a palindrome")
    void shouldPalindrome7() {
        assertThat(isTolerantPalindrome.isTolerantPalindrome("100000001")).isTrue();
    }

    @Test
    @DisplayName("10A0000001 is a palindrome")
    void shouldPalindrome8() {
        assertThat(isTolerantPalindrome.isTolerantPalindrome("10A0000001")).isTrue();
    }

    @Test
    @DisplayName("`Fish hsif` is not a palindrome")
    void shouldPalindrome9() {
        assertThat(isTolerantPalindrome.isTolerantPalindrome("Fish hsif")).isFalse();
    }

    @Test
    @DisplayName("pennep a palindrome")
    void shouldPalindrome10() {
        assertThat(isTolerantPalindrome.isTolerantPalindrome("pennep")).isTrue();
    }

}
