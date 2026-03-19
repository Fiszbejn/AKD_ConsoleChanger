<h1 align="center">🎮 AKD Console Changer</h1>

<p align="center">
  Aplicativo Android que exibe um catálogo interativo de consoles PlayStation da Sony, permitindo navegar entre diferentes gerações com uma interface moderna e responsiva.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" />
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" />
  <img src="https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white" />
  <img src="https://img.shields.io/badge/Material%20Design%203-757575?style=for-the-badge&logo=material-design&logoColor=white" />
  <img src="https://img.shields.io/badge/Min%20SDK-24-brightgreen?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Target%20SDK-36-blue?style=for-the-badge" />
</p>

---

## 📱 Sobre o Projeto

O **AKD Console Changer** é um aplicativo Android desenvolvido com **Kotlin** e **Jetpack Compose** que apresenta um catálogo de consoles da linha PlayStation da Sony. A cada toque no botão "Próximo console", o app navega ciclicamente entre os modelos exibindo imagem, geração, ano de lançamento e fabricante de cada console.

O projeto foi criado para consolidar conhecimentos em desenvolvimento Android moderno, explorando a stack mais atual do ecossistema Android.

---

## ✨ Funcionalidades

- 🕹️ Navegação interativa entre 6 consoles PlayStation (PS1, PS2, PS3, PS4, PSP, PSP Vita)
- 🖼️ Exibição de imagem, nome, geração, ano de lançamento e fabricante de cada console
- 🔤 Tipografia personalizada com a fonte oficial do PlayStation
- 🌗 Suporte a **Dynamic Color** (Material You — Android 12+)
- 📐 Layout **Edge-to-Edge** com suporte a insets do sistema
- 📋 Arquitetura baseada em componentes Composable reutilizáveis

---

## 🛠️ Tecnologias & Ferramentas

| Tecnologia | Descrição |
|---|---|
| **Kotlin** | Linguagem principal do projeto, com uso de `data class`, funções de extensão e lambdas |
| **Jetpack Compose** | Toolkit moderno e declarativo para construção de UI nativa no Android |
| **Material Design 3** | Sistema de design do Google com suporte a Dynamic Color (Material You) |
| **Compose BOM** | Gerenciamento centralizado de versões das bibliotecas do Compose |
| **AndroidX Activity Compose** | Integração entre `ComponentActivity` e Jetpack Compose |
| **AndroidX Lifecycle** | Gerenciamento do ciclo de vida do app |
| **Gradle Kotlin DSL** | Configuração de build com `build.gradle.kts` para maior type-safety e autocompletar |
| **Version Catalog (libs.versions.toml)** | Controle centralizado de versões de dependências |

---

## 🏗️ Arquitetura & Estrutura do Projeto

O projeto segue uma arquitetura **baseada em componentes Composable**, separando responsabilidades em funções independentes e reutilizáveis. O gerenciamento de estado é feito com **State Hoisting**, elevando o estado para o nível mais adequado da árvore de composição.

```
app/src/main/
├── java/com/davifiszbejn/consolechanger/
│   ├── Console.kt                  # Data class: modelo de domínio do console
│   ├── MainActivity.kt             # Entry point: Activity + ConsoleChangerScreen (state holder)
│   ├── ConsoleCard.kt              # Composable: card com detalhes do console
│   ├── ConsoleChangeButton.kt      # Composable: botão de navegação entre consoles
│   ├── ConsoleLogo.kt              # Composable: cabeçalho com logo estilizado
│   └── ui/theme/
│       ├── Theme.kt                # Tema do app (light/dark + dynamic color)
│       ├── Color.kt                # Paleta de cores
│       └── Type.kt                 # Tipografia
└── res/
    ├── drawable/                   # Imagens dos consoles (PNG)
    ├── font/                       # Fonte personalizada PlayStation
    └── values/                     # Strings, cores e temas XML
```

### Padrões aplicados

- **State Hoisting**: o estado selecionado (`consoleSelected`, `currentConsoleIndex`) é mantido no nível do `ConsoleChangerScreen` e passado como parâmetro para os Composables filhos
- **Separação de responsabilidades**: cada Composable tem uma responsabilidade única e bem definida
- **Preview functions**: todos os Composables possuem `@Preview` para validação visual rápida no Android Studio

---

## 🚀 Como Executar

### Pré-requisitos

- Android Studio **Ladybug** ou superior (recomendado: versão estável mais recente)
- JDK 11+
- Android SDK com API 24+

### Passos

```bash
# 1. Clone o repositório
git clone https://github.com/Fiszbejn/AKD_ConsoleChanger.git

# 2. Abra o projeto no Android Studio

# 3. Execute em um emulador ou dispositivo físico (API 24+)
```

> **Dica:** Para aproveitar o **Dynamic Color** (Material You), utilize um emulador ou dispositivo com Android 12 (API 31) ou superior.

---

<p align="center">
  Feito com ❤️ e muito ☕ por <strong>Davi Fiszbejn</strong>
</p>
