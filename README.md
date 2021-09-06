# LINKS
- ORGANIZATION - https://github.com/SimbiozProject
- JIRA - https://chatbotselling.atlassian.net/jira/software/projects/JP/boards/4/backlog
- BOT - https://github.com/SimbiozProject/bot.manager
- WEB - https://github.com/SimbiozProject/web_school_manager
- PROCESSOR - https://github.com/SimbiozProject/school.manager.dummy.repository
- PROPERTIES - https://github.com/SimbiozProject/PropertiesRepo
- SERVER - https://github.com/SimbiozProject/school.manager.config.server

Для запуска проекта необходимо:
- Проверить свободен ли 9000 порт: docker ps 
- Запустить postgres в docker-compose: docker-compose up --force-recreate
- Если при подключении к базе данных выдает ошибку "база данных или пользователь не 
существует" - дропнуть бд (sudo rm ./db/bot/ -r) и попробовать перезапустить 
docker-compose (docker-compose down -> docker-compose up).

Что сделали в прошлый раз:

Что осталось:
перевести на грейдл бот, 
добавить сваггер

