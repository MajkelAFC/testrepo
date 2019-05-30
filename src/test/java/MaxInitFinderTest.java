//Test-Driven-Development(TDD) najpierw programista pisze test, ktory nie powinien sie udac
//pozniej dopiero pisze fizyczny kod

// trzeba zrobic przynajmniej 2,3 testy aby byl on miarodajny i profesjonalny

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxInitFinderTest {

    @Test
    public void shouldFindBiggestIntegerInArray() {
        //given
        int[] givenInputArray = {1, 3, 5, 6, 7};
        int expectedBiggestNumber = 7;
        MaxInitFinder maxInitFinder = new MaxInitFinder();

        //when
        int actualNumber = maxInitFinder.findBiggestNumber(givenInputArray);

        //then
        Assert.assertEquals(expectedBiggestNumber, actualNumber);
    }

    @Test
    public void shouldFindBiggestNegativeIntegerInArray() {
        //given
        int[] givenInputArray = {-1, 2, -5, 6, -7};
        int expectedBiggestNumber = 6;
        MaxInitFinder maxInitFinder = new MaxInitFinder();

        //when
        int actualNumber = maxInitFinder.findBiggestNumber(givenInputArray);

        //then
//        Assert.assertEquals(expectedBiggestNumber, actualNumber);
        assertThat(actualNumber,is(expectedBiggestNumber));
    }

    @Test
    public void shouldFindBiggestNumberWhenArraysEmpty() {
        //given
        int[] givenInputArray = {};
        int expectedBiggestNumber = Integer.MIN_VALUE;
        MaxInitFinder maxInitFinder = new MaxInitFinder();

        //when
        int actualNumber = maxInitFinder.findBiggestNumber(givenInputArray);
        System.out.println(expectedBiggestNumber);

        //then
//        Assert.assertEquals(expectedBiggestNumber, actualNumber);

        //assert that jest bardziej czytelne, mozna odczytac to jako metode:
        // "UPEWNIJ SIE, ZE AKTUALNY NUMER JEST OCZEKIWANYM NAJWIEKSZYM NUMEREM".
        assertThat(actualNumber,is(expectedBiggestNumber));
    }
}
