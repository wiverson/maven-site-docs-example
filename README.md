#maven-site-docs-example
This is a very simple Java project, intended to illustrate the use of a number of Maven plugins related to site documentation.

To use, simply check out and run:

``mvn clean verify site
``

If you only run mvn clean site, you will generate most of the reports, but not the code coverage data.
Code coverage requires the test suite to run (part of verify).

7/3/2019 - As of this writing, both Jacoco and Cobertura appear to be broken for JDK 12.  Hmm.
Updated to Java 12, Maven 3.6.1.  Made a few other changes.

## Requirements
- [Maven 3.6.1+](http://maven.apache.org/)
- Java 1.12+

