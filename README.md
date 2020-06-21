# spring-core
Spring is the most popular application framework for Java. Inversion of Control is the core concept of Spring framework
It is the Open source Java platform since 2003.
It supports all major application servers and JEE standards.
Spring handles the infrastructure , so you can focus on your application and its business logic

# Advantages

## Loose Coupling:
Coupling is the measure of dependencies between two modules/objects in an application. As a good design, coupling should be as loose as possible. Spring ensures that modules are loosely coupled through Dependency Injection
## Inversion of Control (IOC) and Dependency Injection (DI) 
By DI the responsibility of creating objects is shifted from our application code to Spring container and hence the phenomena is called IOC.
In short, IoC is a much broader term that originally meant any sort of programming style where an overall framework or run-time controls the program flow. Inversion of control is the principle where the control flow of a program is inverted ie instead of the programmer controlling the flow of a program, the external sources (framework, services, other components) takes control of it.
## Aspect oriented Programming complements OOP.
Just as in OO we deal with objects, in AOP we deal with aspects. Aspects are cross cutting in our program like transaction logging etc that is required in most of the places in our Application. AOP is programming style that decouples the aspects and the business logic. Aspects can be specified in the configuration file and the spring intercepts these aspects and applies to the corresponding business logic. So your code is clean and becomes more maintainable

## It is an open source.

## Spring is light weight
Spring supports layered Architecture, and it is composed of many modules. Spring community has divided the
modules in such a way that modules are independent of each other except the core module. So according to your requirement you can learn a particular module, you don’t need to learn the complete framework ,for example if you want to develop a java application, choose only that module.
