package com.cbt;



import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages="com.cbt")
@EnableScheduling()
public class AssessmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssessmentApplication.class, args);
    }
    @Bean
    public TomcatEmbeddedServletContainerFactory container(){
        TomcatEmbeddedServletContainerFactory tomcat=new TomcatEmbeddedServletContainerFactory();       
        
        tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector->{
            if(connector.getProtocolHandler()instanceof AbstractHttp11Protocol<?>){
                //
                ((AbstractHttp11Protocol<?>)connector.getProtocolHandler()).setMaxSwallowSize(-1);
            }
        
        });
        return tomcat;
    }
}
