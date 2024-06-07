package com.example.quotes.web;

import com.example.quotes.domain.QuoteService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link QuoteController}.
 */
@Generated
public class QuoteController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'quoteController'.
   */
  private static BeanInstanceSupplier<QuoteController> getQuoteControllerInstanceSupplier() {
    return BeanInstanceSupplier.<QuoteController>forConstructor(QuoteService.class)
            .withGenerator((registeredBean, args) -> new QuoteController(args.get(0)));
  }

  /**
   * Get the bean definition for 'quoteController'.
   */
  public static BeanDefinition getQuoteControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(QuoteController.class);
    beanDefinition.setInitMethodNames("init");
    beanDefinition.setInstanceSupplier(getQuoteControllerInstanceSupplier());
    return beanDefinition;
  }
}
