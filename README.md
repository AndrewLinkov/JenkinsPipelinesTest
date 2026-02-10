## JenkinsTests

### Описание
В проекте реализован запуск автотестов с помощью Jenkins

### Запуск Jenkins (локально)
- скачать файл Jenkins.war с официального сайта https://www.jenkins.io/download/
- запустить в командной строке java -jar jenkins.war (Запускается на локальной машине)
- открыть в браузере http://localhost:8080/
- в настройках Jenkins в Tools установить Maven указать версию maven
- в настройках Jenkins в Plugins установить Allure + Labelled Pipeline Steps

### Задача со свободной конфигурацией
Создать Job с ключевыми параметрами:
- Цели Maven верхнего уровня - maven-jenkins
- Цели - clean test -Dallure.results.directory=%WORKSPACE%\allure-results
- Путь сохранения отчета Path - target/allure-results

### Задача c Pipelines