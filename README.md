# JavaFX Popup Styling

A minimal open-source JavaFX 21 project demonstrating how to customize
`ContextMenu` and `Tooltip` using CSS.

## Features

- Rounded ContextMenu corners
- Custom dark theme
- Styled menu items and separators
- Rounded Tooltip styling
- Configurable popup drop shadows
- Minimal JavaFX implementation

## Tech Stack

- Java 21+
- JavaFX 21
- Maven
- CSS

## Getting Started

### Requirements

- JDK 21 or newer
- Apache Maven

### Run

```bash
git clone https://github.com/sidalikharef/stackoverflow-javafx-popup-styling.git
cd stackoverflow-javafx-popup-styling
mvn clean javafx:run
```

## Project Structure

```text
src/
└── main/
    ├── java/com/sid/popuptest/
    │   └── PopupTest.java
    └── resources/
        └── popup.css
```

## Purpose

This project investigates unwanted background areas and corner artifacts
when styling standard JavaFX popup controls.

The example was tested on Fedora using JavaFX 21.

The test did not reproduce the unwanted corner artifacts in that environment.
Results may differ depending on the operating system and rendering backend.

## License

MIT