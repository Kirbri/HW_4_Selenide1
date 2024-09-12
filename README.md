Package HW4 содержит класс SelenideGithubHaveCodeForJUnit5 с методом selenideCodeTest, в котором проверяется тест: 
- Открытие страницы Selenide в Github
- Переход в раздел Wiki проекта
- Проверка, что в списке страниц (Pages) есть страница SoftAssertions
- Открытие страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5


Package HW5 содержит класс DragDropTransfer с методами selenideCodeTestWithActionsTest и selenideCodeTestWithDragAndDropTest, в котором проверяется тест:
- Откройтие https://the-internet.herokuapp.com/drag_and_drop
- Перенос прямоугольника А на место В
- Проверка что прямоугольники действительно поменялись
- selenideCodeTestWithActionsTest - использование Selenide.actions()
- selenideCodeTestWithDragAndDropTest - использование Selenide.dragAndDrop()

Класс GitHubCase с методом selenideCodeTest, в котором проверяется тест:
- Открытие главной страницы GitHub
- Выбор: Меню -> Solutions -> Enterprize (с помощью команды hover для Solutions).
- Проверка, что загрузилась нужная страница (например, что заголовок: "The AI-powered developer platform.").
