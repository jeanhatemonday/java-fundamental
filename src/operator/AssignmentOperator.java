package operator;

public class AssignmentOperator {

    public static void main(String[] args) {
        /*
        Operator	Example	    Same As
        =	        x = 5	    x = 5
        +=	        x += 3	    x = x + 3
        -=	        x -= 3	    x = x - 3
        *=	        x *= 3	    x = x * 3
        /=	        x /= 3	    x = x / 3
        %=	        x %= 3	    x = x % 3
        &=	        x &= 3	    x = x & 3
        |=	        x |= 3	    x = x | 3
        ^=	        x ^= 3	    x = x ^ 3
        >>=	        x >>= 3	    x = x >> 3
        <<=	        x <<= 3	    x = x << 3
         */
        int a, b, c, d, e, f, g, h, i, j;
        a = b = c = d = e = f = g = h = i = j = 5;

        System.out.println(a);

        a += 3;
        System.out.println(a);

        b -= 3;
        System.out.println(b);

        c *= 3;
        System.out.println(c);

        d /= 3;
        System.out.println(d);

        e %= 3;
        System.out.println(e);

        /*
        The binary representation of 5 is 101
        The binary representation of 3 is 011
        Performing a bitwise AND operation on these two values:
          101
        & 011
          ---
          001
        The result of the bitwise AND operation is 001, which is 1 in decimal
         */
        f &= 3;
        System.out.println(f);

        /*
        The binary representation of 5 is 101
        The binary representation of 3 is 011
        Performing a bitwise OR operation on these two values:
          101
        | 011
          ---
          111
        The result of the bitwise OR operation is 111, which is 7 in decimal
         */
        g |= 3;
        System.out.println(g);

        /*
        The binary representation of 5 is 101
        The binary representation of 3 is 011
        Performing a bitwise OR operation on these two values:
          101
        ^ 011
          ---
          110
        The result of the bitwise XOR operation is 110, which is 6 in decimal
         */
        h ^= 3;
        System.out.println(h);

        /*
        The binary representation of 5 is 101
        Performing a right shift operation on 5 by 3 positions:
          101 (5 in binary)
        >> 3
          ---
          000
        The result of the right shift operation is 000, which is 0 in decimal
         */
        i >>= 3;
        System.out.println(i);

        /*
        The binary representation of 5 is 101
        Performing a right shift operation on 5 by 3 positions:
          101 (5 in binary)
        << 3
          ---
          101000
        The result of the left shift operation is 101000, which is 40 in decimal
         */
        j <<= 3;
        System.out.println(j);
    }
}
