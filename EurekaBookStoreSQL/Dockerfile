FROM mysql:latest
ENV MYSQL_DATABASE: 'db'
ENV MYSQL_USER: 'user'
ENV MYSQL_PASSWORD: 'password'
ENV MYSQL_ROOT_PASSWORD: 'password'
COPY setup.sql /docker-entrypoint-initdb.d/

