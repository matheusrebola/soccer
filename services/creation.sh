#!/bin/bash

alias cdreciever='cd /soccer/services/reciever/'
alias cdpersistence='cd /soccer/services/persistence/'

# Passo 1: Rodar o docker-compose
echo "Iniciando o docker-compose..."
docker-compose up -d
if [ $? -ne 0 ]; then
  echo "Erro ao iniciar o docker-compose!"
  exit 1
fi

# Passo 2: Navegar até o diretório do primeiro Dockerfile e construir a imagem
echo "Construindo a imagem do primeiro Dockerfile..."
cdreciever
docker build -t reciever .
if [ $? -ne 0 ]; then
  echo "Erro ao construir o primeiro Dockerfile!"
  exit 1
fi

# Passo 3: Navegar até o diretório do segundo Dockerfile e construir a imagem
echo "Construindo a imagem do segundo Dockerfile..."
cdpersistence
docker build -t persistence .
if [ $? -ne 0 ]; then
  echo "Erro ao construir o segundo Dockerfile!"
  exit 1
fi

# Passo 4: (Opcional) Rodar os containers resultantes das imagens
echo "Rodando o container do reciever..."
docker run -d reciever

echo "Rodando o container da imagem2..."
docker run -d persistence

echo "Processo concluído com sucesso!"
