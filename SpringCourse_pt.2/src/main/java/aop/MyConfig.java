package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //Конфигурационный класс, нужен чтобы не писать xml файл. хотя, можно и с xmlкой
@ComponentScan("aop") //Сканим все компоненты в пакете aop
@EnableAspectJAutoProxy //вносим в него Aspect
public class MyConfig {

}
