@echo off

rem Mudar para o diretório do projeto
cd /d "C:\Users\Henrique\IdeaProjects\StockMaster"

rem Adicionar todas as alterações
git add .

rem Fazer o commit com uma mensagem
git commit -m "Nova versão do projeto"

rem Enviar as alterações para o repositório remoto
git push origin master

pause