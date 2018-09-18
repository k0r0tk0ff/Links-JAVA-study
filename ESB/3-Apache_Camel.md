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

https://www.enterpriseintegrationpatterns.com/patterns/messaging/index.html  
https://www.enterpriseintegrationpatterns.com/patterns/messaging/toc.html  

https://github.com/k0r0tk0ff/Links-JAVA-study/blob/master/ESB/%D0%A1%D1%82%D0%B8%D0%BB%D0%B8%20%D0%B8%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D1%86%D0%B8%D0%B8%20%D0%BA%D0%BE%D1%80%D0%BF%D0%BE%D1%80%D0%B0%D1%82%D0%B8%D0%B2%D0%BD%D1%8B%D1%85%20%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B9.txt  


  ### Обзор функциональности и архитектуры.  
Рассматривается технология Messaging System - где в качестве атомарной порции информации,
передаваемой от отправителя получателю выступает message. Также, по аналогии с протоколом обмена информацией TCP 
присутствуют маршрутизатор, фильтры, message endpoints (отправитель и получатель).
В дополнении, также существуют трасляторы - где возможна можидикация сообщений, 
каналы - где осуществяется логика доставки сообщений одному или нескольким получателям.

  



