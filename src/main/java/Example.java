/**
 * For this project, your job is to implement five methods as defined below.
 */
public class Example {

    /**
     * Create a method as described here:
     * - named "not"
     * - accepts a single boolean argument
     * - returns a boolean value
     *
     * This method returns the opposite of the value of the argument. EG: if the
     * method receives true for its argument, it will return false.
     */
    // todo: write not() method
    public boolean not(boolean x){
        return !x;
    }

    /**
     * Create a method as described:
     * - named "doublePlusOne"
     * - accepts one integer argument
     * - returns an integer value
     *
     * This method should double the provided argument and add one to it. The
     * resulting value is returned. EG: if the argument is 5, this method
     * returns 11.
     */
    // todo: write doublePlusOne() method
    public int doublePlusOne(int x){
        return x * 2 + 1;
    }

    /**
     * Create a method as described:
     * - named "averageTwoNumbers"
     * - accepts two double arguments
     * - returns a double value
     *
     * This method returns the average of the two arguments. EG: 8.1 and 9.9 are
     * averaged to 9.
     */
    // todo: write averageTwoNumbers() method
    public double averageTwoNumbers(double x, double y){
        return (x + y)/2;
    }


    /**
     * Create a method as described:
     * - named "getGreeting"
     * - accepts a single String argument
     * - returns a String value
     *
     * This method should return a string that reads "Hello, {argument value}!",
     * where {argument value} is a placeholder for the String argument provided.
     * For example if the String argument is "Tracy", this method should return
     * "Hello, Tracy!".
     */
    // todo: write getGreeting() method
    public String getGreeting(String name){
        return "Hello, " + name + "!";
    }

    /**
     * Create a method as described:
     * - named "sayHello"
     * - accepts a single String argument
     * - returns nothing
     *
     * This method should print out the greeting generated by the getGreeting()
     * method. To be clear, this method must invoke the getGreeting() method and
     * print the resulting string to the console. EG: If the String argument is
     * "Tracy", this method should print out "Hello, Tracy!".
     */
    // todo: write sayHello() method
    public void sayHello(String name){
        System.out.println(getGreeting(name));
    }
}
