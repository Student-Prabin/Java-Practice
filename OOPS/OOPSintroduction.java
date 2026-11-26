/*
================================================================================
                              OOPs INTRODUCTION
================================================================================

1. Encapsulation
2. Abstraction
3. Inheritance
4. Polymorphism
5. Object ---------> The instance of a class that has a physical existence.
                     (Every object belongs to a class).
6. Class  ---------> The blueprint/template of an object (logical existence).

--------------------------------------------------------------------------------
                                   SYNTAX
--------------------------------------------------------------------------------

class ClassName {
    // List of properties (variables/fields)
    // List of behaviours (methods)
}

NOTES:
* Properties are always defined using data types.
* Behaviours are defined using methods.
* There are two ways to place the main() method:
    1) Inside the same class.
    2) Inside a separate class containing only the main() method [Preferable].

--------------------------------------------------------------------------------
                      1) MAKING A SEPARATE MAIN CLASS
--------------------------------------------------------------------------------

class C1 {
    // List of properties
    // List of behaviours
}

class ABC {
    public static void main(String[] args) {
        // Execution starts here
    }

    // List of properties
    // List of behaviours
}

================================================================================
                                   EXAMPLE
================================================================================


class Dog {
    // Properties (Instance Variables)
    String name, color, breed;
    int age, leg, ear; // Side Note: Default value of int is 0

    // Behaviours (Methods)
    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void sleep() {
        System.out.println("Dog is sleeping...");
    }

    public void bark() {
        System.out.println("Dog is barking...");
    }
}

class DogMain {
    public static void main(String... args) {
        // Object creation / initialization
        Dog d1 = new Dog();

        // Note: 'Dog' is a user-defined data type.
    }
}
*/