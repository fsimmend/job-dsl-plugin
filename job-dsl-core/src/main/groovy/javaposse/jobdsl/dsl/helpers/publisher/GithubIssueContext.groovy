package javaposse.jobdsl.dsl.helpers.publisher;

import javaposse.jobdsl.dsl.Context;

public class GithubIssueContext implements Context {

  String project;
  String title;
  String label;
  String text;
  boolean append;
  boolean reopen;
  /**
   * Sets the GitHub project on which the issues should be created. If not set, the GitHub project
   * configured for the GitHub plugin is being used.
   * @param project
   */
  void project(String project) {
    this.project = project;
  }

  /**
   * Sets the title of the issue
   * @param title
   */
  void title(String title) {
    this.title = title;
  }

  /**
   * Sets the label(s) for the issue. Multiple labels can be space or commata separated.
   * @param label
   */
  void label(String label) {
    this.label = label;
  }

  /**
   * Sets the issue text or comment.
   * @param text
   */
  void text(String text) {
    this.text = text;
  }

  /**
   * Append the fail message to the issue if issue is open
   * @param append
   */
  void append(boolean append = false) {
    this.append = append;
  }

  /**
   * Reopen the issue or create a new one
   * @param reopen
   */
  void reopen(boolean reopen = false) {
    this.reopen = reopen;
  }
}
