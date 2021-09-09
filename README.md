## LINKS
- ORGANIZATION - https://github.com/SimbiozProject
- JIRA - https://chatbotselling.atlassian.net/jira/software/projects/JP/boards/4/backlog
- BOT - https://github.com/SimbiozProject/bot.manager
- WEB - https://github.com/SimbiozProject/web_school_manager
- PROCESSOR - https://github.com/SimbiozProject/school.manager.dummy.repository
- PROPERTIES - https://github.com/SimbiozProject/PropertiesRepo
- CONFIG SERVER - https://github.com/SimbiozProject/school.manager.config.server

## DEFAULT PORTS
- http://localhost:8090 - PROCESSOR
- http://localhost:8091 - WEB
- http://localhost:8090/swagger-ui/ - Api Documentation in swagger
- http://localhost:8888 - CONFIG SERVER

## START
- Заходим в терминал idee, убеждаемся что нужный порт не занят: sudo lsof -i :5432
- Если порт занят (например локальной БД), то останавливаем его: sudo service postgresql stop
- Вводим команду для запуска docker-compose: docker-compose up --force-recreate 
(либо sudo docker-compose up --force-recreate)
- В разделе idee data source заполняем данные для подключения к БД: 
user - postgres; password - 1234; DB - bot_db;
- Выполняем тестовое подключение. Если все ок - запускаем приложение. Таблицы должны подтянуться.
- Останавливаем docker-compose командой sudo docker-compose down

### Если при подключении к базе данных выдает ошибку "база данных или пользователь не существует":
- дропнуть бд (sudo rm ./db/bot/ -r) и попробовать перезапустить docker-compose 
(docker-compose down -> docker-compose up).

### Для работы с базой данных через консоль:
- Заходим в образ postgresql: sudo docker exec -it schoolmanagerdummyrepository_bot_db_1  psql -U postgres
- \l - list of databases
- Создаем базу данных create database name;
- \с - Используем базу данных (аналог use database)
- create table name() - создание таблиц
- \d - список таблиц
- По окончании работы с psql выходим из бд командой в консоли exit

### Что сделали в прошлый раз:
- написали юнит тесты для сервиса и репозитория
- JP-90:Реализовать ендпоинт, который принимает юзернейм пользователя и генерирует код из 4х символов


- user open browser (web)
- user enter username
- server find user
- server generates code
________________________________________
- server saves code for user
- server sends code in tg
- user enter code received in browser
- server check code with generated one
- if code match - server opens home page
- if code doesn't match - server stay on login page.

### Что будем делать сегодня:
Будем начинать с веб части: 
- UI - написать ендпоинт, где из формы берется имя пользователя и отправляется в сервис
- на чатботе сделать эндпоинт, который принимает сообщение (пинкод) и отправляет его дальше пользователю
- JP-90(доделать): дописать ендпоинт, который отправляет в чатБот код и чатАйди. 
- Если найден - вернуть 200. Если юзерНейм не найден - вернуть сообщение об ошибке 404.




### Делаем сами:
- перевести бот на gradle
- подключить боту swagger
### Делаем сами, когда Макс смержит ветку
- написать unit тест для сервиса (юзер логин сервис), написать интеграционный тест для всей цепочки
- SQL-скрипт для тестирования
- опционально: подумать что будет с пин кодом. хранить? перезаписывать? удалять? 


