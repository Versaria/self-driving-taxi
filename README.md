# Self-Driving Taxi 🚖 Time Calculator

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Java](https://img.shields.io/badge/Java-11+-blue)
![JUnit](https://img.shields.io/badge/JUnit-4-red)
![Coverage](https://img.shields.io/badge/Coverage-100%25-brightgreen)

Проект для расчета времени поездки беспилотного такси с использованием Java и JUnit.

## 📋 Основной функционал

- Расчет времени поездки по расстоянию и скорости
- Конвертация часов в минуты
- Вывод информации о поездке в консоль
- Полное покрытие тестами основных сценариев

## 🚀 Быстрый старт

### Требования
- Java JDK 11+
- Apache Maven 3.6+
- Git (для клонирования)

### Установка и запуск
```bash
git clone https://github.com/Versaria/self-driving-taxi.git
cd self-driving-taxi
mvn clean install
mvn exec:java -Dexec.mainClass="com.versaria.App"
```

## 📂 Структура проекта
```
self-driving-taxi/
├── src/
│   ├── main/java/com/versaria/
│   │   └── App.java
│   └── test/java/com/versaria/
│       └── AppTest.java
├── LICENSE
├── pom.xml
└── README.md
```

## 🧪 Тестирование

### 📊 Покрытие тестами
- **Общее количество тестов**: 3
- **Покрытие кода**: 100% основных сценариев
- **Тестируемые сценарии**:
  - Инициализация времени поездки (0 часов)
  - Расчет времени для стандартного маршрута (80 км / 40 км/ч)
  - Конвертация времени в минуты (2 часа → 120 минут)

Пример теста:
```java
@Test
public void testRideDurationCalculation() {
    double distance = 80;
    final double SPEED = 40;
    double time = distance / SPEED;
    assertEquals(2.0, time, 0.001);
}
```

Для запуска тестов:
```bash
mvn test
```

Для генерации отчета о покрытии:
```bash
mvn jacoco:report
```
Отчет будет доступен в: `target/site/jacoco/index.html`

## 💻 Пример работы
```
Старт поездки. Осталось минут: 120.0
```

## 📜 Лицензия
Проект распространяется под лицензией MIT. Подробнее см. в файле [LICENSE](LICENSE).

## 🤝 Как внести вклад
1. Форкните репозиторий
2. Создайте ветку для новой фичи (`git checkout -b feature/your-feature`)
3. Сделайте коммит изменений (`git commit -am 'Add some feature'`)
4. Запушьте ветку (`git push origin feature/your-feature`)
5. Откройте Pull Request

## 📜 Лицензия
Проект распространяется под лицензией MIT. Подробнее см. в файле [LICENSE](LICENSE).

---

<details>
<summary>🔧 Дополнительные команды</summary>

```bash
# Запуск тестов с отчетом
mvn test surefire-report:report

# Анализ кода
mvn pmd:pmd checkstyle:checkstyle
```
</details>
