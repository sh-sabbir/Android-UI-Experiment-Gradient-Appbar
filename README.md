# Android-UI-Experiment-Gradient-Appbar
Experimenting with dynamic Appbar themeing. Color, gradient or custom nav toggole.

Very easy to understand and modify. All you have to do is to check the code.

## What you will learn?
* How to set or change AppBar layout background dynamically with fallback.
* How to set or change Navbar toggole to custom drawable.

Feel free to ask if you have question. Chao!


### How to modify the source

To change appbar background

```
AppBarLayout barLayout = (AppBarLayout) this.findViewById(R.id.app_bar);
barLayout.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.gradient_app_bar_back_1, null));
```

To change navbar toggle we have to just one thing

```
getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_nav_toggole);
```

## Example App

Download and install the [example app](app-debug.apk) to check the final outcome.


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
