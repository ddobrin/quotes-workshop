package com.example.quotes.actuator;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HealthCheck}.
 */
@Generated
public class HealthCheck__BeanDefinitions {
  /**
   * Get the bean definition for 'customHealthCheck'.
   */
  public static BeanDefinition getCustomHealthCheckBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HealthCheck.class);
    beanDefinition.setInstanceSupplier(HealthCheck::new);
    return beanDefinition;
  }
}
