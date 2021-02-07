package string.ispalindrome.tolerant;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsTolerantPalindromeSolution {

    public Boolean isTolerantPalindrome(String str) {

        boolean characterRemoved = false;

        char[] chars = str.toCharArray();

        for (int index = 0; index < str.length(); index++) {
            int lastIndex = str.length() - 1 - index;
            if (characterRemoved) {//true
                lastIndex--;
            }

            if (index >= lastIndex) {
                return true;
            }

            if (chars[index] != chars[lastIndex]) {
                //check if we have used our one tolerance
                if (characterRemoved) {
                    return false;
                } else {
                    characterRemoved = true;
                }

            }

        }

        return false;
    }

    public Boolean isTolerantPalindromeRecursive(String str) {
        return isTolerantPalindromeRecursive(str, false);
    }

    //recursive solution
    private Boolean isTolerantPalindromeRecursive(String str, Boolean characterRemoved) {

        if (str.isEmpty() || str.length() == 1) {
            return true;
        }

        char[] charArray = str.toCharArray();

        int lastIndex = charArray.length - 1;
        if (charArray[0] == charArray[lastIndex]) {
           return isTolerantPalindromeRecursive(
                    str.substring(1, lastIndex),
                    false
            );
        } else {
            if (characterRemoved) {
                return false;
            } else {
                if (str.length() == 2) {
                    return true;
                }
                System.out.println(str);

                boolean removeLeftResult = isTolerantPalindromeRecursive(
                        str.substring(2, lastIndex),
                        true
                );
                boolean removeRightResult = isTolerantPalindromeRecursive(
                        str.substring(1, lastIndex - 1),
                        true
                );
                return removeLeftResult || removeRightResult;
            }
        }

    }

}

class IsTolerantPalindromeSolutionTest {

    IsTolerantPalindromeSolution palindrome = new IsTolerantPalindromeSolution();

    @Test
    @DisplayName("`aba` is a palindrome")
    void shouldPalindrome1() {
        assertThat(palindrome.isTolerantPalindrome("aba")).isTrue();
        assertThat(palindrome.isTolerantPalindromeRecursive("aba")).isTrue();
    }

    @Test
    @DisplayName("`ab!a is a palindrome`")
    void shouldPalindrome2() {
        assertThat(palindrome.isTolerantPalindrome("ab!a")).isTrue();
        assertThat(palindrome.isTolerantPalindromeRecursive("ab!a")).isTrue();
    }

    @Test
    @DisplayName("`a!ba` is palindrome")
    void shouldPalindrome3() {
        assertThat(palindrome.isTolerantPalindrome("a!ba!a")).isTrue();
        assertThat(palindrome.isTolerantPalindromeRecursive("a!ba!a")).isTrue();
    }

    @Test
    @DisplayName("` aba` is a palindrome")
    void shouldPalindrome4() {
        assertThat(palindrome.isTolerantPalindrome(" aba")).isTrue();
        assertThat(palindrome.isTolerantPalindromeRecursive(" aba")).isTrue();
    }

    @Test
    @DisplayName("`aa#!aa ` is not a palindrome")
    void shouldPalindrome5() {
        assertThat(palindrome.isTolerantPalindrome("aa#!aa ")).isFalse();
        assertThat(palindrome.isTolerantPalindromeRecursive("aa#!aa ")).isFalse();
    }

    @Test
    @DisplayName("`greeting` is not a palindrome")
    void shouldPalindrome6() {
        assertThat(palindrome.isTolerantPalindrome("greeting")).isFalse();
        assertThat(palindrome.isTolerantPalindromeRecursive("greeting")).isFalse();
    }

    @Test
    @DisplayName("`100000001` a palindrome")
    void shouldPalindrome7() {
        assertThat(palindrome.isTolerantPalindrome("100000001")).isTrue();
        assertThat(palindrome.isTolerantPalindromeRecursive("100000001")).isTrue();
    }

    @Test
    @DisplayName("10A0000001 is a palindrome")
    void shouldPalindrome8() {
        assertThat(palindrome.isTolerantPalindrome("10A0000001")).isTrue();
        assertThat(palindrome.isTolerantPalindromeRecursive("10A0000001")).isTrue();
    }

    @Test
    @DisplayName("`Fish hsif` is not a palindrome")
    void shouldPalindrome9() {
        assertThat(palindrome.isTolerantPalindrome("Fish hsif")).isFalse();
        assertThat(palindrome.isTolerantPalindromeRecursive("Fish hsif")).isFalse();
    }

    @Test
    @DisplayName("pennep a palindrome")
    void shouldPalindrome10() {
        assertThat(palindrome.isTolerantPalindrome("pennep")).isTrue();
        assertThat(palindrome.isTolerantPalindromeRecursive("pennep")).isTrue();
    }

}

