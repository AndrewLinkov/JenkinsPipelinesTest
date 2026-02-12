## JenkinsTests

### Описание
В проекте реализован запуск автотестов через Jenkins:
- Задача со свободной конфигурацией
- Задача со свободной конфигурацией с параметрами запуска
- Задача c Pipelines

### Запуск Jenkins (локально)
1. Скачать файл Jenkins.war с официального сайта https://www.jenkins.io/download/
2. В папке с файлом jenkins.war запустить в командной строке java -jar jenkins.war
3. Открыть в браузере Jenkins http://localhost:8080/
4. В настройках Jenkins в Tools установить Maven указать версию maven
5. В настройках Jenkins в Plugins установить Allure + Labelled Pipeline Steps

### Задача со свободной конфигурацией
Создать задачу свободной конфигурации с параметрами:
1. Цели Maven верхнего уровня:
- maven-jenkins
- Цели - clean test -Dallure.results.directory=%WORKSPACE%\allure-results
2. Путь сохранения отчета Path - target/allure-results

### Задача со свободной конфигурацией с параметрами запуска
Создать задачу свободной конфигурации с параметрами:
1. Выбрана параметризованная сборка. Запуск тестов по тегам:
- SMOKE - запуск смоук тестирования
- REGRESS - запуск регресионного тестирования
- DIVISION - запуск тестов на деление
- MULTIPLICATION - запуск тестов на умножение
- SUBTRACTION - запуск тестов на вычитание
- SUM - запуск тестов на сложение
2. В параметре Шаги сборки выбрана команда
    - if "%CATEGORY%"=="REGRESS" (
   mvn clean test -Dallure.results.directory=%WORKSPACE%\allure-results
   ) else (
   mvn clean test -Dgroups="%CATEGORY%" -Dallure.results.directory=%WORKSPACE%\allure-results
   )

### Задача c Pipelines
1. Добавить в pom.xml плагин Jenkinsfile
2. В корне репозитория создать файл jenkins.groovy
3. В Jenkins создать Задачу с Pipelines. В параметрах выбрать:
- Параметризированная сборка - String Parameter Имя - branch Значение по умолчанию - master
- файл jenkins.groovy будет тянуться из репозитория

