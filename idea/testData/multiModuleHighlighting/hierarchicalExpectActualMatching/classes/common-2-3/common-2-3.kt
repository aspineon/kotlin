package sample

expect class Case9<T>

expect class Case10<T> : Iterable<T> {
    override fun iterator(): Nothing
}

expect class Case11<T> : Iterable<T> {
    override fun iterator(): Nothing
}

expect <!EXPERIMENTAL_FEATURE_WARNING("The feature "inline classes" is experimental")!>inline<!> class Case12<T>(val x: Int): Comparable<T>

// UNEXPECTED BEHAVIOUR: KT-31498
expect class Case13<!NO_ACTUAL_FOR_EXPECT("class 'Case13'", "js for JS", " The following declaration is incompatible because upper bounds of type parameters are different:     public final actual class Case13<T : Number> "), NO_ACTUAL_FOR_EXPECT("class 'Case13'", "native for Native", " The following declaration is incompatible because upper bounds of type parameters are different:     public final actual class Case13<T : Number> ")!><T : <!FINAL_UPPER_BOUND("Int")!>Int<!>><!>() {
    inner class Foo<K : T> {}
}