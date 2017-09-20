# PART1_DoublesAndFloats
Integers are great, but the world's not just filled with counting numbers. Introducing: Floating Point Numbers.

Anytime you write down or type a number with a decimal point, you're writing a floating point number. The name
comes from the fact that you can change where you put the decimal point - say, for the number 4.25, moving the decimal
to the right one to make it 42.5 - to make the number an order of magnitude larger or smaller, but the values in the
number itself aren't actually changing; they're floating point numbers.

This principal is carried into how floating point numbers are stored in computer memory. The two data types that
can store numbers with decimal points in Java are:
- Float: 32 bits wide
- Double: 64 bits wide

In memory, they are encoded as such:

- Float: 1 sign bit, 8 exponent bits, and 23 significand bits (the significant figures in scientific notation base 2)
- Double: 1 sign bit 11 exponent bits, and 52 significand bits (the significant figures in scientific notation base 2)

We know this is correct because 1 + 8 + 23 = 32 bits and 1 + 11 + 52 = 64 bits.

If we had a double value of -256, for instance, we'd have a value of 1 in the sign bit, a value of 8 in the exponent
bits, and a value of 1 in the exponent bits. This is because doubles and floats are stored in base two, so while normal
scientific notation would denote -256 as -2.56 * 10^2, Java stores -256 as -1 * 2^8.

You don't have to memorize the technicals of how doubles and floats are stored, but it's helpful to understand how the
max range values of both doubles and floats are calculated.

Your key takeaway from this code snippet is knowing how to store and manipulate floating point numbers in Java, and how
using floating point numbers is almost identical to using integer literals. Remember also that floats must end with the 
'f' character to be stored as a float, otherwise, Java will automatically type promote your float variable to a double.
You should also recognize that, similar to how byte and short relate to int, while float takes up less memory, it is not 
any less efficient to use double, and so most often programmers default to using double for its far greater precision. 
Unlike byte and short however, you will find that in parts of the Java Standard Library, like when setting alpha values 
of GUI components, they use floats.