/*
 * Copyright (C) 2009-2014 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */
package lk.ac.mrt.cse.padss;

import org.sonar.api.SonarPlugin;

import java.util.Arrays;
import java.util.List;

/**
 * Entry point of plugin
 */
public class MyJavaRulesPlugin extends SonarPlugin {

  @Override
  public List getExtensions() {
    return Arrays.asList(
      // server extensions -> objects are instantiated during server startup
      MyJavaRulesDefinition.class,

      // batch extensions -> objects are instantiated during code analysis
      MyJavaFileCheckRegistrar.class);
  }

}
