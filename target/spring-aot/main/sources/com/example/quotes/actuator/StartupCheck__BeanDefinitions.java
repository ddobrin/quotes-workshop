package com.example.quotes.actuator;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link StartupCheck}.
 */
@Generated
public class StartupCheck__BeanDefinitions {
  /**
   * Get the bean definition for 'startupCheck'.
   */
  public static BeanDefinition getStartupCheckBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StartupCheck.class);
    beanDefinition.setInstanceSupplier(StartupCheck::new);
    return beanDefinition;
  }
}
