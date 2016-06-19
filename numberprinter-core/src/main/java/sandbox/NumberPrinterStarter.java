package sandbox;

/**
 * Created by matt on 25/04/16.
 */
public class NumberPrinterStarter {

    public static void main(String [] args) throws Exception{
        if (args.length < 2) {
            System.out.println("usage: NumberPrinterStarter <number>  <Word|Roman>");
            return;
        }

        int value = Integer.valueOf(args[0]);
        switch (args[1].toUpperCase()) {
            case "WORD":
                System.out.println(value + ":" + new WordNumberPrinter().print(value));
                break;

            case "ROMAN":
                System.out.println(value + ":" + new RomanNumeralPrinter().print(value));
                break;

            default:
                System.out.println("unknown printer: " + args[1]);
                break;

        }

    }
}
