package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        if (a || b){
            System.out.println("a or b is true");// It evaluates a first, if a is true it doesn't evaluate b

        }

        if (a & b){
            System.out.println("Both a and b are true");
        }
        if (a && b){
            System.out.println("Both a and b are true"); // It evaluates a first, if a is false it doesn't evaluate b
        }

        if (a ^ b){
            System.out.println("Either a is true or b is true, they can't be both true");
        }

        if (!a){
            System.out.println("a is false");
        }

    }

}

