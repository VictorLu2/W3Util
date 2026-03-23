package com.victor.utilities.Classes.Enums;

enum ExampleOfEnums {
    LOW,
    MEDIUM,
    HIGH
}
/*
An enum cannot be used to create objects,
and it cannot extend other classes (but it can implement interfaces).

Syntactic sugar(Conceptual model)

public final class ExampleOfEnums extends Enum<ExampleOfEnums> {

    // enum constants (其實是 public static final instance fields)
    public static final ExampleOfEnums LOW = new ExampleOfEnums("LOW", 0);
    public static final ExampleOfEnums MEDIUM = new ExampleOfEnums("MEDIUM", 1);
    public static final ExampleOfEnums HIGH = new ExampleOfEnums("HIGH", 2);

    private static final ExampleOfEnums[] $VALUES = {
            LOW,
            MEDIUM,
            HIGH
    };

    private ExampleOfEnums(String name, int ordinal) {
        super(name, ordinal);
    }

    public static ExampleOfEnums[] values() {
        return $VALUES.clone();
    }

    public static ExampleOfEnums valueOf(String name) {
        return Enum.valueOf(ExampleOfEnums.class, name);
    }
}

*/