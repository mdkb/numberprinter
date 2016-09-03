package org.matt.sandbox;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by matt on 22/04/16.
 */
public class RomanNumeralPrinterTest {


    private void test(int number, String expected) throws Exception {
        NumberPrinter printer = new RomanNumeralPrinter();
        String result = printer.print(number);
        assertEquals(expected, result);
        System.out.println(number + ":" + result);

    }

    @Test(expected = Exception.class)
    public void testZero() throws Exception {
        test(0, "zero");

    }

    @Test
    public void testSimple() throws Exception {
        test(1, "I");
        test(2, "II");
        test(3, "III");
        test(4, "IV");
        test(5, "V");
        test(6, "VI");
        test(7, "VII");
        test(8, "VIII");
        test(9, "IX");
    }


    @Test
    public void testTeens() throws Exception {
        test(10, "X");
        test(11, "XI");
        test(12, "XII");
        test(13, "XIII");
        test(14, "XIV");
        test(15, "XV");
        test(16, "XVI");
        test(17, "XVII");
        test(18, "XVIII");
        test(19, "XIX");
    }


    @Test
    public void testTens() throws Exception {

        test(20, "XX");
        test(21, "XXI");
        test(22, "XXII");
        test(29, "XXIX");

        test(30, "XXX");
        test(31, "XXXI");
        test(33, "XXXIII");
        test(39, "XXXIX");

        test(40, "XL");
        test(41, "XLI");
        test(44, "XLIV");
        test(49, "XLIX");


        test(50, "L");
        test(51, "LI");
        test(55, "LV");
        test(59, "LIX");


        test(60, "LX");
        test(61, "LXI");
        test(66, "LXVI");
        test(69, "LXIX");


        test(70, "LXX");
        test(71, "LXXI");
        test(77, "LXXVII");
        test(79, "LXXIX");


        test(80, "LXXX");
        test(81, "LXXXI");
        test(88, "LXXXVIII");
        test(89, "LXXXIX");

        test(90, "XC");
        test(91, "XCI");
        test(99, "XCIX");

    }

    @Test
    public void testHundreds() throws Exception {
        test(100, "C");
        test(101, "CI");
        test(103, "CIII");
        test(104, "CIV");
        test(105, "CV");
        test(106, "CVI");
        test(109, "CIX");

        test(110, "CX");
        test(140, "CXL");
        test(150, "CL");
        test(174, "CLXXIV");
        test(190, "CXC");
        test(197, "CXCVII");
        test(199, "CXCIX");


        test(200, "CC");
        test(201, "CCI");
        test(210, "CCX");
        test(210, "CCX");
        test(277, "CCLXXVII");
        test(291, "CCXCI");


        test(300, "CCC");
        test(364, "CCCLXIV");

        test(400, "CD");

        test(500, "D");

        test(501, "DI");
        test(517, "DXVII");
        test(550, "DL");
        test(585, "DLXXXV");

        test(606, "DCVI");

        test(751, "DCCLI");

        test(800, "DCCC");

        test(900, "CM");
        test(901, "CMI");
        test(990, "CMXC");
        test(999, "CMXCIX");

    }



    @Test
    public void testThousands() throws Exception {
        test(1000, "M");
        test(1001, "MI");

        test(2000, "MM");
        test(3000, "MMM");
        test(3999, "MMMCMXCIX");


    }


    @Test(expected = Exception.class)
    public void testOutOfRange() throws Exception {
        test(4000, "");
    }
    @Test(expected = Exception.class)
    public void testWayOutOfRange() throws Exception {
        test(100001, "");
    }
}
