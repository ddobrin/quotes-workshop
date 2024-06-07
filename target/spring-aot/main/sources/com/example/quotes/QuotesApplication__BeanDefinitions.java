package com.example.quotes;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link QuotesApplication}.
 */
@Generated
public class QuotesApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'quotesApplication'.
   */
  public static BeanDefinition getQuotesApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(QuotesApplication.class);
    beanDefinition.setTargetType(QuotesApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(QuotesApplication.class);
    beanDefinition.setInstanceSupplier(QuotesApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
