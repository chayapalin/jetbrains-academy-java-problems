// You are given a class named Application with one string field name.
//
// Implement an instance method run(String[] args) that takes an array of strings and returns nothing. The method should output the name of the application and then all arguments, each on a new line.
//
// Let's consider the example. Suppose name = "SimpleApplication" and passing argument is ["arg1", "arg2", "arg3"]
//
// Method's output is:
// SimpleApplication
// arg1
// arg2
// arg3

class Application {

    String name;

    void run(String[] args) {
        // implement me
        System.out.println(name);
        for (String var : args) {
            System.out.println(var);
        }
        /*
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        */
    }
}
