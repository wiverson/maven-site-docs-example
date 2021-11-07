# Maven Site Docs Example

This is a Java project showing how to set up Apache Maven to generate a wide array of useful reports. You can see
the generated reports for [this project here](https://wiverson.github.io/maven-site-docs-example/).

Some reports I use on every project include
the [code coverage report](https://wiverson.github.io/maven-site-docs-example/jacoco/index.html) and
the [automatic dependency checker](https://wiverson.github.io/maven-site-docs-example/dependency-updates-report.html) -
it's very nice to see what dependencies are out of date!

Included reports:

- Dependencies. Find out if any of your code or plugin dependencies are out of date.
- Change log & SCM change info. Pull GitHub info and show what's changed.
- Issues. Show open issues in GitHub.
- Source x-ref. Clickable version of source code (prod & test).
- Tag list. Find all of TODOs in your code.
- JDepend. Various quality metrics.
- JavaNCSS. Various code metrics for complexity, etc.
- CPD. Find copy/pasted code in the repo.
- PMD. Finds bugs & bad code.
- Surefire. Test report, including execution times.
- Checkstyle. Check for coding style issues.
- JaCoCo. Code coverage reporting - how much code are your tests actually hitting?
- SpotBugs. Static code analysis to find bugs.


This [project includes a GitHub Action](https://github.com/wiverson/maven-site-docs-example/blob/main/.github/workflows/maven-package.yml)
which automatically publishes the [generated documentation](https://wiverson.github.io/maven-site-docs-example/) to
GitHub Pages.

To use, simply check out and run:

``mvn clean verify site
``

To view the generated reports locally, open ./target/site/index.html in your browser.

If you only run mvn clean site, you will generate most of the reports, but not the code coverage data. Code coverage
requires the test suite to run (part of verify).

11/6/2021 - Updated to Java 17. Added GitHub Action to automatically publish to GitHub Pages.

5/21/2021 - Version bumps. Bumped to Java 16. Added a bunch of reports back in, including JaCoCo.

10/20/2020 - Misc version bumps. Moved to Java 11 LTS.

7/3/2019 - As of this writing, both Jacoco and Cobertura appear to be broken for JDK 12. Hmm. Updated to Java 12, Maven
3.6.1. Made a few other changes.

## Requirements

- [Maven 3.8.3+](http://maven.apache.org/)
- As configured, targets Java 17.

## Further Reading

You may find [SchemaSpy](http://schemaspy.org) to be helpful if you work with RDMBS packages such as MySQL, PostgreSQL,
etc. SchemaSpy can be set up to generate great looking visual, clickable HTML reports documenting a schema directly from
an RDBMS. Very helpful to ensure that your schema documentation is current at all times.

## Tip

This error on macOS?

``
[ERROR] xcrun: error: invalid active developer path (/Library/Developer/CommandLineTools), 
missing xcrun at: /Library/Developer/CommandLineTools/usr/bin/xcrun
``

Install/update XCode.
