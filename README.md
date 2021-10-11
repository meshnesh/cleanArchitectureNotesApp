# Clean Architecture Notes App

[![Maintainability](https://api.codeclimate.com/v1/badges/845077f00546781fbf4a/maintainability)](https://codeclimate.com/github/meshnesh/cleanArchitectureNotesApp/maintainability) [![Kotlin Version](https://img.shields.io/badge/kotlin-1.5.0-blue.svg)](http://kotlinlang.org/) [![License](https://img.shields.io/badge/License-Apache%202.0-lightgrey.svg)](http://www.apache.org/licenses/LICENSE-2.0)

This is an Android application that consumes latest [New York Times Popular Articles](https://www.nytimes.com) for the past 7 days

## Getting Started

This project is built with Gradle, the [Android Gradle plugin](http://tools.android.com/tech-docs/new-build-system/user-guide). Follow the steps below to set up the project locally.

* Install `Java JDK`, `version 11`

* Clone [Clean Architecture Notes App](https://github.com/meshnesh/cleanArchitectureNotesApp) inside your working folder.

* Start Android Studio
* Select "Open Project" and select the generated root Project folder.
* Once the project has compiled -> run the project!
    ```
    from the android main menu, click on 'Run' tab, and click on 'Run MainActivity'
    connect your android mobile phone or simple use an inbuilt android emulator
    ```

## Design

Design follows these recommendations [android jetpack compose](https://developer.android.com/jetpack/compose), a comprehensive guide for visual, motion, and interaction design across platforms and devices.
Granting the project in this way a great user experience (UX) and user interface (UI). For more info about UX best practices visit [link](https://developer.android.com/topic/google-play-instant/best-practices/apps).

## Architecture

The architecture of the application is based, apply and strictly complies with the following:

-   A single-activity architecture, using the [Navigation component](https://developer.android.com/guide/navigation/navigation-getting-started) to manage fragment operations.
-   [Android architecture components](https://developer.android.com/topic/libraries/architecture/), part of Android Jetpack for give to project a robust design, testable and maintainable.
-   Pattern [Model-View-ViewModel](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel) (MVVM) facilitating a [separation](https://en.wikipedia.org/wiki/Separation_of_concerns) of development of the graphical user interface.
-   [S.O.L.I.D](https://en.wikipedia.org/wiki/SOLID) design principles intended to make software designs more understandable, flexible and maintainable.
-   [The Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)

### Architecture components

-   [use case](https://developer.android.com/reference/androidx/camera/core/UseCase) The software in this layer contains application specific business rules. It encapsulates and implements all of the use cases of the system.

Ideally, ViewModels shouldn’t know anything about Android. This improves testability, leak safety and modularity. ViewModels have different scopes than activities or fragments. While a ViewModel is alive and running, an activity can be in any of its lifecycle states. Activities and fragments can be destroyed and created again while the ViewModel is unaware.

Passing a reference of the View (activity or fragment) to the ViewModel is a serious risk. Lets assume the ViewModel requests data from the network and the data comes back some time later. At that moment, the View reference might be destroyed or might be an old activity that is no longer visible, generating a memory leak and, possibly, a crash.

The communication between the different layers follow the above diagram using the reactive paradigm, observing changes on components without need of callbacks avoiding leaks and edge cases related with them.

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests.

## Authors

Antony Munene.

### License

    Copyright 2021 Antony Munene

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
