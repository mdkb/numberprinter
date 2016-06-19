package sandbox;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by matt on 20/04/16.
 */
public class WordNumberPrinterTest {



    private void test(int number, String expected) throws Exception {
        NumberPrinter printer = new WordNumberPrinter();
        String result = printer.print(number);
        assertEquals(expected, result);
        System.out.println(number + ":" + result);

    }


    @Test
    public void testSimple() throws Exception {
        test(0, "zero");
        test(1, "one");
        test(2, "two");
        test(3, "three");
        test(4, "four");
        test(5, "five");
        test(6, "six");
        test(7, "seven");
        test(8, "eight");
        test(9, "nine");
    }


    @Test
    public void testTeens() throws Exception {
        test(10, "ten");
        test(11, "eleven");
        test(12, "twelve");
        test(13, "thirteen");
        test(14, "fourteen");
        test(15, "fifteen");
        test(16, "sixteen");
        test(17, "seventeen");
        test(18, "eighteen");
        test(19, "nineteen");
    }



    @Test
    public void testTens() throws Exception {

        test(20, "twenty");
        test(21, "twenty-one");
        test(22, "twenty-two");
        test(29, "twenty-nine");

        test(30, "thirty");
        test(31, "thirty-one");
        test(33, "thirty-three");
        test(39, "thirty-nine");

        test(40, "forty");
        test(41, "forty-one");
        test(44, "forty-four");
        test(49, "forty-nine");


        test(50, "fifty");
        test(51, "fifty-one");
        test(55, "fifty-five");
        test(59, "fifty-nine");


        test(60, "sixty");
        test(61, "sixty-one");
        test(66, "sixty-six");
        test(69, "sixty-nine");


        test(70, "seventy");
        test(71, "seventy-one");
        test(77, "seventy-seven");
        test(79, "seventy-nine");


        test(80, "eighty");
        test(81, "eighty-one");
        test(88, "eighty-eight");
        test(89, "eighty-nine");

        test(90, "ninety");
        test(91, "ninety-one");
        test(99, "ninety-nine");

    }



    @Test
    public void testHundreds() throws Exception {
        test(100, "one hundred");
        test(101, "one hundred one");
        test(110, "one hundred ten");


        test(200, "two hundred");
        test(201, "two hundred one");
        test(210, "two hundred ten");


        test(300, "three hundred");
        test(301, "three hundred one");
        test(303, "three hundred three");
        test(364, "three hundred sixty-four");

        test(500, "five hundred");
        test(501, "five hundred one");
        test(517, "five hundred seventeen");
        test(550, "five hundred fifty");
        test(585, "five hundred eighty-five");

        test(900, "nine hundred");
        test(901, "nine hundred one");
        test(990, "nine hundred ninety");
        test(999, "nine hundred ninety-nine");
    }

    @Test
    public void testThousands() throws Exception {
        test(1000, "one thousand");
        test(1001, "one thousand one");
        test(1010, "one thousand ten");
        test(1011, "one thousand eleven");
        test(1020, "one thousand twenty");
        test(1021, "one thousand twenty-one");
        test(1057, "one thousand fifty-seven");
        test(1099, "one thousand ninety-nine");
        test(1100, "one thousand one hundred");
        test(1101, "one thousand one hundred one");
        test(1111, "one thousand one hundred eleven");
        test(1199, "one thousand one hundred ninety-nine");
        test(1200, "one thousand two hundred");
        test(1500, "one thousand five hundred");
        test(1555, "one thousand five hundred fifty-five");
        test(1767, "one thousand seven hundred sixty-seven");
        test(1999, "one thousand nine hundred ninety-nine");
        test(2000, "two thousand");
        test(5346, "five thousand three hundred forty-six");
        test(9999, "nine thousand nine hundred ninety-nine");
    }


    @Test
    public void testTenThousands() throws Exception {
        test(10000, "ten thousand");
        test(99000, "ninety-nine thousand");
        test(99999, "ninety-nine thousand nine hundred ninety-nine");

    }

    @Test
    public void testHundredThousands() throws Exception {
        test(100000, "one hundred thousand");
        test(999999, "nine hundred ninety-nine thousand nine hundred ninety-nine");

    }

    @Test(expected = Exception.class)
    public void testNegative() throws Exception {
        test(-1,"");
    }

    @Test(expected = Exception.class)
    public void testOutOfRange() throws Exception {
        test(1000000,"");
    }
}
