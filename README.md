# 🐦 BirdSound

> Simple audio streaming simulation built with Java and Object-Oriented Programming concepts.

Sistema desenvolvido em **Java** com foco em **Programação Orientada a Objetos (POO)**, simulando uma plataforma simples de streaming de áudios (músicas e podcasts), com cálculo de engajamento e sistema de ranking.

---

## 🎯 Objetivo do Projeto

Projeto criado para consolidar fundamentos de:

- Herança  
- Polimorfismo  
- Interfaces  
- Encapsulamento  
- Organização de código em pacotes  
- Modelagem de domínio  

---

## 🚀 Funcionalidades

- 🎵 Cadastro de músicas  
- 🎙 Cadastro de podcasts e episódios  
- ❤️ Controle de curtidas  
- ▶️ Controle de reproduções  
- 📊 Cálculo de taxa de engajamento  
- 🏆 Sistema de classificação (ranking)  

---

## 🧠 Conceitos de POO Aplicados

- ✔ Encapsulamento  
- ✔ Herança  
- ✔ Polimorfismo  
- ✔ Interface  
- ✔ Sobrescrita de métodos  
- ✔ Separação de responsabilidades  

---

## 📂 Estrutura do Projeto

br.com.rovanidev.birdsound
│
├── modelos
│ ├── Audio
│ ├── Musica
│ ├── Podcast
│ └── Episodio
│
└── servicos
├── Classificavel
└── Rankeador


---

## 🏗 Arquitetura

### 🔹 Audio  
Classe base que representa qualquer áudio reproduzível.

**Atributos principais:**
- Título  
- Duração  
- Total de curtidas  
- Total de reproduções  

---

### 🔹 Musica  
Especialização de `Audio`, adicionando:

- Artista  
- Cálculo de engajamento individual  

---

### 🔹 Episodio  
Representa um episódio de podcast:

- Lista de convidados  
- Engajamento individual  

---

### 🔹 Podcast  
Agrupa episódios e calcula o engajamento geral.

---

### 🔹 Interface `Classificavel`

Define o contrato:

```java
double getClassificacao();
```

Permite que diferentes tipos de áudio possam ser ranqueados.

---

### 🔹 Rankeador

Classe responsável por:

- Ordenar objetos classificáveis  
- Gerar ranking com base na taxa de engajamento  

---

## 📊 Regra de Negócio

A taxa de engajamento é calculada com base na fórmula:

```java
(totalCurtidas / totalReproducoes) * 100
```
Essa métrica é utilizada para gerar o ranking.

---

## 🛠 Tecnologias Utilizadas

| Tecnologia      | Finalidade                          |
|----------------|-------------------------------------|
| Java 17+       | Linguagem principal do projeto      |
| IntelliJ IDEA  | Ambiente de desenvolvimento (IDE)   |
| Git            | Controle de versão                  |
| GitHub         | Hospedagem do repositório           |

---

## 📈 Competências Demonstradas

- 🧠 Aplicação prática de Programação Orientada a Objetos  
- 🏗 Organização de projeto em camadas  
- 📊 Implementação de regra de negócio  
- 🔄 Uso de versionamento com Git  

---

## 👨‍💻 Desenvolvedor

**Bruno Rovani**  
🔗 GitHub: https://github.com/rovanidev  

---

## 📌 Status do Projeto

✅ **Versão 1.0 concluída**  
🚀 Projeto desenvolvido para fins de estudo e evolução técnica  
