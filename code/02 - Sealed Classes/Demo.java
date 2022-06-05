// Sealed classes are part of Project Amber, and this JEP officially
// introduces a new feature to the language, although it was
// available in preview mode in the JDK versions 15 and 16.

// The feature restricts which other classes or interfaces may
// extend or implement a sealed component. Showing another
// improvement related to pattern matching combined with the
// JEP 406 will allow a more sophisticated and cleaner inspection of
// the type, cast and act code pattern.

// Problem
// Java provides two access levels: public and the default
// (package-private) if no modifier is specified. If a class has the
// public access modifier, it is accessible anywhere the class
// package is accessible and extensible by any class. If a class
// has the package-private access level (default if no access modifier),
// it is accessible and extensible only within the package the class
// is declared in. Java does not provide any fine-grained access control.

// Solution
// Java 17 introduces sealed classes for fine-grained extensibility.
// Sealed classes in Java 17 is a new feature and not a “preview”
// feature. A class is declared sealed using the modifier sealed.
// The classes that are allowed to extend a sealed class are declared
// with the modifier permits. The sealed and permits are not keywords
// but identifiers. Sealed and permits are restricted identifiers
// as these are usable only in limited contexts. A class that extends
// a sealed class must have been declared in the permits list.
// A class that extends a sealed class must use one of the three
// modifiers: sealed, non-sealed, and final. The non-sealed modifier
// is a new keyword—in fact the only hyphenated keyword. Sealed classes
// may be used with record classes. Pattern matching for switch
// statements may include sealed classes.

// Let's see it in action:

public sealed class Shape permits Circle, Square, Rectangle, WeirdShape { ... }

public sealed class Rectangle extends Shape permits TranspRectangle, FilledRectangle { ... }

