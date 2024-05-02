package operator;

public class LogicalOperator {

    public static void main(String[] args) {
        /*
        Operator	Name	        Description	                                                Example
        && 	        Logical and	    Returns true if both statements are true	                x < 5 &&  x < 10
        || 	        Logical or	    Returns true if one of the statements is true	            x < 5 || x < 4
        !	        Logical not	    Reverse the result, returns false if the result is true	    !(x < 5 && x < 10)
         */
        int x = 5;

        System.out.println(x > 3 && x < 10);
        System.out.println(x > 3 || x < 4);
        System.out.println(!(x > 3 && x < 10));
    }
}
