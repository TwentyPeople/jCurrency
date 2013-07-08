# Currency Converter

This is a very simple currency converter made with Java.
Made by Alexander Sky, under the authority of TwentyPeople Europe.

## License and Distribution

This program is distributed by TwentyPeople International, and can be freely used, modified and shared. More information about the license: [TwentyPeople Open License](http://twentypeopleinternational.blogspot.com.es/p/our-licenses.html#tpol).

The files available are:

* a JAR file, ready for the usage (see below).
* a Java file, under the src folder, with the source code.

## Usage

The usage of this program, in its JAR form, is:

    $ java -jar Currency.jar <amount> <original currency> <conversion currency>

For example, if you want to convert 30 Euros to Dollars, you'll use:

    $ java -jar Currency.jar 30 EUR USD

## Expansion

If you want to add more currencies to the program:

* Add the value of ONE DOLLAR converted to your divise in the `MoneyType` enum: `CODE(value)`.

## Available currencies

In the last version of Currency (v0.2), there are the following currencies available:

* USD
* EUR
* RMB
* GBP
* CAD
* AUD
* JPY
