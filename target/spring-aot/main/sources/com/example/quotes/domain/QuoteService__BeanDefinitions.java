package com.example.quotes.domain;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link QuoteService}.
 */
@Generated
public class QuoteService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'quoteService'.
   */
  private static BeanInstanceSupplier<QuoteService> getQuoteServiceInstanceSupplier() {
    return BeanInstanceSupplier.<QuoteService>forConstructor(QuoteRepository.class)
            .withGenerator((registeredBean, args) -> new QuoteService(args.get(0)));
  }

  /**
   * Get the bean definition for 'quoteService'.
   */
  public static BeanDefinition getQuoteServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(QuoteService.class);
    beanDefinition.setInstanceSupplier(getQuoteServiceInstanceSupplier());
    return beanDefinition;
  }
}
