@echo off
call mvn clean install
docker compose up -d