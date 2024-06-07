package org.springframework.boot.actuate.autoconfigure.flyway;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.flyway.FlywayEndpoint;
import org.springframework.context.ApplicationContext;

/**
 * Bean definitions for {@link FlywayEndpointAutoConfiguration}.
 */
@Generated
public class FlywayEndpointAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'flywayEndpointAutoConfiguration'.
   */
  public static BeanDefinition getFlywayEndpointAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FlywayEndpointAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(FlywayEndpointAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'flywayEndpoint'.
   */
  private static BeanInstanceSupplier<FlywayEndpoint> getFlywayEndpointInstanceSupplier() {
    return BeanInstanceSupplier.<FlywayEndpoint>forFactoryMethod(FlywayEndpointAutoConfiguration.class, "flywayEndpoint", ApplicationContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(FlywayEndpointAutoConfiguration.class).flywayEndpoint(args.get(0)));
  }

  /**
   * Get the bean definition for 'flywayEndpoint'.
   */
  public static BeanDefinition getFlywayEndpointBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FlywayEndpoint.class);
    beanDefinition.setInstanceSupplier(getFlywayEndpointInstanceSupplier());
    return beanDefinition;
  }
}
