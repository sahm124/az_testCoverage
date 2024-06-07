# unittest.with.codecoverage
### _Demo of unit test with code coverage_

## Content
- Unit test exemples with jUnit5 and Mockito
- JaCoCo for code coverage report
- Dificult: Beginner

## Executions
- mvn clean install -DskipTests
- mvn jacoco:report
- mvn test

### JaCoCo report report can be found at _target/site/jacoco/index.html_

Slides with content of the topic (pt-BR):<br> https://docs.google.com/presentation/d/1Dkz-qUYigPFynfNk8KcAeyTIxhUmaVTZ4DM6d5UjcJE/edit?usp=sharing

<div dir="rtl">

# لحظه اجرای code coverage برای دیدن درصد پوشش ها بدون اعمال تغییر در کد تست:

![image](https://github.com/sahm124/az_testCoverage/assets/62812464/3cf7f35e-dbdc-401d-83ac-21bb3bea4da8)



بعد اعمال تغییر در کد تست ها برای افزایش درصد پوشش کد اصلی:
![image](https://github.com/sahm124/az_testCoverage/assets/62812464/67687451-6d30-46a9-8cb3-b9bb22ad4f1e)



منطق تست‌های ما: این تست‌ها اطمینان حاصل می‌کنند که متدهای setter و getter در کلاس Footpassenger به درستی کار می‌کنند. تست‌ها حالت‌های مختلفی را بررسی می‌کنند تا مطمئن شوند که مقادیر به درستی تنظیم و بازیابی می‌ شوند.

FootpassengerTest.java
این کلاس برای تست کردن متدهای مربوط به عابر پیاده (Footpassenger) استفاده می‌شود. منطق تست‌ها به شرح زیر است:

PersonTest.java
این کلاس برای تست کردن متدهای مربوط به شخص (Person) و همچنین سریال‌سازی و دی‌سریال‌سازی استفاده می ‌شود.

منطق تست‌ها: این تست‌ها اطمینان حاصل می‌کنند که متدهای getter و setter در کلاس Person به درستی کار می‌کنند و همچنین تست سریال‌سازی و دی‌سریال‌سازی اطمینان می‌دهد که اشیا Person به درستی سریال و دی‌سریال می ‌شوند.

TrafficTest.java
این کلاس برای تست کردن متدهای مربوط به ترافیک (Traffic) استفاده می‌شود.

منطق تست‌ها: این تست‌ها اطمینان حاصل می‌کنند که متدهای setter و getter در کلاس Traffic به درستی کار می‌کنند و حالت‌های مختلفی از مقادیر بررسی می‌شوند تا مطمئن شوند که مقادیر به درستی تنظیم و بازیابی می‌شوند.


منطق تست‌ها: این تست‌ها اطمینان حاصل می‌کنند که متدهای setter و getter در کلاس Traffic به درستی کار می‌کنند و حالت‌های مختلفی از مقادیر بررسی می‌شوند تا مطمئن شوند که مقادیر به درستی تنظیم و بازیابی می‌شوند.


تست‌های اضافی برای کلاس PersonServiceImplTest

۱. تست برای متد update با شخص معتبر

شرح: این تست اطمینان حاصل می‌کند که متد update در کلاس PersonServiceImpl به درستی عمل می‌کند و شخص معتبر را به‌روز‌رسانی می‌کند.


منطق تست: این تست اطمینان حاصل می‌کند که متد update در کلاس PersonServiceImpl به درستی عمل می‌کند و شخص معتبر را به‌روز‌رسانی می‌کند.
این تست شبیه‌سازی رفتار مخزن برای به‌روز‌رسانی شخص و تأیید اینکه متد update مخزن با شخص موردنظر فراخوانی شده است.


۲. تست برای متد delete با نام معتبر
شرح: این تست اطمینان حاصل می‌کند که متد delete در کلاس PersonServiceImpl به درستی عمل می‌کند و شخص با نام معتبر را حذف می‌ کند.

منطق تست: این تست اطمینان حاصل می‌کند که متد delete در کلاس PersonServiceImpl به درستی عمل می‌کند و شخص با نام معتبر را حذف می‌کند. این تست شبیه‌سازی رفتار مخزن برای حذف شخص و تأیید اینکه متد delete مخزن با نام موردنظر فراخوانی شده است.


نتایج code coverage report ماننده اعمالی که روی پروژه تستی داخل آموزش انجام شده بود:

![image](https://github.com/sahm124/az_testCoverage/assets/62812464/3297de04-0085-4a6a-99bc-e4d2f7941548)

![image](https://github.com/sahm124/az_testCoverage/assets/62812464/e40258ba-cadc-405c-ba3e-8763c90e8599)

![image](https://github.com/sahm124/az_testCoverage/assets/62812464/4075c31d-b65e-4d3a-8fa4-3337493f521e)



</div>
