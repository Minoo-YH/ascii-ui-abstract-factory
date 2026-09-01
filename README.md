# ASCII UI - Abstract Factory

This is a simple Java project to practice the Abstract Factory design pattern.

The program creates three types of UI elements:

- Button
- TextField
- Checkbox

There are two different styles, A and B. Each style has its own version of the UI elements.

## How it works

`UIFactory` is the abstract factory. It defines methods for creating buttons, text fields and checkboxes.

`AFactory` creates the Style A elements:

- ButtonA
- TextFieldA
- CheckboxA

`BFactory` creates the Style B elements:

- ButtonB
- TextFieldB
- CheckboxB

In the Main class, I can choose which factory I want to use. For example:

UIFactory factory = new AFactory();

If I change it to:

UIFactory factory = new BFactory();

the UI elements are created using Style B instead.

I also created a common `UIElement` class because all UI elements have text and need the `setText()` method. This makes it possible to change the text after an element has been created.

## Running the program

Run the `Main` class to see the ASCII UI elements in the console.