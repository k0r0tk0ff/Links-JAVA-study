
## 3. Apache Camel  
EIP.  
Обзор функциональности и архитектуры.  
Exchange, Message  
Описание маршрутов в Java DSL и Spring DSL.  
Стандартные компоненты Apache Camel (file, jms, http). Конвертеры типов.  
Добавление бизнес логики в маршруты (beans, processors).  
Обработка исключений.  
Конфигурирование менеджера распределенных транзакций для использования в маршрутах. 

  ### EIP  
Enterprice integration patterns  

http://camel.apache.org/enterprise-integration-patterns.html
https://www.enterpriseintegrationpatterns.com/patterns/messaging/index.html  
https://www.enterpriseintegrationpatterns.com/patterns/messaging/toc.html  

https://github.com/k0r0tk0ff/Links-JAVA-study/blob/master/ESB/%D0%A1%D1%82%D0%B8%D0%BB%D0%B8%20%D0%B8%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D1%86%D0%B8%D0%B8%20%D0%BA%D0%BE%D1%80%D0%BF%D0%BE%D1%80%D0%B0%D1%82%D0%B8%D0%B2%D0%BD%D1%8B%D1%85%20%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B9.txt  


  ### Обзор функциональности и архитектуры. Exchange, Message   
(Рассматривается технология Messaging System - где в качестве атомарной порции информации,
ередаваемой от отправителя получателю выступает message. Также, по аналогии с протоколом обмена информацией TCP 
присутствуют маршрутизатор, фильтры, message endpoints (отправитель и получатель).
В дополнении, также существуют трасляторы - где возможна можидикация сообщений, 
   каналы - где осуществяется логика доставки сообщений одному или нескольким получателям.

https://www.enterpriseintegrationpatterns.com/patterns/messaging/index.html

Рассматривается схема - 

Endpoint        --- Message --- Channel --- Router --- Translator --- Endpoint   
Application A   --------------------------------------------------->  Application B  


  ### Описание маршрутов в Java DSL и Spring DSL.
Для построения маршрута доставки сообщений используется 
специальный предметно ориентированый язык маршрутизации 
DSL (domain specific language) специализированный для конкретной данной области применения.  

Поддерживаемые синтаксисы языка DSL указаны здесь -
http://camel.apache.org/dsl.html

   ##### Рассмотрим Java DSL
Используется стиль построения buider - необходимо расширить класс RouteBuilder 
и реализовать метод configure.

      Пример: (http://camel.apache.org/java-dsl.html)  
      import org.apache.camel.builder.RouteBuilder;  
      public class MyRouteBuilder extends RouteBuilder {  
      public void configure() {  
        // here is a sample which processes the input files  
        // (leaving them in place - see the 'noop' flag)  
        // then performs content based routing on the message using XPath  
        from("file:src/data?noop=true")  
            .choice()  
            .when(xpath("/person/city = 'London'"))  
            .to("file:target/messages/uk")  
            .otherwise()  
            .to("file:target/messages/others");  
      }  
      }  
      
   #### Конфигурирование менеджера распределенных транзакций для использования в маршрутах.  
   При интеграции приложений, которые имеют свои хранилища данных остро  
   встает вопрос синхронизированности данных в этих хранилищах. Для решения этой
   проблемы испо. т.н. распределенные транзакции - транзакции, охватывающие несколько источников данных.
   В java такие транзакции поддерживаются с помощью Java Transaction API, явл. частью JavaEE. 
   Помимо Java EE JTA существуют и другие, в т.ч. Open Souce решения.
   
   











  



