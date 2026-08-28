# Используем образ с Maven и JDK 21 (можно 17/21 в зависимости от вашего проекта)
FROM maven:3.9.9-eclipse-temurin-21

# Рабочая директория внутри контейнера
WORKDIR /app

# Копируем только pom.xml и подгружаем зависимости (кэш слоёв)
COPY pom.xml .
RUN mvn dependency:go-offline -B || true

# Копируем весь исходный код и тесты
COPY src ./src

# Команда по умолчанию — запуск тестов
CMD ["mvn", "-B", "test"]