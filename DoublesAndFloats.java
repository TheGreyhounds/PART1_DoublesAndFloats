public class DoublesAndFloats {
    public static void main(String[] args) {
        // 64 bits wide
        double pi, e;
        pi = 3.14159265;
        e = 2.71828;
        
        // 32 bits wide
        float floatPi, floatE;
        floatPi = 3.14159265f;
        floatE = 2.71828f;
        // ^^ Notice we have to use the 'f' character
        // as a suffix when we use float values. Without it,
        // Java type-promotes the float to a double.
        System.out.println("Doubles: pi " + pi + " and e " + e + ". Floats: pi " + floatPi + " and e " + floatE);
        
        double twoPi = pi*2;
        float floatTwoPi = floatPi*2;
        
        double hugeNumber = 6.4217e250;
        // To denote our number in scientific notation,
        // we just have to use the 'e' character for the exponent.
        
        //float hugeNumber = 6.4217e250f;
        
        /*
        The reason this is commented out is that our number is outside of the
        bounds of a float - it's too big. Try writing the line without the comment
        and watch it fail to compile!
        */
        
        System.out.println("Pi x 2 = " + floatTwoPi + ". Our huge number: " + hugeNumber);
        
        // Math works just the same with floating point numbers as it does with integers!
        
        double myBankAccount = 1400.51;
        double withdrawl = 160;
        System.out.print("Before my withdrawl, my bank account had $" + myBankAccount);
        myBankAccount -= withdrawl;
        System.out.println(", but after, I only had $" + myBankAccount);
        
        double deposit = 256.18;
        myBankAccount += deposit;
        System.out.println("Luckily, I just got paid today, so now I have $" + myBankAccount);
    }
}