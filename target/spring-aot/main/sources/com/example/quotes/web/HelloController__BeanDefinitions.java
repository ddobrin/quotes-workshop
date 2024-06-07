package com.example.quotes.web;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HelloController}.
 */
@Generated
public class HelloController__BeanDefinitions {
  /**
   * Get the bean definition for 'helloController'.
   */
  public static BeanDefinition getHelloControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HelloController.class);
    InstanceSupplier<HelloController> instanceSupplier = InstanceSupplier.using(HelloController::new);
    instanceSupplier = instanceSupplier.andThen(HelloController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
