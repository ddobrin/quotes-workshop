package com.example.quotes.web;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HelloController}.
 */
@Generated
public class HelloController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HelloController apply(RegisteredBean registeredBean, HelloController instance) {
    instance.target = AutowiredFieldValueResolver.forRequiredField("target").resolve(registeredBean);
    return instance;
  }
}
