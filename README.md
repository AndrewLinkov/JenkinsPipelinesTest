## MathematicalsTests

### Описание
В проекте реализовано:
1) запуск автотестов через Jenkins:
- Задача со свободной конфигурацией
- Задача со свободной конфигурацией с параметрами запуска
- Задача c Pipelines
2) Запуск автотестов через Docker

### Запуск Jenkins (локально)
1. Скачать файл Jenkins.war с официального сайта https://www.jenkins.io/download/
2. В папке с файлом jenkins.war запустить в командной строке java -jar jenkins.war 
   (Файл локально: D:\!документы Андрей\Desktop\Автоматизация\Доп файлы\Jenkins)
3. Открыть в браузере Jenkins http://localhost:8080/
4. В настройках Jenkins в Tools установить Maven указать версию maven
5. В настройках Jenkins в Plugins установить Allure + Labelled Pipeline Steps

### Задача со свободной конфигурацией
Создать задачу **"JenkinsTestFreeConfigurationTask"** свободной конфигурации с параметрами:
1. Цели Maven верхнего уровня:
- maven-jenkins
- Цели - clean test -Dallure.results.directory=%WORKSPACE%\allure-results
2. Путь сохранения отчета Path - target/allure-results

### Задача со свободной конфигурацией с параметрами запуска
Создать задачу **"JenkinsTestParametrsTask"** свободной конфигурации с параметрами:
1. Выбрана параметризованная сборка. Запуск тестов по тегам:
- SMOKE - запуск смоук тестирования
- REGRESS - запуск регресионного тестирования
- DIVISION - запуск тестов на деление
- MULTIPLICATION - запуск тестов на умножение
- SUBTRACTION - запуск тестов на вычитание
- SUM - запуск тестов на сложение
2. В параметре Шаги сборки выбрана команда
    - if "%CATEGORY%"=="REGRESS" (mvn clean test -Dallure.results.directory=%WORKSPACE%\allure-results) 
   else (mvn clean test -Dgroups="%CATEGORY%" -Dallure.results.directory=%WORKSPACE%\allure-results)

### Задача c Pipelines
Предварительно в Jenkins в разделе Tools настроить парметры JDK, Maven, Allure
Создать задачу **"JenkinsTestPipeline"**
1. В корне репозитория создать файл jenkinsfile
2. Добавить параметры:


### Запуск автотестов в Docker из Idea
1. Создать Dockerfile в корне репозитория
2. Создать образ через консоль командой 'docker build -t nameProject .'
   Пример: docker build -t mathematicalsTest .
3. Запустить тесты командой : docker run --rm mathematicalstest
4. Остановить VmmemWSL в которой работает Docker Desctop:  wsl --shutdown
