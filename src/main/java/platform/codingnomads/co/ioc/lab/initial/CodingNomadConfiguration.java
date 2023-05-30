package platform.codingnomads.co.ioc.lab.initial;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import platform.codingnomads.co.corespring.examples.application_context.frameworkevents.FrameworkEventListenerDemo;

@Configuration
@ComponentScan("platform.codingnomads.co.ioc.lab.initial")
public class CodingNomadConfiguration {


    @Bean
    public Framework framework() {
        return Framework.builder().name("Spring").version("2.5").build();
    }

    @Bean
    public IDE ide() {
        return IDE.builder().name("IntelliJ IDEA").version("2021.1").build();

    }

    @Bean
    public JDK jdk() {
        return JDK.builder().name("openJDK").version("11").build();
    }

    @Bean
    public Computer computer() {
        return Computer.builder().name("ThinkPad").version("Xtereme14").build();

    }

    @Bean
    public OS os() {
        return OS.builder().name("Windows").version("11").build();
    }
}
