This code is an implementation of the code presented on
https://riptutorial.com/swing/example/14137/simple-mvp-example#example

This branch is an attempt to refactor the same code to instead use the MVC pattern.

Question: Is this currently consistent with Clean Architecture? Why or why not?

Answer: Currently the `Model` depends on the `View` directly! If we wanted to make this
more consistent with Clean Architecture, we would probably want to have some kind of `Presenter` again, so
the `Model` would use an interface for the `Presenter`, which would use an interface for the `View`!