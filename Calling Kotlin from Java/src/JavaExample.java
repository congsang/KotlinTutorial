import demo.Calculation;
import demo.Person;

public class JavaExample {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Person person = new Person("Nguyen", "CongSang", 18);
        System.out.println("Person details. Firstname: "
                + person.getFirstName() + "Lastname: "
                + person.getLastName() + "Age: "
                + person.getAge());

        System.out.println("Creditcard number is: " + person.creditCardNumber);

        //companion object(Kotlin) => static field(Java)
        System.out.println("PI number is: " + Calculation.PI);

        //const
        System.out.println("VERSION = " + Calculation.VERSION);

        //lateinit
        (new Calculation()).aRandomString = "abc";

        //static function
        Calculation.aStaticFunction();
        Calculation.Companion.aStaticFunction();//the same
    }
}
