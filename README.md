# maven-site-docs-example

This is a very simple Java project, intended to illustrate the use of a number of Maven plugins related to site
documentation.

To use, simply check out and run:

``mvn clean verify site
``

To view the generated reports, open ./target/site/index.html in your browser.

If you only run mvn clean site, you will generate most of the reports, but not the code coverage data. Code coverage
requires the test suite to run (part of verify).

5/21/2021 - Version bumps. Bumped to Java 16. Added a bunch of reports back in, including JaCoCo.

10/20/2020 - Misc version bumps. Moved to Java 11 LTS.

7/3/2019 - As of this writing, both Jacoco and Cobertura appear to be broken for JDK 12. Hmm. Updated to Java 12, Maven
3.6.1. Made a few other changes.

## Requirements

- [Maven 3.6.1+](http://maven.apache.org/)
- As configured, targets Java 16.

## Features

Illustrates an example of how to configure following reports:

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

## Further Reading

Want to publish your reports to GitHub? Check
out [this article](http://www.lorenzobettini.it/2020/01/publishing-a-maven-site-to-github-pages/) for an example of how
to do that.

Combine that
with [GitHub Actions to run Maven projects](https://docs.github.com/en/actions/guides/building-and-testing-java-with-maven)
and you have a pretty nice CI pipeline.

You may also find [SchemaSpy](http://schemaspy.org) to be helpful as well. It can be set up to generate
great looking visual, clickable HTML reports documenting a schema directly from an RDBMS. Very helpful
to ensure that your schema documentation is current at all times.
